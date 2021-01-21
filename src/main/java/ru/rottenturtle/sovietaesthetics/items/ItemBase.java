package ru.rottenturtle.sovietaesthetics.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import ru.rottenturtle.sovietaesthetics.SovietAesthetics;

public class ItemBase extends Item {

    public ItemBase() {
        super(
                new Properties().group(SovietAesthetics.FURNITURE)
        );
    }
}
