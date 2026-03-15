/* 
    Ariana Rahmawati - 2902733863
*/

public class ArrayDays {
    public static void main(String[] args) {

        String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

        System.out.println("Menampilkan hari menggunakan for-loop:");
        for (int k = 0; k < days.length; k++) {
            System.out.println(days[k]);
        }

        System.out.println();

        System.out.println("Menampilkan hari menggunakan do-while:");
        int m = 0;
        do {
            System.out.println(days[m]);
            m++;
        } while (m < days.length);

    }
}