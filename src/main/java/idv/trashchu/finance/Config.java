package idv.trashchu.finance;

import java.util.Properties;

public class Config {
	
	public static final String dataDir = "data/";
	
	public static final String tseDir = "tse/";
	public static final String otcDir = "otc/";
	public static final String emDir = "em/";

	public static final String stockrecordDir = "stockrecord/";
	public static final String operatingrevenueDir = "operatingrevenue/";
	
	public static final String financialstatementDir = "financialstatement/";
	
	public static final String balancesheetDir = "balancesheet/";
	public static final String incomestatementDir = "incomestatement/";

	public static final String bakDir = "bak/";
	
	
	
	
	public static final String rootPath;
	
	public static final String stockrecordPath;
	
	static {
		try {
			Properties prop = new Properties();
			prop.loadFromXML(Config.class.getClassLoader().getResourceAsStream("config.xml"));
			
			rootPath = prop.getProperty("rootPath");
			
			stockrecordPath = rootPath + dataDir + tseDir + stockrecordDir;
			
		} catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
}
