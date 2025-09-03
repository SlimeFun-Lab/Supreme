package com.github.relativobr.supreme.machine;

import com.github.relativobr.supreme.generic.machine.GenericMachine;
import com.github.relativobr.supreme.generic.recipe.AbstractItemRecipe;
import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.resource.magical.SupremeAttribute;
import com.github.relativobr.supreme.resource.magical.SupremeCetrus;
import com.github.relativobr.supreme.util.SupremeItemStack;
import com.github.relativobr.supreme.util.UtilEnergy;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import java.util.ArrayList;
import java.util.List;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.springframework.scheduling.annotation.Async;

@Async
public class MagicAltar extends GenericMachine {

  public static final SlimefunItemStack MAGIC_ALTAR_MACHINE = new SupremeItemStack("SUPREME_MAGIC_ALTAR_I",
      Material.SMOKER, "&bMagic Altar", "", "&fCraft Rune and Magical Items", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), LoreBuilder.speed(1),
      UtilEnergy.energyPowerPerSecond(20), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_MAGIC_ALTAR_MACHINE = new ItemStack[]{SlimefunItems.ANCIENT_PEDESTAL.asOne(),
      SupremeComponents.SYNTHETIC_RUBY.asOne(), SlimefunItems.ANCIENT_PEDESTAL.asOne(), SupremeComponents.CONVEYANCE_MACHINE.asOne(),
      SlimefunItems.ANCIENT_ALTAR.asOne(), SupremeComponents.CONVEYANCE_MACHINE.asOne(), SlimefunItems.ANCIENT_PEDESTAL.asOne(),
      SupremeComponents.INDUCTOR_MACHINE.asOne(), SlimefunItems.ANCIENT_PEDESTAL.asOne()};

