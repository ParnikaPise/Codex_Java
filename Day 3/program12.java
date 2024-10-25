class Demo{
    public static void main(String[] args) {
        LogicPrint p = new LogicPrint();
        p.logic();
    }
}

class LogicPrint{
    void logic(){
        int i;
        for (i = 3; i < 13; i++) {
            if (i%3==0) {
                System.out.print(i + " ");
                
            }
            
            
        }
    }
}
