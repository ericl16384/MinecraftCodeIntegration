//package com.example.examplemod;
//
//import com.mojang.logging.LogUtils;
//import net.minecraft.client.Minecraft;
//import net.minecraftforge.api.distmarker.Dist;
//import net.minecraftforge.common.MinecraftForge;
//import net.minecraftforge.eventbus.api.IEventBus;
//import net.minecraftforge.eventbus.api.SubscribeEvent;
//import net.minecraftforge.fml.common.Mod;
//import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
//import net.minecraftforge.event.server.ServerStartingEvent;
//import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
//import org.slf4j.Logger;
//import net.minecraft.client.player.LocalPlayer;
//import net.minecraftforge.event.TickEvent;
//
//@Mod(ExampleMod_template.MODID)
//public class ExampleMod {
//
//    public static final String MODID = "examplemod";
//
//    private static final Logger LOGGER = LogUtils.getLogger();
//
//    public ExampleMod() {
//        MinecraftForge.EVENT_BUS.register(this);
//
//        LOGGER.info("HELLO WORLD!!");
//    }
//
////    @SubscribeEvent
////    public void onClientTick(TickEvent.ClientTickEvent event) {
////        if (event.phase == TickEvent.Phase.END) {
////            EntityPlayerSP player = Minecraft.getMinecraft().player;
////            if (player != null) {
////                LOGGER.info("Current position: X=" + player.posX + " Y=" + player.posY + " Z=" + player.posZ);
////            }
////        }
////    }
//
//    // You can use SubscribeEvent and let the Event Bus discover methods to call
//    @SubscribeEvent
//    public void onServerStarting(ServerStartingEvent event)
//    {
//        // Do something when the server starts
//        LOGGER.info("HELLO from server starting");
//    }
//
//    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
//    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
//    public static class ClientModEvents
//    {
//        @SubscribeEvent
//        public static void onClientSetup(FMLClientSetupEvent event)
//        {
//            // Some client setup code
//            LOGGER.info("HELLO FROM CLIENT SETUP");
//            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
//        }
//    }
//}
