package io.github.spectraclient.command.impl;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.arguments.StringArgumentType;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;
import net.minecraft.client.network.ClientCommandSource;
import static net.minecraft.server.command.CommandManager.literal;
import static net.minecraft.server.command.CommandManager.argument;

public class SpamCommand {
    public static LiteralArgumentBuilder<ClientCommandSource> create() {
        return literal("spam")
            .then(argument("message", StringArgumentType.string())
            .executes(ctx -> {
                String msg = StringArgumentType.getString(ctx, "message");
                for (int i = 0; i < 50; i++) {
                    MinecraftClient.getInstance().player.sendChatMessage(msg);
                }
                return 1;
            }));
    }
}
