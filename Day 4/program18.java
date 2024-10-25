class Demo{
    public static void main(String[] args) {
        Pattern p = new Pattern();
        p.patternPrint();
    }    
}

class Pattern{

    void patternPrint(){
        int n=2;
        int m=3;
        for (int i = 0; i <=n; i++) {
            for ( int j = 0; j <= m; j++) {
                     System.out.print("*" + " ");
                    
                    }
         System.out.println( );
            
        }
    }
}
