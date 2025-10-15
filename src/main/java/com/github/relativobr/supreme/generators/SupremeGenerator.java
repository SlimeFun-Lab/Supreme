package com.github.relativobr.supreme.generators;

import static com.github.relativobr.supreme.util.ItemUtil.getValueGeneratorsWithLimit;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.resource.core.SupremeCoreAlloy;
import com.github.relativobr.supreme.resource.magical.SupremeCetrus;
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
public class SupremeGenerator {

  public static final SlimefunItemStack BASIC_IGNIS_GENERATOR = new SupremeItemStack("SUPREME_BASIC_IGNIS_GENERATOR",
      Material.ORANGE_CONCRETE, false, LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorBasicIgnisBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorBasicIgnisEnergy())));
  public static final ItemStack[] RECIPE_BASIC_IGNIS_GENERATOR = new ItemStack[]{SupremeComponents.ALLOY_AURUM.asOne(),
      SupremeCoreAlloy.RESOURCE_CORE_REDSTONE.asOne(), SupremeComponents.ALLOY_AURUM.asOne(), SupremeComponents.INDUCTIVE_MACHINE.asOne(),
      SlimefunItems.COAL_GENERATOR_2.asOne(), SupremeComponents.INDUCTIVE_MACHINE.asOne(), SupremeComponents.CARRIAGE_MACHINE.asOne(),
      SlimefunItems.STAFF_FIRE.asOne(), SupremeComponents.CARRIAGE_MACHINE.asOne()};

  public static final SlimefunItemStack IGNIS_GENERATOR = new SupremeItemStack("SUPREME_IGNIS_GENERATOR",
      Material.ORANGE_GLAZED_TERRACOTTA, false, LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorIgnisBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorIgnisEnergy())));
  public static final ItemStack[] RECIPE_IGNIS_GENERATOR = new ItemStack[]{SupremeComponents.AURUM_PLATE.asOne(),
      SupremeCetrus.CETRUS_IGNIS.asOne(), SupremeComponents.AURUM_PLATE.asOne(), SupremeComponents.INDUCTOR_MACHINE.asOne(),
      SupremeGenerator.BASIC_IGNIS_GENERATOR.asOne(), SupremeComponents.INDUCTOR_MACHINE.asOne(), SupremeComponents.CONVEYANCE_MACHINE.asOne(),
      SlimefunItems.STAFF_FIRE.asOne(), SupremeComponents.CONVEYANCE_MACHINE.asOne()};

  public static final SlimefunItemStack BASIC_VENTUS_GENERATOR = new SupremeItemStack("SUPREME_BASIC_VENTUS_GENERATOR",
      Material.LIGHT_BLUE_CONCRETE, false, LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorBasicVentusBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorBasicVentusEnergy())));
  public static final ItemStack[] RECIPE_BASIC_VENTUS_GENERATOR = new ItemStack[]{SupremeComponents.ALLOY_IRIDIUM.asOne(),
      SupremeCoreAlloy.RESOURCE_CORE_LAPIS.asOne(), SupremeComponents.ALLOY_IRIDIUM.asOne(), SupremeComponents.INDUCTIVE_MACHINE.asOne(),
      SlimefunItems.BIO_REACTOR.asOne(), SupremeComponents.INDUCTIVE_MACHINE.asOne(), SupremeComponents.CARRIAGE_MACHINE.asOne(),
      SlimefunItems.STAFF_WIND.asOne(), SupremeComponents.CARRIAGE_MACHINE.asOne()};

  public static final SlimefunItemStack VENTUS_GENERATOR = new SupremeItemStack("SUPREME_VENTUS_GENERATOR",
      Material.LIGHT_BLUE_GLAZED_TERRACOTTA, false, LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorVentusBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorVentusEnergy())));
  public static final ItemStack[] RECIPE_VENTUS_GENERATOR = new ItemStack[]{SupremeComponents.IRIDIUM_PLATE.asOne(),
      SupremeCetrus.CETRUS_VENTUS.asOne(), SupremeComponents.IRIDIUM_PLATE.asOne(), SupremeComponents.INDUCTOR_MACHINE.asOne(),
      SupremeGenerator.BASIC_VENTUS_GENERATOR.asOne(), SupremeComponents.INDUCTOR_MACHINE.asOne(), SupremeComponents.CONVEYANCE_MACHINE.asOne(),
      SlimefunItems.STAFF_WIND.asOne(), SupremeComponents.CONVEYANCE_MACHINE.asOne()};

  public static final SlimefunItemStack BASIC_AQUA_GENERATOR = new SupremeItemStack("SUPREME_BASIC_AQUA_GENERATOR",
      Material.BLUE_CONCRETE, false, LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorBasicAquaBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorBasicAquaEnergy())));
  public static final ItemStack[] RECIPE_BASIC_AQUA_GENERATOR = new ItemStack[]{SupremeComponents.ALLOY_MANGANESE.asOne(),
      SupremeCoreAlloy.RESOURCE_CORE_DIAMOND.asOne(), SupremeComponents.ALLOY_MANGANESE.asOne(), SupremeComponents.INDUCTIVE_MACHINE.asOne(),
      SlimefunItems.MAGNESIUM_GENERATOR.asOne(), SupremeComponents.INDUCTIVE_MACHINE.asOne(), SupremeComponents.CARRIAGE_MACHINE.asOne(),
      SlimefunItems.STAFF_WATER.asOne(), SupremeComponents.CARRIAGE_MACHINE.asOne()};

  public static final SlimefunItemStack AQUA_GENERATOR = new SupremeItemStack("SUPREME_AQUA_GENERATOR",
      Material.BLUE_GLAZED_TERRACOTTA, false, LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorAquaBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorAquaEnergy())), "", "&3Supreme Machine");
  public static final ItemStack[] RECIPE_AQUA_GENERATOR = new ItemStack[]{SupremeComponents.MANGANESE_PLATE.asOne(),
      SupremeCetrus.CETRUS_AQUA.asOne(), SupremeComponents.MANGANESE_PLATE.asOne(), SupremeComponents.INDUCTOR_MACHINE.asOne(),
      SupremeGenerator.BASIC_AQUA_GENERATOR.asOne(), SupremeComponents.INDUCTOR_MACHINE.asOne(), SupremeComponents.CONVEYANCE_MACHINE.asOne(),
      SlimefunItems.STAFF_WATER.asOne(), SupremeComponents.CONVEYANCE_MACHINE.asOne()};

  public static final SlimefunItemStack BASIC_LUX_GENERATOR = new SupremeItemStack("SUPREME_BASIC_LUX_GENERATOR",
      Material.WHITE_CONCRETE, false, LoreBuilder.machine(MachineTier.BASIC, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorBasicLuxBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorBasicLuxEnergy())));
  public static final ItemStack[] RECIPE_BASIC_LUX_GENERATOR = new ItemStack[]{SupremeComponents.ALLOY_TITANIUM.asOne(),
      SupremeCoreAlloy.RESOURCE_CORE_QUARTZ.asOne(), SupremeComponents.TITANIUM_PLATE.asOne(), SupremeComponents.INDUCTIVE_MACHINE.asOne(),
      SlimefunItems.SOLAR_GENERATOR_4.asOne(), SupremeComponents.INDUCTIVE_MACHINE.asOne(), SupremeComponents.CARRIAGE_MACHINE.asOne(),
      SlimefunItems.STAFF_STORM.asOne(), SupremeComponents.CARRIAGE_MACHINE.asOne()};

  public static final SlimefunItemStack LUX_GENERATOR = new SupremeItemStack("SUPREME_LUX_GENERATOR",
      Material.WHITE_GLAZED_TERRACOTTA, false, LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorLuxBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorLuxEnergy())));
  public static final ItemStack[] RECIPE_LUX_GENERATOR = new ItemStack[]{SupremeComponents.TITANIUM_PLATE.asOne(),
      SupremeCetrus.CETRUS_LUX.asOne(), SupremeComponents.TITANIUM_PLATE.asOne(), SupremeComponents.INDUCTOR_MACHINE.asOne(),
      SupremeGenerator.BASIC_LUX_GENERATOR.asOne(), SupremeComponents.INDUCTOR_MACHINE.asOne(), SupremeComponents.CONVEYANCE_MACHINE.asOne(),
      SlimefunItems.STAFF_STORM.asOne(), SupremeComponents.CONVEYANCE_MACHINE.asOne()};

  public static final SlimefunItemStack BASIC_LUMIUM_GENERATOR = new SupremeItemStack("SUPREME_BASIC_LUMIUM_GENERATOR",
      Material.BROWN_CONCRETE, false, LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorBasicLumiumBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorBasicLumiumEnergy())));
  public static final ItemStack[] RECIPE_BASIC_LUMIUM_GENERATOR = new ItemStack[]{SupremeComponents.ALLOY_ADAMANTIUM.asOne(),
      SupremeCoreAlloy.RESOURCE_CORE_NETHERITE.asOne(), SupremeComponents.ALLOY_ADAMANTIUM.asOne(), SupremeComponents.INDUCTIVE_MACHINE.asOne(),
      SlimefunItems.LAVA_GENERATOR_2.asOne(), SupremeComponents.INDUCTIVE_MACHINE.asOne(), SupremeComponents.PETRIFIER_MACHINE.asOne(),
      SlimefunItems.GEO_MINER.asOne(), SupremeComponents.PETRIFIER_MACHINE.asOne()};

  public static final SlimefunItemStack LUMIUM_GENERATOR = new SupremeItemStack("SUPREME_LUMIUM_GENERATOR",
      Material.BROWN_GLAZED_TERRACOTTA, false, LoreBuilder.machine(MachineTier.ADVANCED, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorLumiumBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorLumiumEnergy())));
  public static final ItemStack[] RECIPE_LUMIUM_GENERATOR = new ItemStack[]{SupremeComponents.ADAMANTIUM_PLATE.asOne(),
      SupremeCetrus.CETRUS_LUMIUM.asOne(), SupremeComponents.ADAMANTIUM_PLATE.asOne(), SupremeComponents.INDUCTOR_MACHINE.asOne(),
      SupremeGenerator.BASIC_LUMIUM_GENERATOR.asOne(), SupremeComponents.INDUCTOR_MACHINE.asOne(),
      SupremeComponents.CRYSTALLIZER_MACHINE.asOne(), SlimefunItems.GEO_MINER.asOne(), SupremeComponents.CRYSTALLIZER_MACHINE.asOne()};

  public static final SlimefunItemStack THORNIUM_GENERATOR = new SupremeItemStack("SUPREME_THORNIUM_GENERATOR",
      Material.BLACK_GLAZED_TERRACOTTA, false, LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorThorniumBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorThorniumEnergy())));
  public static final ItemStack[] RECIPE_THORNIUM_GENERATOR = new ItemStack[]{SupremeComponents.THORNIUM_ENERGIZED.asOne(),
      SupremeGenerator.IGNIS_GENERATOR.asOne(), SupremeComponents.THORNIUM_ENERGIZED.asOne(), SupremeComponents.THORNIUM_ENERGIZED.asOne(),
      SupremeGenerator.AQUA_GENERATOR.asOne(), SupremeComponents.THORNIUM_ENERGIZED.asOne(), SupremeComponents.CRYSTALLIZER_MACHINE.asOne(),
      SupremeGenerator.VENTUS_GENERATOR.asOne(), SupremeComponents.CRYSTALLIZER_MACHINE.asOne()};

  public static final SlimefunItemStack SUPREME_GENERATOR = new SupremeItemStack("SUPREME_SUPREME_GENERATOR",
      Material.PURPLE_GLAZED_TERRACOTTA, false, LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR),
      UtilEnergy.energyBuffer(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorSupremeBuffer())),
      UtilEnergy.energyPowerPerTick(getValueGeneratorsWithLimit(Supreme.getSupremePowerSection().getGeneratorSupremeEnergy())));
  public static final ItemStack[] RECIPE_SUPREME_GENERATOR = new ItemStack[]{SupremeComponents.SUPREME.asOne(),
      SupremeGenerator.LUX_GENERATOR.asOne(), SupremeComponents.SUPREME.asOne(), SupremeComponents.SUPREME.asOne(),
      SupremeGenerator.LUMIUM_GENERATOR.asOne(), SupremeComponents.SUPREME.asOne(), SupremeComponents.CRYSTALLIZER_MACHINE.asOne(),
      SupremeGenerator.THORNIUM_GENERATOR.asOne(), SupremeComponents.CRYSTALLIZER_MACHINE.asOne()};

}
