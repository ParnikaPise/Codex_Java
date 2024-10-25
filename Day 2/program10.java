class Demo {
    public static void main(String[] args) {
        divisible d = new divisible();
        d.check();
    }
}

class divisible {
    int i;

    void check() {
        int i=1;
        while (i<=20) {
            
        
            if (i%3==0 || i%7==0) {
                System.out.println(i);
            }
            i++;
        }
            
        }

    }
