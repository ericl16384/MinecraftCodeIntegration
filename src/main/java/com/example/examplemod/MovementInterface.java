package com.example.examplemod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;

import java.awt.*;
import java.awt.event.KeyEvent;

// TODO upgrade movement input from global keypresses (options below)
// - local keypresses (keypresses sent to the Minecraft instance)
// - create new keybinds that are code controlled
// - override keybind states (such as "W" to true or false)
// - edit the player's movement inputs
// - edit the player's movement
// - physically alter the position (DANGEROUS)

//@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class MovementInterface {
//    @SubscribeEvent
//    public static void onClientTick(TickEvent.ClientTickEvent event) throws AWTException { update(); }

    // whether it is in control
//    static boolean active = false;
//    static private boolean wasActive = false;

    // TODO implement blocking the user's control
    static boolean blockUser = false;
//    static

    static boolean forward = false;
    static boolean left = false;
    static boolean back = false;
    static boolean right = false;
    static boolean jump = false;
    static boolean crouch = false;
    static boolean sprint = false;

    static double yaw = 0;
    static double pitch = 0;

    // left click
    static void mb1() {}

    // middle click
    static void mb2() {}

    // right click
    static void mb3() {}

    // put inventory stuff etc.
//    static void hotbar

    static void stopMovement() {
        forward = false;
        left = false;
        back = false;
        right = false;
        jump = false;
//        crouch = false;
    }

    static void update() {
//        if (!hasFocus()) { return; }
//        if (!active) { wasActive = false; return; }

        LocalPlayer player = Minecraft.getInstance().player;

        // position
        // TODO replace with editing the player
        try {
            Robot robot = new Robot();

            if (forward) {
                robot.keyPress(KeyEvent.VK_W);
            } else {
                robot.keyRelease(KeyEvent.VK_W);
            }
        } catch (AWTException e) {
            ExampleMod.LOGGER.debug("new Robot() failed with AWTException: " + e.getMessage());
        }

        // angle
        player.setYRot((float) (Math.toDegrees(yaw) - 90));
        player.setXRot((float) Math.toDegrees(pitch));

        // other
        // player.setSprinting


//        wasActive = true;
    }






//    @SubscribeEvent(priority = EventPriority.LOWEST)
//    public static void onMovementInputUpdateEvent(MovementInputUpdateEvent event) {
//        Input input = event.getInput();
//
//        ExampleMod.LOGGER.info("W=" + input.up + " A=" + input.left + " S=" + input.down + " D=" + input.right);
//
//        input.up = true;
//        input.down = false;
////        input.left = false;
////        input.right = false;
////        input.jumping = false;
////        input.shiftKeyDown = false;
//    }

//    public void step() throws AWTException {
//
//
//        // Get the Minecraft instance
//        Minecraft mc = Minecraft.getMinecraft();
//
//        // Create a new key binding for the 'W' key
//        KeyBinding keyBinding = new KeyBinding("key.simulateW", GLFW.GLFW_KEY_W, "key.categories.misc");
//
//        // Register the key binding with Minecraft Forge
//        ClientRegistry.registerKeyBinding(keyBinding);
//
//        // Simulate a key press for the 'W' key
//        KeyBinding.setKeyBindState(keyBinding.getKeyCode(), true);
//
//        // Update the key bindings
//        KeyBinding.onTick(keyBinding.getKeyCode());
//
//        // Wait a short time (in milliseconds) to allow the key press to register
//        Thread.sleep(50);
//
//        // Simulate a key release for the 'W' key
//        KeyBinding.setKeyBindState(keyBinding.getKeyCode(), false);
//
//        // Update the key bindings
//        KeyBinding.onTick(keyBinding.getKeyCode());
//    }
}
