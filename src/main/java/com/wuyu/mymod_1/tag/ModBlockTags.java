package com.wuyu.mymod_1.tag;

import com.wuyu.mymod_1.LoongnetherGenesis;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModBlockTags {
    public static final TagKey<Block> ORE_TAGS = creat("ore_tags");
    public static final TagKey<Block> PICKAXE_AXE_MINEABLE = creat("pickaxe_minable");

    private static TagKey<Block> creat(String name) {
        return TagKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(LoongnetherGenesis.MOD_ID, name));
    }


}