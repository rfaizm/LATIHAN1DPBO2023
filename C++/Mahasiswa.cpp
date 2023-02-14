#include <iostream>
#include <string>

using namespace std;

class Mahasiswa{
    private:
        string nim;
        string nama;
        string prodi;
        string fakultas;

    public:
        /*Constructors*/
        Mahasiswa(){
            this->nim = "";
            this->nama = "";
            this->prodi = "";
            this->fakultas = "";
        }
        /*Constructors*/
        Mahasiswa(string nim, string nama, string prodi, string fakultas){
            this->nim = nim;
            this->nama = nama;
            this->prodi = prodi;
            this->fakultas = fakultas;
        }

        /*Setter*/
        //NIM
        void setNim(string nim){
            this->nim = nim;
        }
        //Nama
        void setNama(string nama){
            this->nama = nama;
        }
        //Prodi
        void setProdi(string prodi){
            this->prodi = prodi;
        }
        //Fakultas
        void setFakultas(string fakultas){
            this->fakultas = fakultas;
        }

        /*Getter*/
        //NIM
        string getNim(){
            return this->nim;
        }
        //Nama
        string getNama(){
            return this->nama;
        }
        //Prodi
        string getProdi(){
            return this->prodi;
        }
        //Fakultas
        string getFakultas(){
            return this->fakultas;
        }

        /*Method*/
        void setAll(string nama, string prodi, string fakultas){
            this->nama = nama;
            this->prodi = prodi;
            this->fakultas = fakultas;
        }

        int carNim(string nim){
            if(this->nim.compare(nim) == 0){
                return 1;
            }else{
                return 0;
            }
        }

};