package com.wisewarwolf.chessmod.item;

import com.wisewarwolf.chessmod.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModTab {
    public static final CreativeModeTab CHESS_TAB = new CreativeModeTab("chesstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.CHESS_BOARD.get());
        }
    };
}
