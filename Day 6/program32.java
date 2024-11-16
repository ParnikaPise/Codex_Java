class Alphabets{
    public static void main(String[] args) {
        AlphaPattern a = new AlphaPattern();
        a.alpha();
    }
}

class AlphaPattern{
    void alpha(){
        for(int i =0;i<=2;i++){
           for(char j=65;j<69;j++){
            System.out.print(j);
        }
        System.out.println();
    }
    }
}