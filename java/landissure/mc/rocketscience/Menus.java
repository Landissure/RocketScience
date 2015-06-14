package landissure.mc.rocketscience;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class Menus {

	public enum menucode {NONE, EDITOR, COMMAND, FUELTANK, ENGINE};
	
	public static void openRocketEditor(Player p){
		Inventory i  = Bukkit.createInventory(null, 27, "Rocket Editor");
		i.setItem(4, PlayerData.data.get(p.getName()).rocket.getCommand().getRep());
		i.setItem(13, PlayerData.data.get(p.getName()).rocket.getFuelTank().getRep());
		i.setItem(22, PlayerData.data.get(p.getName()).rocket.getEngine().getRep());
		PlayerData.data.get(p.getName()).menu = menucode.EDITOR;
		p.openInventory(i);
	}
	
	public static void openCommandEditor(Player p){
		Inventory i  = Bukkit.createInventory(null, 9, "Select a Command Module");
		i.addItem(CommandModule.ac1.getRep());
		i.addItem(CommandModule.ac2.getRep());
		PlayerData.data.get(p.getName()).menu = menucode.COMMAND;
		p.openInventory(i);
	}

	public static void openFuelTankEditor(Player p) {
		Inventory i  = Bukkit.createInventory(null, 9, "Select a Command Module");
		i.addItem(FuelTank.ac1.getRep());
	}
	
}
