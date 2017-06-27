package cx.ath.chuacw;

public class TestInterface implements Hockey {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInterface intf = new TestInterface();
		Hockey hockey = intf;
		hockey.Announce("Hello world");
		TestInterface i = (TestInterface) hockey;
		i.Announce("Me too");
	}

	@Override
	public void setHomeTeam(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVisitingTeam(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Announce(String Announcement) {
		// TODO Auto-generated method stub
		System.out.println(Announcement);
	}

}
