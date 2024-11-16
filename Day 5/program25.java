class NumPatttern{
    public static void main(String[] args) {
        StarNum s =new StarNum();
        s.star();
    }
}

class StarNum{

    void star(){
        int num=1;
        for(int i = 0; i<=2;i++){
            for(int j =0;j<=4;j++){
                if(j%2==1){
                    
                        System.out.print(num++);
                        
                    
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
