import java.util.Scanner;

class Marks{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks below");
        System.out.println("Maths");
        float maths=sc.nextFloat();
        System.out.println("English");
        float english=sc.nextFloat();
        Grade g = new Grade(maths, english);
        g.percentage();
        sc.close();
    }
}

class Grade{
    float maths,english;
    Grade(float maths,float english){
        this.maths=maths;
        this.english=english;
    }

    void percentage(){
        float percentage;
        percentage=((maths + english)/200)*100;
        System.out.println("total percentage are " + percentage  +"%");

              
                if(percentage>=90){
                   System.out.println("The grade is A");
                }else  if(percentage>=80 ){
                   System.out.println("The grade is B");
                }else if(percentage>=70 ){
                   System.out.println("The grade is C");
                }else if(percentage>=60 ){
                   System.out.println("The grade is D");
                }else {
                   System.out.println("The grade is F");
                }
               }
                
        }
    

