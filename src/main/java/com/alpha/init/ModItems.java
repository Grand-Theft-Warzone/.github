package com.alpha.init;

import com.alpha.items.ItemBase;
import net.minecraft.item.Item;

import java.util.*;

public class ModItems {

    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static final Item CASH = new ItemBase("cash10");    //name is not fine with texture issues
    public static final Item CASH50 = new ItemBase("cash50");      //Name seems fine but with texture issues
    public static final Item CASH100 = new ItemBase("cash100");       //name seems fine but with texture issues
    public static final Item CASH500 = new ItemBase("cash500");     //name is not fine with texture issues

}
