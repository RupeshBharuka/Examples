package sports.app;

public class Player {
	private Integer playerId;
	private String playerName;
	private Integer ageOfPlayer;

	public Player(){
		this.playerId = 0;
		this.playerName = null;
		this.ageOfPlayer = 0;
	}
	
	
	public Player(Integer playerId, String playerName, Integer ageOfPlayer) {
		this.playerId = playerId;
		this.playerName = playerName;
		this.ageOfPlayer = ageOfPlayer;
	}


	public Integer getPlayerId() {
		return playerId;
	}

	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Integer getAgeOfPlayer() {
		return ageOfPlayer;
	}

	public void setAgeOfPlayer(Integer ageOfPlayer) {
		this.ageOfPlayer = ageOfPlayer;
	}

}
