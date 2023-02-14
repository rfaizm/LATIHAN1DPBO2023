import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Setting Properti
        int i, n = 0;
        int cek = 0;
        int menu = 0;
        int no = 0;
        String nim;
        String nama;
        String prodi;
        String fakultas;

        ArrayList<Mahasiswa> list = new ArrayList<>();
        
        //Masukkan daftar mahasiswa ke list dengan hard code
        //Data dummy
        Mahasiswa orang = new Mahasiswa("2106791", "Rachman_Faiz_Maulana", "IK", "FPMIPA");
        Mahasiswa orang1 = new Mahasiswa("2112345", "Aku_Sayang_Kamu", "IK", "FPMIPA");
        list.add(orang);
        list.add(orang1);

        //Pilihan Menu
        System.out.println("Pilihan menu : ");
        System.out.println("1 : Tambah Mahasiswa");
        System.out.println("2 : Hapus Mahasiswa");
        System.out.println("3 : Mengubah Mahasiswa");

        //Input Menu
        System.out.print("Masukkan menu : ");
        try{
            menu = sc.nextInt();
        }catch(Exception e){
            System.out.println("The input is not an integer!");
        }

        //Proses Menu
        switch(menu){
            case 1 : 
                //Masuk menu 1
                System.out.print("Berapa Jumlah Mahasiswa : ");
                //Input jumlah mahasiswa yang di masukkan
                try{
                    n = sc.nextInt();
                }catch(Exception e){
                    System.out.println("The input is not an integer!");
                }

                System.out.println("Masukkan Profile :");
                //Input atribut mahasiswa
                for(i=0; i<n; i++){
                    //Input atribut
                    nim = sc.next();
                    nama = sc.next();
                    prodi = sc.next();
                    fakultas = sc.next();

                    //its just a temp
                    Mahasiswa temp = new Mahasiswa();
                    temp.setNIM(nim);
                    temp.setNama(nama);
                    temp.setProdi(prodi);
                    temp.setFakultas(fakultas);
                    list.add(temp);
                }

                //output daftar mahasiswa
                for(i=0; i<list.size(); i++){
                    System.out.println(Integer.toString(i+1) + ". " + list.get(i).getNIM() + " | " + list.get(i).getNama() + " | " + list.get(i).getProdi() + " | " + list.get(i).getFakultas());
                }

            break;

            case 2:
                //Masuk menu 2
                int sum = 0;
                //Cek banyak daftar mahasiswa
                for(i=0; i<list.size(); i++){
                    sum++;
                }
                System.out.println("Banyak daftar mahasiswa " + sum);
                System.out.print("Masukkan NIM: ");
                //Input NIM
                nim = sc.next();
                //Proses hapus
                for(i=0; i<list.size(); i++){
                    cek = list.get(i).cariNim(nim);
                    if(cek != 0){
                        list.remove(i);
                        no = 1;
                    }
                }
                if(no != 1){
                    System.out.println("NIM tidak ada \n");
                }

                for(i=0; i<list.size(); i++){
                    System.out.println(Integer.toString(i+1) + ". " + list.get(i).getNIM() + " | " + list.get(i).getNama() + " | " + list.get(i).getProdi() + " | " + list.get(i).getFakultas());
                }

            break;

            case 3:
                System.out.print("Masukkan NIM: ");
                //Input NIM
                nim = sc.next();
                //Proses ubah
                for(i=0; i<list.size(); i++){
                    cek = list.get(i).cariNim(nim);
                    if(cek != 0){
                        //Input atribut yang ingin diubah
                        nama = sc.next();
                        prodi = sc.next();
                        fakultas = sc.next();
                        //Ubah di dalam list
                        list.get(i).setAll(nama, prodi, fakultas);
                        no = 1;
                    }
                }

                if(no != 1){
                    System.out.println("NIM tidak ada \n");
                }

                for(i=0; i<list.size(); i++){
                    System.out.println(Integer.toString(i+1) + ". " + list.get(i).getNIM() + " | " + list.get(i).getNama() + " | " + list.get(i).getProdi() + " | " + list.get(i).getFakultas());
                }
            break;
        }

    }
}