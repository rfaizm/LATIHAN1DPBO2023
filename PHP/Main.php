<?php

require ('Mahasiswa.php');

$orang1 = new Mahasiswa('2106791', 'Rachman_Faiz_Maulana', 'IK', 'FPMIPA');
$orang2 = new Mahasiswa('2112345', 'Aku_Sayang_Kamu', 'IK', 'FPMIPA');
 
$array = array($orang1, $orang2);

echo "Daftar Mahasiswa :" . "<br/>";
foreach ($array as $mahasiswa){
    $mahasiswa->display();
}

$orang3 = new Mahasiswa('2156789', 'Dia_Nggak_Sayang', 'IK', 'FPMIPA');

array_push($array, $orang3);

echo "Daftar Mahasiswa Baru :<br/>";
foreach($array as $mahasiswa){
    $mahasiswa->display();
}

$hps = '2106791';
$cek = 0;
$idx = 0;
foreach($array as $mahasiswa){
    $cek = $mahasiswa->cariNim($hps);
    if($cek != 0){
        unset($array[$idx]);
    }
    $idx++;
}

echo "Daftar Mahasiswa Baru :<br/>";
foreach($array as $mahasiswa){
    $mahasiswa->display();
}


?>