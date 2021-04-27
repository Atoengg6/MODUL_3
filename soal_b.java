package modul3;

import java.util.*;


//superclass
class dtmhs{
    String nama;
    String NIM;
    String alamat;

    dtmhs(String nama, String NIM, String alamat){
        this.nama = nama;
        this.NIM = NIM;
        this.alamat = alamat;
    }

    dtmhs(){

    }
}


//subclass
class prodi extends dtmhs{
    String jurusan;
    
    prodi(String jurusan, String nama, String NIM, String alamat ){
        super(nama, NIM, alamat);
        this.jurusan = jurusan;
    }
    
    prodi(){
        
    }
}

public class soal_b {
    public static void main(String[] args) {
        String ulang;
        int pil;
        
        do{
            prodi mahasiswa = new prodi();
            
            Scanner input = new Scanner(System.in);
            System.out.println("======================");
            System.out.println("MASUKAN DATA MAHASISWA");
            System.out.println("======================");
            
            System.out.print("Nama Mahasiswa : ");
            mahasiswa.nama = input.nextLine();
            System.out.print("NIM Mahasiswa : ");
            mahasiswa.NIM = input.nextLine();
            System.out.print("Alamat Mahasiswa : ");
            mahasiswa.alamat = input.nextLine();
            
            System.out.println("Daftar Jurusan");
            System.out.println("61: MATEMATIKA");
            System.out.println("62: BIOLOGI");
            System.out.println("63: KIMIA");
            System.out.println("64: FISIKA");
            System.out.println("65: TEKNIK INFORMATIKA");
            System.out.println("66: SISTEM INFORMASI");
            System.out.print("masukan pilihan jurusan di atas: ");
            
            pil = input.nextInt();
            switch(pil){
                case 61 :
                    mahasiswa.jurusan = "MATEMATIKA";
                    break;
                case 62 :
                    mahasiswa.jurusan = "BIOLOGI";
                    break;
                case 63 :
                    mahasiswa.jurusan = "KIMIA";
                    break;
                case 64 :
                    mahasiswa.jurusan = "FISIKA";
                    break;
                case 65 :
                    mahasiswa.jurusan = "TEKNIK INFORMATIKA";
                    break;
                case 66 :
                    mahasiswa.jurusan = "SISTEM INFORMASI";
                    break;
                default:
                    System.out.println("maaf jurusan tidak tersedia");
                    return;
            }
            
            System.out.println("=================================");
            System.out.println("========= DAFTAR MAHASISWA ======");
            System.out.println("=================================");
            System.out.println("Nama Mahasiswa          :"+ mahasiswa.nama);
            System.out.println("NIM Mahasiswa           :"+ mahasiswa.NIM);
            System.out.println("Alamat Mahasiswa        :"+ mahasiswa.alamat);
            System.out.println("jurusan Mahasiswa       :"+ mahasiswa.jurusan);
            
            Scanner inputuser = new Scanner(System.in);
            System.out.print("ingin ulang program? [Y]/[N]: ");
            ulang = inputuser.nextLine();
        }while(ulang.equals("Y"));
    }   
}
