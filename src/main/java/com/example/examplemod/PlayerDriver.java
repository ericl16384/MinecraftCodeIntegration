package com.example.examplemod;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
//import net.minecraft.client.settings.KeyBinding;
//import net.minecraftforge.fml.client.registry.ClientRegistry;

import java.util.Date;

import static com.example.examplemod.ExampleMod.MODID;

@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class PlayerDriver {
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public static void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        ExampleMod.LOGGER.info("HELLO from server starting - PlayerDriver");
    }

//
//    boolean hasFocus = false;
//    static long lastRenderEvent = 0;
//
//    @SubscribeEvent
//    static public void onRenderTick(TickEvent.RenderTickEvent event) {
//        lastRenderEvent = new Date().getTime();
//    }
//
//    static boolean hasFocus() {
////        return Minecraft.getMinecraft().inGameHasFocus;
//        return (lastRenderEvent - new Date().getTime()) < 100;
//    }
}
