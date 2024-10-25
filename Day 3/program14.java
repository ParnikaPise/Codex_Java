class Alpha{
    public static void main(String[] args) {
       Alphabet a = new Alphabet();
       a.alphaPrint(); 
    }
}

class Alphabet{

    void alphaPrint(){
        char i;
        for (i = 65; i < 69 ; i++) {
            System.out.print(i + " ");
            
        }
    }
}
