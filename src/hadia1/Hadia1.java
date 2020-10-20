
package hadia1;

import java.util.Scanner;
public class Hadia1 {

    
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        
        
        String NIK,nama,tempat,alamat,kelurahan,kecamatan,agama,statusPerkawinan,pekerjaan,kewarganegaraan;
        int rt,rw,umur,berlaku;
        char golDarah;
        
        System.out.print("Umur: ");
        umur = input.nextInt();
        
        if (umur >= 17){
            System.out.println(" Silahkan Lengkapi Data Berikut ");
            System.out.print("NIK : ");
            NIK = input.next();
            System.out.print("Nama : ");
            nama = input.next();
            System.out.print("Tempat/Tgl Lahir: ");
            tempat = input.next();
            System.out.print("Gol. Darah: ");
            golDarah = input.next();
            System.out.print("Alamat: ");
            alamat = input.next();
            System.out.print("Desa/Kelurahan: ");
            kelurahan = input.next();
            System.out.print("Kecamatan: ");
            kecamatan = input.next();
            System.out.print("Agama: ");
            agama = input.next();
            System.out.print("Status Perkawinan: ");
            statusPerkawinan = input.next();
            System.out.print("Pekerjaan: ");
            pekerjaan = input.next();
            System.out.print("Kewarganegaraan: ");
            kewarganegaraan = input.next();
            System.out.print("Berlaku Hingga: ");
            berlaku = input.nextInt();
            System.out.print("RT: ");
            rt = input.nextInt();
            System.out.print("RW: ");
            rw= input.nextInt();
            System.out.println("<=================================>");
            System.out.println("NIK              : "+NIK);
            System.out.println("Nama             : "+nama);
            System.out.println("Tempat/Tgl Lahir : "+tempat);
            System.out.println("Gol.Darah        : "+golDarah);
            System.out.println("Alamat           : "+alamat);
            System.out.println("    RT/RW        : "+rt+"/"+ rw);
            System.out.println("    Kelurahan    : "+kelurahan);
            System.out.println("    Kecamatan    : "+kecamatan);
            System.out.println("Agama            : "+agama);
            System.out.println("Status Perkawinan: "+statusPerkawinan);
            System.out.println("Pekerjaan        : "+pekerjaan);
            System.out.println("Kewarganegaran   : "+kewarganegaraan);
            System.out.println("Berlaku Hingga   : "+berlaku);
            
            
        }else{
            System.out.println(" Anda tidak dapat membuat KTP karena Umur anda belum cukup ");
    }
        
        
    }
    
}
