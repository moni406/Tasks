package java8.interfaces;
interface Logger{
	default void logInfo() {
		System.out.println("Default Info log");
	}
	static void logError() {
		System.out.println("Static Error log");
	}
}
class AppLogger implements Logger{}
public class TnterfaceSample  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AppLogger logger=new AppLogger();
		logger.logInfo();
		Logger.logError();
	}

}
