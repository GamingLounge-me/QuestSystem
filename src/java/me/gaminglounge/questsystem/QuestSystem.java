package me.gaminglounge.questsystem; 
 
import java.util.logging.Level; 
 
import org.bukkit.plugin.PluginManager; 
import org.bukkit.plugin.java.JavaPlugin; 
 
public final class QuestSystem extends JavaPlugin { 
 
    public static QuestSystem INSTANCE; 
 
    @Override
    public void onLoad() {
        INSTANCE = this; 
    }

    @Override
    public void onEnable() {
        // this.listener();
    }

    @Override
    public void onDisable() {
        
    }

    public void listener() {
        PluginManager pm = getServer().getPluginManager();

        // pm.registerEvents(new InvClickEvent(), this);
    } 
} 
