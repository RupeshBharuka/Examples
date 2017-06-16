package sports.app;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringJDBCConfiguration {
	
	 @Bean
	    public DataSource dataSource() {
	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        
            //MySQL database configuration details
	        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
	        dataSource.setUrl("jdbc:mysql://localhost:3306/Players");
	        dataSource.setUsername("root");
	        dataSource.setPassword("root");
	        
	       return dataSource;
	    }
	 
	    @Bean
	    public JdbcTemplate jdbcTemplate() {
	        JdbcTemplate jdbcTemplate = new JdbcTemplate();
	        jdbcTemplate.setDataSource(dataSource());
	        return jdbcTemplate;
	    }
	    
	    @Bean(name="playerDao")
	    public PlayerDao payerDAO(){
	    	PlayerDaoImpl playerDAOImpl = new PlayerDaoImpl();
	    	playerDAOImpl.setJdbcTemplate(jdbcTemplate());
	    	
	    	return playerDAOImpl;
	    }
	 	   
}	
