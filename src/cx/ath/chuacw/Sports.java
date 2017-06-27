package cx.ath.chuacw;

public interface Sports {
   public void setHomeTeam(String name);
   public void setVisitingTeam(String name);
   public boolean IsInjured(String playerName);
   public int getNumPlayers();
   public Object[] getPlayerAttribute(String playerName);
   public void setStrength(String playerName, int newStreng);
   public void setInjury(String playerName, float injuryPercent);
}
