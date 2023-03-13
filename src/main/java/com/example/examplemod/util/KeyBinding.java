package com.example.examplemod.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public class KeyBinding {
    public static final String KEY_CATEGORY_PLAYER_AUTOMATION = "key.category.examplemod.player_automation";
    public static final String KEY_TOGGLE_AUTOPILOT = "key.examplemod.toggle_autopilot";

    public static final KeyMapping AUTOPILOT_KEY = new KeyMapping(KEY_TOGGLE_AUTOPILOT, KeyConflictContext.IN_GAME,
            InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_SEMICOLON, KEY_CATEGORY_PLAYER_AUTOMATION);
}