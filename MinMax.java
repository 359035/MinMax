/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minmax;

/**
 *
 * @author Samsung
 */
import java.util.*;
public class MinMax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.print("Eleman Sayisini Giriniz:");
        int elemanSayisi=input.nextInt();
        int [] liste=new int[elemanSayisi];
        
        for(int i=0;i<elemanSayisi;i++){
            System.out.print((i+1)+"."+"Elemani Giriniz:");
            liste[i]=input.nextInt();
            
        }
        Arrays.sort(liste);
        System.out.println("En Kucuk Eleman:"+liste[0]);
        System.out.println("En Buyuk Eleman:"+liste[elemanSayisi-1]);
    }
    
}
