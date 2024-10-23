import java.util.*;
class Employee  {
        public static void main(String   []args)  {
         float DA,HRA,PF,gr_sal,net_sal;
        float CCA=240f,PT=100f;
         Scanner sc= new Scanner(System.in);
         System.out.println("enter employee rollno=");
         int r=sc.nextInt();
        System.out.println("enter your basic ");
        float f=sc.nextFloat();
       System.out.println("enter employee name="); 
       String w=sc.next();
        DA=(70/100)*f;
        HRA=(30/100)*f;
        PF=(10/100)*f;
        gr_sal=(f + DA + HRA);
        net_sal=(gr_sal-CCA-PT-PF);
        System.out.println("your Gross Salary : " + gr_sal);
        System.out.println("your Net Salary : " + net_sal);
 }
}
