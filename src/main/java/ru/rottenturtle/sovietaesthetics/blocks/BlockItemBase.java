package ru.rottenturtle.sovietaesthetics.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import ru.rottenturtle.sovietaesthetics.SovietAesthetics;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {
        super(block, new Item.Properties().group(SovietAesthetics.FURNITURE));
    }
}
