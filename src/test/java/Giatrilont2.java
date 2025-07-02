public class Giatrilont2 {
    public static int findGiatrilont2(int[] arr) {
        if (arr.length < 2) {
            return Integer.MIN_VALUE;
        }
        int max = Integer.MIN_VALUE;
        int giatrilont2 = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                giatrilont2 = max;
                max = num;
            } else if (num > giatrilont2 && num < max) {
                giatrilont2 = max;
            }
        }
        return giatrilont2;

    }

    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5, 0, 1, 2};
        System.out.println("Output:" + findGiatrilont2(arr1));
    }
}

