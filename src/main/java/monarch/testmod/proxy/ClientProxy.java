package monarch.testmod.proxy;

import monarch.testmod.proxy.ModItems.questWand;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy implements CommonProxy {


public void preInit(FMLPreInitializationEvent e) {
	questWand questWand;
	ModItems.creatItems(questWand); }}
