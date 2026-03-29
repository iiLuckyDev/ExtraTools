package me.sfiguz7.extratools.setup;

import io.github.thebusybiscuit.slimefun4.api.researches.Research;
import me.sfiguz7.extratools.lists.ETItems;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;

public final class ETResearches {

    private static final int BASE_ID = 4100;

    private ETResearches() {
    }

    public static void setup(Plugin plugin) {
        register(plugin, "primitive_crushing", BASE_ID + 1, "Primitive Crushing", 8,
            ETItems.HAMMER
        );
        register(plugin, "utility_machines", BASE_ID + 2, "Utility Machines", 18,
            ETItems.ELECTRIC_COMPOSTER,
            ETItems.CONCRETE_FACTORY
        );
        register(plugin, "material_reprocessing", BASE_ID + 3, "Material Reprocessing", 22,
            ETItems.GOLD_TRANSMUTER,
            ETItems.PULVERIZER
        );
        register(plugin, "fluid_processing", BASE_ID + 4, "Fluid Processing", 26,
            ETItems.VAPORIZER
        );
        register(plugin, "advanced_automation", BASE_ID + 5, "Advanced Automation", 40,
            ETItems.ELECTRIC_COMPOSTER_2,
            ETItems.COBBLESTONE_GENERATOR
        );
    }

    private static void register(Plugin plugin, String key, int id, String name, int cost, ItemStack... items) {
        new Research(new NamespacedKey(plugin, key), id, name, cost)
            .addItems(items)
            .register();
    }
}
