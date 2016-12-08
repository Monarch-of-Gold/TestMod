package monarch.testmod.proxy;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ServerProxy implements CommonProxy {

	private static final QuestWand QuestWand = null;

	public void preInit(FMLPreInitializationEvent e) {
		ModItems.creatItems(QuestWand); }}
