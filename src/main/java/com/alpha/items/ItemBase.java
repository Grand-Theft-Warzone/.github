package com.alpha.items;

import com.alpha.CashItem;
import com.alpha.init.ModItems;
import com.alpha.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name)
    {
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {

        CashItem.proxy.registerItemRenderer(this, 0, "inventory");

    }
}
