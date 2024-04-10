import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int status=1;
        Main movlist[]=null;

        do {
            System.out.println("Välkommen till bio salongen");
            System.out.println("1. Lägg till film detaljer");
            System.out.println("2. Sök och boka");
            System.out.println("3. Visa allt");
            System.out.println("Ange ditt val :");
            int ch=scan.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Ange antal filmer");
                    int no=scan.nextInt();
                    movlist=new Main[no];
                    for(int i=0;i<movlist.length;i++);
                {
                    int j=i;
                    System.out.println("Ange film "+ ++j +" Detaljer");
                    movlist[i]=new Main();
                    break;
                    case 2:
                        boolean flag = true;
                        sc.nextLine();
                        System.out.println("Ange namn på film: ");
                        String name=scan.nextLine();
                        for(int i=0;i<movlist.length;i++)
                        {
                            if(movlist[i].getName().equals(name))
                            {
                                movlist[i].viewAllDetails();
                                flag = true;
                                System.out.println("Vill do boka biljetter för denna film");
                                System.out.println("Ange 1 för att boke 2 för att lämna");
                                int c=scan.nextInt();
                                if(c==1)
                                {

                                }
                            }
                        }
                }
            }
        }
    }
}