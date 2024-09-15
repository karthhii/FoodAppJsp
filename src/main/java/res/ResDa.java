package res;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ResDa {
	public static ArrayList<ResDt> getAllDetails(){
		ArrayList<ResDt> r1=new ArrayList<ResDt>();
		ResDt r=null;
		try {
			Connection con=JdbcConn.getCon();
			PreparedStatement ps=con.prepareStatement("select * from restaurant");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				int a=rs.getInt(1);
				String b=rs.getString(2);
				String c=rs.getString(3);
				String d=rs.getString(4);
				String e=rs.getString(5);
				String f=rs.getString(6);
				int g=rs.getInt(7);
				int h=rs.getInt(8);
				String i=rs.getString(9);
				float j=rs.getFloat(10);
				int k=rs.getInt(11);
				r=new ResDt(a,b,c,d,e,f,g,h,i,j,k);
				r1.add(r);
				
			}
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
			
		}
		return r1;
		
	}
	public static ArrayList<ResDt> getIdPass(){
		ArrayList<ResDt> r1=new ArrayList<ResDt>();
		ResDt r=null;
		try {
			Connection con=JdbcConn.getCon();
			PreparedStatement ps=con.prepareStatement("select * from restaurant");
		
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				int a=rs.getInt(1);
				String b=rs.getString(2);
				String c=rs.getString(3);
				String d=rs.getString(4);
				String e=rs.getString(5);
				String f=rs.getString(6);
				int g=rs.getInt(7);
				int h=rs.getInt(8);
				String i=rs.getString(9);
				float j=rs.getFloat(10);
				int k=rs.getInt(11);
				r=new ResDt(a,b,c,d,e,f,g,h,i,j,k);
				r1.add(r);
				
			}
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
			
		}
		return r1;
	

}
}
