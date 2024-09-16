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
	public static int AddRestaurant(int resId,String resName,String address,String location,String openTime,String closeTime,int gstNumber,int contactNumber,String email,float avgRating,int password) {
		int valid=0;
		try {
			Connection con=JdbcConn.getCon();
			PreparedStatement rs=con.prepareStatement("insert into restaurant values(?,?,?,?,?,?,?,?,?,?,?)");
				rs.setInt(1,resId);
				rs.setString(2,resName);
				rs.setString(3,address);
				rs.setString(4,location);
				rs.setString(5,openTime);
				rs.setString(6,closeTime);
				rs.setInt(7,gstNumber);
				rs.setInt(8,contactNumber);
				rs.setString(9,email);
				rs.setFloat(10,avgRating);
				rs.setInt(11,password);
				valid=rs.executeUpdate();
				
			}
			
		
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
		return valid;
	}
}
