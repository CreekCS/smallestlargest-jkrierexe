//Jackson Krier
public class SmallestLargest{
    public static void main(String[] args){
        int[] nums = new int[10];
        for(int i=0; i<nums.length; i++){
            nums[i] = (int)(Math.random()*100);
            System.out.print(nums[i] + " ");
        }
        System.out.println("");
        System.out.println(smallestValue(nums));
        System.out.println(largestValue(nums));

    }
    public static int smallestValue(int[] nums){
        int min = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i]<min){
                min = nums[i];
            }
        }
        return min;


    }
    public static int largestValue(int[] nums){
        int max = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i]> max){
                max = nums[i];
            }
        }
        return max;
        
    }
}