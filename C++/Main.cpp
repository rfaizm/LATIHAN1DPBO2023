#include <bits/stdc++.h>
#include "Mahasiswa.cpp"

using namespace std;

int main(){
    int i, n = 0;
    int cek = 0;
    int menu = 0;
    int no = 0;
    int count = 0;
    string nim;
    string nama;
    string prodi;
    string fakultas;

    list<Mahasiswa> llist;

    //Data Dummy
    Mahasiswa orang("2106791", "Rachman_Faiz_Maulana", "IK", "FPMIPA");
    Mahasiswa orang1("2112345", "Aku_Sayang_Dia", "IK", "FPMIPA");
    llist.push_back(orang);
    llist.push_back(orang1);

    cout << "Daftar menu :" << endl;
    cout << "1 : Tambah Mahasiswa" << endl;
    cout << "2 : Hapus Mahasiswa" << endl;
    cout << "3 : Mengubah Mahasiswa" << endl;
    cout << "Masukkan menu : ";
    cin >> menu;

    switch (menu)
    {
    case 1:{
        //Masuk menu 1
        cout << "Berapa Jumlah Mahasiswa : ";
        cin >> n;
        cout << "Masukkan Profile :" << endl;

        for(i=0; i<n; i++){
            Mahasiswa temp;

            cin >> nim >> nama >> prodi >> fakultas;

            temp.setNim(nim);
            temp.setNama(nama);
            temp.setProdi(prodi);
            temp.setFakultas(fakultas);
            llist.push_back(temp);
        }

        i = 0;
        for(list<Mahasiswa>::iterator it = llist.begin(); it != llist.end(); it++){
            cout << (i + 1) << ". " << it->getNim() << " | " << it->getNama() << " | " << it->getProdi() << " | " << it->getFakultas() << endl;
            i++;
        }
    }break;
    
    case 2:{
        //Masuk menu 2
        int sum = 0;

        for(list<Mahasiswa>::iterator it = llist.begin(); it != llist.end(); it++){
            sum++;
        }
        cout << "Banyak daftar mahasiswa " << sum << endl;
        cout << "Masukkan NIM: ";
        cin >> nim;

        list<Mahasiswa>::iterator i = llist.begin();
        while(i != llist.end()){
            cek = i->carNim(nim);
            if(cek == 1){
                i = llist.erase(i);
                no = 1;
            }else{
                i++;
            }
        }
        if(no != 1){
            cout << "NIM tidak ada!" << endl;
        }
        count = 0;
        for(list<Mahasiswa>::iterator it = llist.begin(); it != llist.end(); it++){
            cout << (count + 1) << ". " << it->getNim() << " | " << it->getNama() << " | " << it->getProdi() << " | " << it->getFakultas() << endl;
            count++;
        }
    }break;

    case 3:{
        cout << "Masukkan NIM: ";
        //Input NIM
        cin >> nim;
        //Proses ubah
        for(list<Mahasiswa>::iterator it = llist.begin(); it != llist.end(); it++){
            cek = it->carNim(nim);
            if(cek != 0){
                //Input yang ingin diubah
                cin >> nama >> prodi >> fakultas;
                //Ubah di dalam list
                it->setAll(nama, prodi, fakultas);
                no = 1;
            }
        }
        if(no != 1){
            cout << "NIM tidak ada!" << endl;
        }

        count = 0;
        for(list<Mahasiswa>::iterator it = llist.begin(); it != llist.end(); it++){
            cout << (count + 1) << ". " << it->getNim() << " | " << it->getNama() << " | " << it->getProdi() << " | " << it->getFakultas() << endl;
            count++;
        }
    }break;
    }

    return 0;
}