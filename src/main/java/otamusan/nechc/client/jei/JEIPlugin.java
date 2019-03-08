package otamusan.nechc.client.jei;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.ISubtypeRegistry;
import mezz.jei.api.ingredients.IModIngredientRegistration;
import mezz.jei.api.recipe.IRecipeCategoryRegistration;
import mezz.jei.api.recipe.VanillaRecipeCategoryUid;
import otamusan.nec.common.config.NECConfig;

public class JEIPlugin implements IModPlugin {
	@mezz.jei.api.JEIPlugin
	@Override
	public void registerItemSubtypes(ISubtypeRegistry subtypeRegistry) {
	}

	@Override
	public void registerIngredients(IModIngredientRegistration registry) {
	}

	@Override
	public void registerCategories(IRecipeCategoryRegistration registry) {
	}

	@Override
	public void register(IModRegistry registry) {
		if (NECConfig.CONFIG_TYPES.JEIshowCompressedCraft)
			registry.addRecipes(FakeRecipe.getCompressedCraftFakeRecipe(), VanillaRecipeCategoryUid.CRAFTING);
	}
}
