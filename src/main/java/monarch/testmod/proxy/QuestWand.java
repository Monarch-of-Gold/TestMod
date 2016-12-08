package monarch.testmod.proxy;

import monarch.testmod.TestMod;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class QuestWand extends Item {
	public static final String name = "questWand";
	public QuestWand() {
	setRegistryName("questWand");
	setUnlocalizedName(getRegistryName().toString());
	setCreativeTab(TestMod.tabTest);
		}
	}
	