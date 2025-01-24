package io.fom.util.simple_item;

import javax.annotation.Nullable;
import io.fom.util.mod_tabs.Tabs;
import io.fom.util.proxy.EnumProxyModelTypes;
import io.fom.util.proxy.IFomLibItemTagImplementation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class PickaxeItemBase extends ItemPickaxe implements IFomLibItemTagImplementation {
    private int colorHex;
    public PickaxeItemBase(ToolMaterial material,
                           @Nullable boolean setTab,
                           @Nullable CreativeTabs tab,
                           @Nullable int getColorHex
    ) {
        super(material);
        setUnlocalizedName(material.name() + "_pickaxe");
        setRegistryName(material.name() + "_pickaxe");
        setHarvestLevel("pickaxe" , material.getHarvestLevel());
        setMaxStackSize(1);
        setCreativeTab(setTab ? tab : Tabs.tools_tab);
        colorHex = getColorHex;
    }
    @Override
    public EnumProxyModelTypes getModel() { return EnumProxyModelTypes.PICKAXE; }
    @Override
    public int getColorHex() { return colorHex; }
}
