class Solution {
    public String frequencySort(String s) {
        if(s.length() == 0)
        {
            return "";
        }

        Map<Character, Integer> map = new HashMap<>();
        for(char ch:s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0) + 1);
        }

        PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>(
            (a,b) -> b.getValue() - a.getValue()
        );

        StringBuilder sb = new StringBuilder();
        pq.addAll(map.entrySet());

        while(!pq.isEmpty())
        {
            Map.Entry<Character, Integer> entry = pq.poll();
            char ch = entry.getKey();
            int freq = entry.getValue();

            for(int i = 0; i < freq; i++)
            {
                sb.append(ch);
            }
        }
    return sb.toString();
    }
}