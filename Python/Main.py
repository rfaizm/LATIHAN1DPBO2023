from Mahasiswa import Mahasiswa

nim = ""
nama = ""
prodi = ""
fakultas = ""
mhs = []

# Data Dummy #
orang = Mahasiswa("2106791", "Rachman_Faiz_Maulana", "IK", "FPMIPA")
orang1 = Mahasiswa("2112345", "Aku_Sayang_Dia", "IK", "FPMIPA")
mhs.append((orang))
mhs.append((orang1))

print("Daftar menu :")
print("1 : Tambah Mahasiswa")
print("2 : Hapus Mahasiswa")
print("3 : Mengubah Mahasiswa")
# Input the menu #
menu = int(input("Masukkan menu : "))
# Procces the menu #
if menu == 1:
    # Case 1 #
    # Input how much we want the student
    n = int(input("Berapa Jumlah Mahasiswa : "))
    print("Masukkan Profile :")

    # Procces input and add the data
    for i in range(n):
        nim = str(input())
        nama = str(input())
        prodi = str(input())
        fakultas = str(input())
        # Put in the array
        mhs.append(Mahasiswa(nim, nama, prodi, fakultas))
     
    # Output #
    count = 0
    for human in mhs:
        print(str(count + 1) + "." , human.getNim(), "|", human.getNama(), "|", human.getProdi(), "|", human.getFakultas())
        count += 1
elif menu == 2:
    # Case 2 #
    # How much data in array
    sum = 0
    for human in mhs:
        sum += 1

    print("Banyak daftar mahasiswa ", sum)
    # Input unique number #
    nim = str(input("Masukkan NIM: "))

    coba = 0
    # Procces to remove #
    for human in mhs:
        cek = human.carNim(nim)
        if cek == 1:
            # Pop the student we want
            mhs.pop(coba)
            no = 1
        coba += 1
    
    if no != 1:
        print("NIM tidak ada")
    
    # Output #
    count = 0
    for human in mhs:
        print(str(count + 1) + "." , human.getNim(), "|", human.getNama(), "|", human.getProdi(), "|", human.getFakultas())
        count += 1

elif menu == 3:
    # Case 3 #
    # Input unique data #
    nim = str(input("Masukkan NIM: "))

    # Procces edit
    for human in mhs:
        cek = human.carNim(nim)
        if cek == 1:
            nama = str(input())
            prodi = str(input())
            fakultas = str(input())
            
            # Set into data we want
            human.setAll(nama, prodi, fakultas)
            no = 1
    
    if no != 1:
        print("NIM tidak ada!")
    # Output #
    count = 0
    for human in mhs:
        print(str(count + 1) + "." , human.getNim(), "|", human.getNama(), "|", human.getProdi(), "|", human.getFakultas())
        count += 1
        


