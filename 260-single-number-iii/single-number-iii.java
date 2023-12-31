class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                int k=map.get(nums[i]);
                map.put(nums[i],k+1);
            }
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int value=entry.getValue();
            if(value==1){
                l.add(entry.getKey());
            }
        }
        int[] res=new int[l.size()];
        for(int i=0;i<l.size();i++){
            res[i]=l.get(i);
        }
        return res;
    }
}