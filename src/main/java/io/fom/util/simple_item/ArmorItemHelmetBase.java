package io.fom.util.simple_item;

import javax.annotation.Nullable;
import io.fom.util.mod_tabs.Tabs;
import io.fom.util.proxy.EnumProxyModelTypes;
import io.fom.util.proxy.IFomLibItemTagImplementation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorItemHelmetBase extends ItemArmor implements IFomLibItemTagImplementation {
    private int colorHex;
    public ArmorItemHelmetBase(ArmorMaterial material,
                               @Nullable boolean setTab,
                               @Nullable CreativeTabs tab,
                               @Nullable int getColorHex
    ) {
        super(material, EntityEquipmentSlot.HEAD.getSlotIndex(), EntityEquipmentSlot.HEAD);
        setUnlocalizedName(material.name() + "_helmet");
        setRegistryName(material.name() + "_helmet");
        setMaxStackSize(1);
        setCreativeTab(setTab ? tab : Tabs.armor_tab);
        colorHex = getColorHex;
    }
    @Override
    public EnumProxyModelTypes getModel() { return EnumProxyModelTypes.HELMET; }
    @Override
    public int getColorHex() { return colorHex; }
}
