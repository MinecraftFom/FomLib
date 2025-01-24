package io.fom.util.simple_item;

import javax.annotation.Nullable;
import io.fom.util.mod_tabs.Tabs;
import io.fom.util.proxy.EnumProxyModelTypes;
import io.fom.util.proxy.IFomLibItemTagImplementation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorItemLeggingsBase extends ItemArmor implements IFomLibItemTagImplementation {
    private int colorHex;
    public ArmorItemLeggingsBase(ArmorMaterial material,
                                 @Nullable boolean setTab,
                                 @Nullable CreativeTabs tab,
                                 @Nullable int getColorHex
    ) {
        super(material, EntityEquipmentSlot.LEGS.getSlotIndex(), EntityEquipmentSlot.LEGS);
        setUnlocalizedName(material.name() + "_leggings");
        setRegistryName(material.name() + "_leggings");
        setMaxStackSize(1);
        setCreativeTab(setTab ? tab : Tabs.armor_tab);
        colorHex = getColorHex;
    }
    @Override
    public EnumProxyModelTypes getModel() { return EnumProxyModelTypes.LEGGINGS; }
    @Override
    public int getColorHex() { return colorHex; }
}
