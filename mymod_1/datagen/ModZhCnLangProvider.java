package com.wuyu.mymod_1.datagen;

import com.wuyu.mymod_1.block.ModBlocks;
import com.wuyu.mymod_1.LoongnetherGenesis;
import com.wuyu.mymod_1.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class ModZhCnLangProvider extends LanguageProvider {
    public ModZhCnLangProvider(PackOutput output) {
        super(output, LoongnetherGenesis.MOD_ID, "zh_cn");
    }

    @Override
    protected void addTranslations() {
        add(ModItems.CLOUD_CRYSTAL.get(), "云晶");
        add(ModItems.ICE_ETHER.get(), "玄晶");
        add(ModItems.RAW_ICE_ETHER.get(), "玄冥聚尘");
        add(ModItems.COLD_NETHER_IRON.get(),  "寒冥锻铁");
        add(ModItems.CARDBOARD.get(),   "玄冥宝珠");
        add(ModItems.OPTICALNANO_INGOT.get(), "光纳米聚合锭");
        add(ModItems.LICHTS_TAUB.get(), "光尘");
        add(ModItems.GENESIS_SWORD_INTENT.get(), "创世剑意");
        add(ModItems.QUANTUM_CORE.get(), "量子核心");
        add(ModItems.DAMONEN_STAUB.get(), "魔尘");
        add(ModItems.REINER_DAMON_STAUB.get(), "纯化魔尘");


        add(ModItems.ALLOY_HANDLE.get(), "合金手柄");

        add(ModItems.Lo_Zhi.get(), "洛枳冥果");

        add(ModItems.ANGELIKA.get(), "白芷");
        add(ModItems.OPTICALNANO_PICKAXE.get(), "光纳米镐");
        add(ModItems.OPTICALNANO_SHOVEL.get(), "光纳米铲");
        add(ModItems.OPTICALNANO_AXE.get(), "光纳米斧");

        add(ModItems.OPTICAL_QUANTUM_HELMET.get(), "光量子头盔");
        add(ModItems.OPTICAL_QUANTUM_CHESTPLATE.get(), "光量子胸甲");
        add(ModItems.OPTICAL_QUANTUM_LEGGINGS.get(), "光量子护腿");
        add(ModItems.OPTICAL_QUANTUM_BOOTS.get(), "光量子战靴");


        add(ModBlocks.ICE_ETHER_ORE.get(), "玄冥聚能矿");
        add(ModBlocks.COLD_NETHER_ORE.get(), "寒冥矿石");
        add(ModBlocks.ICE_ETHER_BLOCK.get(), "玄冥立方");
        add(ModBlocks.RAW_ICE_ETHER_BLOCK.get(), "统合聚尘（玄）");
        add(ModBlocks.AGGREGATED_LICHTSTAUB.get(), "聚合光尘");
        add(ModBlocks.UNTERIRDISIER_LAND.get(), "冥化土");


        add("itemGroup.long_tab","龙冥:材料");
        add("itemGroup.long_tab2","龙冥:工具与装备");
        add("itemGroup.long_tab3","龙冥：食物");
        add("itemGroup.long_tab4","龙冥：矿石与方块");
    }
}



