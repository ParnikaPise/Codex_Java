class Pattern{
    public static void main(String[] args) {
        EvenNum e = new EvenNum();
        e.even();
    }
}

class EvenNum{
    void even(){
        int a=1;
        for(int i =0;i<3;i++){
            for (int j = 0; j < 4; j++) {
                if (a%2==1) {
                    System.out.print(a);
                    a=a+2;
                }
                
            }
            System.out.println();
        }
    }
}