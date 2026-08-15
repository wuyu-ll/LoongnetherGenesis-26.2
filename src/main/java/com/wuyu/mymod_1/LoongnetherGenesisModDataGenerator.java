package com.wuyu.mymod_1;

import com.wuyu.mymod_1.datagen.*;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.List;
import java.util.Set;

@EventBusSubscriber(modid = LoongnetherGenesis.MOD_ID)
public class LoongnetherGenesisModDataGenerator {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent.Client event) {
        event.createProvider(((output, lookupProvider)->
                        new LootTableProvider(output,Set.of(),List.of(new LootTableProvider.SubProviderEntry(
                                ModBlockLootTablesProvider::new, LootContextParamSets.BLOCK
                        )), lookupProvider)));



        event.createProvider(ModRecipesProvider.Runner::new);
        event.createProvider(ModBlocksTagsProvider::new);
        event.createProvider(ModItemTagsProvider::new);
        event.createProvider(ModEnUsLangProvider::new);
        event.createProvider(ModZhCnLangProvider::new);
        event.createProvider(ModModelsProvider::new);



    }
}
