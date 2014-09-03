package main.redstonearmory.items;

import cofh.api.modhelpers.ThermalExpansionHelper;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import main.redstonearmory.ConfigHandler;
import main.redstonearmory.blocks.BlockRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.oredict.ShapedOreRecipe;
import redstonearsenal.item.RAItems;
import thermalexpansion.item.TEItems;
import thermalfoundation.item.TFItems;

@SuppressWarnings("all")
public class ItemRecipeRegistry {

	private static void registerShapedRecipes() {
		//Gelid Enderium Nugget -> Ingot
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.gelidMaterials, 1, 0), new Object[] { "NNN", "NNN", "NNN", 'N', new ItemStack(ItemRegistry.gelidMaterials, 1, 1) });

		//Armor recipes
		if(ConfigHandler.enableEnderiumFluxArmorCrafting) {
			GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorEnderiumHelm, 1), new Object[]{"PHP", "P P", 'P', new ItemStack(ItemRegistry.armorPlating, 1, 0), 'H', RAItems.armorFluxHelmet});
			GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorEnderiumChestplate, 1), new Object[] { "P P", "PCP", "PPP", 'P', new ItemStack(ItemRegistry.armorPlating, 1, 0), 'C', RAItems.armorFluxPlate});
			GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorEnderiumLeggings, 1), new Object[] { "PLP", "P P", "P P", 'P', new ItemStack(ItemRegistry.armorPlating, 1, 0), 'L', RAItems.armorFluxLegs});
			GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorEnderiumBoots, 1), new Object[] { "P P", "PBP", 'P', new ItemStack(ItemRegistry.armorPlating, 1, 0), 'B', RAItems.armorFluxBoots});
		}
		if(ConfigHandler.enablePowersuitCrafting) {
			//stuffs
		}
		if(ConfigHandler.enableLumiumArmorCrafting) {
			GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorLumiumHelm, 1), new Object[]{"PPP", "P P", 'P', new ItemStack(ItemRegistry.armorPlating, 1, 1)});
			GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorLumiumChestplate, 1), new Object[] { "P P", "PPP", "PPP", 'P', new ItemStack(ItemRegistry.armorPlating, 1, 1)});
			GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorLumiumLeggings, 1), new Object[] { "PPP", "P P", "P P", 'P', new ItemStack(ItemRegistry.armorPlating, 1, 1)});
			GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorLumiumBoots, 1), new Object[] { "P P", "P P", 'P', new ItemStack(ItemRegistry.armorPlating, 1, 1)});
		}
		if(ConfigHandler.enableMithrilArmorCrafting) {
			GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorMithrilHelm, 1), new Object[]{"PPP", "P P", 'P', new ItemStack(ItemRegistry.armorPlating, 1, 2)});
			GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorMithrilChestplate, 1), new Object[] { "P P", "PPP", "PPP", 'P', new ItemStack(ItemRegistry.armorPlating, 1, 2)});
			GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorMithrilLeggings, 1), new Object[] { "PPP", "P P", "P P", 'P', new ItemStack(ItemRegistry.armorPlating, 1, 2)});
			GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorMithrilBoots, 1), new Object[] { "P P", "P P", 'P', new ItemStack(ItemRegistry.armorPlating, 1, 2)});
		}
		if(ConfigHandler.enableTinkersAlloyArmorCrafting) {
			//stuffs
		}
		if(ConfigHandler.enableTuberousArmorCrafting) {
			GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorTuberousHelm, 1), new Object[]{"PPP", "P P", 'P', new ItemStack(ItemRegistry.armorPlating, 1, 4)});
			GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorTuberousChestplate, 1), new Object[] { "P P", "PPP", "PPP", 'P', new ItemStack(ItemRegistry.armorPlating, 1, 4)});
			GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorTuberousLeggings, 1), new Object[] { "PPP", "P P", "P P", 'P', new ItemStack(ItemRegistry.armorPlating, 1, 4)});
			GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorTuberousBoots, 1), new Object[] { "P P", "P P", 'P', new ItemStack(ItemRegistry.armorPlating, 1, 4)});
		}
	}

	private static void registerShaplessRecipes() {
		//Block -> Ingot -> Nugget
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.gelidMaterials, 9, 0), new Object[] { new ItemStack(BlockRegistry.ingotStorage, 0) });
		GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.gelidMaterials, 9, 1), new Object[] { new ItemStack(ItemRegistry.gelidMaterials, 0) });
	}

	private static void registerMachineRecipes() {
		if(Loader.isModLoaded("ThermalExpansion")) {
			ThermalExpansionHelper.addTransposerFill(12000, RAItems.gemCrystalFlux, new ItemStack(ItemRegistry.gelidMaterials, 1, 2), new FluidStack(FluidRegistry.getFluid("cryotheum"), 1000), false);
			ThermalExpansionHelper.addTransposerFill(12000, TFItems.ingotEnderium, new ItemStack(ItemRegistry.gelidMaterials, 1, 0), new FluidStack(FluidRegistry.getFluid("cryotheum"), 1000), false);
			ThermalExpansionHelper.addTransposerFill(12000, new ItemStack(ItemRegistry.armorPlating, 1, 5), new ItemStack(ItemRegistry.armorPlating, 1, 6), new FluidStack(FluidRegistry.getFluid("mana"), 1000), false);
		} else {
			GameRegistry.addRecipe(new ItemStack(ItemRegistry.gelidMaterials, 1, 0), new Object[] { "PSP", "SIS", "PSP", 'P', new ItemStack(Items.ender_pearl), 'S', new ItemStack(Blocks.snow), 'I', RAItems.ingotElectrumFlux });
			GameRegistry.addRecipe(new ItemStack(ItemRegistry.gelidMaterials, 1, 2), new Object[] { "PSP", "SGS", "PSP", 'P', new ItemStack(Items.ender_pearl), 'S', new ItemStack(Blocks.ice), 'G', RAItems.gemCrystalFlux });
			GameRegistry.addShapelessRecipe(TFItems.bucketMana, new Object[] { TFItems.bucketCryotheum, TFItems.bucketEnder, TFItems.bucketPyrotheum, TFItems.bucketRedstone, TFItems.bucketCoal, TFItems.bucketGlowstone });
			GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.armorPlating, 1, 6), new Object[] { TFItems.bucketMana, new ItemStack(ItemRegistry.armorPlating, 1, 5) });
		}
	}

	private static void registerLateShapedRecipes() {

		//Gelid Rod
		GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.gelidMaterials, 1, 3), new Object[]{"  G", " R ", "G  ", 'R', RAItems.rodObsidianFlux, 'G', new ItemStack(ItemRegistry.gelidMaterials, 1, 2) });


		//Tool recipes
		if(ConfigHandler.enableGelidAxeCrafting) {
			GameRegistry.addRecipe(new ItemStack(ItemRegistry.axeGelidEnderium, 1, 0), new Object[] { "II ", "IT ", " R ", 'R', new ItemStack(ItemRegistry.gelidMaterials, 1, 3), 'T', RAItems.itemAxeFlux, 'I', new ItemStack(ItemRegistry.gelidMaterials, 1, 0)});
		}
		if(ConfigHandler.enableGelidBattleWrenchCrafting) {
			GameRegistry.addRecipe(new ItemStack(ItemRegistry.battleWrenchGelidEnderium, 1, 0), new Object[] { "I I", "ITI", " R ", 'R', new ItemStack(ItemRegistry.gelidMaterials, 1, 3), 'T', RAItems.itemBattleWrenchFlux, 'I', new ItemStack(ItemRegistry.gelidMaterials, 1, 0)});
		}
		if(ConfigHandler.enableGelidPickaxeCrafting) {
			GameRegistry.addRecipe(new ItemStack(ItemRegistry.pickaxeGelidEnderium, 1, 0), new Object[] { "III", " T ", " R ", 'R', new ItemStack(ItemRegistry.gelidMaterials, 1, 3), 'T', RAItems.itemPickaxeFlux, 'I', new ItemStack(ItemRegistry.gelidMaterials, 1, 0)});
		}
		if(ConfigHandler.enableGelidShovelCrafting) {
			GameRegistry.addRecipe(new ItemStack(ItemRegistry.shovelGelidEnderium, 1, 0), new Object[] { " I ", " T ", " R ", 'R', new ItemStack(ItemRegistry.gelidMaterials, 1, 3), 'T', RAItems.itemShovelFlux, 'I', new ItemStack(ItemRegistry.gelidMaterials, 1, 0)});
		}
		if(ConfigHandler.enableGelidSickleCrafting) {
			GameRegistry.addRecipe(new ItemStack(ItemRegistry.sickleGelidEnderium, 1, 0), new Object[] { " I ", "  I", "RT ", 'R', new ItemStack(ItemRegistry.gelidMaterials, 1, 3), 'T', RAItems.itemSickleFlux, 'I', new ItemStack(ItemRegistry.gelidMaterials, 1, 0)});
		}
		if(ConfigHandler.enableGelidSwordCrafting) {
			GameRegistry.addRecipe(new ItemStack(ItemRegistry.swordGelidEnderium, 1, 0), new Object[] { " I ", " T ", " R ", 'R', new ItemStack(ItemRegistry.gelidMaterials, 1, 3), 'T', RAItems.itemSwordFlux, 'I', new ItemStack(ItemRegistry.gelidMaterials, 1, 0)});
		}

		//armor plating
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemRegistry.armorPlating, 1, 0), new Object[]{"NNN", "GIG", "NNN", 'N', "nuggetEnderium", 'G', "gemCrystalFlux", 'I', "ingotEnderium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemRegistry.armorPlating, 1, 1), new Object[]{"NNN", "GIG", "NNN", 'N', "nuggetLumium", 'G', "dustRedstone", 'I', "ingotLumium"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemRegistry.armorPlating, 1, 2), new Object[]{"NNN", "GIG", "NNN", 'N', "nuggetMithril", 'G', "dustRedstone", 'I', "ingotMithril"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemRegistry.armorPlating, 1, 3), new Object[]{"NNN", "GIG", "NNN", 'N', "nuggetBronze", 'G', "dustRedstone", 'I', "ingotBronze"}));
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(ItemRegistry.armorPlating, 1, 4), new Object[]{"PPP", "DCD", "PPP", 'P', new ItemStack(Items.potato), 'D', "dustRedstone", 'C', TEItems.capacitorPotato}));
	}

	public static void registerItemRecipes() {
		registerShapedRecipes();
		registerShaplessRecipes();
	}

	//Anything that uses TF, TE, or RArs goes here
	public static void registerLateItemRecipes() {
		registerMachineRecipes();
		registerLateShapedRecipes();
	}
}