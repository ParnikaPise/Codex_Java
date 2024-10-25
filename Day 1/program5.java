import java.util.*;
class Demo{
    public static void main(String[] args) {
    odd o = new odd();
    o.check();

    }
}

class odd{

    void check(){
        int i;
        for(i=1;i<=15;i++){
            if(i%2!=0)
                System.out.println(i);
        }
    }
}