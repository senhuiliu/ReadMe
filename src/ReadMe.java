/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Huige1
 */
import java.io.*;

public class ReadMe
{
   public static void main(String[] args)
   {
       try
       {
           RandomAccessFile raf=new RandomAccessFile("Pledge.txt","r");
           String s="";
           raf.seek(124);
           System.out.println("Char at 124="+(char)raf.read());
           raf.seek(136);
           System.out.println("Char at 136="+(char)raf.read());
           raf.close();
       }catch(Exception e){System.out.println(e.getMessage());}
   }
}