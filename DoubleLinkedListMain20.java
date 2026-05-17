import java.util.Scanner;
public class DoubleLinkedListMain20 {
    static Mahasiswa20 inputMahasiswa20(Scanner scan) {
    System.out.print("Masukkan NIM   : ");
    String nim = scan.nextLine();
    System.out.print("Masukkan Nama  : ");
    String nama = scan.nextLine();
    System.out.print("Masukkan Kelas : ");
    String kelas = scan.nextLine();
    System.out.print("Masukkan IPK   : ");
    double ipk = scan.nextDouble();
    scan.nextLine();
    return new Mahasiswa20(nim, nama, kelas, ipk);
}
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    DoubleLinkedList20 list20 = new DoubleLinkedList20();
    int pilihan;

     do {
            System.out.println("\n===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = scan.nextInt();
            scan.nextLine();
          switch (pilihan) {
                case 1:
                    Mahasiswa20 mhsAwal = inputMahasiswa20(scan);
                    list20.addFirst(mhsAwal);
                    break;
                case 2:
                    Mahasiswa20 mhsAkhir = inputMahasiswa20(scan);
                    list20.addLast(mhsAkhir);
                    break;
                case 3:
                    System.out.print("Masukkan NIM yang dicari : ");
                    String keyNIM = scan.nextLine();
                    System.out.println("Masukkan data baru: ");
                    Mahasiswa20 dataBaru = inputMahasiswa20(scan);
                    list20.insertAfter(keyNIM, dataBaru);
                    break;
                case 4:
                    list20.removeFirst();
                    break;
                case 5:
                    list20.removeLast();
                    break;
                case 6:
                    list20.print();
                    break;
                case 0:
                    System.out.println("Program selesai");
                    break;
                default:
                    System.out.println("Menu tidak tersedia");
            }
        } while (pilihan != 0);
        scan.close();
    }
}