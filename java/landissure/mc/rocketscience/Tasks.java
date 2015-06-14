package landissure.mc.rocketscience;

import org.bukkit.Bukkit;

public class Tasks {

	public static Runnable toggleEngines = new Runnable(){

		public void run() {
			for(String s : PlayerData.data.keySet()){
				if(Bukkit.getPlayer(s) != null && PlayerData.data.get(s).rocket.getEngine().isFiring()){
					PlayerData.data.get(s).rocket.fire(Bukkit.getPlayer(s));
				}
			}
		}
	};
}
