package com.gato.customrecipesmod.recipes;

import com.gato.customrecipesmod.init.ModItems;

import defeatedcrow.hac.api.climate.DCHeatTier;
import defeatedcrow.hac.api.recipe.RecipeAPI;
import frogcraftrebirth.common.FrogFluids;
import ic2.api.item.IC2Items;
//import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
//import net.minecraft.item.crafting.Ingredient;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.oredict.OreDictionary;
//import net.minecraftforge.oredict.OreDictionary;
//import net.minecraftforge.oredict.OreIngredient;
//import net.minecraftforge.registries.IForgeRegistry;
import nmd.primal.core.api.PrimalAPI;
//import nmd.primal.core.api.PrimalAPI.Items;
import nmd.primal.forgecraft.crafting.AnvilCrafting;
import nmd.primal.forgecraft.crafting.ForgeCrafting;
import nmd.primal.forgecraft.crafting.WorkbenchCrafting;


@EventBusSubscriber
public final class CustomRecipes
{
  @SubscribeEvent
  public static void registerRecipes(RegistryEvent.Register<WorkbenchCrafting> event) {
	  
	  //ForgeCraft
      //PrimalAPI.logger(7, "Registering Recipes: workbench");
      /*IForgeRegistry<WorkbenchCrafting> recipes = event.getRegistry();

	  recipes.register((WorkbenchCrafting)(new WorkbenchCrafting((Ingredient)new OreIngredient("stickTreatedWood"),           
      Ingredient.fromStacks(new ItemStack[] { new ItemStack(ModItems.FORGE_HAMMER_HEAD, 1) }),
      (Ingredient)new OreIngredient("pinBasic"), Ingredient.EMPTY, (Ingredient)new OreIngredient("toolGallagher"), IC2Items.getItem("forge_hammer")))
      .setRecipeName("ic2hammer"));*/
	  
      
      ItemStack emptyAir = ItemStack.EMPTY;
      
      NBTTagCompound setHot = new NBTTagCompound();
      setHot.setBoolean("hot", true);
      
      ItemStack hotIronIngot = new ItemStack(nmd.primal.forgecraft.init.ModItems.ironingotball, 1);
      hotIronIngot.setTagCompound(setHot);
      ItemStack hotChunk = new ItemStack(nmd.primal.forgecraft.init.ModItems.wroughtironchunk, 1);
      hotChunk.setTagCompound(setHot);
      
      ItemStack hotSteelIngot = new ItemStack(nmd.primal.forgecraft.init.ModItems.steelingotball, 1);
      hotSteelIngot.setTagCompound(setHot);
      ItemStack hotSteelChunk = new ItemStack(nmd.primal.forgecraft.init.ModItems.steelchunk, 1);
      hotSteelChunk.setTagCompound(setHot);
      
      ItemStack hotBronzeIngot = new ItemStack(nmd.primal.forgecraft.init.ModItems.bronzeingotball, 1);
      hotBronzeIngot.setTagCompound(setHot);
      ItemStack hotBronzeChunk = new ItemStack(nmd.primal.forgecraft.init.ModItems.bronzechunk, 1);
      hotBronzeChunk.setTagCompound(setHot);
      
      ForgeCrafting.addRecipe(nmd.primal.forgecraft.init.ModItems.bronzeingotball, hotBronzeIngot, 950, 250, 500, 1.0F, 1.0F);
      
      ForgeCrafting.addRecipe(nmd.primal.forgecraft.init.ModItems.bronzechunk, hotBronzeChunk, 950, 130, 500, 1.0F, 1.0F);

      
      AnvilCrafting.addRecipe(new ItemStack[] { emptyAir, emptyAir, emptyAir, emptyAir, emptyAir,
    		  									hotChunk, hotIronIngot, hotIronIngot, hotIronIngot, hotChunk,
    		  									hotChunk, hotChunk, emptyAir, hotChunk, hotChunk,
    		  									emptyAir, emptyAir, emptyAir, emptyAir, emptyAir,
    		  									emptyAir, emptyAir, emptyAir, emptyAir, emptyAir }, new ItemStack(ModItems.FORGE_HAMMER_HEAD, 1), "null");
      
      AnvilCrafting.addRecipe(new ItemStack[] { emptyAir, emptyAir, emptyAir, emptyAir, emptyAir,
												emptyAir, hotIronIngot, hotIronIngot, hotChunk, emptyAir,
												emptyAir, hotChunk, emptyAir, hotChunk, emptyAir,
												emptyAir, emptyAir, emptyAir, emptyAir, emptyAir,
												emptyAir, emptyAir, emptyAir, emptyAir, emptyAir }, new ItemStack(ModItems.IRON_HAMMER_HEAD, 1), "null");
      
      AnvilCrafting.addRecipe(new ItemStack[] { emptyAir, emptyAir, emptyAir, emptyAir, emptyAir,
												emptyAir, hotSteelIngot, hotSteelIngot, hotSteelChunk, emptyAir,
												emptyAir, hotSteelChunk, emptyAir, hotSteelChunk, emptyAir,
												emptyAir, emptyAir, emptyAir, emptyAir, emptyAir,
												emptyAir, emptyAir, emptyAir, emptyAir, emptyAir }, new ItemStack(ModItems.STEEL_HAMMER_HEAD, 1), "null");
      
      AnvilCrafting.addRecipe(new ItemStack[] { emptyAir, emptyAir, emptyAir, emptyAir, emptyAir,
												emptyAir, hotChunk, emptyAir, hotChunk, emptyAir,
												emptyAir, hotChunk, emptyAir, hotChunk, emptyAir,
												emptyAir, emptyAir, hotChunk, emptyAir, emptyAir,
												emptyAir, hotChunk, emptyAir, hotChunk, emptyAir }, IC2Items.getItem("cutter"), "null");
      
      AnvilCrafting.addRecipe(new ItemStack[] { emptyAir, hotBronzeChunk, emptyAir, hotBronzeChunk, emptyAir,
												emptyAir, hotBronzeChunk, emptyAir, hotBronzeChunk, emptyAir,
												emptyAir, hotBronzeChunk, hotBronzeIngot, hotBronzeChunk, emptyAir,
												emptyAir, emptyAir, hotBronzeIngot, emptyAir, emptyAir, 
												emptyAir, emptyAir, hotBronzeIngot, emptyAir, emptyAir }, IC2Items.getItem("wrench"), "null");
      
      
      //Heat and Climate
      
      RecipeAPI.registerReactorRecipes.addRecipe(new ItemStack(PrimalAPI.Items.WAX_RESIDUE, 2, 0), null, 0F, new FluidStack(PrimalAPI.Fluids.PARAFFIN,1500), null, DCHeatTier.OVEN, "saltSpecial", FluidRegistry.getFluidStack("benzene", 2000), null, new Object[] { new ItemStack(PrimalAPI.Items.PARAFFIN_CLUMP, 16, 0) });
      RecipeAPI.registerReactorRecipes.addRecipe(null, null, 0F, new FluidStack(PrimalAPI.Fluids.BITUMEN_BOILING,1000), null, DCHeatTier.OVEN, "saltSpecial", FluidRegistry.getFluidStack("bitumen", 1000), FluidRegistry.getFluidStack("brine", 250), new Object[] {  });

      RecipeAPI.registerReactorRecipes.addRecipe(null, null, 0F, new FluidStack(PrimalAPI.Fluids.OVIS_ATRE_MILK, 500), null, DCHeatTier.OVEN, ItemStack.EMPTY, FluidRegistry.getFluidStack("milk", 250), FluidRegistry.getFluidStack("magma_basaltic", 250), new Object[] {  });
      RecipeAPI.registerReactorRecipes.addRecipe(null, null, 0F, new FluidStack(PrimalAPI.Fluids.OVIS_ATRE_MILK, 500), null, DCHeatTier.OVEN, ItemStack.EMPTY, FluidRegistry.getFluidStack("milk", 250), FluidRegistry.getFluidStack("ic2pahoehoe_lava", 250), new Object[] {  });
      
    }
}