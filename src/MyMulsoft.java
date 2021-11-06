import java.sql.*;
import java.util.*;
public class MyMulsoft {
 
    public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
        try {
        Class.forName("org.sqlite.JDBC");
        Connection con=DriverManager.getConnection("jdbc:sqlite:product.db");
        if(con!=null)
        {
        	//PreparedStatement pstmt=con.prepareStatement("insert into mymovies values(?,?,?,?,?)");
        	PreparedStatement pstmt=con.prepareStatement("select movie from mymovies where actor='prabhas'");
        	ResultSet rs=pstmt.executeQuery();
        	System.out.println("Movie"+"\t"+"Actor"+"\t"+"Actress"+"\t"+"year"+"\t"+"Director");
        	System.out.println("______________________________________________________________");
        	while( rs.next()) {
               System.out.println(rs.getString(1));
             }
        	//Statement stmt=con.createStatement();
            //int k=stmt.executeUpdate("create table mymovies(Movie varchar2(20) NOT NULL,Actor varchar2(20) NOT NULL,Actress varchar2(20) NOT NULL,year number NOT NULL,director varchar2(20) NOT NULL)");
            //System.out.println("Table Created");
           /* System.out.println("Enter movie name");
            String Movie=sc.next();
            System.out.println("Enter actor name");
            String Actor=sc.next();
            System.out.println("Enter actress name");
            String Actress=sc.next();
            System.out.println("Enter year of movie");
            int year=sc.nextInt();
            System.out.println("Enter name of the director");
            String director=sc.next();
            pstmt.setString(1,Movie);
            pstmt.setString(2,Actor);
            pstmt.setString(3,Actress);
            pstmt.setInt(4,year);
            pstmt.setString(5,director);
           int x= pstmt.executeUpdate();
           System.out.println(x);
        */}
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
    
}