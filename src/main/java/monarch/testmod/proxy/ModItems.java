package monarch.testmod.proxy;

import java.util.HashSet;
import java.util.Set;

import net.minecraft.item.Item;

public class ModItems {
	GameRegistry.register(questWand); 
	public static final Set<Item> items = new HashSet();
	public static Item.QuestWand questWand;
	public static QuestWand creatItems(QuestWand questWand) {
		return null;
	}
}