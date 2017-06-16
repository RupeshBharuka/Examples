package sports.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	private static AnnotationConfigApplicationContext context;

	public static void main(String[] args) {
		context = new AnnotationConfigApplicationContext(SpringJDBCConfiguration.class);

//		PlayerDao playerDao = context.getBean(PlayerDao.class); //OK 
		PlayerDao playerDao = (PlayerDao) context.getBean("playerDao"); //OK
		
		
		playerDao.insertPlayerDetails("Sunil", 32);
//		String playerName = playerDao.getPlayerNameById(1); //Auto-Boxing will happen automatically
//		System.out.println("Player Name : " +playerName);
	}

}
