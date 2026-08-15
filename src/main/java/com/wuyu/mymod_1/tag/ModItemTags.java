package com.wuyu.mymod_1.tag;

import com.wuyu.mymod_1.LoongnetherGenesis;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModItemTags {
    public static final TagKey<Item> COLD_NETHER_IRON_MA = bind ("cold_nether_iron_ma");
    public static final TagKey<Item> COLD_NETHER_IRON = bind ("cold_nether_iron");
    public static final TagKey<Item> OPTICALNANO_INGOT = bind ("lichtnano_ingot");
    public static final TagKey<Item> OPTICALNANO_INGOT_MA= bind ("lichtnano_ingot_ma");
    public static final TagKey<Item> ANGELIKA_MA = bind ("angelika_ma");




    private static TagKey<Item> bind(String name) {
        return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(LoongnetherGenesis.MOD_ID, name));
    }
}
