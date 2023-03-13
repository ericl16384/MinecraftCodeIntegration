package com.example.examplemod;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;

import static com.example.examplemod.ExampleMod.MODID;

@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MovementInterface {
    // whether it is in control
    static boolean active = false;
    static boolean blockUser = true;
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




//    @SubscribeEvent(priority = EventPriority.LOWEST)
//    public void onMovementInputUpdateEvent(MovementInputUpdateEvent event) {
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
//        Robot robot = new Robot();
//
//        if(hasFocus()) {
//            robot.keyPress(KeyEvent.VK_W);
//        } else {
//            robot.keyRelease(KeyEvent.VK_W);
//        }


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
