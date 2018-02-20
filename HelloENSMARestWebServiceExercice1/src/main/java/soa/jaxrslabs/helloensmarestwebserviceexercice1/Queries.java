

package soa.jaxrslabs.helloensmarestwebserviceexercice1;

import java.sql.*;

public class Queries {
         static String URL="jdbc:mysql://e-srvlamp:3306/s133207";
         static String login="s133207";
         static String password="gqy42mb";
         static String SELECT ="SELECT COUNT (*) FROM product;";
         
         static int testSelect(String select, Statement st){
                  try{
                           ResultSet contenuTab=st.executeQuery(select);
                          
                           
                           return contenuTab.getInt(1);
                                    
                           
                           
                  }catch(Exception e){
                           System.out.println("Erreur dans testSelect");
                  }
                  return -1;
         }
         
         

}


