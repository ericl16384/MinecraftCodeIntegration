package com.example.examplemod;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.InputInterface;
import com.example.examplemod.WorldInterface;

import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraftforge.client.event.MovementInputUpdateEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
//import net.minecraft.client.settings.KeyBinding;
//import net.minecraftforge.fml.client.registry.ClientRegistry;
import org.lwjgl.glfw.GLFW;
import net.minecraft.client.player.Input;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Date;

public class PlayerDriver {
    boolean hasFocus = false;
    static long lastRenderEvent = 0;

    @SubscribeEvent
    static public void onRenderTick(TickEvent.RenderTickEvent event) {
        lastRenderEvent = new Date().getTime();
    }

    static boolean hasFocus() {
//        return Minecraft.getMinecraft().inGameHasFocus;
        return (lastRenderEvent - new Date().getTime()) < 100;
    }

    @SubscribeEvent
    public void onClientTick(TickEvent.ClientTickEvent event) {
        if (event.phase == TickEvent.Phase.START) {
            LocalPlayer player = Minecraft.getInstance().player;

            if (player != null) {
                double x = player.getX();
                double y = player.getY();
                double z = player.getZ();

                ExampleMod.LOGGER.info("Current position: X=" + x + " Y=" + y + " Z=" + z);
            }
        }
    }
}
