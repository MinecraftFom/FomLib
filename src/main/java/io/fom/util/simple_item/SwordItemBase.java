package io.fom.util.simple_item;

import javax.annotation.Nullable;
import io.fom.util.mod_tabs.Tabs;
import io.fom.util.proxy.EnumProxyModelTypes;
import io.fom.util.proxy.IFomLibItemTagImplementation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class SwordItemBase extends ItemSword implements IFomLibItemTagImplementation {
    @Nullable
    private int colorHex;
    public SwordItemBase(Item.ToolMaterial material,
                         @Nullable boolean setTab,
                         @Nullable CreativeTabs tab,
                         @Nullable int getColorHex
    ) {
        super(material);
        setUnlocalizedName(material.name() + "_sword");
        setRegistryName(material.name() + "_sword");
        setCreativeTab(setTab ? tab : Tabs.tools_tab);
        colorHex = getColorHex;
    }

    @Override
    public EnumProxyModelTypes getModel() {
        return EnumProxyModelTypes.SWORD;
    }

    @Override
    public int getColorHex() {
        return colorHex;
    }
}
