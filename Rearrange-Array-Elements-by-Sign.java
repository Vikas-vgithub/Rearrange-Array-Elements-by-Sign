class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(nums[i]>=0){
                l1.add(nums[i]);
            }else{
                l2.add(nums[i]);
            }
        }

        int a = 0;
        int b = 0;

        while(a < nums.length/2){
            ans.add(l1.get(a));
            a++;
            ans.add(l2.get(b));
            b++;

        }

        return ans.stream().mapToInt(Integer::intValue).toArray();

    }
}
