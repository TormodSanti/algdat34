public class Uke34 {
    public static void main(String[] args) {
        //Første oppgave
        int[] array1 = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 19};
        System.out.println("Posisjonen til minste tall er " + min(array1));

    }

    public static int min(int[] array) {
        if (array.length < 1) {
            throw new java.util.NoSuchElementException("Arrayet er tomt");
        }
        int minste = array[0];
        int minstepos = 0;
        for (int i = 1;i<array.length;i++) {
            if (array[i] <= minste) {
                minste = array[i];
                minstepos = i;
            }
        }
        return minstepos;
    }
}
