public class Problem7 {
    public static boolean increasingTriplet(int[] nums) {

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i=0;i<nums.length;i++) {
 int num = nums[i];
 if (num <= first) {
    first = num;
 }
 if (num<=second) {
second=num;
 }
 else{
    return true;
 }

        }
        return false;

}
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(increasingTriplet(nums));  // Output: true
    }
}
