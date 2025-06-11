package io.github.spectraclient;

import net.fabricmc.api.ClientModInitializer;
import io.github.spectraclient.command.CommandManager;

public class SpectraClient implements ClientModInitializer {
    public static final String NAME = "SpectraClient";

    @Override
    public void onInitializeClient() {
        CommandManager.registerAll();
        System.out.println(NAME + " initialized.");
    }
}
