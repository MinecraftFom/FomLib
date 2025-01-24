package io.fom.util.simple_item;

import javax.annotation.Nullable;
import io.fom.util.mod_tabs.Tabs;
import io.fom.util.proxy.EnumProxyModelTypes;
import io.fom.util.proxy.IFomLibItemTagImplementation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmorItemChestBase extends ItemArmor implements IFomLibItemTagImplementation {
    private int colorHex;
    public ArmorItemChestBase(ArmorMaterial material,
                              @Nullable boolean setTab,
                              @Nullable CreativeTabs tab,
                              @Nullable int getColorHex
    ) {
        super(material, EntityEquipmentSlot.CHEST.getSlotIndex(), EntityEquipmentSlot.CHEST);
        setUnlocalizedName(material.name().toLowerCase() + "_chestplate");
        setRegistryName(material.name().toLowerCase() + "_chestplate");
        setMaxStackSize(1);
        setCreativeTab(setTab ? tab : Tabs.armor_tab);
        colorHex = getColorHex;
    }
    @Override
    public EnumProxyModelTypes getModel() { return EnumProxyModelTypes.CHESTPLATE; }
    @Override
    public int getColorHex() { return colorHex; }
}
