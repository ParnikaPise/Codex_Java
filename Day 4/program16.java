class Alpha{
    public static void main(String[] args) {
        AlternateAlpha a = new AlternateAlpha();
        a.alpha();
    }

}

class AlternateAlpha{
    void alpha(){
        char i;
        for (i = 65; i < 75; i++) {
            if (i%2!=0) {
                System.out.print(i + " ");
                
            }
            
        }
    }
    }