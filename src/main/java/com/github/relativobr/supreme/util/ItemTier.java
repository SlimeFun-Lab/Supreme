package com.github.relativobr.supreme.util;

import static com.github.relativobr.supreme.resource.SupremeComponents.SUPREME;
import static com.github.relativobr.supreme.resource.SupremeComponents.THORNIUM_BIT_SYNTHETIC;
import static com.github.relativobr.supreme.resource.SupremeComponents.THORNIUM_CARBONADO;
import static com.github.relativobr.supreme.resource.SupremeComponents.THORNIUM_DUST_SYNTHETIC;
import static com.github.relativobr.supreme.resource.SupremeComponents.THORNIUM_ENERGIZED;
import static com.github.relativobr.supreme.resource.SupremeComponents.THORNIUM_INGOT_SYNTHETIC;
import static com.github.relativobr.supreme.resource.magical.SupremeCetrus.CETRUS_IGNIS;
import static com.github.relativobr.supreme.resource.magical.SupremeCetrus.CETRUS_LUMIUM;
import static com.github.relativobr.supreme.resource.magical.SupremeCetrus.CETRUS_LUX;
import static com.github.relativobr.supreme.resource.magical.SupremeCetrus.CETRUS_VENTUS;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import org.bukkit.inventory.ItemStack;

public class ItemTier {

  public static ItemStack[] getMagicRecipe(SlimefunItemStack preItem) {
    return new ItemStack[]{THORNIUM_BIT_SYNTHETIC.asOne(), preItem.asOne(), THORNIUM_BIT_SYNTHETIC.asOne(),
        THORNIUM_BIT_SYNTHETIC.asOne(), CETRUS_IGNIS.asOne(), THORNIUM_BIT_SYNTHETIC.asOne(),
				THORNIUM_BIT_SYNTHETIC.asOne(), preItem.asOne(), THORNIUM_BIT_SYNTHETIC.asOne()};
  }

  public static ItemStack[] getRareRecipe(SlimefunItemStack preItem) {
    return new ItemStack[]{THORNIUM_DUST_SYNTHETIC.asOne(), preItem.asOne(), THORNIUM_DUST_SYNTHETIC.asOne(),
				THORNIUM_DUST_SYNTHETIC.asOne(), CETRUS_VENTUS.asOne(), THORNIUM_DUST_SYNTHETIC.asOne(),
        THORNIUM_DUST_SYNTHETIC.asOne(), preItem.asOne(), THORNIUM_DUST_SYNTHETIC.asOne()};
  }

  public static ItemStack[] getEpicRecipe(SlimefunItemStack preItem) {
    return new ItemStack[]{THORNIUM_INGOT_SYNTHETIC.asOne(), preItem.asOne(), THORNIUM_INGOT_SYNTHETIC.asOne(),
				THORNIUM_INGOT_SYNTHETIC.asOne(), CETRUS_LUX.asOne(), THORNIUM_INGOT_SYNTHETIC.asOne(),
        THORNIUM_INGOT_SYNTHETIC.asOne(), preItem.asOne(), THORNIUM_INGOT_SYNTHETIC.asOne()};
  }

  public static ItemStack[] getLegendaryRecipe(SlimefunItemStack preItem) {
    return new ItemStack[]{THORNIUM_CARBONADO.asOne(), preItem.asOne(), THORNIUM_CARBONADO.asOne(),
        THORNIUM_CARBONADO.asOne(), CETRUS_LUMIUM.asOne(), THORNIUM_CARBONADO.asOne(),
				THORNIUM_CARBONADO.asOne(), preItem.asOne(), THORNIUM_CARBONADO.asOne()};
  }

  public static ItemStack[] getSupremeRecipe(SlimefunItemStack preItem) {
    return new ItemStack[]{THORNIUM_ENERGIZED.asOne(), preItem.asOne(), THORNIUM_ENERGIZED.asOne(),
        THORNIUM_ENERGIZED.asOne(), SUPREME.asOne(), THORNIUM_ENERGIZED.asOne(),
        THORNIUM_ENERGIZED.asOne(), preItem.asOne(), THORNIUM_ENERGIZED.asOne()};
  }

}