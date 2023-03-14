package com.example.examplemod.commands;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.tree.LiteralCommandNode;
import net.minecraft.client.Minecraft;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.commands.arguments.coordinates.BlockPosArgument;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;

public class AutopilotCommand {
    public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
        // Register the command
        LiteralArgumentBuilder<CommandSourceStack> command = Commands.literal("autopilot")
                .then(Commands.literal("target")
                        .then(Commands.literal("set")
                                .then(Commands.argument("position", BlockPosArgument.blockPos())
                                        .executes(AutopilotCommand::setTargetPosition)
                                )
                        )
                );
        LiteralCommandNode<CommandSourceStack> commandNode = dispatcher.register(command);

        // Add command to root
        dispatcher.getRoot().addChild(commandNode);
    }

    private static int setTargetPosition(CommandContext<CommandSourceStack> context) throws CommandSyntaxException {
        ServerPlayer player = context.getSource().getPlayerOrException();
        BlockPos position = BlockPosArgument.getLoadedBlockPos(context, "position");

        Minecraft.getInstance().player.sendSystemMessage(Component.literal("Hello, World!"));

        // TODO, not working
        // Define the behavior of your command here
        // This function will be called when the command is executed with a position argument
        // For example, /autopilot target set 10 20 30 will set the target position to (10, 20, 30)
//        player.sendSystemMessage(Component.literal(
//                "commands.autopilot.target.set.success", position.getX(), position.getY(), position.getZ()), player.getUUID()
//        );
        return 1;
    }

}
