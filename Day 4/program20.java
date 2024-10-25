class Demo {
    public static void main(String[] args) {
        Binary b = new Binary();
        b.binarypattern();

    }
}

class Binary {

    void binarypattern() {
        int n = 3;
        int m = 4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(j%2==1){
                    System.out.print("0" + " ");
                }else{
                    System.out.print("1" + " ");
                }
            }
             System.out.println();
        }
    }
}
