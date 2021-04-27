package modul3;

class dftruniv{
    private String nama;
    
    void dftruniv(String nama){

    }
    
    void setnama(String nama){
        this.nama = nama;
    }
    
    public String getnama(){
        return this.nama;
    }
}

public class universitas {
    public static void main(String[] arg){
        System.out.println("======================");
        System.out.println("DAFTAR NAMA UNIVERSITAS NEGERI DI JAWA TIMUR");
        System.out.println("======================");
        
        System.out.println("");
        
        dftruniv utm = new dftruniv();
        utm.setnama("(UNIVERSITAS TRUNOJOYO MADURA)");
        System.out.println("1. UTM "+utm.getnama());
        
        dftruniv unair = new dftruniv();
        unair.setnama("(UNIVERSITAS AIRLANGGA)");
        System.out.println("2. UNAIR "+unair.getnama());
        
        dftruniv ub = new dftruniv();
        ub.setnama("(UNIVERSITAS BRAWIJAYA)");
        System.out.println("3. UB "+ub.getnama());
        
        dftruniv unesa = new dftruniv();
        unesa.setnama("(UNIVERSITAS SURABAYA)");
        System.out.println("4. UNESA "+unesa.getnama());
        
        dftruniv upn = new dftruniv();
        upn.setnama("(UNIVERSITAS VETERAN JATIM)");
        System.out.println("5. UPN "+upn.getnama());
        
        dftruniv um = new dftruniv();
        um.setnama("(UNIVERSITAS NEGERI MALANG)");
        System.out.println("6. UM "+um.getnama());
    }
}