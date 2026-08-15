package com.wuyu.mymod_1.item;

import com.wuyu.mymod_1.LoongnetherGenesis;
import com.wuyu.mymod_1.tag.ModBlockTags;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ShovelItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(LoongnetherGenesis.MOD_ID);

    public static final DeferredItem<Item> ICE_ETHER = ITEMS.registerSimpleItem("ice_ether");
    public static final DeferredItem<Item> RAW_ICE_ETHER = ITEMS.registerSimpleItem("raw_ice_ether");
    public static final DeferredItem<Item> CARDBOARD = ITEMS.registerSimpleItem( "material/cardboard");
    public static final DeferredItem<Item> COLD_NETHER_IRON = ITEMS.registerSimpleItem("cold_nether_iron");
    public static final DeferredItem<Item> CLOUD_CRYSTAL = ITEMS.registerSimpleItem("cloud_crystal");
    public static final DeferredItem<Item> OPTICALNANO_INGOT = ITEMS.registerSimpleItem("opticalnano_ingot");
    public static final DeferredItem<Item> LICHTSTAUB = ITEMS.registerSimpleItem("lichtstaub");
    public static final DeferredItem<Item> GENESIS_SWORD_INTENT = ITEMS.registerSimpleItem("genesis_sword_intent");
    public static final DeferredItem<Item> QUANTUM_CORE = ITEMS.registerSimpleItem("quantum_core");
    public static final DeferredItem<Item> LICHT_QUANT_HELMET = ITEMS.registerSimpleItem("licht_quant_helmet");




    public static final DeferredItem<Item> ALLOY_HANDLE = ITEMS.registerSimpleItem("alloy_handle");



    public static final DeferredItem<Item> ANGELIKA = ITEMS.registerItem("angelika",
            p -> new Item(p.sword(ModToolMaterials.ANGELIKA, 3f, -2.4F)));

    public static final DeferredItem<Item> OPTICALNANO_PICKAXE = ITEMS.registerItem("opticalnano_pickaxe",
            p -> new Item(p.pickaxe(ModToolMaterials.OPTICAL_NANO_INGOT, 1.5f, -2.6F)));
    public static final DeferredItem<Item> OPTICALNANO_AXE = ITEMS.registerItem("opticalnano_axe",
            p -> new AxeItem(ModToolMaterials.OPTICAL_NANO_INGOT, 5.0F, -2.2F,p));
    public static final DeferredItem<Item> OPTICALNANO_SHOVEL = ITEMS.registerItem("opticalnano_shovel",
            p -> new ShovelItem(ModToolMaterials.OPTICAL_NANO_INGOT, 2.0F, -2.2F,p));



    public static final DeferredItem<Item> PICKAXE_AXE_ITEM = ITEMS.registerItem("pickaxe_axe_item",
            p -> new Item(p.tool(ModToolMaterials.OPTICAL_NANO_INGOT, ModBlockTags.PICKAXE_AXE_MINEABLE,5.0f,-2.2f,0.0f)));
    public static final DeferredItem<Item> PICKAXE_AXE_ITEM2 = ITEMS.registerItem("pickaxe_axe_item2",
            p -> new PickaxeAxeItem(ModToolMaterials.OPTICAL_NANO_INGOT, 5.0F, -2.2F,p));


    public static final DeferredItem<Item> Lo_Zhi = ITEMS.registerSimpleItem("lo_zhi", () -> new Item.Properties().food(ModFoods.Lo_Zhi_FOOD, ModFoods.Lo_Zhi_CONSUMABLE));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
        LoongnetherGenesis.LOGGER.info("Registering Mod Items for " + LoongnetherGenesis.MOD_ID);
    }
}
