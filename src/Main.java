import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Playlist playlist = new Playlist();

        int pilihan;
        do {
            System.out.println("\n=== MENU PLAYLIST ===");
            System.out.println("1. Tambah Lagu");
            System.out.println("2. Tampilkan Playlist");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); // membersihkan buffer enter

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan judul lagu: ");
                    String title = input.nextLine();
                    playlist.addSong(title);
                    System.out.println("Lagu berhasil ditambahkan!");
                    break;

                case 2:
                    playlist.displayPlaylist();
                    break;

                case 3:
                    System.out.println("Keluar dari program...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 3);

        input.close();
    }
}

