package Praktikum5;
public class DataDosen {
    Dosen [] listDosen = new Dosen[10];
    int idx;

    void tambah (Dosen m){
        if (idx<listDosen.length){
            listDosen[idx] = m;
            idx++;
        }
    }
    void tampil (){
        for (int i = 0; i < idx; i++){
            listDosen[i].tampil();
            System.out.println("-----------------------------");
        }
    }
    void SortingASC (){
        for (int i = 0; i < idx -1; i++){
            for (int j = 1; j<idx-i; j++){
                if (listDosen[j].usia<listDosen[j-1].usia){
                    Dosen tmp = listDosen[j];
                    listDosen[j] = listDosen[j-1];
                    listDosen[j-1] = tmp;
                }
            }
        }
    }
    void SortingDSC (){
        for (int i = 0; i < idx - 1; i++){
        int idxMax = i;
        for (int j = i + 1; j < idx; j++){
            if (listDosen[j].usia > listDosen[idxMax].usia){
                idxMax = j;
            }
        }
        Dosen tmp = listDosen[idxMax];
        listDosen[idxMax]= listDosen[i];
        listDosen[i] = tmp;
        }
    }
}

