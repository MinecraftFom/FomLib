package io.fom.util.util;

import io.fom.util.mod_tabs.Tabs;
import net.minecraft.item.Item;

public class IconItem extends Item {
    public IconItem() {
        setUnlocalizedName("icon");
        setRegistryName("icon");
        setCreativeTab(Tabs.misc_tab);
    }
}
