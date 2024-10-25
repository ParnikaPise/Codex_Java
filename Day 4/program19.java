class Demo{
public static void main(String[] args) {
     Pattern p = new Pattern();
     p.patternPrint();
}    
}

class Pattern{

    void patternPrint(){
        int n =3;
        int m =4;
            for(int i=0;i<n;i++){
                for (int j = 0; j < m; j++) {
                    System.out.print("1" + " ");
                }
                System.out.println();
            }
    }
}