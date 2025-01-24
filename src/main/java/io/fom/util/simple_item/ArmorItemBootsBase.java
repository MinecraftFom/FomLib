package io.fom.util.simple_item;

import javax.annotation.Nullable;
import io.fom.util.mod_tabs.Tabs;
import io.fom.util.proxy.EnumProxyModelTypes;
import io.fom.util.proxy.IFomLibItemTagImplementation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorItemBootsBase extends ItemArmor implements IFomLibItemTagImplementation {
    @Nullable
    private int colorHex;
    public ArmorItemBootsBase(ArmorMaterial material,
                              @Nullable boolean setTab,
                              @Nullable CreativeTabs tab,
                              @Nullable int getColorHex
    ) {
        super(material, EntityEquipmentSlot.FEET.getSlotIndex(), EntityEquipmentSlot.FEET);
        setUnlocalizedName(material.name().toLowerCase() + "_boots");
        setRegistryName(material.name().toLowerCase() + "_boots");
        setMaxStackSize(1);
        setCreativeTab(setTab ? tab : Tabs.armor_tab);
        colorHex = getColorHex;
    }
    @Override
    public EnumProxyModelTypes getModel() {
        return EnumProxyModelTypes.BOOTS;
    }
    @Override
    public int getColorHex() {
        return colorHex;
    }
}
