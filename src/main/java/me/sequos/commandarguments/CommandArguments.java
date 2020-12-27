package me.sequos.commandarguments;

import me.sequos.commandarguments.Commands.sendWord;
import org.bukkit.plugin.java.JavaPlugin;

public final class CommandArguments extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("sendWord").setExecutor(new sendWord());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