  public static final SlimefunItemStack MAGIC_ALTAR_MACHINE_II = new SupremeItemStack("SUPREME_MAGIC_ALTAR_II",
      Material.SMOKER, "&bMagic Altar II", "", "&fAdvanced Craft Rune and Magical Items", "",
      LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(5),
      UtilEnergy.energyPowerPerSecond(100), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_MAGIC_ALTAR_MACHINE_II = new ItemStack[]{SupremeComponents.THORNERITE.asOne(),
      SupremeCetrus.CETRUS_AQUA.asOne(), SupremeComponents.THORNERITE.asOne(), SupremeCetrus.CETRUS_VENTUS.asOne(),
      MagicAltar.MAGIC_ALTAR_MACHINE.asOne(), SupremeCetrus.CETRUS_LUX.asOne(), SupremeComponents.THORNERITE.asOne(),
      SupremeCetrus.CETRUS_IGNIS.asOne(), SupremeComponents.THORNERITE.asOne()};

  public static final SlimefunItemStack MAGIC_ALTAR_MACHINE_III = new SupremeItemStack("SUPREME_MAGIC_ALTAR_III",
      Material.SMOKER, "&bMagic Altar III", "", "&fAdvanced Craft Rune and Magical Items", "",
      LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE), LoreBuilder.speed(15),
      UtilEnergy.energyPowerPerSecond(300), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_MAGIC_ALTAR_MACHINE_III = new ItemStack[]{SupremeComponents.THORNERITE.asOne(),
      SupremeAttribute.getMagic().asOne(), SupremeComponents.THORNERITE.asOne(), SupremeComponents.SUPREME.asOne(),
      MagicAltar.MAGIC_ALTAR_MACHINE_II.asOne(), SupremeComponents.SUPREME.asOne(), SupremeComponents.CRYSTALLIZER_MACHINE.asOne(),
      SupremeCetrus.CETRUS_LUMIUM.asOne(), SupremeComponents.CRYSTALLIZER_MACHINE.asOne()};
	
	public static final AbstractItemRecipe RECIPE_RUNE_AIR = new AbstractItemRecipe(
			new ItemStack[]{new ItemStack(Material.FEATHER), SlimefunItems.MAGIC_LUMP_1.asOne(), new ItemStack(Material.FEATHER).asOne(),
					new ItemStack(Material.GHAST_TEAR), SlimefunItems.BLANK_RUNE.asOne(), new ItemStack(Material.GHAST_TEAR).asOne(),
					new ItemStack(Material.FEATHER), SlimefunItems.MAGIC_LUMP_1.asOne(), new ItemStack(Material.FEATHER)},
			new SlimefunItemStack(SlimefunItems.AIR_RUNE, 4).asOne());
	public static final AbstractItemRecipe RECIPE_RUNE_EARTH = new AbstractItemRecipe(
			new ItemStack[]{new ItemStack(Material.DIRT), SlimefunItems.MAGIC_LUMP_1.asOne(), new ItemStack(Material.STONE),
					new ItemStack(Material.OBSIDIAN), SlimefunItems.BLANK_RUNE.asOne(), new ItemStack(Material.OBSIDIAN),
					new ItemStack(Material.STONE), SlimefunItems.MAGIC_LUMP_1.asOne(), new ItemStack(Material.DIRT)},
			new SlimefunItemStack(SlimefunItems.EARTH_RUNE, 4).asOne());
	public static final AbstractItemRecipe RECIPE_RUNE_FIRE = new AbstractItemRecipe(
			new ItemStack[]{new ItemStack(Material.FIRE_CHARGE), SlimefunItems.MAGIC_LUMP_2.asOne(), new ItemStack(Material.FIRE_CHARGE),
					new ItemStack(Material.BLAZE_POWDER), SlimefunItems.EARTH_RUNE.asOne(), new ItemStack(Material.FLINT_AND_STEEL),
					new ItemStack(Material.FIRE_CHARGE), SlimefunItems.MAGIC_LUMP_2.asOne(), new ItemStack(Material.FIRE_CHARGE)},
			new SlimefunItemStack(SlimefunItems.FIRE_RUNE, 4).asOne());
	public static final AbstractItemRecipe RECIPE_RUNE_WATER = new AbstractItemRecipe(
			new ItemStack[]{new ItemStack(Material.SALMON), SlimefunItems.MAGIC_LUMP_2.asOne(), new ItemStack(Material.WATER_BUCKET),
					new ItemStack(Material.SAND), SlimefunItems.BLANK_RUNE.asOne(), new ItemStack(Material.SAND),
					new ItemStack(Material.WATER_BUCKET), SlimefunItems.MAGIC_LUMP_2.asOne(), new ItemStack(Material.COD)},
			new SlimefunItemStack(SlimefunItems.WATER_RUNE, 4).asOne());
	public static final AbstractItemRecipe RECIPE_RUNE_ENDER = new AbstractItemRecipe(
			new ItemStack[]{new ItemStack(Material.ENDER_PEARL), SlimefunItems.ENDER_LUMP_3.asOne(), new ItemStack(Material.ENDER_PEARL),
					new ItemStack(Material.ENDER_EYE), SlimefunItems.BLANK_RUNE.asOne(), new ItemStack(Material.ENDER_EYE),
					new ItemStack(Material.ENDER_PEARL), SlimefunItems.ENDER_LUMP_3.asOne(), new ItemStack(Material.ENDER_PEARL)},
			new SlimefunItemStack(SlimefunItems.ENDER_RUNE, 6).asOne());
	public static final AbstractItemRecipe RECIPE_RUNE_LIGHTNING = new AbstractItemRecipe(
			new ItemStack[]{new ItemStack(Material.IRON_INGOT), SlimefunItems.MAGIC_LUMP_3.asOne(), new ItemStack(Material.IRON_INGOT),
					SlimefunItems.AIR_RUNE.asOne(), new ItemStack(Material.PHANTOM_MEMBRANE), SlimefunItems.WATER_RUNE.asOne(),
					new ItemStack(Material.IRON_INGOT), SlimefunItems.MAGIC_LUMP_3.asOne(), new ItemStack(Material.IRON_INGOT)},
			new SlimefunItemStack(SlimefunItems.LIGHTNING_RUNE, 4).asOne());
	public static final AbstractItemRecipe RECIPE_RUNE_RAINBOW = new AbstractItemRecipe(
			new ItemStack[]{new ItemStack(Material.RED_DYE), SlimefunItems.MAGIC_LUMP_3.asOne(), new ItemStack(Material.CYAN_DYE),
					new ItemStack(Material.WHITE_WOOL), SlimefunItems.ENDER_RUNE.asOne(), new ItemStack(Material.WHITE_WOOL),
					new ItemStack(Material.YELLOW_DYE), SlimefunItems.ENDER_LUMP_3.asOne(), new ItemStack(Material.MAGENTA_DYE)},
			new SlimefunItemStack(SlimefunItems.RAINBOW_RUNE, 1).asOne());
	public static final AbstractItemRecipe RECIPE_RUNE_SOULBOUND = new AbstractItemRecipe(
			new ItemStack[]{SlimefunItems.MAGIC_LUMP_3.asOne(), SlimefunItems.ESSENCE_OF_AFTERLIFE.asOne(), SlimefunItems.MAGIC_LUMP_3.asOne(),
					SlimefunItems.ENDER_LUMP_3.asOne(), SlimefunItems.ENDER_RUNE.asOne(), SlimefunItems.ENDER_LUMP_3.asOne(),
					SlimefunItems.MAGIC_LUMP_3.asOne(), SlimefunItems.ESSENCE_OF_AFTERLIFE.asOne(), SlimefunItems.MAGIC_LUMP_3.asOne()},
			new SlimefunItemStack(SlimefunItems.SOULBOUND_RUNE, 1).asOne());
	public static final AbstractItemRecipe RECIPE_RUNE_ENCHANTMENT = new AbstractItemRecipe(
			new ItemStack[]{SlimefunItems.MAGIC_LUMP_3.asOne(), SlimefunItems.MAGICAL_GLASS.asOne(), SlimefunItems.MAGIC_LUMP_3.asOne(),
					SlimefunItems.MAGICAL_GLASS.asOne(), SlimefunItems.LIGHTNING_RUNE.asOne(), SlimefunItems.MAGICAL_GLASS.asOne(),
					SlimefunItems.MAGIC_LUMP_3.asOne(), SlimefunItems.MAGICAL_GLASS.asOne(), SlimefunItems.MAGIC_LUMP_3.asOne()},
			new SlimefunItemStack(SlimefunItems.ENCHANTMENT_RUNE, 1).asOne());
	public static final AbstractItemRecipe RECIPE_RUNE_VILLAGERS = new AbstractItemRecipe(
			new ItemStack[]{SlimefunItems.MAGIC_LUMP_3.asOne(), SlimefunItems.MAGICAL_GLASS.asOne(), new ItemStack(Material.CRYING_OBSIDIAN),
					SlimefunItems.STRANGE_NETHER_GOO.asOne(), SlimefunItems.FIRE_RUNE.asOne(), SlimefunItems.STRANGE_NETHER_GOO.asOne(),
					new ItemStack(Material.CRYING_OBSIDIAN), SlimefunItems.MAGICAL_GLASS.asOne(), SlimefunItems.MAGIC_LUMP_3.asOne()},
			new SlimefunItemStack(SlimefunItems.VILLAGER_RUNE, 3).asOne());
	public static final AbstractItemRecipe RECIPE_BLANK_RUNE = new AbstractItemRecipe(
			new ItemStack[]{new ItemStack(Material.STONE), SlimefunItems.MAGIC_LUMP_1.asOne(), new ItemStack(Material.STONE),
					SlimefunItems.MAGIC_LUMP_1.asOne(), new ItemStack(Material.OBSIDIAN), SlimefunItems.MAGIC_LUMP_1.asOne(),
					new ItemStack(Material.STONE), SlimefunItems.MAGIC_LUMP_1.asOne(), new ItemStack(Material.STONE)},
			new SlimefunItemStack(SlimefunItems.BLANK_RUNE, 1).asOne());
	public static final AbstractItemRecipe RECIPE_ESSENCE_OF_AFTERLIFE = new AbstractItemRecipe(
			new ItemStack[]{SlimefunItems.ENDER_LUMP_3.asOne(), SlimefunItems.AIR_RUNE.asOne(), SlimefunItems.ENDER_LUMP_3.asOne(),
					SlimefunItems.EARTH_RUNE.asOne(), SlimefunItems.NECROTIC_SKULL.asOne(), SlimefunItems.FIRE_RUNE.asOne(),
					SlimefunItems.ENDER_LUMP_3.asOne(), SlimefunItems.WATER_RUNE.asOne(), SlimefunItems.ENDER_LUMP_3.asOne()},
			new SlimefunItemStack(SlimefunItems.ESSENCE_OF_AFTERLIFE, 1).asOne());
	public static final AbstractItemRecipe RECIPE_LAVA_CRYSTAL = new AbstractItemRecipe(
			new ItemStack[]{SlimefunItems.MAGIC_LUMP_1.asOne(), new ItemStack(Material.BLAZE_POWDER), SlimefunItems.MAGIC_LUMP_1.asOne(),
					new ItemStack(Material.BLAZE_POWDER), SlimefunItems.FIRE_RUNE.asOne(), new ItemStack(Material.BLAZE_POWDER),
					SlimefunItems.MAGIC_LUMP_1.asOne(), new ItemStack(Material.BLAZE_POWDER), SlimefunItems.MAGIC_LUMP_1.asOne()},
			new SlimefunItemStack(SlimefunItems.LAVA_CRYSTAL, 1).asOne());
	public static final AbstractItemRecipe RECIPE_MAGICAL_GLASS = new AbstractItemRecipe(
			new ItemStack[]{SlimefunItems.MAGIC_LUMP_2.asOne(), SlimefunItems.GOLD_DUST.asOne(), SlimefunItems.MAGIC_LUMP_2.asOne(),
					new ItemStack(Material.EXPERIENCE_BOTTLE), new ItemStack(Material.GLASS_PANE), new ItemStack(Material.EXPERIENCE_BOTTLE),
					SlimefunItems.MAGIC_LUMP_2.asOne(), new ItemStack(Material.EXPERIENCE_BOTTLE), SlimefunItems.MAGIC_LUMP_2.asOne()},
			new SlimefunItemStack(SlimefunItems.MAGICAL_GLASS, 1).asOne());
	public static final AbstractItemRecipe RECIPE_COMMON_TALISMAN = new AbstractItemRecipe(
			new ItemStack[]{SlimefunItems.MAGIC_LUMP_2.asOne(), SlimefunItems.GOLD_8K.asOne(), SlimefunItems.MAGIC_LUMP_2.asOne(),
					null, new ItemStack(Material.EMERALD), null,
					SlimefunItems.MAGIC_LUMP_2.asOne(), SlimefunItems.GOLD_8K.asOne(), SlimefunItems.MAGIC_LUMP_2.asOne()},
			new SlimefunItemStack(SlimefunItems.COMMON_TALISMAN, 1).asOne());
	public static final AbstractItemRecipe RECIPE_MAGICAL_BOOK_COVER = new AbstractItemRecipe(
			new ItemStack[]{null, SlimefunItems.MAGIC_LUMP_2.asOne(), null,
					SlimefunItems.MAGIC_LUMP_2.asOne(), new ItemStack(Material.BOOK), SlimefunItems.MAGIC_LUMP_2.asOne(),
					null, SlimefunItems.MAGIC_LUMP_2.asOne(), null},
			new SlimefunItemStack(SlimefunItems.MAGICAL_BOOK_COVER, 1).asOne());
	public static final AbstractItemRecipe RECIPE_POWER_CRYSTAL = new AbstractItemRecipe(
			new ItemStack[]{new ItemStack(Material.REDSTONE), SlimefunItems.SYNTHETIC_SAPPHIRE.asOne(), new ItemStack(Material.REDSTONE),
					SlimefunItems.SYNTHETIC_SAPPHIRE.asOne(), SlimefunItems.SYNTHETIC_DIAMOND.asOne(), SlimefunItems.SYNTHETIC_SAPPHIRE.asOne(),
					new ItemStack(Material.REDSTONE), SlimefunItems.SYNTHETIC_SAPPHIRE.asOne(), new ItemStack(Material.REDSTONE)},
			new SlimefunItemStack(SlimefunItems.POWER_CRYSTAL, 1).asOne());
	public static final AbstractItemRecipe RECIPE_ELYTRA_SCALE = new AbstractItemRecipe(
			new ItemStack[]{SlimefunItems.ENDER_LUMP_3.asOne(), SlimefunItems.AIR_RUNE.asOne(), SlimefunItems.ENDER_LUMP_3.asOne(),
					new ItemStack(Material.PHANTOM_MEMBRANE), new ItemStack(Material.FEATHER), new ItemStack(Material.PHANTOM_MEMBRANE),
					SlimefunItems.ENDER_LUMP_3.asOne(), SlimefunItems.AIR_RUNE.asOne(), SlimefunItems.ENDER_LUMP_3.asOne()},
			new SlimefunItemStack(SlimefunItems.ELYTRA_SCALE, 1).asOne());
	public static final AbstractItemRecipe RECIPE_ELITROS = new AbstractItemRecipe(
			new ItemStack[]{SlimefunItems.ELYTRA_SCALE.asOne(), SlimefunItems.AIR_RUNE.asOne(), SlimefunItems.ELYTRA_SCALE.asOne(),
					SlimefunItems.AIR_RUNE.asOne(), new ItemStack(Material.LEATHER_CHESTPLATE), SlimefunItems.AIR_RUNE.asOne(),
					SlimefunItems.ELYTRA_SCALE.asOne(), SlimefunItems.AIR_RUNE.asOne(), SlimefunItems.ELYTRA_SCALE.asOne()},
			new ItemStack(Material.ELYTRA, 1).asOne());
	public static final AbstractItemRecipe RECIPE_INFUSED_ELYTRA = new AbstractItemRecipe(
			new ItemStack[]{SlimefunItems.FLASK_OF_KNOWLEDGE.asOne(), SlimefunItems.ELYTRA_SCALE.asOne(), SlimefunItems.FLASK_OF_KNOWLEDGE.asOne(),
					SlimefunItems.FLASK_OF_KNOWLEDGE.asOne(), new ItemStack(Material.ELYTRA), SlimefunItems.FLASK_OF_KNOWLEDGE.asOne(),
					SlimefunItems.FLASK_OF_KNOWLEDGE.asOne(), SlimefunItems.ELYTRA_SCALE.asOne(), SlimefunItems.FLASK_OF_KNOWLEDGE.asOne()},
			new SlimefunItemStack(SlimefunItems.INFUSED_ELYTRA, 1).asOne());
	
  public MagicAltar(ItemGroup category, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe) {
    super(category, item, recipeType, recipe);
  }

  public static List<AbstractItemRecipe> getAllRecipe() {
    List<AbstractItemRecipe> list = new ArrayList<>();
    list.add(RECIPE_RUNE_AIR);
    list.add(RECIPE_RUNE_EARTH);
    list.add(RECIPE_RUNE_FIRE);
    list.add(RECIPE_RUNE_WATER);
    list.add(RECIPE_RUNE_ENDER);
    list.add(RECIPE_RUNE_LIGHTNING);
    list.add(RECIPE_RUNE_RAINBOW);
    list.add(RECIPE_RUNE_SOULBOUND);
    list.add(RECIPE_RUNE_ENCHANTMENT);
    list.add(RECIPE_RUNE_VILLAGERS);
    list.add(RECIPE_BLANK_RUNE);
    list.add(RECIPE_ESSENCE_OF_AFTERLIFE);
    list.add(RECIPE_LAVA_CRYSTAL);
    list.add(RECIPE_MAGICAL_GLASS);
    list.add(RECIPE_COMMON_TALISMAN);
    list.add(RECIPE_MAGICAL_BOOK_COVER);
    list.add(RECIPE_POWER_CRYSTAL);
    list.add(RECIPE_ELYTRA_SCALE);
    list.add(RECIPE_ELITROS);
    list.add(RECIPE_INFUSED_ELYTRA);
    return list;
  }

}
