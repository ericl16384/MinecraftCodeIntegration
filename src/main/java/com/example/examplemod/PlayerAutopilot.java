package com.example.examplemod;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
//import net.minecraft.client.settings.KeyBinding;
//import net.minecraftforge.fml.client.registry.ClientRegistry;

import static com.example.examplemod.ExampleMod.MOD_ID;

@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class PlayerAutopilot {
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public static void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        ExampleMod.LOGGER.info("HELLO from server starting - PlayerDriver");
    }

    @SubscribeEvent
    public static void onClientTick(TickEvent.ClientTickEvent event) {
//            ExampleMod.LOGGER.debug("hasFocus=" + hasFocus() + " lastRenderEvent=" + lastRenderEvent);

        if(event.phase == TickEvent.Phase.START && active) {
            WorldInterface.update();
            update();
            MovementInterface.update();
        }
    }


    public static boolean active = false;
    public static void toggleEnabled() {
        active = !active;
    }

    static double targetX = 0;
    static double targetZ = 0;

    static boolean blockCenterAligned = true;

    static double getTargetX() {
        if (blockCenterAligned) {
            return targetX + 0.5;
        } else {
            return targetX;
        }
    }

    static double getTargetZ() {
        if (blockCenterAligned) {
            return targetZ + 0.5;
        } else {
            return targetZ;
        }
    }

    public static void update() {
//        MovementInterface.forward = true;
//        MovementInterface.active = WorldInterface.x < 0;


//        MovementInterface.active = true;
//        MovementInterface.forward = WorldInterface.x < 0;

        double displacementX = targetX - WorldInterface.x;
        double displacementZ = targetZ - WorldInterface.z;

//        double dotProduct = MathUtil.dot(WorldInterface.facingX2, WorldInterface.facingZ2, displacementX, displacementZ);
//        ExampleMod.LOGGER.debug("" + dotProduct);
//        MovementInterface.active = true;
//        MovementInterface.forward = dotProduct > Math.cos(Math.toRadians(15)); // plus or minus 15 deg

//        MovementInterface.active = true;

        if (Math.sqrt(Math.pow(displacementX, 2) + Math.pow(displacementZ, 2)) > 0.1) {
            MovementInterface.forward = true;
            MovementInterface.yaw = Math.atan2(displacementZ, displacementX);
        } else {
            MovementInterface.stopMovement();
        }
    }

//
//    static long lastRenderEvent = Long.MAX_VALUE;
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
