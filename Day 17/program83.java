class NumPattern {
    public static void main(String[] args) {
        int n = 3,m=n;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(m++ + " ");
                
            }
            System.out.println();
            n--;
            m=n;

        }
    }
}