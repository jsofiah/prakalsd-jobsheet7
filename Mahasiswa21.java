public class Mahasiswa21 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    Mahasiswa21(){
    }

    Mahasiswa21(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi(){
        System.out.println("NIM\t : " + nim);
        System.out.println("Nama\t : " + nama);
        System.out.println("Kelas\t : " + kelas);
        System.out.println("IPK\t : " + ipk);
    }
}