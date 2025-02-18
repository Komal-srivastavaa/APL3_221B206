public class Main {
    public static void main(String[] args) {

        Arjun arjun = new Arjun();
        Bheem bheem = new Bheem();
        Duryodhan duryodhan = new Duryodhan();
        Vikarn vikarn = new Vikarn();
       
        System.out.println("Arjun's traits:");
        arjun.fight();
        arjun.obey();
        arjun.kind();
        System.out.println();
    
        System.out.println("Bheem's traits:");
        bheem.fight();
        bheem.obey();
        bheem.kind();
        System.out.println();
        
        System.out.println("Duryodhan's traits:");
        duryodhan.fight();
        duryodhan.obey();
        duryodhan.disobey();
        System.out.println();
       
        System.out.println("Vikarn's traits:");
        vikarn.fight();
        vikarn.obey();
        vikarn.disobey();
    }
}