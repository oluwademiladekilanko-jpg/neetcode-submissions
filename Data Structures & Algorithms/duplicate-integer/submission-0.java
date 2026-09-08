
class Solution {
    public boolean hasDuplicate(int[] nums) {
        ArrayList<Integer> data = new ArrayList<Integer>();
        boolean hasDup = false;
        for(int value:nums){
            if(data.contains(value)){
                hasDup = true;
            }
            else{
                data.add(value);
            }
            
        }

        return hasDup;
    }

    public static void main(String[]args){
        int [] nums = {1,2,3,5};
    }
}