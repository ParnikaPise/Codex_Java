class NumPrint{
    public static void main(String[] args) {
       
        for(int i=1;i<=4;i++){
            for (int j = 7; j >=8-i; j--) {
                   System.out.print(j + " ");
            }
           
            System.out.println();
        }
    }
}