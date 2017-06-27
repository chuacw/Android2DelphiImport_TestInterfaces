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

	@Override
	public boolean IsInjured(String playerName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getNumPlayers() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Object[] getPlayerAttribute(String playerName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setStrength(String playerName, int newStreng) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setInjury(String playerName, float injuryPercent) {
		// TODO Auto-generated method stub
		
	}

}
