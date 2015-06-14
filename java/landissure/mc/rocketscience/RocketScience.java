package landissure.mc.rocketscience;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class RocketScience extends JavaPlugin {
	
	public void onEnable(){
		new RocketListeners(this);
		
		RocketExecutor rexec = new RocketExecutor();
		getCommand("rocket").setExecutor(rexec);
		Bukkit.getScheduler().scheduleSyncRepeatingTask(this, Tasks.toggleEngines, 0L, 1L);
	}
	
}
