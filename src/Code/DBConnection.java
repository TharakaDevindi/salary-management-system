/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;
/**
 *
 * @author THARAKA DEVINDI
 */
import java.sql.*;

public class DBConnection {
    Connection con = null;
    public Connection DBGetConnection()
    {  
    try
	{
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        con=DriverManager.getConnection("jdbc:odbc:Emp_SalaryManagementSystem","sa","123"); 
        }                                         
    catch(Exception ex)
        {
         System.out.println("Error connecting to database"+ex);
        }
        return con;
    }
    void m()
    {
      con=DBGetConnection();
    }
      public static void main(String args[])
      {
           DBConnection obj=new DBConnection();
           obj.m();
      }
}

