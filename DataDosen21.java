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
        int hitung = 0;
        int posisi = -1;
        for (int j = 0; j < dataDosen.length; j++) {
            if(dataDosen[j].nama.equalsIgnoreCase(cari)){
                posisi = j;
                hitung++;
            }
        }
        if (hitung == 0){
            System.out.println("Data dosen dengan nama " + cari + " tidak ditemukan.");
        } else if (hitung > 1) {
            System.out.println("Peringatan: Ada " + hitung + " dosen dengan nama yang sama.");
        }
        return posisi;
    }

    void tampilDataSearch(String x){
        boolean ditemukan = false;
        for (int j = 0; j < dataDosen.length; j++) {
            if (dataDosen[j].nama.equalsIgnoreCase(x)) {
                dataDosen[j].tampilInformasi();
                System.out.println("===========================================");
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Data dosen dengan nama " + x + " tidak ditemukan.");
        }
    }

    int findBinarySearch(int cari, int left, int right){
        int mid, firstPos = -1, hitung = 0;
        while (left <= right){
            mid = (left + right) / 2;
            if( cari == dataDosen[mid].usia){
                firstPos = mid;
                for (int i = mid; i >= 0 && cari == dataDosen[i].usia; i--) {
                    hitung++;
                }
                for (int i = mid + 1; i < idx && cari == dataDosen[i].usia; i++) {
                    hitung++;
                }
                break;
            }
            else if( dataDosen[mid].usia > cari){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        if(firstPos == -1){
            return -1;
        }
        return firstPos;
    }


    void tampilDataSearch2(int x, int pos){
        if(pos == -1){
            System.out.println("Data dosen dengan usia " + x + " tidak ditemukan");
            return;
        }

        int hitung = 0;
        for (int i = pos; i >= 0 && dataDosen[i].usia == x; i--) {
            dataDosen[i].tampilInformasi();
            System.out.println("===========================================");
            hitung++;
        }
        for (int i = pos + 1; i < idx && dataDosen[i].usia == x; i++) {
            dataDosen[i].tampilInformasi();
            System.out.println("===========================================");
            hitung++;
        }

        if(hitung > 1){
            System.out.println("Peringatan: Ada " + hitung + " dosen dengan usia yang sama.");
        }
    }
}