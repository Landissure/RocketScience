package landissure.mc.rocketscience;

import org.bukkit.inventory.ItemStack;

public abstract class RocketPart {

	private double mass;
	private double hull;
	private ItemStack rep;
	private String id;
	
	protected RocketPart(double mass, double hull, ItemStack rep, String id){
		this.mass = mass;
		this.hull = hull;
		this.id = id;
		this.rep = rep;
	}
	
	public double getMass(){
		return mass;
	}
	
	public void setHull(double hull){
		this.hull = hull;
	}
	
	public double getHull(){
		return hull;
	}
	
	public ItemStack getRep(){
		return rep;
	}
	
	public String getName(){
		return id;
	}
	
}
