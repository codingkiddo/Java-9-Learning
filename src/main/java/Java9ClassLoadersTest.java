public class Java9ClassLoadersTest {

	public static void main(String[] args) {

		ModuleLayer layer = ModuleLayer.boot();
		layer.modules().forEach(module -> {
		    ClassLoader classLoader = module.getClassLoader();
		    String classLoaderName = classLoader == null ? "bootstrap" : classLoader.getName();
		    System.out.println(classLoaderName + ": " + module.getName());
		});

		
	}

}
