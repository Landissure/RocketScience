package landissure.mc.rocketscience;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class FuelTank extends RocketPart {
	
	private double fuel;
	private double maxFuel;
	public static FuelTank ac1;
	static{
		ItemStack i = new ItemStack(Material.BLAZE_POWDER);
		ItemMeta m = i.getItemMeta();
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("A basic fuel tank.");
		m.setDisplayName("AC-1 Fuel Tank");
		m.setLore(lore);
		i.setItemMeta(m);
		ac1 = new FuelTank(10, 100, i, "AC-1 Fuel Tank", 100);
	}

	private FuelTank(double mass, double hull, ItemStack rep, String id, double fuel) {
		super(mass, hull, rep, id);
		this.fuel = fuel;
		this.maxFuel = fuel;
	}
	
	public double getFuel(){
		return fuel;
	}
	
	public double getMaxFuel(){
		return maxFuel;
	}
	
	public boolean setFuel(double fuel){
		if(fuel >= 0 && fuel < maxFuel){
			this.fuel = fuel;
			return true;
		}
		else{
			this.fuel = 0;
			return false;
		}
	}

}
