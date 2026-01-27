public class Bai06 {
    public static void main(String[] args) {

        int[] arrayFirst = {1, 3, 5, 7, 9};
        int[] arraySecond = {2, 3, 5, 6, 8, 9, 10};

        System.out.print("Kho cu: [");
        for (int i = 0; i < arrayFirst.length; i++) {
            System.out.print(arrayFirst[i]);
            if (i < arrayFirst.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("Lo moi: [");
        for (int i = 0; i < arraySecond.length; i++) {
            System.out.print(arraySecond[i]);
            if (i < arraySecond.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        int i = 0, j = 0, k = 0;
        int[] temp = new int[arrayFirst.length + arraySecond.length];

        while (i < arrayFirst.length && j < arraySecond.length) {
            if (arrayFirst[i] < arraySecond[j]) {
                temp[k++] = arrayFirst[i++];
            } else if (arrayFirst[i] > arraySecond[j]) {
                temp[k++] = arraySecond[j++];
            } else {
                temp[k++] = arrayFirst[i];
                i++;
                j++;
            }
        }

        while (i < arrayFirst.length) {
            temp[k++] = arrayFirst[i++];
        }

        while (j < arraySecond.length) {
            temp[k++] = arraySecond[j++];
        }

        int[] result = new int[k];
        for (int x = 0; x < k; x++) {
            result[x] = temp[x];
        }

        System.out.print("Kho tong (da gop & loc trung): [");
        for (int x = 0; x < result.length; x++) {
            System.out.print(result[x]);
            if (x < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
