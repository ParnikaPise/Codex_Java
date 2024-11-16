class star{
    public static void main(String[] args) {
        Patternprint p = new Patternprint();
        p.print();
    }
}

class Patternprint{
     
    void print(){
     for(int i = 0;i<=2;i++){
        for(int j=0;j<=4;j++){
            if(j%2==1){
                System.out.print("*");
            }else{
                System.out.print("=");
            }
        }
        System.out.println();
     }
    } 
}    
