PERTANYAAN PRAKTIKUM 
1. Jelaskan fungsi kode program berikut
if (data[j-1]>data[j]){
                temp=data[j];
                data[j]=data[j-1];
                data[j-1]=temp;
            }
jawaban : Kode tersebut berfungsi untuk menukar (swap) posisi dua data yang bersebelahan jika urutannya salah.
Jika elemen di kiri (data[j-1]) lebih besar dari elemen di kanan (data[j]), maka keduanya ditukar agar urutan menjadi menaik (ascending).

2. Tunjukkan kode program yang merupakan algoritma pencarian nilai minimum pada
selection sort!
jawaban : if (listMhs[j].ipk < listMhs[idxMin].ipk){
    idxMin = j;
}

3. Pada Insertion sort , jelaskan maksud dari kondisi pada perulangan
while (j>=0 && data[j]>temp)
jawaban : 
j >= 0 → memastikan indeks tidak keluar dari array
data[j] > temp → mengecek apakah data sebelumnya lebih besar dari nilai yang akan disisipkan.
Jika kedua kondisi terpenuhi, maka data akan digeser ke kanan agar posisi yang tepat untuk temp bisa ditemukan.

4. Pada Insertion sort, apakah tujuan dari perintah data[j+1]=data[j]
jawaban : Perintah ini bertujuan untuk menggeser elemen ke kanan sehingga memberi ruang bagi nilai temp untuk dimasukkan pada posisi yang sesuai.

PERTANYAAN PRAKTIKUM 2
1. Perhatikan perulangan di dalam bubbleSort() di bawah ini:
for (int i=0; i<listMhs.length-1; i++){
        for (int j=1; j<listMhs.length-i; j++){
a. Mengapa syarat dari perulangan i adalah i<listMhs.length-1 ?
jawaban : Karena proses bubble sort cuma butuh n-1 tahap buat mengurutkan seluruh data. Kalo udah mencapai tahap terakhir, data pasti udah terurut sehingga nggak perlu dilakukan perulangan lagi.

b. Mengapa syarat dari perulangan j adalah j<listMhs.length-i ?
jawaban : Karena setiap tahap, elemen terbesar sudah berada di posisi akhir. Sehingga bagian belakang tidak perlu dicek lagi, dan batas perulangan akan semakin berkurang seiring bertambahnya i

c. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan
berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?
jawaban : Perulangan i = 49 kali (karena 50 - 1)
Tahap bubble sort = 49 tahap

2. Modifikasi program diatas dimana data mahasiswa bersifat dinamis (input dari keyborad)
yang terdiri dari nim, nama, kelas, dan ipk
jawaban : sudahh di commit

PERTANYAAN PRAKTIKUM 2 (SELECTION SORT)
1. Di dalam method selection sort, terdapat baris program seperti di bawah ini:
int idxMin = i;
        for (int j = i + 1; j < listMhs.length; j++){
            if (listMhs[j].ipk < listMhs[idxMin].ipk){
                idxMin = j;
untuk apakah proses tersebut, jelaskan!
jawaban : berfungsi untuk mencari indeks dari nilai IPK terkecil (minimum) pada bagian array yang belum terurut.

PERTANYAAN PRAKTIKUM 2 (INSERTION SORT)
1. Ubahlah fungsi pada InsertionSort sehingga fungsi ini dapat melaksanakan proses sorting dengan cara descending.   
jawaban : sudah saya modif       