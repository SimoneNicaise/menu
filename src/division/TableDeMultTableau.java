package division;

public class TableDeMultTableau {
    public static void main(String[] args) {
         int[][] mult=new int[12][2];
         int x=7;
         //remplissage de la premiere ligne
         mult[0][0]=1;
         mult[0][1]=x* mult[0][0];
        //remplissage de la deuxieme ligne
         mult[1][0]=2;
         mult[1][1]=x* mult[1][0];
        //remplissage de la troisieme ligne
         mult[2][0]=3;
         mult[2][1]=x* mult[2][0];
        //remplissage de la quatrieme ligne
        mult[3][0]=4;
        mult[3][1]=x* mult[3][0];
        // remplissage de la cinquieme ligne
        mult[4][0]=5;
        mult[4][1]=x * mult[4][0];
        // remplissage de la sixieme ligne
        mult[5][0]=6;
        mult[5][1]=x* mult[5][0];


        System.out.println("\n\t Affichage du tableau valeur/ resultat");
        System.out.println("\t\t\t  --- ---");
        System.out.println("\t\t\t | "+ mult[0][0] + " | " + mult[0][1] + " |");
        System.out.println("\t\t\t  --- ---");
        System.out.println("\t\t\t | "+ mult[1][0] + " | " + mult[1][1] + " |");
        System.out.println("\t\t\t  --- ---");
        System.out.println("\t\t\t | "+ mult[2][0] + " | " + mult[2][1] + " |");
        System.out.println("\t\t\t  --- ---");
        System.out.println("\t\t\t | "+ mult[3][0] + " | " + mult[3][1] + " |");
        System.out.println("\t\t\t  --- ---");
        System.out.println("\t\t\t | "+ mult[4][0] + " | " + mult[4][1] + " |");
        System.out.println("\t\t\t  --- ---");
        System.out.println("\t\t\t | "+ mult[5][0] + " | " + mult[5][1] + " |");

        System.out.println("Afficher la table de multiplication");
        System.out.println("\t\t --- --- --- --- --- ---");
        System.out.println("\t\t | "+x+" | x | "+ mult[0][0] + " | = | "+ mult[0][1] + " | ");
        System.out.println("\t\t --- --- --- --- --- ---");
        System.out.println("\t\t | "+x+" | " + " x "+ mult[1][0] + " | " + " = " + " | "+ mult[1][1] + " | ");
        System.out.println("\t\t --- --- --- --- --- ---");
        System.out.println("\t\t | "+x+" | " + " x "+ mult[2][0] + " | " + " = " + " | "+ mult[2][1] + " | ");
        System.out.println("\t\t --- --- --- --- --- ---");
        System.out.println("\t\t | "+x+" | " + " x "+ mult[3][0] + " | " + " = " + " | "+ mult[3][1] + " | ");
        System.out.println("\t\t --- --- --- --- --- ---");
        System.out.println("\t\t | "+x+" | " + " x "+ mult[4][0] + " | " + " = " + " | "+ mult[4][1] + " | ");
        System.out.println("\t\t --- --- --- --- --- ---");
        System.out.println("\t\t | "+x+" | " + " x "+ mult[5][0] + " | " + " = " + " | "+ mult[5][1] + " | ");
        System.out.println("\t\t --- --- --- --- --- ---");








    }
}
