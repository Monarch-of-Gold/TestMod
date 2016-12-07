package monarch.testmod.proxy;

import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ServerProxy implements CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
		ModItems.creatItems(null); }}
