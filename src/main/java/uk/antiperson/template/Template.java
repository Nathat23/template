package uk.antiperson.template;

import org.bukkit.plugin.java.JavaPlugin;

public class Template extends JavaPlugin{

    @Override
    public void onEnable(){
        getLogger().info("Template v" + getDescription().getVersion() + " by antiPerson");
        getLogger().info("Documentation can be found at " + getDescription().getWebsite());

        getLogger().info("Registering events, tasks and commands...");
        registerEvents();
    }

    @Override
    public void onDisable(){
        getServer().getScheduler().cancelTasks(this);
    }

    public void registerEvents(){
        // register events
    }
}
