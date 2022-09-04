package com.scouter.netherdepthsupgrade.structures;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.levelgen.feature.NoiseEffect;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.level.levelgen.structure.PoolElementStructurePiece;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceSerializationContext;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceType;
import net.minecraft.world.level.levelgen.structure.pools.StructurePoolElement;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureManager;

public class LavaStructurePiece extends PoolElementStructurePiece {

    public LavaStructurePiece(StructureManager structureManager, StructurePoolElement structurePoolElement, BlockPos blockPos, int groundLevelDelta, Rotation rotation, BoundingBox boundingBox) {
        super(structureManager, structurePoolElement, blockPos, groundLevelDelta, rotation, boundingBox);
    }

    public LavaStructurePiece(StructurePieceSerializationContext context, CompoundTag tag) {
        super(context, tag);
    }

    @Override
    public NoiseEffect getNoiseEffect() {
        return NoiseEffect.BURY;
    }

    @Override
    public StructurePieceType getType() {
        return NDUStructures.LAVA_STRUCTURE_PIECE;
    }
}
