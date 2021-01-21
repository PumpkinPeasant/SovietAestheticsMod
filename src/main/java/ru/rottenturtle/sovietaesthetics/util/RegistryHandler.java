package ru.rottenturtle.sovietaesthetics.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import ru.rottenturtle.sovietaesthetics.SovietAesthetics;
import ru.rottenturtle.sovietaesthetics.blocks.BlockItemBase;
import ru.rottenturtle.sovietaesthetics.blocks.Chair;
import ru.rottenturtle.sovietaesthetics.items.ItemBase;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SovietAesthetics.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SovietAesthetics.MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    //BLOCKS
    public static final RegistryObject<Block> CHAIR = BLOCKS.register("chair", Chair::new);

    //BLOCK ITEMS
    public static final RegistryObject<Item> CHAIR_ITEM = ITEMS.register("chair_item", () -> new BlockItemBase(CHAIR.get()) );


    //ITEMS

   // public static final RegistryObject<CarpetEntity> CARPET = ITEMS.register("carpet_entity", CarpetEntity::new);

}
