package ru.rottenturtle.sovietaesthetics.blocks;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;



public class Chair extends Block implements IWaterLoggable
{
    //public static final DirectionProperty FACING = DirectionProperty.create("facing", Direction.Plane.HORIZONTAL);
    //public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;




    public Chair() {
        super(Block.Properties.create(Material.WOOD)
                .hardnessAndResistance(2.0f,4.5f)
                .sound(SoundType.WOOD)
                .harvestTool(ToolType.AXE)

        );
        //this.setDefaultState(this.stateContainer.getBaseState().with(FACING, Direction.NORTH).with(WATERLOGGED, Boolean.valueOf(false)));
    }


//    public boolean isValidPosition(BlockState state, IWorldReader worldIn, BlockPos pos)
//    {
//        return hasEnoughSolidSide(worldIn, pos.down(), Direction.UP);
//    }
//
//
//
//    @SuppressWarnings("deprecation")
//    public BlockState updatePostPlacement(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos)
//    {
//        if(stateIn.get(WATERLOGGED))
//        {
//            worldIn.getPendingFluidTicks().scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickRate(worldIn));
//        }
//
//        if(facing == Direction.DOWN && !this.isValidPosition(stateIn, worldIn, currentPos))
//            return Blocks.AIR.getDefaultState();
//
//        return super.updatePostPlacement(stateIn, facing, facingState, worldIn, currentPos, facingPos);
//    }
//
//    @Override
//    public BlockState getStateForPlacement(BlockItemUseContext context)
//    {
//        BlockPos blockpos = context.getPos();
//        FluidState ifluidstate = context.getWorld().getFluidState(blockpos);
//
//        return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing().getOpposite()).with(WATERLOGGED, Boolean.valueOf(Boolean.valueOf(ifluidstate.getFluid() == Fluids.WATER)));
//    }
//
//    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder)
//    {
//        builder.add(FACING, WATERLOGGED);
//    }
//
//    @SuppressWarnings("deprecation")
//    public FluidState getFluidState(BlockState state)
//    {
//        return state.get(WATERLOGGED) ? Fluids.WATER.getStillFluidState(false) : super.getFluidState(state);
//    }
}
