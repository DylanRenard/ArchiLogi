package soa.jaxrslabs.helloensmarestwebserviceexercice1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.sql.*;

@Path("product")
public class product {
	public product() {
		
	}
	@GET
	@Produces("application/xml")
	public String getJson() {
		String result = null;
		try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn=DriverManager.getConnection(Queries.URL,Queries.login,Queries.password);
            Statement st=cn.createStatement();
            result = "" + Queries.testSelect(Queries.SELECT, st);
            
            st.close();
            cn.close();

            }catch(Exception e){
                     System.out.println("Erreur"  );
                     e.printStackTrace();
                     
            }

		
	    return result;
	}
	
	
		
	

}
