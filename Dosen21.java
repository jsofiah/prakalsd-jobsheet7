public class Dosen21 {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    public Dosen21(String kd, String name, boolean jk, int age) {
        kode = kd;
        nama = name;
        jenisKelamin = jk;
        usia = age;
    }

    void tampilInformasi(){
        System.out.println("Nama\t\t : " + nama);
        System.out.println("Kode\t\t : " + kode);
        if(jenisKelamin == true){
            System.out.println("Jenis Kelamin\t : Pria" );
        } else{
            System.out.println("Jenis Kelamin\t : Wanita" );
        }
        System.out.println("Usia\t\t : " + usia);
    }
}
