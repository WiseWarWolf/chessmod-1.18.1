package com.wisewarwolf.chessmod.item;

import com.wisewarwolf.chessmod.ChessMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ChessMod.MOD_ID);

    public static final RegistryObject<Item> WHITE_PAWN = ITEMS.register("white_pawn",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.CHESS_TAB)));

    public static final RegistryObject<Item> WHITE_QUEEN = ITEMS.register("white_queen",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.CHESS_TAB)));

    public static final RegistryObject<Item> BLACK_QUEEN = ITEMS.register("black_queen",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.CHESS_TAB)));

    public static final RegistryObject<Item> BLACK_PAWN = ITEMS.register("black_pawn",
            () -> new Item(new Item.Properties().tab(ModCreativeModTab.CHESS_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
