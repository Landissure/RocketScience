package landissure.mc.rocketscience;

import org.bukkit.Effect;
import org.bukkit.EntityEffect;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class Rocket {

	private CommandModule command;
	private FuelTank fueltank;
	private Engine engine;

	public double getMass(){
		return command.getMass() + fueltank.getMass() + engine.getMass();
	}

	public void setCommand(CommandModule c){
		this.command = c;
	}

	public void setFuelTank(FuelTank t){
		this.fueltank = t;
	}

	public void setEngine(Engine e){
		this.engine = e;
	}

	public CommandModule getCommand(){
		return command;
	}

	public FuelTank getFuelTank(){
		return fueltank;
	}

	public Engine getEngine(){
		return engine;
	}

	public boolean fire(Player p){
		if(fueltank.getFuel() > 0){
			p.setVelocity(new Vector(p.getVelocity().getX(), p.getVelocity().getY() + engine.getThrust()/getMass(), p.getVelocity().getZ()));
			fueltank.setFuel(fueltank.getFuel() - 1);
			p.playEffect(p.getLocation(), Effect.MOBSPAWNER_FLAMES, 50);
			return true;
		}
		else return false;
	}

}
