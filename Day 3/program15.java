class SmallAlpha{
    public static void main(String[] args) {
        SmallAlphaPrint p = new SmallAlphaPrint();
        p.alpha();
    }
}

class SmallAlphaPrint{

    void alpha(){
        char i;
        for(i=97;i < 101;i++){
            System.out.print(i + " ");
        }
    }
}