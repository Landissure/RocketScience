package landissure.mc.rocketscience;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Engine extends RocketPart {

	private boolean firing = false;
	private double thrust;
	public static Engine ac1;
	static{
		ItemStack i = new ItemStack(Material.BLAZE_ROD);
		ItemMeta m = i.getItemMeta();
		ArrayList<String> lore = new ArrayList<String>();
		lore.add("A basic engine.");
		m.setDisplayName("AC-1 Engine");
		i.setItemMeta(m);
		ac1 = new Engine(10, 100, i, "AC-1 Command Module", 3);
	}
	
	private Engine(double mass, double hull, ItemStack rep, String id, double thrust) {
		super(mass, hull, rep, id);
		this.thrust = thrust;
	}
	
	public double getThrust(){
		return thrust;
	}
	
	public void toggleFiring(){
		firing = !firing;
	}
	
	public boolean isFiring(){
		return firing;
	}

}
