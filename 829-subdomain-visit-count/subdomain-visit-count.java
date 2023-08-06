class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        List<String> ls = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for(String s : cpdomains) {
            String[] arr = s.split("\\s++");
            String sNum = arr[0];
            String sText = arr[1];

            String[] domains = sText.split("\\.");
            StringBuilder sb = new StringBuilder();

            for (int i=domains.length-1;i>=0;i--) {
                String subDomain = domains[i] + sb.toString();
                map.put(subDomain, map.getOrDefault(subDomain, 0) + Integer.parseInt(sNum));
                sb.setLength(0);
                sb.append(".");
                sb.append(subDomain);
            }
        }

        for (Map.Entry<String, Integer> en : map.entrySet()) {
            ls.add(en.getValue() + " " + en.getKey());
        }

        return ls;
    }
}