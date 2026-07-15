class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      
        HashMap<Integer,Integer> hashMap= new HashMap<>();
        for(int key:nums){
            if (hashMap.containsKey(key)) {
                hashMap.put(key,hashMap.get(key)+1);
            }else {
                hashMap.put(key,1);
            }
        }
        PriorityQueue<Integer> pq= new PriorityQueue<>((a,b)->hashMap.get(a)-hashMap.get(b));

        for(int key:hashMap.keySet()){
            pq.offer(key);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int [] res=new int[k];
        int i=0;
        while (!pq.isEmpty()){
            res[i++] = pq.poll();
        }
        return res;
    }
}
