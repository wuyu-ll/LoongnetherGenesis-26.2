package com.wuyu.mymod_1.item;

import com.wuyu.mymod_1.LoongnetherGenesis;
import com.wuyu.mymod_1.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABs =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LoongnetherGenesis.MOD_ID);
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> long_TAB =
            CREATIVE_MODE_TABs.register("long_tab",() -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.long_tab"))
                    .withTabsBefore(CreativeModeTabs.COMBAT)
                    .icon(() -> new ItemStack(ModItems.ICE_ETHER.get()))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ICE_ETHER);
                        output.accept(ModItems.RAW_ICE_ETHER);
                        output.accept(ModItems.CARDBOARD);
                        output.accept(ModItems.COLD_NETHER_IRON);
                        output.accept(ModItems.CLOUD_CRYSTAL);
                        output.accept(ModItems.OPTICALNANO_INGOT);
                        output.accept(ModItems.LICHTSTAUB);
                        output.accept(ModItems.GENESIS_SWORD_INTENT);
                        output.accept(ModItems.QUANTUM_CORE);
                    }).build());
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> Long_TAB2 =
            CREATIVE_MODE_TABs.register("long_tab2",() -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.long_tab2"))
                    .withTabsBefore(ModCreativeModeTabs.long_TAB.getId())
                    .icon(() -> new ItemStack(ModItems.ICE_ETHER.get()))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ANGELIKA);
                        output.accept(ModItems.OPTICALNANO_PICKAXE);
                        output.accept(ModItems.OPTICALNANO_AXE);
                        output.accept(ModItems.OPTICALNANO_SHOVEL);

                        output.accept(ModItems.ALLOY_HANDLE);
                    }).build());
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> Long_TAB3 =
            CREATIVE_MODE_TABs.register("long_tab3",() -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.long_tab3"))
                    .withTabsBefore(ModCreativeModeTabs.Long_TAB2.getId())
                    .icon(() -> new ItemStack(ModItems.Lo_Zhi.get()))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.Lo_Zhi);
                    }).build());
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> Long_TAB4 =
            CREATIVE_MODE_TABs.register("long_tab4",() -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.long_tab4"))
                    .withTabsBefore(ModCreativeModeTabs.Long_TAB3.getId())
                    .icon(() -> new ItemStack(ModBlocks.ICE_ETHER_BLOCK.get()))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.ICE_ETHER_BLOCK);
                        output.accept(ModBlocks.RAW_ICE_ETHER_BLOCK);
                        output.accept(ModBlocks.ICE_ETHER_ORE);
                        output.accept(ModBlocks.COLD_NETHER_ORE);
                        output.accept(ModBlocks.AGGREGATED_LICHTSTAUB);

                    }).build());
    public  static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABs.register(eventBus);
        LoongnetherGenesis.LOGGER.info("registering Mod Creative mode Tabs for" + LoongnetherGenesis.MOD_ID);
    }
}
