public class DataDosen21 {
    Dosen21[] dataDosen;
    int idx;

    public DataDosen21(int kapasitas) {
        dataDosen = new Dosen21[kapasitas];
        idx = 0;
    }

    void tambah (Dosen21 d){
        if(idx < dataDosen.length){
            dataDosen[idx] = d;
            idx++;
        } else{
            System.out.println("Data sudah penuh");
        }
    }

    void tampil(){
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampilInformasi();
            System.out.println("=======================================");
        }
    }

    int sequentialSearching(String cari){
        int posisi = -1;
        for (int j = 0; j < dataDosen.length; j++) {
            if(dataDosen[j].nama.equalsIgnoreCase(cari)){
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    void tampilPosisi(String x, int pos){
        if(pos != -1){
            System.out.println("Data dosen dengan nama " + x + " ditemukan pada indeks " + pos);
        } else{
            System.out.println("Data dosen dengan nama " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch(String x, int pos){
        if(pos != -1){
            dataDosen[pos].tampilInformasi();
        } else{
            System.out.println("Data dosen dengan nama " + x + " tidak ditemukan");
        }
    }

    int findBinarySearch(int cari, int left, int right){
        int mid;
        if (right >= left){
            mid = (left + right) / 2;
            if( cari == dataDosen[mid].usia){
                return mid;
            }
            else if( dataDosen[mid].usia > cari){
                return findBinarySearch(cari, left, mid-1);
            }
            else{
                return findBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }

    void tampilPosisi2(int x, int pos){
        if(pos != -1){
            System.out.println("Data dosen dengan usia " + x + " ditemukan pada indeks " + pos);
        } else{
            System.out.println("Data dosen dengan usia " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch2(int x, int pos){
        if(pos != -1){
            dataDosen[pos].tampilInformasi();
        } else{
            System.out.println("Data dosen dengan usia " + x + " tidak ditemukan");
        }
    }
}