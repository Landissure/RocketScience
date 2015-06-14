package landissure.mc.rocketscience;

import landissure.mc.rocketscience.Menus.menucode;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class RocketListeners implements Listener {

	public RocketListeners(RocketScience e){
		Bukkit.getPluginManager().registerEvents(this, e);
	}

	@EventHandler
	public void onInteract(PlayerInteractEvent e){
		if(PlayerData.data.get(e.getPlayer().getName()) != null){
			if((e.getAction().equals(Action.RIGHT_CLICK_AIR) || e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) && e.getPlayer().getItemInHand().equals(new ItemStack(Material.GOLD_AXE))){
				PlayerData.data.get(e.getPlayer().getName()).rocket.getEngine().toggleFiring();
			}

		}
	}

	@EventHandler
	public void onItemShift(InventoryClickEvent i){
		PlayerData d = PlayerData.data.get(i.getWhoClicked().getName());
		if(i.getWhoClicked().getGameMode().equals(GameMode.ADVENTURE)) i.setCancelled(true);
		if(d != null && d.menu.equals(menucode.EDITOR)){
			if(i.getCurrentItem().equals(d.rocket.getCommand().getRep())){
				i.getWhoClicked().closeInventory();
				Menus.openCommandEditor((Player) i.getWhoClicked());
			}
			else if(i.getCurrentItem().equals(d.rocket.getFuelTank().getRep())){
				i.getWhoClicked().closeInventory();
				Menus.openFuelTankEditor((Player) i.getWhoClicked());
			}
		}
	}
}
