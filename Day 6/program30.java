class Star{
    public static void main(String[] args) {
      StarPattern s = new StarPattern();
      s.print();  
    }
}

class StarPattern{
    int a =5;
    
    void print(){
        for(int i=0;i<a;i++){
            for (int j = 0; j <i; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}