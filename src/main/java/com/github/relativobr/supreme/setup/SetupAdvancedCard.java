package com.github.relativobr.supreme.setup;

import com.github.relativobr.supreme.Supreme;
import com.github.relativobr.supreme.machine.tech.TechGenerator;
import com.github.relativobr.supreme.resource.SupremeComponents;
import com.github.relativobr.supreme.resource.mobtech.AdvancedCard;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import lombok.experimental.UtilityClass;

@UtilityClass
public class SetupAdvancedCard {

  public static void setup(Supreme plugin) {

    TechGenerator.preSetup(plugin, AdvancedCard.CARD_SOLDER_INGOT, SlimefunItems.SOLDER_INGOT.asOne(),
        SlimefunItems.SOLDER_INGOT.asOne());

    TechGenerator.preSetup(plugin, AdvancedCard.CARD_BILLON_INGOT, SlimefunItems.BILLON_INGOT.asOne(),
        SlimefunItems.BILLON_INGOT.asOne());

    TechGenerator.preSetup(plugin, AdvancedCard.CARD_BRONZE_INGOT, SlimefunItems.BRONZE_INGOT.asOne(),
        SlimefunItems.BRONZE_INGOT.asOne());

    TechGenerator.preSetup(plugin, AdvancedCard.CARD_BRASS_INGOT, SlimefunItems.BRASS_INGOT.asOne(), SlimefunItems.BRASS_INGOT.asOne());

    TechGenerator.preSetup(plugin, AdvancedCard.CARD_SULFATE, SlimefunItems.SULFATE.asOne(), SlimefunItems.SULFATE.asOne());

    TechGenerator.preSetup(plugin, AdvancedCard.CARD_CARBON, SlimefunItems.CARBON.asOne(), SlimefunItems.CARBON.asOne());

    TechGenerator.preSetup(plugin, AdvancedCard.CARD_SILICON, SlimefunItems.SILICON.asOne(), SlimefunItems.SILICON.asOne());

    TechGenerator.preSetup(plugin, AdvancedCard.CARD_STEEL, SlimefunItems.STEEL_INGOT.asOne(), SlimefunItems.STEEL_INGOT.asOne());

    TechGenerator.preSetup(plugin, AdvancedCard.CARD_NICKEL, SlimefunItems.NICKEL_INGOT.asOne(), SlimefunItems.NICKEL_INGOT.asOne());

    TechGenerator.preSetup(plugin, AdvancedCard.CARD_DURALUMIN_INGOT, SlimefunItems.DURALUMIN_INGOT.asOne(),
        SlimefunItems.DURALUMIN_INGOT.asOne());

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_FERROSILICON, SlimefunItems.FERROSILICON.asOne(),
        SlimefunItems.FERROSILICON.asOne());

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_DAMASCUS, SlimefunItems.DAMASCUS_STEEL_INGOT.asOne(),
        SlimefunItems.DAMASCUS_STEEL_INGOT.asOne());

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_COBALT, SlimefunItems.COBALT_INGOT.asOne(), SlimefunItems.COBALT_INGOT.asOne());

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_ALUMINUM_BRONZE_INGOT, SlimefunItems.ALUMINUM_BRONZE_INGOT.asOne(),
        SlimefunItems.ALUMINUM_BRONZE_INGOT.asOne());

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_ALUMINUM_BRASS_INGOT, SlimefunItems.ALUMINUM_BRASS_INGOT.asOne(),
        SlimefunItems.ALUMINUM_BRASS_INGOT.asOne());

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_CORINTHIAN_BRONZE_INGOT, SlimefunItems.CORINTHIAN_BRONZE_INGOT.asOne(),
        SlimefunItems.CORINTHIAN_BRONZE_INGOT.asOne());

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_GOLD24K, SlimefunItems.GOLD_24K.asOne(), SlimefunItems.GOLD_24K.asOne());

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_CARBON_PRESS, SlimefunItems.COMPRESSED_CARBON.asOne(),
        SlimefunItems.COMPRESSED_CARBON.asOne());

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_SYNTHETIC_SAPPHIRE, SlimefunItems.SYNTHETIC_SAPPHIRE.asOne(),
        SlimefunItems.SYNTHETIC_SAPPHIRE.asOne());

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_SYNTHETIC_EMERALD, SlimefunItems.SYNTHETIC_EMERALD.asOne(),
        SlimefunItems.SYNTHETIC_EMERALD.asOne());

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_BATTERY, SlimefunItems.BATTERY.asOne(), SlimefunItems.BATTERY.asOne());

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_MAGNET, SlimefunItems.MAGNET.asOne(), SlimefunItems.MAGNET.asOne());

    TechGenerator.preSetup(plugin, 2, AdvancedCard.CARD_PLASTIC_SHEET, SlimefunItems.PLASTIC_SHEET.asOne(),
        SlimefunItems.PLASTIC_SHEET.asOne());

    TechGenerator.preSetup(plugin, 3, AdvancedCard.CARD_HARDENED_METAL_INGOT, SlimefunItems.HARDENED_METAL_INGOT.asOne(),
        SupremeComponents.TITANIUM_PLATE.asOne(), SlimefunItems.HARDENED_METAL_INGOT.asOne());

    TechGenerator.preSetup(plugin, 3, AdvancedCard.CARD_REDSTONE_ALLOY, SlimefunItems.REDSTONE_ALLOY.asOne(),
        SupremeComponents.TITANIUM_PLATE.asOne(), SlimefunItems.REDSTONE_ALLOY.asOne());

    TechGenerator.preSetup(plugin, 3, AdvancedCard.CARD_ELECTRO_MAGNET, SlimefunItems.ELECTRO_MAGNET.asOne(),
        SupremeComponents.IRIDIUM_PLATE.asOne(), SlimefunItems.ELECTRO_MAGNET.asOne());

    TechGenerator.preSetup(plugin, 3, AdvancedCard.CARD_ELECTRIC_MOTOR, SlimefunItems.ELECTRIC_MOTOR.asOne(),
        SupremeComponents.AURUM_PLATE.asOne(), SlimefunItems.ELECTRIC_MOTOR.asOne());

    TechGenerator.preSetup(plugin, 3, AdvancedCard.CARD_HEATING_COIL, SlimefunItems.HEATING_COIL.asOne(),
        SupremeComponents.AURUM_PLATE.asOne(), SlimefunItems.HEATING_COIL.asOne());

    TechGenerator.preSetup(plugin, 3, AdvancedCard.CARD_SYNTHETIC_DIAMOND, SlimefunItems.SYNTHETIC_DIAMOND.asOne(),
        SupremeComponents.ADAMANTIUM_PLATE.asOne(), SlimefunItems.SYNTHETIC_DIAMOND.asOne());

    TechGenerator.preSetup(plugin, 3, AdvancedCard.CARD_CARBONADO, SlimefunItems.CARBONADO.asOne(),
        SupremeComponents.ADAMANTIUM_PLATE.asOne(), SlimefunItems.CARBONADO.asOne());

    TechGenerator.preSetup(plugin, 3, AdvancedCard.CARD_REINFORCED_ALLOY_INGOT, SlimefunItems.REINFORCED_ALLOY_INGOT.asOne(),
        SupremeComponents.ADAMANTIUM_PLATE.asOne(), SlimefunItems.REINFORCED_ALLOY_INGOT.asOne());

  }
}
