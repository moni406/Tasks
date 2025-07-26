package JavaOopsTask;
abstract class Appliance{
	abstract void turnon();
}
interface Connectable{
	void connect();
}
class SmartTv extends Appliance implements Connectable{
	public void turnon()
	{
		System.out.println("Smart Tv is On");
	}
	public void connect()
	{
		System.out.println("Smart Tv connected to WIFI");
	}
}
public class Abstract_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartTv tv=new SmartTv();
		tv.turnon();
		tv.connect();
	}

}
