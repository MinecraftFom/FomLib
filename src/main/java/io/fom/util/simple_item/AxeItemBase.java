package io.fom.util.simple_item;

import javax.annotation.Nullable;
import io.fom.util.mod_tabs.Tabs;
import io.fom.util.proxy.EnumProxyModelTypes;
import io.fom.util.proxy.IFomLibItemTagImplementation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class AxeItemBase extends ItemAxe implements IFomLibItemTagImplementation {
    private int colorHex;
    public AxeItemBase(ToolMaterial material,
                       @Nullable boolean setTab,
                       @Nullable CreativeTabs tab,
                       @Nullable int getColorHex
    ) {
        super(material);
        setUnlocalizedName(material.name() + "_axe");
        setRegistryName(material.name() + "_axe");
        setHarvestLevel("axe", material.getHarvestLevel());
        setMaxStackSize(1);
        setCreativeTab(setTab ? tab : Tabs.tools_tab);
        colorHex = getColorHex;
    }
    @Override
    public EnumProxyModelTypes getModel() { return EnumProxyModelTypes.AXE; }
    @Override
    public int getColorHex() { return colorHex; }
}
