package otamusan.nechc.client.jei;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.crafting.ShapedRecipes;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraft.util.NonNullList;
import otamusan.nec.common.Lib;
import otamusan.nec.common.config.NECConfig;
import otamusan.nec.items.ItemCompressed;
import otamusan.nechc.common.heavycraft.RecipeReplacer;

public class FakeRecipe {
	public static List<IRecipe> getCompressedCraftFakeRecipe() {
		List<IRecipe> recipes = new ArrayList<>();
		for (int i = 0; i < NECConfig.CONFIG_TYPES.JEIshowCompressionTime; i++) {
			for (IRecipe recipe : RecipeReplacer.existingRecipe) {
				ItemStack out = ItemCompressed.createCompressedItem(recipe.getRecipeOutput(), i);
				NonNullList<Ingredient> in = NonNullList.create();
				for (Ingredient ingredient : recipe.getIngredients()) {
					if (ingredient.getMatchingStacks().length == 0) {
						in.add(Ingredient.EMPTY);
						continue;
					}
					in.add(Ingredient
							.fromStacks(ItemCompressed.createCompressedItem(ingredient.getMatchingStacks()[0], i + 1)));
				}
				if (recipe.getClass() == ShapedRecipes.class) {
					recipes.add(new ShapedRecipes(Lib.MOD_ID + "_compressedcraft", ((ShapedRecipes) recipe).recipeWidth,
							((ShapedRecipes) recipe).recipeHeight, in, out));
				} else if (recipe.getClass() == ShapelessRecipes.class) {
					recipes.add(new ShapelessRecipes(Lib.MOD_ID + "_compressedcraft", out, in));
				}
			}
		}
		return recipes;
	}
}
