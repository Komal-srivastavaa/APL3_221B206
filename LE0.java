/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class JUET
{
    static int age;
    static String name;
    static private void set_name(String s){
        name=s;
    }
    static private void set_age(int a){
        age=a;
    }
    static private String get_name(){
        return name;
    }
    static private int get_age(){
        return age;
    }
	public static void main(String[] args) {
	    age=Integer.parseInt(args[1]);
	    name=args[0];
	    System.out.println("before: "+get_name()+" "+get_age());
	    set_name("aplab4");
    }
}