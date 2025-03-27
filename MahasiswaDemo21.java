import java.util.Scanner;
public class MahasiswaDemo21 {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        MahasiswaBerprestasi21 list = new MahasiswaBerprestasi21();
        int jumMhs = 5;

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke " + (i+1) + ": ");
            System.out.print("NIM\t : ");
            String nim = input21.nextLine();
            System.out.print("Nama\t : ");
            String nama = input21.nextLine();
            System.out.print("Kelas\t : ");
            String kelas = input21.nextLine();
            System.out.print("IPK\t : ");
            double ipk = input21.nextDouble();
            input21.nextLine();
            System.out.println("===========================================");
            Mahasiswa21 m = new Mahasiswa21(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        System.out.println("===========================================");
        System.out.println("\t\t Tampil Data");
        System.out.println("===========================================");
        list.tampil();

        //Melakukan pencarian data sequential
        // System.out.println("===========================================");
        // System.out.println("\t\t Pencarian Data");
        // System.out.println("===========================================");
        // System.out.println("Masukkan ipk mahasiswa yang dicari");
        // System.out.print("IPK: ");
        // double cari = input21.nextDouble();

        // System.out.println("===========================================");
        // System.out.println("\t\t Sequential Searching");
        // System.out.println("===========================================");
        // double posisi = list.sequentialSearching(cari);
        // int pss = (int) posisi;
        // list.tampilPosisi(cari, pss);
        // list.tampilDataSearch(cari, pss);

        //Melakukan pencarian data Binary
        System.out.println("===========================================");
        System.out.println("\t\t Pencarian Data");
        System.out.println("===========================================");
        System.out.println("Masukkan ipk mahasiswa yang dicari");
        System.out.print("IPK: ");
        double cari = input21.nextDouble();

        System.out.println("===========================================");
        System.out.println("\t\t Binary Search");
        System.out.println("===========================================");
        double posisi2 = list.findBinarySearch(cari, 0, jumMhs-1);
        int pss2 = (int) posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
}
