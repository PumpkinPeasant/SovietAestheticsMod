//package ru.rottenturtle.sovietaesthetics.entities;
//
//import net.minecraft.entity.Entity;
//import net.minecraft.entity.EntityType;
//import net.minecraft.entity.item.HangingEntity;
//import net.minecraft.entity.player.PlayerEntity;
//import net.minecraft.item.Items;
//import net.minecraft.network.IPacket;
//import net.minecraft.util.SoundEvents;
//import net.minecraft.world.GameRules;
//import net.minecraft.world.World;
//import ru.rottenturtle.sovietaesthetics.SovietAesthetics;
//import ru.rottenturtle.sovietaesthetics.util.ModEntityTypes;
//import ru.rottenturtle.sovietaesthetics.util.RegistryHandler;
//
//import javax.annotation.Nullable;
//
//public class CarpetEntity extends HangingEntity{
//
//    public CarpetEntity(EntityType<? extends HangingEntity> type, World p_i48561_2_) {
//        super(type, p_i48561_2_);
//    }
//
//    @Override
//    public int getWidthPixels() {
//        return 0;
//    }
//
//    @Override
//    public int getHeightPixels() {
//        return 0;
//    }
//
//    @Override
//    public void onBroken(@Nullable Entity brokenEntity) {
//        if (this.world.getGameRules().getBoolean(GameRules.DO_ENTITY_DROPS)) {
//            this.playSound(SoundEvents.BLOCK_WOOL_BREAK, 1.0F, 1.0F);
//            if (brokenEntity instanceof PlayerEntity) {
//                PlayerEntity playerentity = (PlayerEntity)brokenEntity;
//                if (playerentity.abilities.isCreativeMode) {
//                    return;
//                }
//            }
//
//            this.entityDropItem(Items.BIRCH_PLANKS);
//        }
//    }
//
//    @Override
//    public void playPlaceSound() {
//
//    }
//
//    @Override
//    public IPacket<?> createSpawnPacket() {
//        return null;
//    }
//}
