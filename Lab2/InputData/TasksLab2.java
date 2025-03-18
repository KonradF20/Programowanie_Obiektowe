package InputData;

public class TasksLab2 {

    public void Task1(double a, double b, double c){
        double delta = (b*b)+(a*c*(-4));
        if(delta < 0){
            System.out.println("Równanie nie ma rozwiązań");
        }
        else if(delta > 0){
            double x1 = ((-b) - Math.sqrt(delta))/(2*a);
            double x2 = ((-b) + Math.sqrt(delta))/(2*a);
            System.out.println("Równanie ma 2 rozwiązania: x1 = "+x1 +", x2 = "+x2);
        }
        else{
            double x = (-b)/(2*a);
            System.out.println("Równanie ma 1 rozwiązanie: x0 = "+x);
        }
    }

    public void Task2(double a, double b, double c){
        System.out.println("a("+a+") = "+FunAX(a));
        System.out.println("b("+b+") = "+FunBX(b));
        System.out.println("c("+c+") = "+FunCX(c));
    }

    private double FunAX(double x){
        if(x > 0){
            return (2 * x);
        }
        else if(x == 0){
            return 0;
        }
        else{
            return (-3 * x);
        }
    }

    private double FunBX(double x){
        if(x >= 1){
            return (x * x);
        }
        else{
            return x;
        }
    }

    private double FunCX(double x){
        if(x > 2){
            return (2 + x);
        }
        else if(x == 2){
            return 8;
        }
        else{
            return (x - 4);
        }
    }

    public void Task3(int x, int y, int z){
        if(x > y){
            int tmp = x;
            x = y;
            y = tmp;
        }
        if(x > z){
            int tmp = x;
            x = z;
            z = tmp;
        }
        if(y > z){
            int tmp = y;
            y = z;
            z = tmp;
        }
        System.out.println("Liczby po sortowaniu: "+x +", "+y +", "+z);
    }

    public void Task4(boolean deszcz, boolean bus){
        if(deszcz && bus){
            System.out.println("Weź parasol, Dostaniesz się na uczelnie");
        }
        else if(deszcz && !bus){
            System.out.println("Nie dostaniesz się na uczelnie");
        }
        else if(!deszcz && bus){
            System.out.println("Dostaniesz się na uczelnie, Miłego dnia i pięknej pogody");
        }
    }

    public void Task5(boolean znizka, boolean podwyzka){
        if(!znizka || podwyzka){
            System.out.println("Możesz kupić samochoód!, Zniżki na samochód nie ma");
        }
        else if(!znizka || !podwyzka){
            System.out.println("Zakup samochodu trzeba odłożyć na później..., Zniżki na samochód nie ma");
        }
        else if(znizka || podwyzka){
            System.out.println("Możesz kupić samochód!");
        }
    }

    public void Task6(double x, double y, int choose){
        switch (choose){
            case 1: System.out.println("Wynik dodawania wynosi "+(x+y)); break;
            case 2: System.out.println("Wynik odejmowania wynosi "+(x-y)); break;
            case 3: System.out.println("Wynik mnożenia wynosi "+(x*y)); break;
            case 4: System.out.println("Wynik dzielenia wynosi "+(x/y)); break;
            case 5: System.out.println("Reszta z dzielenia wynosi "+(x%y)); break;
            default:
                System.out.println("Błędne dane, wybierz ponownie."); break;
        }
    }

    public void Close() {
        System.out.println("Koniec programu");
    }
}
