class Num{
    public static void main(String[] args) {
        NumberPattern p = new NumberPattern();
        p.pattern();
    }
}

class NumberPattern{
    void pattern(){
        int a = 1;
        int b=4;
        for(int i=0;i<=b;i++){
            for (int j = 0; j <i; j++) {
                System.out.print(a++);
                
            }
            System.out.println();
        }
    }
}