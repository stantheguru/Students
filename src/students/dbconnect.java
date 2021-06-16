/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package students;
import java.sql.Connection;
import java.sql.DriverManager;
public class dbconnect {
    public static void main(String[]args)throws Exception{
        getConnection();}
        public static Connection getConnection()throws Exception{
    
        try{
            String driver="org.postgresql.Driver";
            String url="jdbc:postgresql://localhost:5432/postgres";
            String username="postgres";
            String password="awesome";
            Class.forName(driver);
            
            Connection conn=DriverManager.getConnection(url,username,password);
            if(conn==null){
                 System.out.println("disconnected");
            }else{
            System.out.println("connected");
        }
            
            return conn;
            
        }
        catch (Exception e){System.out.println(e);}
        return null;
        }
        
}