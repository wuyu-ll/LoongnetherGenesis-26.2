package com.wuyu.mymod_1.item;

import com.wuyu.mymod_1.tag.ModItemTags;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ToolMaterial;

public class ModToolMaterials {
    public static final ToolMaterial COLD_NETHER_IRON= new ToolMaterial(
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            50000,14.0f,26.0f,30,
            ModItemTags.COLD_NETHER_IRON_MA);
    public static final ToolMaterial OPTICAL_NANO_INGOT = new ToolMaterial(
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            38800,2.0f,12.0f,21,
            ModItemTags.OPTICALNANO_INGOT_MA);
    public static final ToolMaterial ANGELIKA= new ToolMaterial(
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            999999999, 16, 999999999,30,
            ModItemTags.ANGELIKA_MA);



}
