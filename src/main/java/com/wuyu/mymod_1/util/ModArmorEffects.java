package com.wuyu.mymod_1.util;

import com.wuyu.mymod_1.LoongnetherGenesis;
import com.wuyu.mymod_1.tag.ModItemTags;
import net.minecraft.client.Minecraft;
import net.minecraft.core.Holder;
import net.minecraft.tags.TagKey;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.LevelTickEvent;

import java.util.List;
import java.util.Map;

@EventBusSubscriber(modid = LoongnetherGenesis.MOD_ID)
public class ModArmorEffects {
    public static final Map<TagKey<Item>, List<Template>> EFFECTS = Map.of(
            ModItemTags.OPTI_NANO_ARMOR, List.of(
                    new Template(MobEffects.SPEED, 20, 3),
                    new Template(MobEffects.FIRE_RESISTANCE, 20, 10),
                    new Template(MobEffects.HEALTH_BOOST, 20, 4),
                    new Template(MobEffects.JUMP_BOOST, 20, 3),
                    new Template(MobEffects.HASTE, 20, 3),
                    new Template(MobEffects.WATER_BREATHING, 20, 6)
            ));
    private static boolean hasFullArmor(Player player, TagKey<Item> tag) {
        return  player.getItemBySlot(EquipmentSlot.HEAD).is(tag) &&
                player.getItemBySlot(EquipmentSlot.CHEST).is(tag) &&
                player.getItemBySlot(EquipmentSlot.LEGS).is(tag) &&
                player.getItemBySlot(EquipmentSlot.FEET).is(tag);

    }


    private static void tickPlayer(Player player) {
        for (var entry: EFFECTS.entrySet()) {
            if(hasFullArmor(player, entry.getKey())) {
                applyEffects(player, entry.getValue());break;
            }
        }

    }

    private static void applyEffects(Player player, List<Template> effects) {
        for (var template: effects) {
            MobEffectInstance effectInstance = new MobEffectInstance(template.effect(), template.duration(),template.amplifier(),false,false,true);
            if (!player.hasEffect(effectInstance.getEffect())) {
                player.addEffect(effectInstance);
            }
        }

    }
    @SubscribeEvent


    public static void register(LevelTickEvent.Post event) {
        for (Player player :event.getLevel().players()) {
            tickPlayer(player);
        }
    }


    public record Template(Holder<MobEffect> effect, int duration, int amplifier){

    }
}
