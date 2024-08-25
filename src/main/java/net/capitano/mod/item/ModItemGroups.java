package net.capitano.mod.item;

import net.capitano.mod.ArmoryOfFun;
import net.capitano.mod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ARMORY_OF_FUN_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ArmoryOfFun.MOD_ID, "armory_of_fun_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SMALL_AMMO_BOX))
                    .displayName(Text.translatable("itemgroup.armoryoffun.armory_of_fun_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.SMALL_AMMO);
                        entries.add(ModItems.SMALL_AMMO_BOX);
                        entries.add(ModItems.LARGER_AMMO);
                        entries.add(ModBlocks.SMALL_AMMO_CRATE);
                    }).build());

    public static void registerItemGroups() {
        ArmoryOfFun.LOGGER.info("Registering Item Groups For" + ArmoryOfFun.MOD_ID);

    }
}
