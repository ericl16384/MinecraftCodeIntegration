package com.example.examplemod;

import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
//import net.minecraft.client.settings.KeyBinding;
//import net.minecraftforge.fml.client.registry.ClientRegistry;

import java.util.Date;

public class PlayerDriver {
    boolean hasFocus = false;
    static long lastRenderEvent = 0;

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        ExampleMod.LOGGER.info("HELLO from server starting - PlayerDriver");
    }

    @SubscribeEvent
    static public void onRenderTick(TickEvent.RenderTickEvent event) {
        lastRenderEvent = new Date().getTime();
    }

    static boolean hasFocus() {
//        return Minecraft.getMinecraft().inGameHasFocus;
        return (lastRenderEvent - new Date().getTime()) < 100;
    }
}
