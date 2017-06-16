package sports.app;

public interface PlayerDao {
	public void insertPlayerDetails(String playerName, Integer ageOfPlayer);
	public String getPlayerNameById(Integer playerId);
}
