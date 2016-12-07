package monarch.testmod.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class QuestWand extends Item {
	public static final String name = "Quest Wand";
	public QuestWand () {
		GameRegistry.registerItem(this, name);
		setUnlocalizedName(Constants.MODID + "_" + name);
		setCreativeTab(Minecraft.tabTools);
	}
	

}
