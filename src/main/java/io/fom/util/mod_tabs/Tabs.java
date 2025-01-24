package io.fom.util.mod_tabs;

import io.fom.util.FomLib;
import io.fom.util.util.IconItem;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class Tabs {
    public static CreativeTabs misc_tab = new CreativeTabs("misc_tab") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(FomLib.ICON_ITEM);
        }
    };

    public static CreativeTabs tools_tab = new CreativeTabs("tools_tab") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(FomLib.ICON_ITEM);
        }
    };

    public static CreativeTabs blocks_tab = new CreativeTabs("blocks_tab") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(FomLib.ICON_ITEM);
        }
    };

    public static CreativeTabs armor_tab = new CreativeTabs("armor_tab") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(FomLib.ICON_ITEM);
        }
    };

    public static CreativeTabs food_tab = new CreativeTabs("food_tab") {
        @Override
        public ItemStack getTabIconItem() {
            return new ItemStack(FomLib.ICON_ITEM);
        }
    };
}
