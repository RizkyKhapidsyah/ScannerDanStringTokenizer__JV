import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ScannerDanStringTokenizer2 {
    public static void main(String[] args) throws IOException {
        FileReader fileInput = new FileReader("Input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileInput);

        //System.out.println((char) bufferedReader.read());
        Scanner scanner = new Scanner(bufferedReader);

        /* Ini berfungsi untuk mengecek apakah ada kata selanjutnya atau tidak */
        System.out.println(scanner.hasNext());

        /* Untuk membaca kata dengan pemisah/demilimiter atau spasi */
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());
        System.out.println(scanner.next());

        System.out.println(scanner.hasNext()); //False

        /* Menggunakan Delimiter tertentu */
        FileReader fileInput2 = new FileReader("Input2.txt");
        bufferedReader = new BufferedReader(fileInput2);
        bufferedReader.mark(200);

        scanner = new Scanner(bufferedReader);
        scanner.useDelimiter(",");
        System.out.println(scanner.hasNext());

        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }

        /* Menggunakan String Tokenizer */
        bufferedReader.reset();

        //Baris Pertama
        String data = bufferedReader.readLine();
        System.out.println(data);

        StringTokenizer stringToken = new StringTokenizer(",");

        while (stringToken.hasMoreTokens()) {
            System.out.println(stringToken.nextToken());
        }

        //Baris Kedua
        data = bufferedReader.readLine();
        System.out.println(data);

        while (stringToken.hasMoreTokens()) {
            System.out.println(stringToken.nextToken());
        }

    }
}
