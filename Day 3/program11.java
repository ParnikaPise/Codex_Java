class Demo{
    public static void main(String[] args) {
        pattern p= new pattern();
        p.patternprint();
    }
}

class pattern{

    void patternprint(){
        int i;
        for (i= 1; i <= 4; i++) {
            System.out.print("*" + " ");
            
        }
    }
}