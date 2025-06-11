package io.github.spectraclient.command;

import com.mojang.brigadier.CommandDispatcher;
import io.github.spectraclient.command.impl.*;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandManager;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;

public class CommandManager {
    public static void registerAll() {
        ClientCommandRegistrationCallback.EVENT.register((dispatcher, registryAccess) -> {
            dispatcher.register(SpamCommand.create());
            dispatcher.register(GriefCommand.create());
            dispatcher.register(ForceOpCommand.create());
        });
    }
}
