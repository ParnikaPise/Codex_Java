class Math{
    public static void main(String[] args) {
        Cube c = new Cube();
        c.cubeprint();
    }
}
class Cube{
    void cubeprint(){
        for(int i=1;i<6;i++){
            if (i%2==0) {
                int square = i*i;
                System.out.print(square + " ");
            }else{
            int cube = i*i*i;
            System.out.print(cube + " ");
        }
    }
    }
}