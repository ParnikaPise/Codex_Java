class Demo {
    public static void main(String[] args) {
        divisible d = new divisible();
        d.check();
    }
}

class divisible {
    int i;

    void check() {

        for(i=1;i<=20;i++){
            if (i%3==0 && i%7==0) {
                System.out.println(i);
            }
            
        }
            
        }

    }
