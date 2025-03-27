import java.util.Scanner;
public class DosenDemo {
    public static void main(String[] args) {
        Scanner input21 = new Scanner(System.in);
        DataDosen21 list = new DataDosen21(10);
        Dosen21 d1 = new Dosen21("001", "Silby", false, 27);
        Dosen21 d2 = new Dosen21("002", "Devin", true, 30);
        Dosen21 d3 = new Dosen21("003", "Jeri", true, 44);
        Dosen21 d4 = new Dosen21("004", "Nici", false, 40);
        Dosen21 d5 = new Dosen21("005", "Kenan", true, 45);
        Dosen21 d6 = new Dosen21("006", "Betty", false, 50);
        Dosen21 d7 = new Dosen21("007", "Clara", false, 56);
        Dosen21 d8 = new Dosen21("008", "Jono", true, 59);
        Dosen21 d9 = new Dosen21("009", "Dono", true, 60);
        Dosen21 d10 = new Dosen21("010", "Alza", false, 70);

        list.tambah(d1);
        list.tambah(d2);
        list.tambah(d3);
        list.tambah(d4);
        list.tambah(d5);
        list.tambah(d6);
        list.tambah(d7);
        list.tambah(d8);
        list.tambah(d9);
        list.tambah(d10);

        System.out.println("===========================================");
        System.out.println("\t\t Tampil Data");
        System.out.println("===========================================");
        list.tampil();

        //Melakukan pencarian data sequential
        System.out.println("===========================================");
        System.out.println("\t\t Pencarian Data");
        System.out.println("===========================================");
        System.out.println("Masukkan nama dosen yang dicari");
        System.out.print("Nama: ");
        String cari = input21.nextLine();

        System.out.println("===========================================");
        System.out.println("\t\t Sequential Searching");
        System.out.println("===========================================");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);

        System.out.println("===========================================");
        System.out.println("\t\t Pencarian Data");
        System.out.println("===========================================");
        System.out.println("Masukkan usia dosen yang dicari");
        System.out.print("Usia: ");
        int cari2 = input21.nextInt();

        System.out.println("===========================================");
        System.out.println("\t\t Binary Search");
        System.out.println("===========================================");
        double posisi2 = list.findBinarySearch(cari2, 0, list.idx-1);
        int pss2 = (int) posisi2;
        list.tampilPosisi2(cari2, pss2);
        list.tampilDataSearch2(cari2, pss2);
    }
}