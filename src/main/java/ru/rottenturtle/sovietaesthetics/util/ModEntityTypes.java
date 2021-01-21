//package ru.rottenturtle.sovietaesthetics.util;
//
//import net.minecraft.entity.EntityClassification;
//import net.minecraft.entity.EntityType;
//import net.minecraft.util.ResourceLocation;
//import net.minecraftforge.fml.RegistryObject;
//import net.minecraftforge.registries.DeferredRegister;
//import net.minecraftforge.registries.ForgeRegistries;
//import ru.rottenturtle.sovietaesthetics.SovietAesthetics;
//import ru.rottenturtle.sovietaesthetics.entities.CarpetEntity;
//
//public class ModEntityTypes {
//    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, SovietAesthetics.MOD_ID);
//
//    //Entity Types
//    public static final RegistryObject<EntityType<CarpetEntity>> CARPET = ENTITY_TYPES.register("carpet", () ->
//            EntityType.Builder.create(CarpetEntity::new, EntityClassification.MISC)
//            .size(1.0f,1.0f)
//            .build(new ResourceLocation(SovietAesthetics.MOD_ID, "carpet").toString()
//            ));
//}
