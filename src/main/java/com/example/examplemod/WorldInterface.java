package com.example.examplemod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class WorldInterface {
    // get postion, chunks, inventory, health, status effects

    static double x;
    static double y;
    static double z;

    @SubscribeEvent
    public void onClientTick(TickEvent.ClientTickEvent event) {
        if (event.phase == TickEvent.Phase.START) {
            LocalPlayer player = Minecraft.getInstance().player;

            if (player != null) {
                x = player.getX();
                y = player.getY();
                z = player.getZ();

                ExampleMod.LOGGER.debug("Current position: X=" + x + " Y=" + y + " Z=" + z);
            }
        }
    }
}
