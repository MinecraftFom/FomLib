package io.fom.util.simple_item;

import javax.annotation.Nullable;
import io.fom.util.proxy.EnumProxyModelTypes;
import io.fom.util.proxy.IFomLibItemTagImplementation;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;

public class ItemBase extends Item implements IFomLibItemTagImplementation {
    private int colorHex;
    private EnumProxyModelTypes model;
    public ItemBase(String unlocalizedName,
                    String registryName,
                    CreativeTabs tab,
                    int stackSize,
                    @Nullable int colorHex,
                    @Nullable EnumProxyModelTypes model
    ) {
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(registryName);
        this.setCreativeTab(tab);
        this.setMaxStackSize(stackSize);
    }
    @Override
    public EnumProxyModelTypes getModel() { return model; }
    @Override
    public int getColorHex() { return colorHex; }
}
