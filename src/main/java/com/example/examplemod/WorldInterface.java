package com.example.examplemod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static com.example.examplemod.ExampleMod.MODID;

//@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class WorldInterface {
    // get postion, chunks, inventory, health, status effects

    static double x;
    static double y;
    static double z;

//    @SubscribeEvent
//    public static void onClientTick(TickEvent.ClientTickEvent event) {
//        update();
//    }

    public static void update() {
        LocalPlayer player = Minecraft.getInstance().player;

        if (player != null) {
            x = player.getX();
            y = player.getY();
            z = player.getZ();

            ExampleMod.LOGGER.debug("Current position: X=" + x + " Y=" + y + " Z=" + z);
        }
    }
}
