package MakeBlockNukkitPlugin.Scheduler;

import MakeBlockNukkitPlugin.Main;
import cn.nukkit.Player;
import cn.nukkit.scheduler.PluginTask;


/**
 * Created by ilcato on 26/10/16.
 */
public class ReadPlayerCoordinates extends PluginTask<Main>
{
    public ReadPlayerCoordinates(Main owner)
    {
        super(owner);
    }

    public void onRun(int arg0)
    {
        for (Player pl : Main.players)
        {
            double posX = Math.round(pl.getX() - 0.5D);
            double posY = Math.round(pl.getY() - 0.5D);
            double posZ = Math.round(pl.getZ() - 0.5D);

            owner.getLogger().info("Read X: " + posX + " Y: " + posY + " Z: " + posZ);
        }
    }
}
