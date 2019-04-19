/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pismedi;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ibrahim
 */
public class Pismedi {

    public static void desteDoldur(String[] deste)
    {
        
        deste[0]="[♢]Karo As";
        deste[1]="[♢]Karo 2";
        deste[2]="[♢]Karo 3";
        deste[3]="[♢]Karo 4";
        deste[4]="[♢]Karo 5";
        deste[5]="[♢]Karo 6";
        deste[6]="[♢]Karo 7";
        deste[7]="[♢]Karo 8";
        deste[8]="[♢]Karo 9";
        deste[9]="[♢]Karo 10";
        deste[10]="[♢]Karo Joker";
        deste[11]="[♢]Karo Kız";
        deste[12]="[♢]Karo Papaz";
       
        deste[13]="[♡]Kupa As";
        deste[14]="[♡]Kupa 2";
        deste[15]="[♡]Kupa 3";
        deste[16]="[♡]Kupa 4";
        deste[17]="[♡]Kupa 5";
        deste[18]="[♡]Kupa 6";
        deste[19]="[♡]Kupa 7";
        deste[20]="[♡]Kupa 8";
        deste[21]="[♡]Kupa 9";
        deste[22]="[♡]Kupa 10";
        deste[23]="[♡]Kupa Joker";
        deste[24]="[♡]Kupa Kız";
        deste[25]="[♡]Kupa Papaz";
        
        deste[26]="[♠]Maça As";
        deste[27]="[♠]Maça 2";
        deste[28]="[♠]Maça 3";
        deste[29]="[♠]Maça 4";
        deste[30]="[♠]Maça 5";
        deste[31]="[♠]Maça 6";
        deste[32]="[♠]Maça 7";
        deste[33]="[♠]Maça 8";
        deste[34]="[♠]Maça 9";
        deste[35]="[♠]Maça 10";
        deste[36]="[♠]Maça Joker";
        deste[37]="[♠]Maça Kız";
        deste[38]="[♠]Maça Papaz";
        
        deste[39]="[♣]Sinek As";
        deste[40]="[♣]Sinek 2";
        deste[41]="[♣]Sinek 3";
        deste[42]="[♣]Sinek 4";
        deste[43]="[♣]Sinek 5";
        deste[44]="[♣]Sinek 6";
        deste[45]="[♣]Sinek 7";
        deste[46]="[♣]Sinek 8";
        deste[47]="[♣]Sinek 9";
        deste[48]="[♣]Sinek 10";
        deste[49]="[♣]Sinek Joker";
        deste[50]="[♣]Sinek Kız";
        deste[51]="[♣]Sinek Papaz";
    }
    public static void desteKaristir(String[] deste)
    {
        desteDoldur(deste);
        Random rnd = new Random();
        for (int i = 0; i < deste.length; i++) {
            int rasgele = rnd.nextInt(52);
            String yedek = deste[i];
            deste[i]=deste[rasgele];
            deste[rasgele]=yedek;
        }
        
    }
    public static void elYazdir(String[] uDeste)
    {
        int sayac =0;
       System.out.println("----------------------");
       System.out.println("Elinizdeki Kağıtlar :");
       for(String item : uDeste)
       {
           if (item!=null) {
                System.out.println(sayac+" "+item);
                sayac++;
           }
          
       }
       System.out.println("----------------------");
    }
    public static void desteYazdir(String[] deste)
    {
        System.out.println("----------------------");
        int sayac =0;
        for(String item :deste)
        {
            System.out.println(sayac+" "+item);
            sayac++;
        }
        System.out.println("----------------------");
    }
    public static void desteYazdir(String[][] deste)
    {
        System.out.println("----------------------");
        System.out.println("Yerdeki Kağıtlar :");
        int sayac =0;
        for (int i = 0; i < deste.length; i++) {
            if (deste[i][0]!=null) {
                if (deste[i][1]=="Açık") {
                    System.out.println(sayac+" "+deste[i][0]);
                    sayac++;
                }
                else
                {
                    System.out.println(sayac+" "+"Kapalı");
                    sayac++;
                }
                
            }
        }
        System.out.println("----------------------");
    }
    public static void desteIlkDagit(String[] deste,String[] uDeste,String[] cDeste,String[][] yerDeste){
       int index=0;
        for (int i = 0; i < deste.length; i++) {
            if (deste[i].equals("")) {
                index=i;
            }
        }
        index++;
        /// destenin bitme durumunu kontrol et...
        
        //kullanıcı destesi ilk dagıtım.
        uDeste[0]=deste[index];
        uDeste[1]=deste[index+1];
        uDeste[2]=deste[index+2];
        uDeste[3]=deste[index+3];
        
        //bilgisayar destesi ilk dağıtım
        cDeste[0]=deste[index+4];
        cDeste[1]=deste[index+5];
        cDeste[2]=deste[index+6];
        cDeste[3]=deste[index+7];
        
        //yere açılan deste ilk dagıtım dizimiz 2 boyutlu ilk üç kart kapalı açılma durumu için
        yerDeste[0][0]=deste[index+8];
        yerDeste[0][1]="Kapalı";
        yerDeste[1][0]=deste[index+9];
        yerDeste[1][1]="Kapalı";
        yerDeste[2][0]=deste[index+10];
        yerDeste[2][1]="Kapalı";
        yerDeste[3][0]=deste[index+11];
        yerDeste[3][1]="Açık";
        
        for (int i = 0; i < 12; i++) {//destemizden aldığımız kartları kaldırıyoruz.
            deste[i]="";
        }

    }
    public static void desteKesDagit(String[] deste,String[] uDeste,String[] cDeste,String[][] yerDeste)
    {
        
        
        desteKaristir(deste);//deste karıştırılır.
        
        //Desteden Rasgele Kesilir ve alt üst edilir.[KesBaslangic]
        Random rnd = new Random();
        int kes = 16+rnd.nextInt(18);
        String[] deste1 = new String[52];
        String[] deste2 = new String[52];
        int d2Sayac=0;
        for (int i = 0; i < deste.length; i++) {
            if (i<kes) {
                deste1[i]=deste[i];
            }
            else{
                deste2[d2Sayac]=deste[i];
                d2Sayac++;
            }
        }
        int sayac =0;
        for(String item :deste2)
        {
           if (item==null) {
               break;}
            
            deste[sayac]=item;
            sayac++;
        }
        for(String item :deste1) {
             if (item==null) {
                break;}
            
            deste[sayac]=item;
            sayac++;
        }
        //[KesBitis]
        
        //Dağıtma ve açma aşamaları.
        
        desteIlkDagit(deste, uDeste, cDeste, yerDeste);
        
        
        
    }
    public static void desteSonYaz(String[] deste)
    {// destede en altta açık olun kartları açamaya yarar son kart Joker normal kart gelesiye kadar açar.
        System.out.println("----------------------");
        System.out.println("Taban Kağıdı :");
        for (int i = 0; i < 5; i++) {//destenin el altındaki kagıdı açar ve ekrana basar.
            if (deste[51-i].substring(deste[51-i].length()-5, deste[51-i].length()).equals("Joker")) {
                System.out.println(deste[51-i]);
            }
            else{
                 System.out.println(deste[51-i]);
                 break;
            }
        }
        System.out.println("----------------------");
    }
    public static void nullAtlatici(String[] deste)
    {
        for (int i = 0; i < deste.length-1; i++) {
            if (deste[i]==null) {
                deste[i]=deste[i+1];
                deste[i+1]=null;
            }
        }
    }
    public static void kartAt(String[][]yerDeste,String[] uDeste,int indis)
    {   int sonElemanIndis=0;
        if (yerDeste[0][0]!=null) {
        for (int i = 0; i < yerDeste.length; i++) {//yerdeki boş alanın indisini buluyoruz.
            if(yerDeste[i][0]==null)
            {
                sonElemanIndis=i;
                break;
            }
        }}
        yerDeste[sonElemanIndis][0]=uDeste[indis];
        yerDeste[sonElemanIndis][1]="Açık";
        uDeste[indis]=null;
        nullAtlatici(uDeste);
        
    }
    public static void cKartAt(String[][]yerDeste,String[] cDeste,String[] cYigin,int[] cPisti)
    {
        int random=0;
        Random rnd = new Random();
        
        do {            
            random = rnd.nextInt(4);
            if (cDeste[0]==null&&cDeste[1]==null&&cDeste[2]==null&&cDeste[3]==null) {
                break;
            }
        } while (cDeste[random]==null);
        kartAt(yerDeste, cDeste, random);
       konrol(yerDeste, cYigin, cPisti);
    }
    public static void uKartAt(String[][]yerDeste,String[] uDeste,int indis,String[] uYigin,int[] uPisti)
    {
        kartAt(yerDeste, uDeste, indis);
        konrol(yerDeste, uYigin, uPisti);
       
    }
    public static void yiginAktar(String[][] yerDeste,String[] yigin)
    {
         int yiginIndex =0;
                    for (int i = 0; i < yigin.length; i++) {
                        if (yigin[i]!=null) {
                            yiginIndex++;
                        }
                        else break;
                    }
                    for (int i = 0; i < yerDeste.length; i++) {
                        if (yerDeste[i][0]!=null) {
                             yigin[yiginIndex+i]=yerDeste[i][0];
                        }
                       
                    }
                    for (int i = 0; i < yerDeste.length; i++) {
                    yerDeste[i][0]=null;
                    yerDeste[i][1]="Açık";
                    
                    }
    }
     public static void konrol(String[][]yerDeste,String[] yigin,int[] pisti)
     {
        int index=51;
        
        for (int i = 51; i >= 0; i--) {
            if (yerDeste[i][0]==null) {
                index =i;
            }
            else break;
        } //yerdeki elemanların sonunu aldık
        index--;
        if(yerDeste[index][0]!=null)
        {
         if (index==0) {
             //yer boş
         }
         else{
                    if (yerDeste[index][0].substring(yerDeste[index][0].length()-5,yerDeste[index][0].length()).equals("Joker"))
                    {
                    yiginAktar(yerDeste, yigin);// joker
                    
                    
                    }
                    else if (index==1&&yerDeste[index][0].substring(yerDeste[index][0].length()-2,yerDeste[index][0].length()).equals(yerDeste[index-1][0].substring(yerDeste[index-1][0].length()-2,yerDeste[index-1][0].length()))) {
                        //pişti
                        pisti[0]++;
                        yiginAktar(yerDeste, yigin);
                        
                   }
                    else if (yerDeste[index][0].substring(yerDeste[index][0].length()-2,yerDeste[index][0].length()).equals(yerDeste[index-1][0].substring(yerDeste[index-1][0].length()-2,yerDeste[index-1][0].length()))) {
                        yiginAktar(yerDeste, yigin);
                   }

         }
  
     }}
    public static void kartDagit(String[] deste,String[] cDeste,String[] uDeste)
    {int index =0;
        while(deste[index].equals(""))
            index++;
        
         //kullanıcı destesi ilk dagıtım.
        uDeste[0]=deste[index];
        uDeste[1]=deste[index+1];
        uDeste[2]=deste[index+2];
        uDeste[3]=deste[index+3];
        
        //bilgisayar destesi ilk dağıtım
        cDeste[0]=deste[index+4];
        cDeste[1]=deste[index+5];
        cDeste[2]=deste[index+6];
        cDeste[3]=deste[index+7];
        
        for (int i = 0; i < 8; i++) {
            deste[index+i]="";
        }
    }
    public static void oyun(String[] deste,String[][] yerDeste,String[] uDeste,String[] cDeste,boolean son,String[] uYigin,int[] uPisti,String[] cYigin,int[] cPisti)
    {
        Scanner scn=new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            if(!son)  
                desteSonYaz(deste);//taban kağıdı
            
            desteYazdir(yerDeste);//yerdeki desteleri yazıyor
            elYazdir(uDeste);
            System.out.print("Atmak istediğiniz kart :");
            uKartAt(yerDeste, uDeste, scn.nextInt(),uYigin,uPisti);
            cKartAt(yerDeste, cDeste,cYigin,cPisti);
            }
            if(!son)  
              kartDagit(deste, cDeste, uDeste);
            
    }
    public static void puanHesapla(String[] uYigin,int[] uPisti,String[] cYigin,int[] cPisti)
    {
        int cPuan=0;
       
        int uPuan=0;
                    int cYiginIndex =0;
                    for (int i = 0; i < cYigin.length; i++) {
                        if (cYigin[i]!=null) {
                            if (cYigin[i].substring(cYigin[i].length()-2,cYigin[i].length()).equals("er")) {
                                cPuan++;//jokerleri sayar puan ekler
                            }
                            if (cYigin[i].substring(cYigin[i].length()-2,cYigin[i].length()).equals("As")) {
                                cPuan++;//as ları sayar puan ekler.
                            }
                            if (cYigin[i].equals("[♣]Sinek 2")) {
                                cPuan=cPuan+2;
                            }
                            if (cYigin[i].equals("[♢]Karo 10")) {
                                cPuan=cPuan+3;
                            }
                            cYiginIndex++;
                        }
                        else break;
                    }
                    int uYiginIndex =0;
                    for (int i = 0; i < uYigin.length; i++) {
                        if (uYigin[i]!=null) {
                            if (uYigin[i].substring(uYigin[i].length()-2,uYigin[i].length()).equals("er")) {
                                cPuan++;//jokerleri sayar puan ekler
                            }
                            if (uYigin[i].substring(uYigin[i].length()-2,uYigin[i].length()).equals("As")) {
                                uPuan++;//as ları sayar puan ekler.
                            }
                            if (uYigin[i].equals("[♣]Sinek 2")) {
                                uPuan=cPuan+2;
                            }
                            if (uYigin[i].equals("[♢]Karo 10")) {
                                uPuan=cPuan+3;
                            }
                            uYiginIndex++;
                        }
                        else break;
                    }
                    if (uYiginIndex>cYiginIndex) {
                        uPuan=uPuan+3;
                    }
                    if (uYiginIndex<cYiginIndex) {//kağıç çoğunluğuna göre +3 puannı verdik.
                        cPuan=cPuan+3;
                    }
                    cPuan=cPuan+cPisti[0]*10;
                    uPuan=uPuan+uPisti[0]*10;
                   System.out.println("Bilgisayar Puanı :"+cPuan);
                   System.out.println("Kullanıcı Puanı :"+uPuan);
        
        
    }
    public static void main(String[] args) {
       
       String[] deste=new String[52];//destemiz
       String[] uDeste=new String[4];//kullanıcının elindeki deste
       String[] uYigin=new String[52];//kullanıcının aldıkları
       int[] uPisti=new int[1];//kullanıcının pişti sayılarını tutar.
       String[] cDeste=new String[4];//bilgisayarın elindeki deste
       String[] cYigin=new String[52];//bilgisayarın aldıkları
       int[] cPisti=new int[1];//bilgisayarın pişti sayılarını tutar.
       String[][] yerDeste=new String[52][2];//yerdeki destemiz
       
       desteKesDagit(deste,uDeste,cDeste,yerDeste);
      
       
        while (!deste[51].equals("")){            
            oyun(deste, yerDeste, uDeste, cDeste,false,uYigin,uPisti,cYigin,cPisti);
            
        }
        oyun(deste, yerDeste, uDeste, cDeste,true,uYigin,uPisti,cYigin,cPisti);
        
        desteYazdir(yerDeste);
        System.out.println("cPisti"+cPisti[0]+"  uPisti :"+uPisti[0]);
        puanHesapla(uYigin, uPisti, cYigin, cPisti);
        
    }
    
}
