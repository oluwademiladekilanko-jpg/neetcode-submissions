class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int [] numDiff = new int[length];
        // to find the num difference each number has between the target and its value
        //this works because the target must always be greater in the working outcome.
        int i = 0;
        int j = 0;
        boolean found = false;//to break the for loop
        for(int d = 0;d<length;d++){
            numDiff[d] = target - nums[d];
            //set K equqal to d so we only compare the numbers after it!
            //we can do it this way because if the first doesn't have a match, checking it again wouldn't matter.
            for(int k = d+1;k<length;k++){
                if(numDiff[d] == nums[k]){// this means we've found the combination
                    //this means d = first index and k = the second index
                i = d;
                j = k;
                found = true;

                }  
                    
            }
            if(found){// end the outerforloop thus ending the loop.
                break;
            }
        
        }
       //now return the index values
       return new int [] {i,j};

    }
}
