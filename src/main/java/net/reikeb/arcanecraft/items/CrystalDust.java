package net.reikeb.arcanecraft.items;

import net.minecraft.block.BlockState;
import net.minecraft.item.*;

import net.reikeb.arcanecraft.setup.ItemGroups;

public class CrystalDust extends Item {

    public CrystalDust() {
        super(new Properties()
                .stacksTo(64)
                .tab(ItemGroups.ARCANECRAFT));
    }

    @Override
    public int getEnchantmentValue() {
        return 0;
    }

    @Override
    public int getUseDuration(ItemStack itemstack) {
        return 0;
    }

    @Override
    public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
        return 1F;
    }
}