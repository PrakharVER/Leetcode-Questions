class Solution 
{
    public static void mergeFun(int[] arr, int l, int m, int r) 
    {
        int an1 = m + 1 - l;
        int an2 = r-m;
        int[] left = new int[an1];
        for (int i = 0; i < an1; i++) {
            left[i] = arr[l + i];
        }
        int[] right = new int[an2];
        for (int i = 0; i < an2; i++) {
            right[i] = arr[m + 1 + i];
        }
        int i = 0, j = 0, k = l;
        while (i<an1 || j<an2) {
            if (j == an2 || i < an1 && left[i] < right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];
        }
    }
    public static void mergeSort(int[] arr, int low, int high) {
        if (low < high) {
            int middle = (high - low)/2 + low;
            mergeSort(arr, low, middle);
            mergeSort(arr, middle + 1, high);
            mergeFun(arr, low, middle, high);
        }
    }
    public int[] sortArray(int[] num) {
        mergeSort(num, 0, num.length - 1);
        return num;
    }
}