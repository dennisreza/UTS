/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.ti4bmalamUTS;

import com.app.ti4bmalamUTS.model.Sparepart;
import java.util.List;

/**
 *
 * @author denis
 */
public class Main {
  private SparepartDataSource dataSource;
   public Main(){
       dataSource = new SparepartDataSource();
   }
    public static void main(String[] args){
    new Main().testDelete();
   }
public void testGetAll(){
    List<Sparepart> list = dataSource.getAll();
    for (Sparepart spr : list){
        System.out.println("Nama Part: "+ spr.getNamaPart() + " Merk Part :"+spr.getMerkPart());
    }
    }
 public void testGetByID(){
     Sparepart sparepart = dataSource.getByID("SP0002");
     if(sparepart !=null){
         System.out.println("Nama Part: "+ sparepart.getNamaPart() + " Merk Part :"+sparepart.getMerkPart());
     }
 }
 
 public void testInsert(){
     Sparepart sparepart = new Sparepart("SP0004", "Velg", "Enkei", "RP.500.000,00","3");
     boolean hasil = dataSource.Insert(sparepart);
     if(hasil){
         System.out.println("Insert Data Berhasil!");
     }
     
 }   
 
   public void testUpdate(){
     Sparepart sparepart = dataSource.getByID("SP0002");
     sparepart.setMerkPart("Hannocs");
     boolean hasil = dataSource.Update(sparepart);
     if(hasil){
         System.out.println("Update Data Berhasil!");
     } 
 }
   
   public void testDelete(){
     boolean hasil = dataSource.Delete("SP0003");
     if(hasil){
         System.out.println("Delete Data SP0003 Berhasil!");
     } 
 }
}