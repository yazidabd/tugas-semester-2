import java.util.Scanner;
import tugaspl.NIM;

public class App {

    public static void main(String[] args) {
        String nimScan = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan NIM anda   : ");
        nimScan = scan.next();

        NIM nim = new NIM(nimScan);

        System.out.println("Jenjang Pendidikan  : " + nim.jenjangPendidikan());
        System.out.println("Angkatan            : " + nim.angkatan());
        System.out.println("Fakultas            : " + nim.fakultas());
        System.out.println("Prodi               : " + nim.prodi());
        System.out.println("Jenis Kelamin       : " + nim.jenisKelamin());
        System.out.println("No Urut mahasiswa   : " + nim.noMhs());
    }
}