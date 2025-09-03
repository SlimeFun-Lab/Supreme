package com.github.relativobr.supreme.generators;

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
import org.bukkit.inventory.ItemStack;

@UtilityClass
public class SupremeCapacitor {

  public static final SlimefunItemStack AURUM_CAPACITOR = new SupremeItemStack("SUPREME_AURUM_CAPACITOR",
      "db2b1c052e84a4ad245a4d1ca5b10bd7f5249af0ca373f99174ce7990e597836", false,
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.CAPACITOR), UtilEnergy.energyCapacity(Supreme.getSupremePowerSection().getCapacitorAurumCapacity()));
  public static final ItemStack[] MACHINE_AURUM_CAPACITOR = new ItemStack[]{SupremeComponents.AURUM_PLATE.asOne(),
      SlimefunItems.ENERGIZED_CAPACITOR.asOne(), SupremeComponents.AURUM_PLATE.asOne(), SupremeComponents.AURUM_PLATE.asOne(),
      SupremeCoreAlloy.RESOURCE_CORE_IRON.asOne(), SupremeComponents.AURUM_PLATE.asOne(), SupremeComponents.INDUCTOR_MACHINE.asOne(),
      SlimefunItems.ENERGIZED_CAPACITOR.asOne(), SupremeComponents.INDUCTOR_MACHINE.asOne()};

  public static final SlimefunItemStack TITANIUM_CAPACITOR = new SupremeItemStack("SUPREME_TITANIUM_CAPACITOR",
      "b30ad864b265ab178a03e27fc249a1e32941e007486febd0059e4e3b76c11958", false,
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.CAPACITOR), UtilEnergy.energyCapacity(Supreme.getSupremePowerSection().getCapacitorTitaniumCapacity()));
  public static final ItemStack[] MACHINE_TITANIUM_CAPACITOR = new ItemStack[]{SupremeComponents.TITANIUM_PLATE.asOne(),
      AURUM_CAPACITOR.asOne(), SupremeComponents.TITANIUM_PLATE.asOne(), SupremeComponents.TITANIUM_PLATE.asOne(),
      SupremeCoreAlloy.RESOURCE_CORE_REDSTONE.asOne(), SupremeComponents.TITANIUM_PLATE.asOne(), SupremeComponents.STAINLESS_MACHINE.asOne(),
      AURUM_CAPACITOR.asOne(), SupremeComponents.STAINLESS_MACHINE.asOne()};

  public static final SlimefunItemStack ADAMANTIUM_CAPACITOR = new SupremeItemStack("SUPREME_ADAMANTIUM_CAPACITOR",
      "9ac52419b99025828c89fa825945e6948e45bb5a22e4425a59e9096e4c1ac38", false,
      LoreBuilder.machine(MachineTier.ADVANCED, MachineType.CAPACITOR), UtilEnergy.energyCapacity(Supreme.getSupremePowerSection().getCapacitorAdamantiumCapacity()));
  public static final ItemStack[] MACHINE_ADAMANTIUM_CAPACITOR = new ItemStack[]{SupremeComponents.ADAMANTIUM_PLATE.asOne(),
      TITANIUM_CAPACITOR.asOne(), SupremeComponents.ADAMANTIUM_PLATE.asOne(), SupremeComponents.ADAMANTIUM_PLATE.asOne(),
      SupremeCoreAlloy.RESOURCE_CORE_EMERALD.asOne(), SupremeComponents.ADAMANTIUM_PLATE.asOne(), SupremeComponents.CONVEYANCE_MACHINE.asOne(),
      TITANIUM_CAPACITOR.asOne(), SupremeComponents.CONVEYANCE_MACHINE.asOne()};

  public static final SlimefunItemStack THORNIUM_CAPACITOR = new SupremeItemStack("SUPREME_THORNIUM_CAPACITOR",
      "9aab01a5d9512e3175bf3af2edbfd59419dc5662605c42c91730e711254efcc4", false,
      LoreBuilder.machine(MachineTier.END_GAME, MachineType.CAPACITOR), UtilEnergy.energyCapacity(Supreme.getSupremePowerSection().getCapacitorThorniumCapacity()));
  public static final ItemStack[] MACHINE_THORNIUM_CAPACITOR = new ItemStack[]{SupremeComponents.THORNIUM_ENERGIZED.asOne(),
      ADAMANTIUM_CAPACITOR.asOne(), SupremeComponents.THORNIUM_ENERGIZED.asOne(), SupremeComponents.THORNIUM_ENERGIZED.asOne(),
      SupremeCetrus.CETRUS_LUMIUM.asOne(), SupremeComponents.THORNIUM_ENERGIZED.asOne(), SupremeComponents.CRYSTALLIZER_MACHINE.asOne(),
      ADAMANTIUM_CAPACITOR.asOne(), SupremeComponents.CRYSTALLIZER_MACHINE.asOne()};

  public static final SlimefunItemStack SUPREME_CAPACITOR = new SupremeItemStack("SUPREME_SUPREME_CAPACITOR",
      "77400ea19dbd84f75c39ad6823ac4ef786f39f48fc6f84602366ac29b837422", false,
      LoreBuilder.machine(MachineTier.END_GAME, MachineType.CAPACITOR), UtilEnergy.energyCapacity(null));
  public static final ItemStack[] MACHINE_SUPREME_CAPACITOR = new ItemStack[]{SupremeComponents.SUPREME.asOne(),
      THORNIUM_CAPACITOR.asOne(), SupremeComponents.SUPREME.asOne(), SupremeComponents.SUPREME.asOne(), SupremeCetrus.CETRUS_LUMIUM.asOne(),
      SupremeComponents.SUPREME.asOne(), SupremeComponents.THORNERITE.asOne(), THORNIUM_CAPACITOR.asOne(), SupremeComponents.THORNERITE.asOne()};
}
