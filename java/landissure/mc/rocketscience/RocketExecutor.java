package landissure.mc.rocketscience;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RocketExecutor implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(sender instanceof Player){
			Player p = (Player) sender;
			if(cmd.getName().equalsIgnoreCase("rocket")){
				if(PlayerData.data.get(p.getName()) != null && PlayerData.data.get(p.getName()).rocket != null){
					Menus.openRocketEditor(p);
				}
				else{
					PlayerData.data.put(p.getName(), new PlayerData());
					PlayerData.data.get(p.getName()).rocket = new Rocket();
					Rocket r = PlayerData.data.get(p.getName()).rocket;
					r.setCommand(CommandModule.ac1);
					r.setFuelTank(FuelTank.ac1);
					r.setEngine(Engine.ac1);
					Menus.openRocketEditor(p);
				}
			}
		}
		return true;
	}

}
