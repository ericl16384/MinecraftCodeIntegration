package com.example.examplemod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;

//@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class WorldInterface {
    // get postion, chunks, inventory, health, status effects

    static double x;
    static double y;
    static double z;

    static float yawMinecraftDegrees;
    static float pitchMinecraftDegrees;
    static double yawRadians;
    static double pitchRadians;

    // unit vector representing facing in 2 dimensions (yaw)
    static double facingX2;
    static double facingZ2;

//    @SubscribeEvent
//    public static void onClientTick(TickEvent.ClientTickEvent event) {
//        update();
//    }

    public static void update() {
        LocalPlayer player = Minecraft.getInstance().player;
        if(player == null) {
            ExampleMod.LOGGER.warn("WorldInterface - player is null");
            return;
        }

        if (player != null) {
            x = player.getX();
            y = player.getY();
            z = player.getZ();

            yawMinecraftDegrees = player.getYRot();
            pitchMinecraftDegrees = player.getXRot();
            yawRadians = MathUtil.convertMinecraftDegreesToRadians(yawMinecraftDegrees);
            pitchRadians = MathUtil.convertMinecraftDegreesToRadians(pitchMinecraftDegrees);

            facingX2 = Math.cos(yawRadians);
            facingZ2 = Math.sin(yawRadians);

            ExampleMod.LOGGER.debug("Current position: X=" + x + " Y=" + y + " Z=" + z);
//            ExampleMod.LOGGER.debug("Current angles: YAW=" + yawDegrees + " PITCH=" + pitchDegrees);
        }
    }
}
