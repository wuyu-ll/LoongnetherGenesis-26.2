package com.wuyu.mymod_1.datagen;

import com.wuyu.mymod_1.block.ModBlocks;
import com.wuyu.mymod_1.LoongnetherGenesis;
import com.wuyu.mymod_1.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipesProvider extends RecipeProvider {
    protected ModRecipesProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    private static final List<ItemLike> ICE_ETHER_LIST = List.of(ModBlocks.ICE_ETHER_ORE,ModItems.ICE_ETHER);
    private static final List<ItemLike> COLD_NETHER_IRON_LIST = List.of(ModBlocks.COLD_NETHER_ORE);
    private static final List<ItemLike> CARDBOARD_LIST = List.of(ModItems.RAW_ICE_ETHER);
    private static final List<ItemLike> OPTICALNANO_LIST = List.of(ModBlocks.AGGREGATED_LICHTSTAUB);

    @Override
    protected void buildRecipes() {
        oreSmelting(ICE_ETHER_LIST, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.ICE_ETHER, 0.7f, 300, "ice_ether");
        oreBlasting(CARDBOARD_LIST,RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.CARDBOARD, 0.8f, 500, "carbod");
        oreBlasting(COLD_NETHER_IRON_LIST, RecipeCategory.MISC, CookingBookCategory.MISC, ModItems.COLD_NETHER_IRON, 0.8f, 400, "cold_nether");
        oreBlasting(OPTICALNANO_LIST, RecipeCategory.MISC ,CookingBookCategory.MISC, ModItems.OPTICALNANO_INGOT, 0.8f, 450, "opticalnano");


        nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.ICE_ETHER, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ICE_ETHER_BLOCK);
        nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.RAW_ICE_ETHER, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RAW_ICE_ETHER_BLOCK);
        nineBlockStorageRecipes(RecipeCategory.MISC, ModItems.LICHTSTAUB, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AGGREGATED_LICHTSTAUB);

        shapeless(RecipeCategory.MISC, ModItems.CLOUD_CRYSTAL)
                .requires(ModItems.ICE_ETHER)
                .requires(ModItems.CARDBOARD)
                .unlockedBy("has_ice_ether", has(ModItems.ICE_ETHER))
                .save(output);

        shaped(RecipeCategory.MISC, ModItems.ALLOY_HANDLE)
                .define('x', Items.NETHERITE_INGOT)
                .pattern("x")
                .pattern("x")
                .pattern("x")
                .unlockedBy("has_netherite_ingot", has(Items.NETHERITE_INGOT))
                .save(output);
        shaped(RecipeCategory.MISC, ModItems.OPTICALNANO_AXE )
                .define('x', ModItems.OPTICALNANO_INGOT)
                .define('y', ModItems.ALLOY_HANDLE)
                .pattern("xxx")
                .pattern("xy ")
                .pattern(" y ")
                .unlockedBy("has_opticalnano_ingot", has(ModItems.OPTICALNANO_AXE))
                .save(output);
        shaped(RecipeCategory.MISC, ModItems.OPTICALNANO_PICKAXE )
                .define('x', ModItems.OPTICALNANO_INGOT)
                .define('y', ModItems.ALLOY_HANDLE)
                .pattern("xxx")
                .pattern(" y ")
                .pattern(" y ")
                .unlockedBy("has_opticalnano_ingot", has(ModItems.OPTICALNANO_AXE))
                .save(output);
        shaped(RecipeCategory.MISC, ModItems.OPTICALNANO_SHOVEL )
                .define('x', ModItems.OPTICALNANO_INGOT)
                .define('y', ModItems.ALLOY_HANDLE)
                .pattern(" x ")
                .pattern(" y ")
                .pattern(" y ")
                .unlockedBy("has_opticalnano_ingot", has(ModItems.OPTICALNANO_AXE))
                .save(output);

    }


    protected void nineBlockStorageRecipes(RecipeCategory unpackedFormCategory, ItemLike unpackedForm, RecipeCategory packedFormCategory, ItemLike packedForm) {
        this.nineBlockStorageRecipes(unpackedFormCategory, unpackedForm, packedFormCategory, packedForm, getSimpleRecipeName(packedForm), (String)null, getSimpleRecipeName(unpackedForm), (String)null);
    }

    protected void oreSmelting(List<ItemLike> smeltables, RecipeCategory craftingCategory, CookingBookCategory cookingCategory, ItemLike result, float experience, int cookingTime, String group) {
        this.oreCooking(SmeltingRecipe::new, smeltables, craftingCategory, cookingCategory, result, experience, cookingTime, group, "_from_smelting");
    }

    protected void oreBlasting(List<ItemLike> smeltables, RecipeCategory craftingCategory, CookingBookCategory cookingCategory, ItemLike result, float experience, int cookingTime, String group) {
        this.oreCooking(BlastingRecipe::new, smeltables, craftingCategory, cookingCategory, result, experience, cookingTime, group, "_from_blasting");
    }

    protected <T extends AbstractCookingRecipe> void oreCooking(AbstractCookingRecipe.Factory<T> factory, List<ItemLike> smeltables, RecipeCategory craftingCategory, CookingBookCategory cookingCategory, ItemLike result, float experience, int cookingTime, String group, String fromDesc) {
        for (ItemLike item : smeltables) {
            SimpleCookingRecipeBuilder
                    .generic(Ingredient.of(item), craftingCategory, cookingCategory, result, experience, cookingTime, factory)
                    .group(group)
                    .unlockedBy(getHasName(item), this.has(item))
                    .save(this.output, LoongnetherGenesis.MOD_ID + getItemName(result) + fromDesc + "_" + getItemName(item));
        }

    }
    public static class Runner extends RecipeProvider.Runner {

        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
            super(packOutput, registries);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
            return new ModRecipesProvider(registries,output);
        }

        @Override
        public String getName() {
            return "recipe gen";
        }
    }
}