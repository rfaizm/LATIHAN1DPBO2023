public class Mahasiswa{
    private String nim;
    private String nama;
    private String prodi;
    private String fakultas;

    //Constructors
    public Mahasiswa(){
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.fakultas = "";
    }

    public Mahasiswa(String nim, String nama, String prodi, String fakultas){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.fakultas = fakultas;
    }

    //Getter NIM
    public String getNIM(){
        return this.nim;
    }
    //Setter NIM
    public void setNIM(String nim){
        this.nim = nim;
    }

    //Getter Nama
    public String getNama(){
        return this.nama;
    }
    //Setter Nama
    public void setNama(String nama){
        this.nama = nama;
    }

    //Getter Prodi
    public String getProdi(){
        return this.prodi;
    }
    //Setter Prodi
    public void setProdi(String prodi){
        this.prodi = prodi;
    }

    //Getter Fakultas
    public String getFakultas(){
        return this.fakultas;
    }
    //Setter Fakultas
    public void setFakultas(String fakultas){
        this.fakultas = fakultas;
    }

    public void setAll(String nama, String prodi, String fakultas){
        this.nama = nama;
        this.prodi = prodi;
        this.fakultas = fakultas;
    }
    //Method cari NIM
    public int cariNim(String nim){
        
        if(this.nim.equals(nim)){
            return 1;
        }else{
            return 0;
        }
    }

}