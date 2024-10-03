package shubha_cosmetic;
import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.Statement;

import java.util.*;

import shubha_cosmetic.detailsdb;
public class inventory {
	Connection con;

    Statement stmt;

    ResultSet rs;

    String qry=null;

    detailsdb db;

    Scanner sc=new Scanner(System.in);

    List <cosmetic> list=new ArrayList <>();

    Main m;

	public Connection getDBConnection() {

		Connection con=null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shubha","root","");

		}

		catch(Exception ex) {

			System.out.println(ex);

		}

		return con;

	}

	      public void addP(cosmetic s) {

	        boolean sts=false;

	        int count;

	        try {

	        	con=getDBConnection();

	        	stmt=con.createStatement();

	        	qry="insert into cosmetic(name,brand,quan,price,id)values('"+s.getname()+"','"+s.getbrand()+"','"+s.getquan()+"','"+s.getprice()+"','"+s.getid()+"')" ;

	        	count=stmt.executeUpdate(qry);

	        	if (count==1)

	        		sts=true;

	        	else

	        		throw new Exception();

	        }

	        catch(Exception ex) {

	        	System.out.println(ex.getMessage());

	        }

	      }

	      public void update(cosmetic s) {

	    	  boolean sts=false;

	    	  int count;

	    	  try{

	    		  con=getDBConnection();

	    		  stmt=con.createStatement();

	    		  count=stmt.executeUpdate("update cosmetic set name='"+s.getname()+"' where id='"+s.getid()+"'");

	    		  if(count==1)

	    			  sts=true;

	    		  else

	    			  throw new Exception();

	    	 }

	    	  catch(Exception ex) {

	    		  System.out.println(ex.getMessage());

	    	  }

	          System.out.println("Successfully updated");

	      }

	      public cosmetic search(String ids) {

	    for(int i=0;i<list.size();i++) {

	    if(list.get(i).getid().equals(ids))

	    return list.get(i);

	    }

	return null;

	      }

	      public void Remove(String ids1) {

	     /*for(int i=0;i<list.size();i++) {

	      if(list.get(i).getid().equals(idr))

	       list.remove(i);

	      }*/



	    	 int count;

	    	 try {

	    		 con=getDBConnection();

	    		 stmt=con.createStatement();

	    		 qry="delete from cosmetic where id='"+ids1+"'";

	    		 count=stmt.executeUpdate(qry);

	    		 if(count==1)

	    			 System.out.println("Successfully Deleted");

	    	 }catch(Exception ex) {

	    		 System.out.println(ex.getMessage());

	 

	    	 }

	    	 

	      }

	      public void show() {

	    	  try {

		    	  con=getDBConnection();

		    	  stmt=con.createStatement();

		    	  rs=stmt.executeQuery("select * from cosmetic");

		    	  while(rs.next())

		    		  System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4)+" "+rs.getString(5));

		      }

		      catch(Exception ex) {

		    	  System.out.println(ex.getMessage());

		      }

	     //System.out.println(list);

	      }

	     public void logout() {

	    System.out.println("Logged out");

	    Main.main(null);

	    for(cosmetic s:list) {

	    System.out.println(s);

	    }

	      }

}


