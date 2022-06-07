package learning.growing.threesum;

public class ThreeSumBForce {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        int targetSum = 10;
        boolean isExists = threeSumExists(arr, targetSum);

        if (!isExists) {
            System.out.println("Three Sum not exists");
        } else {
            System.out.println("Three Sum exists");
        }
    }

    private static boolean threeSumExists(int[] arr, int targetSum) {
        for (int i = 0; i < arr.length-2; i++) {
            for (int j = i+1; j < arr.length-1; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == targetSum) {
                        System.out.format("Three Sum Exists: [%d , %d , %d]", arr[i], arr[j], arr[k]);
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
