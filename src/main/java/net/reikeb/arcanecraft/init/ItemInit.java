package net.reikeb.arcanecraft.init;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.*;

import net.reikeb.arcanecraft.ArcaneCraft;
import net.reikeb.arcanecraft.items.*;
import net.reikeb.arcanecraft.setup.ItemGroups;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            ArcaneCraft.MODID);

    // Items
    public static final RegistryObject<Item> CRYSTAL = ITEMS.register("crystal", Crystal::new);

    // BlockItems
    public static final RegistryObject<Item> RUNIC_STONE_ITEM = ITEMS.register("runic_stone", () ->
            new BlockItem(BlockInit.RUNIC_STONE.get(), new Item.Properties().tab(ItemGroups.ARCANECRAFT)));
}
