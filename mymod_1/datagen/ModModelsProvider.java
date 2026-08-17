package com.wuyu.mymod_1.datagen;

import com.wuyu.mymod_1.block.ModBlocks;
import com.wuyu.mymod_1.LoongnetherGenesis;
import com.wuyu.mymod_1.item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.core.Holder;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.stream.Stream;

public class ModModelsProvider extends ModelProvider {
    public ModModelsProvider(PackOutput output) {
        super(output, LoongnetherGenesis.MOD_ID);

    }
    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        itemModels.generateFlatItem(ModItems.ICE_ETHER.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_ICE_ETHER.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CLOUD_CRYSTAL.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.COLD_NETHER_IRON.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CARDBOARD.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.OPTICALNANO_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.LICHTS_TAUB.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.GENESIS_SWORD_INTENT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.ALLOY_HANDLE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.QUANTUM_CORE.get(),  ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.DAMONEN_STAUB.get(),  ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.REINER_DAMON_STAUB.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.OPTICAL_QUANTUM_HELMET.get(),  ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.OPTICAL_QUANTUM_CHESTPLATE.get(),   ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.OPTICAL_QUANTUM_LEGGINGS.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.OPTICAL_QUANTUM_BOOTS.get(), ModelTemplates.FLAT_ITEM);



        itemModels.generateFlatItem(ModItems.ANGELIKA.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.OPTICALNANO_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.OPTICALNANO_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.OPTICALNANO_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModels.generateFlatItem(ModItems.PICKAXE_AXE_ITEM.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.PICKAXE_AXE_ITEM2.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModels.generateFlatItem(ModItems.Lo_Zhi.get(), ModelTemplates.FLAT_ITEM);

        blockModels.createTrivialCube(ModBlocks.ICE_ETHER_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.RAW_ICE_ETHER_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.COLD_NETHER_ORE.get());
        blockModels.createTrivialCube(ModBlocks.ICE_ETHER_ORE.get());
        blockModels.createTrivialCube(ModBlocks.AGGREGATED_LICHTSTAUB.get());
        blockModels.createTrivialCube(ModBlocks.UNTERIRDISIER_LAND.get());
    }

    @Override
    protected Stream<? extends Holder<Item>> getKnownItems() {
        return ModItems.ITEMS.getEntries().stream();
    }

    @Override
    protected Stream<? extends Holder<Block>> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream();
    }
}
