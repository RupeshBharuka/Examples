package sports.app;

import org.springframework.jdbc.core.JdbcTemplate;

public class PlayerDaoImpl implements PlayerDao{
	private JdbcTemplate jdbcTemplate;
	
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	@Override
	public String getPlayerNameById(Integer playerId) {
		String query = "SELECT playername FROM Player where playerid = ?";
		 String name = jdbcTemplate.queryForObject(query,new Object[]{playerId},String.class);
	    return name;
	}


	@Override
	public void insertPlayerDetails(String playerName, Integer ageOfPlayer) {
		String query = "insert into Player(playername,age) values (?,?)";
		jdbcTemplate.update(query,playerName,ageOfPlayer);
		System.out.println("Record inserted successfully !");
		return ;
	}

}
