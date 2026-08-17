package com.wuyu.mymod_1.datagen;

import com.wuyu.mymod_1.block.ModBlocks;
import com.wuyu.mymod_1.item.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;

import java.util.Set;

public class ModBlockLootTablesProvider extends BlockLootSubProvider {
    public ModBlockLootTablesProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.DEFAULT_FLAGS, registries);
    }



    @Override
    protected void generate() {
        dropSelf(ModBlocks.ICE_ETHER_ORE.get());
        dropSelf(ModBlocks.COLD_NETHER_ORE.get());
        dropSelf(ModBlocks.ICE_ETHER_BLOCK.get());
        dropSelf(ModBlocks.RAW_ICE_ETHER_BLOCK.get());
        dropSelf(ModBlocks.AGGREGATED_LICHTSTAUB.get());
        dropSelf(ModBlocks.UNTERIRDISIER_LAND.get());
        add(ModBlocks.ICE_ETHER_ORE.get(), createOreLikeDrops(ModBlocks.ICE_ETHER_ORE.get(), ModItems.RAW_ICE_ETHER.get()));
    }

    protected LootTable.Builder createOreLikeDrops(Block block, Item item) {
        HolderLookup.RegistryLookup<Enchantment> enchantments = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this
                .createSilkTouchDispatchTable(block, (LootPoolEntryContainer.Builder)
                this
                        .applyExplosionDecay(block, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 2.0F)))
                        .apply(ApplyBonusCount.addOreBonusCount(enchantments.getOrThrow(Enchantments.FORTUNE)))));
    }

     @Override
     protected Iterable<Block> getKnownBlocks() {
         return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;


    }
}
