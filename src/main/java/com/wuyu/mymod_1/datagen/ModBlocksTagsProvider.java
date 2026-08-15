package com.wuyu.mymod_1.datagen;

import com.wuyu.mymod_1.block.ModBlocks;
import com.wuyu.mymod_1.LoongnetherGenesis;
import com.wuyu.mymod_1.tag.ModBlockTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModBlocksTagsProvider extends BlockTagsProvider {
    public ModBlocksTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, LoongnetherGenesis.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {

        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.ICE_ETHER_BLOCK.getKey())
                .add(ModBlocks.ICE_ETHER_ORE.getKey())
                .add(ModBlocks.COLD_NETHER_ORE.getKey());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.ICE_ETHER_ORE.getKey())
                .add(ModBlocks.RAW_ICE_ETHER_BLOCK.getKey());
        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.COLD_NETHER_ORE.getKey());

        tag(ModBlockTags.PICKAXE_AXE_MINEABLE)
                .addTag(BlockTags.MINEABLE_WITH_PICKAXE)
                .addTag(BlockTags.MINEABLE_WITH_AXE);
    }
}