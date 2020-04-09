/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.ti4bmalamUTS;

import com.app.ti4bmalamUTS.model.Sparepart;
import com.app.ti4bmalamUTS.utility.DatabaseUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author denis
 */
public class SparepartDataSource {
    private Connection connection;
    private Sparepart sparepart;

    public SparepartDataSource() {
        connection = DatabaseUtility.getConnection();
    }
    
    public Sparepart getByID(String id){
    Sparepart sparepart = null;
    String sql = "SELECT * FROM Sparepart where idpart=?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, id);
            ResultSet rs = statement.executeQuery(); 
            
            if(rs.next()){
                sparepart = new Sparepart();
                sparepart.setIdPart(rs.getString("IdPart"));
                sparepart.setNamaPart(rs.getString("NamaPart"));
                sparepart.setMerkPart(rs.getString("MerkPart"));
                sparepart.setHarga(rs.getString("Harga"));
                sparepart.setJumlah(rs.getString("Jumlah"));
                
            }
        } catch (Exception e) {
        }
    
    
    return sparepart;
    }    
    
public List<Sparepart> getAll(){
    List<Sparepart> list = new  ArrayList<>();
    String sql = "SELECT * FROM sparepart";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery(); 
            Sparepart sparepart;
            while(rs.next()){
                sparepart = new Sparepart();
                sparepart.setIdPart(rs.getString("IdPart"));
                sparepart.setNamaPart(rs.getString("NamaPart"));
                sparepart.setMerkPart(rs.getString("MerkPart"));
                sparepart.setHarga(rs.getString("Harga"));
                sparepart.setJumlah(rs.getString("Jumlah"));
                
            }
        } catch (Exception e) {
        }
    
    
    return list;
    
    }
public boolean Insert(Sparepart sparepart){
    String sql = "INSERT INTO Sparepart VALUES(?,?,?,?,?)";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, sparepart.getIdPart());
            statement.setString(2, sparepart.getNamaPart());
            statement.setString(3, sparepart.getMerkPart());
            statement.setString(4, sparepart.getHarga());
            statement.setString(5, sparepart.getJumlah());
            int result = statement.executeUpdate();
        return result > 0;    
        } catch (Exception e) {
        System.out.println ("Error: "+e.getMessage());
        }
    
    
    return false;
    }    
  
public boolean Update(Sparepart sparepart){
    String sql = "UPDATE Sparepart SET NamaPart=?,MerkPart=?,Harga=?,Jumlah=? "
            + "WHERE IdPart=?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, sparepart.getNamaPart());                      
            statement.setString(2, sparepart.getMerkPart());
            statement.setString(3, sparepart.getHarga());
            statement.setString(4, sparepart.getJumlah());
            statement.setString(5, sparepart.getIdPart());
            int result = statement.executeUpdate();
        return result > 0;    
       
        } catch (Exception e) {
        System.out.println ("Error: "+e.getMessage());
        }
    
    
    return false;
    }    

public boolean Delete(String id){
    String sql = "DELETE FROM Sparepart WHERE IdPart=?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, id);
            int result = statement.executeUpdate();
        return result > 0;    
       
        } catch (Exception e) {
        System.out.println ("Error: "+e.getMessage());
        }
    
    
    return false;
    }    


}
