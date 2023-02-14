<?php

class Mahasiswa{
    private $nim = '';
    private $nama = '';
    private $prodi = '';
    private $fakultas = '';

    /* Constructors */
    public function __construct($nim = '', $nama = '', $prodi = '', $fakultas = '')
    {
        $this->nim = $nim;
        $this->nama = $nama;
        $this->prodi = $prodi;
        $this->fakultas = $fakultas;
    }

    /* Setter */
    // NIM
    public function setNim($nim){
        $this->nim = $nim;
    }
    // Nama 
    public function setNama($nama){
        $this->nama = $nama;
    }
    // Prodi
    public function setProdi($prodi){
        $this->prodi = $prodi;
    }
    // Fakultas
    public function setFakultas($fakultas){
        $this->fakultas = $fakultas;
    }

    /* Getter */
    // NIM
    public function getNim(){
        return $this->nim;
    }
    // Nama
    public function getNama(){
        return $this->nama;
    }
    // Prodi
    public function getProdi(){
        return $this->prodi;
    }
    // Fakultas
    public function getFakultas(){
        return $this->fakultas;
    }

    public function setAll($nama, $prodi, $fakultas){
        $this->nama = $nama;
        $this->prodi = $prodi;
        $this->fakultas = $fakultas;
    }

    /* Method */
    public function cariNim($nim){
        if(strcmp($this->nim, $nim) == 0){
            return 1;
        }else{
            return 0;
        }
    }

    public function display(){
        echo "Nim: " . $this->nim . "| Nama: " . $this->nama . "| Prodi: " . $this->prodi . "| Fakultas : " . $this->fakultas . "<br/>";
    }

    public function __destruct()
    {
        
    }
}

?>