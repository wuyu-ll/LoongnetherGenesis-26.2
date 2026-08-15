package com.wuyu.mymod_1.datagen;

import com.wuyu.mymod_1.block.ModBlocks;
import com.wuyu.mymod_1.LoongnetherGenesis;
import com.wuyu.mymod_1.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModEnUsLangProvider extends LanguageProvider {
    public ModEnUsLangProvider(PackOutput output) {
        super(output, LoongnetherGenesis.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(ModItems.CLOUD_CRYSTAL.get(),  "Cloud Crystal");
        add(ModItems.ICE_ETHER.get(), "Ice Ether");
        add(ModItems.RAW_ICE_ETHER.get(), "Raw Ice Ether");
        add(ModItems.COLD_NETHER_IRON.get(),  "Cold Nether Iron");
        add(ModItems.CARDBOARD.get(),   "Carbon Dioxide");
        add(ModItems.OPTICALNANO_INGOT.get(), "Opticalnano Ingot");
        add(ModItems.LICHTSTAUB.get(),  "LichtStaub");
        add(ModItems.GENESIS_SWORD_INTENT.get(),  "Genesis_sword Intent");
        add(ModItems.QUANTUM_CORE.get(),  "Quantum Core");


        add(ModItems.ALLOY_HANDLE.get(),  "Alloy Handle");

        add(ModItems.Lo_Zhi.get(),  "Lo Zhi");


        add(ModItems.ANGELIKA.get(),  "Angelika");
        add(ModItems.OPTICALNANO_PICKAXE.get(),  "Opticalnano Pickaxe");
        add(ModItems.OPTICALNANO_AXE.get(),  "Opticalnano Axe");
        add(ModItems.OPTICALNANO_SHOVEL.get(), "Opticalnano Shovel");

        add(ModItems.PICKAXE_AXE_ITEM.get(),  "Pickaxe Axe");
        add(ModItems.PICKAXE_AXE_ITEM2.get(),   "Pickaxe Axe 2");


        add(ModBlocks.ICE_ETHER_ORE.get(), "Ice Ether Ore");
        add(ModBlocks.COLD_NETHER_ORE.get(), "Cold Nether Ore");
        add(ModBlocks.ICE_ETHER_BLOCK.get(), "Ice Ether Block");
        add(ModBlocks.RAW_ICE_ETHER_BLOCK.get(), "Raw Ice Ether Block");
        add(ModBlocks.AGGREGATED_LICHTSTAUB.get(),  "Aggregated LichtStatub");

        add("itemGroup.long_tab","LG-Genesis:Materials");
        add("itemGroup.long_tab2","LG-Genesis:Tools");
        add("itemGroup.long_tab3","LG-Genesis:Foods");
        add("itemGroup.long_tab4","LG-Genesis:Ore & Blocks");
    }
}
