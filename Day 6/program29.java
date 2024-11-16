class Alpha{
    public static void main(String[] args) {
        AlphaPattern a = new AlphaPattern();
        a.pattern();
    }
}

class AlphaPattern{

    void pattern(){
        char a ='A';
        for (int i =1;i<=3;i++) {
            for (int j = 0; j <=3; j++) {
                System.out.print(a++ + " ");
            }
            System.out.println();
            
        }
    }
}