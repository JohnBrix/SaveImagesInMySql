/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import database.Database;
import model.ImageModel;
import service.ImageService;

/**
 *
 * @author User
 */
public class ImageDAO implements ImageService {
    Connection con;
    ResultSet rs;
    PreparedStatement ps;

    

 
      
     
    @Override
      public ArrayList<ImageModel> displayInformation()  {
        ArrayList<ImageModel> get = new ArrayList<ImageModel>();
        
        con = Database.getConnection();
        String query = "SELECT * FROM `image`";

        Statement st;
        ResultSet rs;
        
        try {
            st = con.createStatement();
            rs = st.executeQuery(query);
            ImageModel image;
            while (rs.next()) {
                
                image = new ImageModel(rs.getInt("id"), rs.getString("name"),
                        rs.getBytes("images"));
                       
                get.add(image);
            }
            
            
        }
        catch (Exception ex) {
            ex.printStackTrace();  
        }  
        return get;
      }
      
    @Override
      public void saveImage(ImageModel saveData){

     
      try {
        con = Database.getConnection();
       ps = con.prepareStatement("INSERT INTO `image`(`name`, `images`) VALUES (?,?)");

    
            ps.setString(1, saveData.getName());
            ps.setAsciiStream(2,saveData.getFile() );

            ps.executeUpdate();
   
                //display
             
                //auto clear once filled up formed
        
        } catch (SQLException e){
        e.printStackTrace();
      }
      
   }
      
    @Override
     public void updateInformation(ImageModel updateData){
            String UpdateQuery = null;
            con = Database.getConnection();
            
       try 
        {     
            
            UpdateQuery ="UPDATE `image` SET `name`=?,`images`=? WHERE id =?";
            ps = con.prepareStatement(UpdateQuery);
            ps.setString(1,updateData.getName() );
            ps.setAsciiStream(2,updateData.getFile() );
            ps.setInt(3, updateData.getId() );

            ps.executeUpdate();
       
            
        } catch (SQLException ex) {
            System.out.print(ex);
           ex.printStackTrace();
        }
       
        
       
    }
   

   

    

    
}
