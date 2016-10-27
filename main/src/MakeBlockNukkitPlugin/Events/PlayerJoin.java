package MakeBlockNukkitPlugin.Events;

import MakeBlockNukkitPlugin.Main;
import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.EventPriority;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerJoinEvent;
import java.util.ArrayList;

/**
 * Created by ilcato on 26/10/16.
 */
public class PlayerJoin implements Listener {
    Main plugin;

    public PlayerJoin(Main plugin)
    {
        this.plugin = plugin;
    }

    @EventHandler(priority=EventPriority.NORMAL, ignoreCancelled=false)
    public void on(PlayerJoinEvent e)
    {
        Player p = e.getPlayer();
        Main.players.add(p);
    }
}
