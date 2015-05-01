package techreborn.compat.nei;

import codechicken.nei.recipe.GuiCraftingRecipe;
import codechicken.nei.recipe.TemplateRecipeHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.inventory.GuiContainer;
import techreborn.lib.ModInfo;
import codechicken.nei.api.API;
import codechicken.nei.api.IConfigureNEI;

public class NEIConfig implements IConfigureNEI {

	@Override
	public String getName()
	{
		return ModInfo.MOD_ID;
	}

	@Override
	public String getVersion()
	{
		return ModInfo.MOD_VERSION;
	}

	@Override
	public void loadConfig()
	{
		CentrifugeRecipeHandler centrifugeRecipeHandler = new CentrifugeRecipeHandler();
		ShapedRollingMachineHandler shapedRollingMachineHandler = new ShapedRollingMachineHandler();
		ShapelessRollingMachineHandler shapelessRollingMachineHandler = new ShapelessRollingMachineHandler();
		BlastFurnaceRecipeHandler blastFurnaceRecipeHandler = new BlastFurnaceRecipeHandler();

		API.registerRecipeHandler(centrifugeRecipeHandler);
		API.registerUsageHandler(centrifugeRecipeHandler);

		API.registerUsageHandler(shapedRollingMachineHandler);
		API.registerRecipeHandler(shapedRollingMachineHandler);

		API.registerUsageHandler(shapelessRollingMachineHandler);
		API.registerRecipeHandler(shapelessRollingMachineHandler);

		API.registerUsageHandler(blastFurnaceRecipeHandler);
		API.registerRecipeHandler(blastFurnaceRecipeHandler);
	}


	public static void openUsages(TemplateRecipeHandler.RecipeTransferRect rect, GuiContainer parent){
		Minecraft.getMinecraft().displayGuiScreen(new GuiCraftingRecipe(parent, rect));
	}
}
