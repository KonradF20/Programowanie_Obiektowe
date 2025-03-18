package InputData;

public class TasksLab1{

    protected String Task1(String name, int age){
        return "Imię: "+name +" , wiek: "+age;
    }

    public void Task2(double value1, double value2){
        double sum = value1 + value2;
        double difference = value1 - value2;
        double product = value1 * value2;
        double quotient = 1;

        System.out.println("Suma: "+sum);
        System.out.println("Różnica: "+difference);
        System.out.println("Iloczyn: "+product);
        if(value2 != 0){
            quotient = value1/value2;
            System.out.println("Iloraz: "+quotient);
        }
        else{
            System.out.println("Nie można dzielić przez zero");
        }

    }

    public boolean Task3(int number){
        if(number % 2 == 0){
            return true;
        }
        return false;
    }

    public boolean Task4(int number){
        if(number % 3 == 0 && number % 5 == 0){
            return true;
        }
        return false;
    }

    public double Task5(double number){
        return Math.pow(number,3);
    }

    public double Task6(double number){
        return Math.sqrt(number);
    }

    public boolean Task7(int a, int b, int c){
        if((a + b) > c && (a + c) > b && (c + b) > a){
            int a2 = a*a;
            int b2 = b*b;
            int c2 = c*c;
            if ((a2+b2) == c2 || (a2+c2) == b2 || (b2+c2) == a2){
                return true;
            }
        }
        return false;
    }

    public void Close(){
        System.out.println("Koniec programu");
    }
}
