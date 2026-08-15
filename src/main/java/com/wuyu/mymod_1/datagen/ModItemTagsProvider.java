package com.wuyu.mymod_1.datagen;


import com.wuyu.mymod_1.LoongnetherGenesis;
import com.wuyu.mymod_1.item.ModItems;
import com.wuyu.mymod_1.tag.ModItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ItemTagsProvider;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {

    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, LoongnetherGenesis.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        tag(ModItemTags.COLD_NETHER_IRON_MA)
                .add(ModItems.COLD_NETHER_IRON.getKey());
        tag(ModItemTags.OPTICALNANO_INGOT_MA)
                .add(ModItems.OPTICALNANO_INGOT.getKey());


       }
    }