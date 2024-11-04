package JavaCollections.ArrayPrograms.IQ;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};
        int m =3; //no of elements in nums1 array
        int n=3; //no of elements in num2 array

        System.out.println(merge(nums1,m,nums2,n));

    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);

        return nums1;
    }
}
