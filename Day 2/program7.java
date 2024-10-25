

class Demo{
    public static void main(String[] args) {
        checker c =new checker();
        c.even();
        c.odd();
    }
}

class checker{
    int i=1;
    void even(){
        System.out.println("even no between 1 to 20");
    while (i<=20) {
        if (i%2==0) {
            
            System.out.println(i);
        }
        i++;
    }
    }

    void odd(){
        i=1;
        System.out.println("odd no between 1 to 20");
        while (i<=20) {
            if (i%2!=0) {
               
                System.out.println(i);
            }
            i++;
        }
    }
}