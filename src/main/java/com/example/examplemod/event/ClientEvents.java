package com.example.examplemod.event;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.PlayerAutopilot;
import com.example.examplemod.util.KeyBinding;
import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ClientEvents {
    @Mod.EventBusSubscriber(modid = ExampleMod.MOD_ID, value = Dist.CLIENT)
    public static class ClientForgeEvents {

        // this puts it in the options menu
        @Mod.EventBusSubscriber(modid = ExampleMod.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
        public static class ClientModBusEvents {
            @SubscribeEvent
            public static void onKeyRegister(RegisterKeyMappingsEvent event) {
                event.register(KeyBinding.AUTOPILOT_KEY);
            }
        }

        @SubscribeEvent
        public static void onKeyInput(InputEvent.Key event) {
            if(KeyBinding.AUTOPILOT_KEY.consumeClick()) {
                PlayerAutopilot.toggleEnabled();

                if (PlayerAutopilot.active) {
                    Minecraft.getInstance().player.sendSystemMessage(Component.literal("Autopilot enabled"));
                } else {
                    Minecraft.getInstance().player.sendSystemMessage(Component.literal("Autopilot disabled"));
                }
            }
        }
    }
}