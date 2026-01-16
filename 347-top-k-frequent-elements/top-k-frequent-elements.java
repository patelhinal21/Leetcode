class Solution {
    public int[] topKFrequent(int[] nums, int k) {
          HashMap<Integer, Integer> hm = new HashMap<>();
        for (int n : nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        PriorityQueue<Map.Entry<Integer,Integer>> minHeap = new PriorityQueue<>((a,b)-> a.getValue()-b.getValue());

        for (Map.Entry<Integer,Integer> entry : hm.entrySet()){
             minHeap.add(entry);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }

    int [] result = new int[k];
    for(int i =0; i<k;i++){
        result[i] = minHeap.poll().getKey();
    }
    return result;
    }
}