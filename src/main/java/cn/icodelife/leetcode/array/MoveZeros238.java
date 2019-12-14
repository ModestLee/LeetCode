package cn.icodelife.leetcode.array;

/**
 * @author modestlee
 * @url 问题讲解地址 https://mp.weixin.qq.com/s/LwWZv7NF72DJBwRHghIMvg
 * @date 2019/12/14
 */
public class MoveZeros238 {

    public static void main(String[] args) {
        int[] arr = {3,0,0,2,4,50,6,7,0,0,7};
        new MoveZeros238().moveZeroes_Solution1(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    public void moveZeroes_Solution1(int[] nums) {
        //在nums中，[0,k)的元素为非0元素
        int k = 0;
        //遍历到第i个元素后，保证[0,i]中所有的元素都按照顺序排列在[0,k)中
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                nums[k++] = nums[i];
            }
        }
        //将nums剩余的位置放置为0
        for(int i = k;i<nums.length;i++){
            nums[i] = 0;
        }
    }


    public void moveZeroes2_Solution2(int[] nums) {
        //在nums中，[0,k)的元素为非0元素
        int k = 0;
        //遍历到第i个元素后，保证[0,i]中所有的元素都按照顺序排列在[0,k)中
        // 同时,[k,i]为0

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
                k++;
            }
        }

    }


    public void moveZeroes_solution3(int[] nums) {
        //在nums中，[0,k)的元素为非0元素
        int k = 0;
        //遍历到第i个元素后，保证[0,i]中所有的元素都按照顺序排列在[0,k)中
        // 同时,[k,i]为0

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                //排除全部都是非0的元素
                if(i != k) {
                    int temp = nums[k];
                    nums[k] = nums[i];
                    nums[i] = temp;
                    k++;
                }else{
                    k++;
                }
            }
        }

    }

}
