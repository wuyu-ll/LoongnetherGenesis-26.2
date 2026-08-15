package com.wuyu.mymod_1.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

import java.util.List;

public class ModFoods {
    public static final FoodProperties Lo_Zhi_FOOD = new FoodProperties.Builder()
            .nutrition(5)
            .saturationModifier(1.0F).build();
    public static final Consumable Lo_Zhi_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    List.of(
                            new MobEffectInstance(MobEffects.SPEED,400, 1),
                            new MobEffectInstance(MobEffects.LUCK,2000)
                    ),1.0F)).build();


    }
