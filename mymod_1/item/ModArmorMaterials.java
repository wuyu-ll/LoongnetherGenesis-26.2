package com.wuyu.mymod_1.item;

import com.google.common.collect.Maps;
import com.wuyu.mymod_1.LoongnetherGenesis;
import com.wuyu.mymod_1.tag.ModItemTags;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;

import java.util.Map;

import static net.minecraft.world.item.equipment.EquipmentAssets.ROOT_ID;

public interface ModArmorMaterials {
    ArmorMaterial OPTICAL_NANO = new ArmorMaterial(
            40, makeDefense(6, 12, 16, 10, 22), 25,
            SoundEvents.ARMOR_EQUIP_NETHERITE, 9.0f, 1.0f,
            ModItemTags.OPTI_NANO_ARMOR_MA, createId("optical_nano_1")
    );

    private static Map<ArmorType, Integer> makeDefense(int boots, int legs, int chest, int helm, int body) {
        return Maps.newEnumMap(
                Map.of(ArmorType.BOOTS, boots, ArmorType.LEGGINGS, legs, ArmorType.CHESTPLATE, chest, ArmorType.HELMET, helm, ArmorType.BODY, body)
        );
    }
    static ResourceKey<EquipmentAsset> createId(String name) {
        return ResourceKey.create(ROOT_ID, Identifier.fromNamespaceAndPath(LoongnetherGenesis.MOD_ID, name));
    }
}
