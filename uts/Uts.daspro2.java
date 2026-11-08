package uts; 
import java.util.Scanner;
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
double w,t1,s1,h1,t2,s2,h2,t3,s3,h3;
double a,b,c,total,avg,target,p;
int n;

System.out.print("Weight: ");
w=sc.nextDouble();

System.out.print("Running time: ");
t1=sc.nextDouble();
System.out.print("Running speed: ");
s1=sc.nextDouble();
System.out.print("Running altitude: ");
h1=sc.nextDouble();

System.out.print("Swimming time: ");
t2=sc.nextDouble();
System.out.print("Swimming speed: ");
s2=sc.nextDouble();
System.out.print("Swimming altitude: ");
h2=sc.nextDouble();

System.out.print("Cycling time: ");
t3=sc.nextDouble();
System.out.print("Cycling speed: ");
s3=sc.nextDouble();
System.out.print("Cycling altitude: ");
h3=sc.nextDouble();

System.out.print("Target: ");
target=sc.nextDouble();

a=t1*0.05*w+s1*0.5+h1*0.01;
b=t2*0.04*w+s2*0.5+h2*0.01;
c=t3*0.03*w+s3*0.5+h3*0.01;
total=a+b+c;
avg=total/(t1+t2+t3);
p=total/target*100;

System.out.println("1. Each activity");
System.out.println("2. Total calories");
System.out.println("3. Average");
System.out.println("4. Target status");
System.out.print("Choose: ");
n=sc.nextInt();

switch(n) {
case 1:
System.out.printf("Running: %.2f%n",a);
System.out.printf("Swimming: %.2f%n",b);
System.out.printf("Cycling: %.2f%n",c);
break;
case 2:
System.out.printf("Total: %.2f%n",total);
break;
case 3:
System.out.printf("Average: %.2f%n",avg);
break;
case 4:
if(p<80)
System.out.println("Far below target");
else if(p<100)
System.out.println("Almost achieved");
else
System.out.println("Target achieved");
break;
default:
System.out.println("Invalid menu selection");
} mkasihh ya gal