package landissure.mc.rocketscience;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.MaterialData;

public class CommandModule extends RocketPart {

	private double oxygen;
	private double maxOxygen;
	public static CommandModule ac1;
	static{
		ItemStack i = new ItemStack(Material.QUARTZ);
		ItemMeta m = i.getItemMeta();
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("A basic command module.");
		m.setDisplayName("AC-1 Command Module");
		m.setLore(lore);
		i.setItemMeta(m);
		ac1 = new CommandModule(10, 100, i, "AC-1 Command Module", 100);
	}
	public static CommandModule ac2;
	static{
		ItemStack i = new ItemStack(Material.INK_SACK);
		ItemMeta m = i.getItemMeta();
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("A command module with halfway-decent life support!");
		m.setDisplayName("AC-2 Command Module");
		m.setLore(lore);
		i.setItemMeta(m);
		i.setDurability((short) 9);
		ac2 = new CommandModule(10, 100, i, "AC-2 Command Module", 200);
	}
	private CommandModule(double mass, double hull, ItemStack rep, String id, double oxygen) {
		super(mass, hull, rep, id);
		this.oxygen = oxygen;
		this.maxOxygen = oxygen;
	}
	
	public double getOxygen(){
		return oxygen;
	}
	
	public double getMaxOxygen(){
		return maxOxygen;
	}
	
	public void setOxygen(double oxygen){
		this.oxygen = oxygen;
	}

}
