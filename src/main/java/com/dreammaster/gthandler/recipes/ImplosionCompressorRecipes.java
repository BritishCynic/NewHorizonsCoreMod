package com.dreammaster.gthandler.recipes;

import com.dreammaster.gthandler.CustomItemList;

import cpw.mods.fml.common.Loader;
import gregtech.api.enums.GT_Values;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_ModHandler;
import gregtech.api.util.GT_OreDictUnificator;

public class ImplosionCompressorRecipes implements Runnable {

    @Override
    public void run() {
        if (Loader.isModLoaded("GalaxySpace")) {
            GT_Values.RA.addImplosionRecipe(
                    GT_OreDictUnificator.get(OrePrefixes.compressed, Materials.Aluminium, 2L),
                    1,
                    GT_ModHandler.getModItem("GalaxySpace", "item.CompressedDualAluminium", 1L, 0),
                    GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 1L));
            GT_Values.RA.addImplosionRecipe(
                    GT_OreDictUnificator.get(OrePrefixes.compressed, Materials.Bronze, 2L),
                    1,
                    GT_ModHandler.getModItem("GalaxySpace", "item.CompressedDualBronze", 1L, 0),
                    GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 1L));
            GT_Values.RA.addImplosionRecipe(
                    CustomItemList.RawSDHCAlloy.get(1L),
                    5,
                    GT_ModHandler.getModItem("GalaxySpace", "item.CompressedSDHD120", 1L, 0),
                    GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.StainlessSteel, 1L));
            GT_Values.RA.addImplosionRecipe(
                    GT_OreDictUnificator.get(OrePrefixes.block, Materials.Coal, 1L),
                    1,
                    GT_ModHandler.getModItem("GalaxySpace", "item.CompressedCoal", 1L, 0),
                    GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 1L));
            GT_Values.RA.addImplosionRecipe(
                    GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.BlackPlutonium, 1L),
                    1,
                    CustomItemList.BlackPlutoniumCompressedPlate.get(1L),
                    GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 1L));
            GT_Values.RA.addImplosionRecipe(
                    GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.Adamantium, 1L),
                    1,
                    GT_ModHandler.getModItem("GalaxySpace", "item.CompressedPlates", 1L, 0),
                    GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 1L));
            GT_Values.RA.addImplosionRecipe(
                    GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.Cobalt, 1L),
                    1,
                    GT_ModHandler.getModItem("GalaxySpace", "item.CompressedPlates", 1L, 1),
                    GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 1L));
            GT_Values.RA.addImplosionRecipe(
                    GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.Duralumin, 1L),
                    1,
                    GT_ModHandler.getModItem("GalaxySpace", "item.CompressedPlates", 1L, 2),
                    GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 1L));
            GT_Values.RA.addImplosionRecipe(
                    GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.Lead, 1L),
                    1,
                    GT_ModHandler.getModItem("GalaxySpace", "item.CompressedPlates", 1L, 3),
                    GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 1L));
            GT_Values.RA.addImplosionRecipe(
                    GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.Magnesium, 1L),
                    1,
                    GT_ModHandler.getModItem("GalaxySpace", "item.CompressedPlates", 1L, 4),
                    GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 1L));
            GT_Values.RA.addImplosionRecipe(
                    GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.Mithril, 1L),
                    1,
                    GT_ModHandler.getModItem("GalaxySpace", "item.CompressedPlates", 1L, 5),
                    GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 1L));
            GT_Values.RA.addImplosionRecipe(
                    GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.Nickel, 1L),
                    1,
                    GT_ModHandler.getModItem("GalaxySpace", "item.CompressedPlates", 1L, 6),
                    GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 1L));
            GT_Values.RA.addImplosionRecipe(
                    GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.Oriharukon, 1L),
                    1,
                    GT_ModHandler.getModItem("GalaxySpace", "item.CompressedPlates", 1L, 7),
                    GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 1L));
            GT_Values.RA.addImplosionRecipe(
                    GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.Platinum, 1L),
                    1,
                    GT_ModHandler.getModItem("GalaxySpace", "item.CompressedPlates", 1L, 8),
                    GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 1L));
            GT_Values.RA.addImplosionRecipe(
                    GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.Tungsten, 1L),
                    1,
                    GT_ModHandler.getModItem("GalaxySpace", "item.CompressedPlates", 1L, 9),
                    GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 1L));
        }
        if (Loader.isModLoaded("GalacticraftMars")) {
            GT_Values.RA.addImplosionRecipe(
                    GT_ModHandler.getModItem("GalacticraftMars", "item.itemBasicAsteroids", 2L, 6),
                    2,
                    CustomItemList.TitaniumDualCompressedPlates.get(1L),
                    GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 2L));
            GT_Values.RA.addImplosionRecipe(
                    GT_ModHandler.getModItem("GalacticraftMars", "item.null", 2L, 5),
                    2,
                    CustomItemList.DeshDualCompressedPlates.get(1L),
                    GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 2L));
        }
        GT_Values.RA.addImplosionRecipe(
                CustomItemList.IceCompressedPlate.get(2L),
                2,
                CustomItemList.IceDualCompressedPlates.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 2L));
        GT_Values.RA.addImplosionRecipe(
                CustomItemList.QuantinumCompressedPlate.get(2L),
                2,
                CustomItemList.QuantinumDualCompressedPlates.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 2L));
        GT_Values.RA.addImplosionRecipe(
                GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.Ledox, 1L),
                1,
                CustomItemList.LedoxCompressedPlate.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 1L));
        GT_Values.RA.addImplosionRecipe(
                GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.Mytryl, 1L),
                1,
                CustomItemList.MytrylCompressedPlate.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 1L));
        GT_Values.RA.addImplosionRecipe(
                GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.Quantium, 1L),
                1,
                CustomItemList.QuantinumCompressedPlate.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 1L));
        GT_Values.RA.addImplosionRecipe(
                GT_OreDictUnificator.get(OrePrefixes.plateTriple, Materials.CallistoIce, 1L),
                1,
                CustomItemList.CallistoIceCompressedPlate.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 1L));

        GT_Values.RA.addImplosionRecipe(
                CustomItemList.MytrylCompressedPlate.get(2L),
                2,
                CustomItemList.MytrylDualCompressedPlates.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 2L));
        GT_Values.RA.addImplosionRecipe(
                CustomItemList.MysteriousCrystalCompressedPlate.get(2L),
                2,
                CustomItemList.MysteriousCrystalDualCompressedPlates.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 2L));
        if (Loader.isModLoaded("GalacticraftCore")) {
            GT_Values.RA.addImplosionRecipe(
                    GT_ModHandler.getModItem("GalacticraftCore", "item.basicItem", 2L, 9),
                    2,
                    CustomItemList.SteelDualCompressedPlates.get(1L),
                    GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 2L));
            GT_Values.RA.addImplosionRecipe(
                    GT_ModHandler.getModItem("GalacticraftCore", "item.basicItem", 2L, 7),
                    2,
                    CustomItemList.TinDualCompressedPlates.get(1L),
                    GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 2L));
            GT_Values.RA.addImplosionRecipe(
                    GT_ModHandler.getModItem("GalacticraftCore", "item.basicItem", 2L, 6),
                    2,
                    CustomItemList.CopperDualCompressedPlates.get(1L),
                    GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 2L));
            GT_Values.RA.addImplosionRecipe(
                    GT_ModHandler.getModItem("GalacticraftCore", "item.basicItem", 2L, 11),
                    2,
                    CustomItemList.IronDualCompressedPlates.get(1L),
                    GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 2L));
            GT_Values.RA.addImplosionRecipe(
                    GT_ModHandler.getModItem("GalacticraftCore", "item.meteoricIronIngot", 2L, 1),
                    2,
                    CustomItemList.MeteoricIronDualCompressedPlates.get(1L),
                    GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Ash, 2L));
        }
        if (!Loader.isModLoaded("bartworks")) GT_Values.RA.addImplosionRecipe(
                CustomItemList.HeavyDutyAlloyIngotT4.get(1L),
                32,
                CustomItemList.HeavyDutyPlateTier4.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Osmiridium, 4L));
        GT_Values.RA.addImplosionRecipe(
                CustomItemList.HeavyDutyAlloyIngotT5.get(1L),
                40,
                CustomItemList.HeavyDutyPlateTier5.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Europium, 5L));
        GT_Values.RA.addImplosionRecipe(
                CustomItemList.HeavyDutyAlloyIngotT6.get(1L),
                48,
                CustomItemList.HeavyDutyPlateTier6.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Tritanium, 6L));
        GT_Values.RA.addImplosionRecipe(
                CustomItemList.HeavyDutyAlloyIngotT7.get(1L),
                56,
                CustomItemList.HeavyDutyPlateTier7.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Neutronium, 7L));
        GT_Values.RA.addImplosionRecipe(
                CustomItemList.HeavyDutyAlloyIngotT8.get(1L),
                64,
                CustomItemList.HeavyDutyPlateTier8.get(1L),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.BlackPlutonium, 8L));
        // Avaritia recipes
        if (Loader.isModLoaded("Avaritia")) {
            GT_Values.RA.addImplosionRecipe(
                    GT_ModHandler.getModItem("Avaritia", "Resource", 9L, 2),
                    1,
                    GT_ModHandler.getModItem("Avaritia", "Resource", 1L, 3),
                    GT_Values.NI);
            GT_Values.RA.addImplosionRecipe(
                    GT_ModHandler.getModItem("Avaritia", "Resource", 9L, 3),
                    4,
                    GT_ModHandler.getModItem("Avaritia", "Resource", 1L, 4),
                    GT_Values.NI);
            GT_Values.RA.addImplosionRecipe(
                    GT_ModHandler.getModItem("Avaritia", "Resource", 9L, 4),
                    16,
                    GT_ModHandler.getModItem("Avaritia", "Resource_Block", 1L, 0),
                    GT_Values.NI);
            GT_Values.RA.addImplosionRecipe(
                    GT_ModHandler.getModItem("Avaritia", "Resource", 9L, 6),
                    64,
                    GT_ModHandler.getModItem("Avaritia", "Resource_Block", 1L, 1),
                    GT_Values.NI);
        }
        // extra utils
        if (Loader.isModLoaded("ExtraUtilities")) {
            // CC
            GT_Values.RA.addImplosionRecipe(
                    GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 9L, 0),
                    1,
                    GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 1L, 1),
                    GT_Values.NI);
            GT_Values.RA.addImplosionRecipe(
                    GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 9L, 1),
                    1,
                    GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 1L, 2),
                    GT_Values.NI);
            GT_Values.RA.addImplosionRecipe(
                    GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 9L, 2),
                    1,
                    GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 1L, 3),
                    GT_Values.NI);
            GT_Values.RA.addImplosionRecipe(
                    GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 9L, 3),
                    1,
                    GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 1L, 4),
                    GT_Values.NI);
            GT_Values.RA.addImplosionRecipe(
                    GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 9L, 4),
                    8,
                    GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 1L, 5),
                    GT_Values.NI);
            GT_Values.RA.addImplosionRecipe(
                    GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 9L, 5),
                    10,
                    GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 1L, 6),
                    GT_Values.NI);
            GT_Values.RA.addImplosionRecipe(
                    GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 9L, 6),
                    16,
                    GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 1L, 7),
                    GT_Values.NI);
            // CD
            GT_Values.RA.addImplosionRecipe(
                    GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 9L, 8),
                    1,
                    GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 1L, 9),
                    GT_Values.NI);
            GT_Values.RA.addImplosionRecipe(
                    GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 9L, 9),
                    2,
                    GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 1L, 10),
                    GT_Values.NI);
            GT_Values.RA.addImplosionRecipe(
                    GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 9L, 10),
                    4,
                    GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 1L, 11),
                    GT_Values.NI);
            // CG
            GT_Values.RA.addImplosionRecipe(
                    GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 9L, 12),
                    1,
                    GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 1L, 13),
                    GT_Values.NI);
            // CS
            GT_Values.RA.addImplosionRecipe(
                    GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 9L, 14),
                    1,
                    GT_ModHandler.getModItem("ExtraUtilities", "cobblestone_compressed", 1L, 15),
                    GT_Values.NI);

            GT_Values.RA.addImplosionRecipe(
                    GT_ModHandler.getModItem("ExtraUtilities", "bedrockiumIngot", 9),
                    8,
                    GT_ModHandler.getModItem("ExtraUtilities", "block_bedrockium", 1L),
                    GT_Values.NI);
        }

        if (Loader.isModLoaded("StevesCarts")) GT_Values.RA.addImplosionRecipe(
                GT_ModHandler.getModItem("StevesCarts", "ModuleComponents", 1L, 18),
                1,
                GT_ModHandler.getModItem("StevesCarts", "ModuleComponents", 1L, 19),
                GT_Values.NI);

        GT_Values.RA.addImplosionRecipe(
                GT_OreDictUnificator.get(OrePrefixes.dustSmall, Materials.Diamond, 1L),
                2,
                GT_ModHandler.getModItem("Translocator", "diamondNugget", 2L, 0),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.DarkAsh, 1L));

        if (Loader.isModLoaded("DraconicEvolution")) {
            GT_Values.RA.addImplosionRecipe(
                    GT_ModHandler.getModItem("DraconicEvolution", "chaosFragment", 9L, 2),
                    8,
                    GT_ModHandler.getModItem("DraconicEvolution", "chaosShard", 1L, 0),
                    GT_Values.NI);
            GT_Values.RA.addImplosionRecipe(
                    GT_ModHandler.getModItem("DraconicEvolution", "chaosFragment", 9L, 1),
                    4,
                    GT_ModHandler.getModItem("DraconicEvolution", "chaosFragment", 1L, 2),
                    GT_Values.NI);
            GT_Values.RA.addImplosionRecipe(
                    GT_ModHandler.getModItem("DraconicEvolution", "chaosFragment", 9L, 0),
                    2,
                    GT_ModHandler.getModItem("DraconicEvolution", "chaosFragment", 1L, 1),
                    GT_Values.NI);
        }
    }
}
