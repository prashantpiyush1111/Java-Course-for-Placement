class Problem1689 {

    public int minPartitions(String n) {
        int max = 0;

        for(char c : n.toCharArray()){
            int temp = c - '0';
            if(temp > max){
                max = temp;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Problem1689 obj = new Problem1689();

        System.out.println(obj.minPartitions("273"));
    }
}