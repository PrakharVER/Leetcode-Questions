class Solution {
    public int getLucky(String as, int ke) {
        StringBuilder number = new StringBuilder();
        for (char ax : as.toCharArray()) {
            number.append(ax - 'a' + 1);
        }
        while (ke > 0) {
            int temp = 0;
            for (char ax : number.toString().toCharArray()) {
                temp += ax - '0';  
            }
            number = new StringBuilder(String.valueOf(temp)); 
            ke--;
        }
        return Integer.parseInt(number.toString());  
    }
}