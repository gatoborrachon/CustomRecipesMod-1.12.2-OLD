package com.gato.forgecraftcustomrecipes.items;

import com.gato.forgecraftcustomrecipes.ForgecraftCustomRecipes;
import com.gato.forgecraftcustomrecipes.init.ModItems;
import com.gato.forgecraftcustomrecipes.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import nmd.primal.forgecraft.ModInfo;

public class ItemBase extends Item implements IHasModel
{

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(ModInfo.TAB_FORGECRAFT);
	
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		
		ForgecraftCustomRecipes.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
