package com.github.relativobr.supreme.machine;

import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.resource.magical.SupremeCetrus;
import com.github.relativobr.supreme.resource.magical.SupremeCore;
import com.github.relativobr.supreme.util.SupremeItemStack;
import com.github.relativobr.supreme.util.UtilEnergy;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public class SupremeQuarry {


  public static final SlimefunItemStack STONE_QUARRY = new SupremeItemStack("SUPREME_STONE_QUARRY",
      "139ac257f4e04adc6ab3e46fd3b28749e866faa9ce6a1d6d526e0e3864d9222", "&eStone Quarry", "",
      LoreBuilder.machine(MachineTier.MEDIUM, MachineType.MACHINE), UtilEnergy.energyPowerPerItem(20),
      UtilEnergy.energyBuffer(10000), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_STONE_QUARRY = new ItemStack[]{SupremeComponents.ADAMANTIUM_PLATE.asOne(),
      SupremeComponents.INDUCTIVE_MACHINE.asOne(), SupremeComponents.ADAMANTIUM_PLATE.asOne(), new ItemStack(Material.DIAMOND_PICKAXE),
      SlimefunItems.PROGRAMMABLE_ANDROID_MINER.asOne(), new ItemStack(Material.DIAMOND_PICKAXE),
      SupremeComponents.ADAMANTIUM_PLATE.asOne(), SlimefunItems.COAL_GENERATOR.asOne(), SupremeComponents.ADAMANTIUM_PLATE.asOne()};

  public static final SlimefunItemStack COAL_QUARRY = new SupremeItemStack("SUPREME_COAL_QUARRY",
      "579ee734b739c0d19546d5b4b049c01a055506cc00b0cfcbf177883d2c814c04", "&eCoal Quarry", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), UtilEnergy.energyPowerPerItem(20),
      UtilEnergy.energyBuffer(10000), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_COAL_QUARRY = new ItemStack[]{SupremeCetrus.CETRUS_IGNIS.asOne(),
      SupremeComponents.ALLOY_PLATINUM.asOne(), SupremeCetrus.CETRUS_IGNIS.asOne(), new ItemStack(Material.DIAMOND_PICKAXE),
      SupremeQuarry.STONE_QUARRY.asOne(), new ItemStack(Material.DIAMOND_PICKAXE), SlimefunItems.COAL_GENERATOR.asOne(),
      SlimefunItems.GEO_MINER.asOne(), SlimefunItems.LARGE_CAPACITOR.asOne()};

  public static final SlimefunItemStack IRON_QUARRY = new SupremeItemStack("SUPREME_IRON_QUARRY",
      "f8eecae423359d3f5efd1063a9a7bcfaa43839d75d3b223c808df7961dd173d0", "&eIron Quarry", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), UtilEnergy.energyPowerPerItem(20),
      UtilEnergy.energyBuffer(10000), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_IRON_QUARRY = new ItemStack[]{SupremeCetrus.CETRUS_VENTUS.asOne(),
      SupremeComponents.ALLOY_IRIDIUM.asOne(), SupremeCetrus.CETRUS_VENTUS.asOne(), SupremeComponents.STAINLESS_MACHINE.asOne(),
      SupremeQuarry.COAL_QUARRY.asOne(), SupremeComponents.STAINLESS_MACHINE.asOne(), SlimefunItems.ELECTRO_MAGNET.asOne(),
      SlimefunItems.IRON_GOLEM_ASSEMBLER.asOne(), SlimefunItems.ELECTRO_MAGNET.asOne()};

  public static final SlimefunItemStack GOLD_QUARRY = new SupremeItemStack("SUPREME_GOLD_QUARRY",
      "6c07d48fd8764bc8d01a10cc6426578862090d9e856f3a8dd7f974a7521efc43", "&eGold Quarry", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), UtilEnergy.energyPowerPerItem(20),
      UtilEnergy.energyBuffer(10000), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_GOLD_QUARRY = new ItemStack[]{SupremeCetrus.CETRUS_LUX.asOne(),
      SupremeComponents.ALLOY_AURUM.asOne(), SupremeCetrus.CETRUS_LUX.asOne(), SupremeComponents.CONVEYANCE_MACHINE.asOne(),
      SupremeQuarry.IRON_QUARRY.asOne(), SupremeComponents.CONVEYANCE_MACHINE.asOne(), SlimefunItems.ELECTRO_MAGNET.asOne(),
      SlimefunItems.ELECTRIC_SMELTERY.asOne(), SlimefunItems.ELECTRO_MAGNET.asOne()};

  public static final SlimefunItemStack DIAMOND_QUARRY = new SupremeItemStack("SUPREME_DIAMOND_QUARRY",
      "666070ce03a545ee4d263bcf27f36338d249d7cb7a2376f92c1673ae134e04b6", "&eDiamond Quarry", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), UtilEnergy.energyPowerPerItem(10),
      UtilEnergy.energyBuffer(1000), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_DIAMOND_QUARRY = new ItemStack[]{SupremeCetrus.CETRUS_AQUA.asOne(),
      SupremeComponents.ALLOY_TITANIUM.asOne(), SupremeCetrus.CETRUS_AQUA.asOne(), SupremeComponents.INDUCTOR_MACHINE.asOne(),
      SupremeQuarry.GOLD_QUARRY.asOne(), SupremeComponents.INDUCTOR_MACHINE.asOne(), SlimefunItems.ELECTRIC_MOTOR.asOne(),
      SlimefunItems.HEATED_PRESSURE_CHAMBER.asOne(), SlimefunItems.ELECTRIC_MOTOR.asOne()};

  public static final SlimefunItemStack THORNIUM_QUARRY = new SupremeItemStack("SUPREME_THORNIUM_QUARRY",
      "6ddd4a12da1cc2c9f9d6cd49fc778e3a11f3757de6dd312d70a0d47885189c0", "&eThornium Quarry", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), UtilEnergy.energyPowerPerItem(10),
      UtilEnergy.energyBuffer(1000), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_THORNIUM_QUARRY = new ItemStack[]{SupremeCetrus.CETRUS_LUMIUM.asOne(),
      SupremeComponents.ALLOY_ADAMANTIUM.asOne(), SupremeCetrus.CETRUS_LUMIUM.asOne(), SupremeComponents.CRYSTALLIZER_MACHINE.asOne(),
      SupremeQuarry.DIAMOND_QUARRY.asOne(), SupremeComponents.CRYSTALLIZER_MACHINE.asOne(), SlimefunItems.ELECTRIC_MOTOR.asOne(),
      SlimefunItems.WITHER_ASSEMBLER.asOne(), SlimefunItems.ELECTRIC_MOTOR.asOne()};

  public static final SlimefunItemStack SUPREME_NUGGETS_QUARRY = new SupremeItemStack("SUPREME_SUPREME_NUGGETS_QUARRY",
      "ec7007d16abcfac9c6830c74d37cfd439a26373457d91452c1a96b8e04a6d", "&eNuggets of Supreme Quarry", "",
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE), UtilEnergy.energyPowerPerItem(10),
      UtilEnergy.energyBuffer(1000), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_SUPREME_NUGGETS_QUARRY = new ItemStack[]{SupremeCetrus.CETRUS_LUMIUM.asOne(),
      SupremeComponents.THORNERITE.asOne(), SupremeCetrus.CETRUS_LUMIUM.asOne(), SupremeCore.CORE_OF_NATURE.asOne(),
      SupremeQuarry.THORNIUM_QUARRY.asOne(), SupremeCore.CORE_OF_BLOCK.asOne(), SupremeCore.CORE_OF_LIFE.asOne(), SlimefunItems.NUCLEAR_REACTOR.asOne(),
      SupremeCore.CORE_OF_DEATH.asOne()};

}
