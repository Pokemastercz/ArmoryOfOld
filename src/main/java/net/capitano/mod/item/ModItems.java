package net.capitano.mod.item;

import net.capitano.mod.ArmoryOfFun;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final Item HANDGUN_AMMO = registerItem("handgun_ammo", new Item(new Item.Settings()));
    public static final Item RIFLE_AMMO = registerItem("rifle_ammo", new Item(new Item.Settings()));
    public static final Item HANDGUN_AMMO_BOX = registerItem("handgun_ammo_box", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ArmoryOfFun.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ArmoryOfFun.LOGGER.info("Registering Mod Items for" + ArmoryOfFun.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(HANDGUN_AMMO);
            entries.add(RIFLE_AMMO);
            entries.add(HANDGUN_AMMO_BOX);
        });
    }
}