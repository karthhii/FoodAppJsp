package res;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class FoodItemsDao {
	public static ArrayList<FoodItemsDto> getAllItems(){
		ArrayList<FoodItemsDto> r1=new ArrayList<>();
		FoodItemsDto r=null;
		try {
			Connection con=JdbcConn.getCon();
			PreparedStatement ps=con.prepareStatement("select * from foodDish");
		
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				int a=rs.getInt(1);
				String b=rs.getString(2);
				int c=rs.getInt(3);
				String d=rs.getString(4);
				String e=rs.getString(5);
				String f=rs.getString(6);
				float g=rs.getFloat(7);
				int h=rs.getInt(8);
				int i=rs.getInt(9);
				r=new FoodItemsDto(a,b,c,d,e,f,g,h,i);
				r1.add(r);
				
			}
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
			
		}
		return r1;
		
	}
	public static int AddItems(int foodId,String foodName,int price,String foodDes,String isNon,String isVeg,float avgRating,int cuId,int resId)
	{
		int valid=0;
		try
		{
			Connection con =JdbcConn.getCon();
			PreparedStatement ps=con.prepareStatement("insert into foodDish values(?,?,?,?,?,?,?,?,?)");
			ps.setInt(1, foodId);
			ps.setString(2, foodName);
			ps.setInt(3, price);
			ps.setString(4,foodDes);
			ps.setString(5, isNon);
			ps.setString(6, isVeg);
			ps.setFloat(7, avgRating);
			ps.setInt(8, cuId);
			ps.setInt(9, resId);
			valid=ps.executeUpdate();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return valid;
	}


}
