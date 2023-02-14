class Mahasiswa:
    __nim = ""
    __nama = ""
    __prodi = ""
    __fakultas = ""

    def __init__(self, nim = "", nama = "", prodi = "", fakultas = ""):
        self.__nim = nim
        self.__nama = nama
        self.__prodi = prodi
        self.__fakultas = fakultas

    # Getter #
    #NIM
    def getNim(self):
        return self.__nim
    #Nama
    def getNama(self):
        return self.__nama
    #Prodi
    def getProdi(self):
        return self.__prodi
    #Fakultas
    def getFakultas(self):
        return self.__fakultas
    
    # Setter #
    #NIM
    def setNim(self, nim):
        self.__nim = nim
    #Nama
    def setNama(self, nama):
        self.__nama = nama
    #Prodi
    def setProdi(self, prodi):
        self.__prodi = prodi
    #Fakultas
    def setFakultas(self, fakultas):
        self.__fakultas = fakultas
    #SetAll use for Edits
    def setAll(self, nama, prodi, fakultas):
        self.__nama = nama
        self.__prodi = prodi
        self.__fakultas = fakultas

    # Method #
    def carNim(self, nim):
        if self.__nim == nim:
            return 1
        else:
            return 0

