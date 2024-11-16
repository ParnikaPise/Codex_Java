class NumPattern{
    public static void main(String[] args) {
     Pattern p =new Pattern();
     p.print();   

    }
}

class Pattern{
    void print(){
        int a=1;
        for(int i=1;i<=3;i++){
            for (int j = 0; j <=3; j++) {
                System.out.print(a++ + " ");
            }
          System.out.println();
        }
    }
}
