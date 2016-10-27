package MakeBlockNukkitPlugin;


import MakeBlockNukkitPlugin.Events.PlayerJoin;
import MakeBlockNukkitPlugin.Events.PlayerQuit;
import MakeBlockNukkitPlugin.Scheduler.ReadPlayerCoordinates;
import cn.nukkit.Player;
import cn.nukkit.Server;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.plugin.PluginLogger;
import cn.nukkit.plugin.PluginManager;
import cn.nukkit.scheduler.ServerScheduler;
import java.util.ArrayList;

public class Main
        extends PluginBase
{
    public static ArrayList<Player> players = new ArrayList();

    public void onLoad()
    {
        getLogger().info("Loading plugin...");
    }

    public void onEnable()
    {
        getLogger().info("Plugin enabled!");

        getServer().getPluginManager().registerEvents(new PlayerJoin(this), this);
        getServer().getPluginManager().registerEvents(new PlayerQuit(this), this);

        getServer().getScheduler().scheduleRepeatingTask(new ReadPlayerCoordinates(this), 2);
    }

    public void onDisable()
    {
        getLogger().info("Deactivating plugin...");
    }
}
