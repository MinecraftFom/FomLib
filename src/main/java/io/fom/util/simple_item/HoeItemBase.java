package io.fom.util.simple_item;

import javax.annotation.Nullable;
import io.fom.util.mod_tabs.Tabs;
import io.fom.util.proxy.EnumProxyModelTypes;
import io.fom.util.proxy.IFomLibItemTagImplementation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class HoeItemBase extends ItemHoe implements IFomLibItemTagImplementation {
    private int colorHex;
    public HoeItemBase(ToolMaterial material,
                       @Nullable boolean setTab,
                       @Nullable CreativeTabs tab,
                       @Nullable int getColorHex
    ) {
        super(material);
        setUnlocalizedName(material.name().toLowerCase() + "_hoe");
        setRegistryName(material.name().toLowerCase() + "_hoe");
        setHarvestLevel("hoe", material.getHarvestLevel());
        setMaxStackSize(1);
        setCreativeTab(setTab ? tab : Tabs.tools_tab);
        colorHex = getColorHex;
    }
    @Override
    public EnumProxyModelTypes getModel() { return EnumProxyModelTypes.HOE; }
    @Override
    public int getColorHex() { return colorHex; }
}
