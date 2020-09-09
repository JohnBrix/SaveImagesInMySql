/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.FileInputStream;
import java.sql.Blob;
import javax.swing.ImageIcon;
import static sun.security.krb5.Confounder.bytes;

/**
 *
 * @author User
 */
public class ImageModel {
    
    private int id;
    private String name;
    private byte [] Myimage;
    private FileInputStream file;

   

    public FileInputStream getFile() {
        return file;
    }

    public void setFile(FileInputStream file) {
        this.file = file;
    }

//    public ImageIcon getImage(){
//        return new ImageIcon(Myimage);
//    }

    public ImageModel(int id, String name, byte [] image ) {
        this.id = id;
        this.name = name;
        this.Myimage = image;
        
    }

    public byte[] getMyimage() {
        return Myimage;
    }

    public void setMyimage(byte[] Myimage) {
        this.Myimage = Myimage;
    }

    

  

  
    public ImageModel(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMyimage(FileInputStream fin) {
         //To change body of generated methods, choose Tools | Templates.
    }

   

   

   

   
    
    
}
