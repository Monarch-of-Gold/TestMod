package monarch.testmod;

import monarch.testmod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = TestRef.MOD_ID, name = TestRef.name, version = TestRef.VERSION, acceptedMinecraftVersions = TestRef.ACCEPTED_VERSIONS)
public class TestMod {

	@Instance
	public static TestMod instance;
	
	@SidedProxy(clientSide = TestRef.CLIENT_PROXY_CLASS, serverSide = TestRef.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) 
	{
		System.out.println("PreInitialization DONE!");
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) 
	{
		System.out.println("Initialization DONE!");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) 
	{
		System.out.println("PostInitialization DONE!");
	}
}
