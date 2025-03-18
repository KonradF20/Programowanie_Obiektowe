package InputData;
import java.util.Random;

public class Run{

    TasksLab1 tasksLab1 = new TasksLab1();
    InputData inputData = new InputData();
    Random random = new Random();

    public void RunMain(){
        Menu();
    }

    private void Menu(){
        System.out.println("1. Zadanie 1");
        System.out.println("2. Zadanie 2");
        System.out.println("3. Zadanie 3");
        System.out.println("4. Zadanie 4");
        System.out.println("5. Zadanie 5");
        System.out.println("6. Zadanie 6");
        System.out.println("7. Zadanie 7");
        System.out.println("8. Wyjście");
        System.out.println("Wybierz zadanie: ");

        int choose = inputData.InputInt();

        switch (choose){
            case 1: Task1Run(); break;
            case 2: Task2Run(); break;
            case 3: Task3Run(); break;
            case 4: Task4Run(); break;
            case 5: Task5Run(); break;
            case 6: Task6Run(); break;
            case 7: Task7Run(); break;
            case 8: tasksLab1.Close(); break;
            default:
                System.out.println("Błędne dane, wybierz ponownie."); break;
        }

    }

    private void Task1Run(){
        System.out.println("Podaj imię: ");
        String name = inputData.InputString();
        System.out.println("Podaj wiek: ");
        int age = inputData.InputInt();
        System.out.println(tasksLab1.Task1(name, age));
    }

    private void Task2Run(){
        System.out.println("Podaj liczbę 1: ");
        double value1 = inputData.InputDouble();
        System.out.println("Podaj liczbę 2: ");
        double value2 = inputData.InputDouble();
        tasksLab1.Task2(value1, value2);
    }

    private void Task3Run(){
        System.out.println("Podaj liczbę: ");
        int number = inputData.InputInt();
        if(tasksLab1.Task3(number)){
            System.out.println("Liczba "+number +" jest parzysta");
        }
        else{
            System.out.println("Liczba "+number +" jest nieparzysta");
        }
    }

    private void Task4Run(){
        System.out.println("Podaj liczbę: ");
        int number = inputData.InputInt();
        if(tasksLab1.Task4(number)){
            System.out.println("Liczba "+number +" jest podzielna przez 3 i 5");
        }
        else{
            System.out.println("Liczba "+number +" jest niepodzielna przez 3 i 5");
        }
    }

    private void Task5Run(){
        System.out.println("Podaj liczbę: ");
        double number = inputData.InputDouble();
        System.out.println("Liczba "+number +" podniesiona do potęgi 3 wynosi "+tasksLab1.Task5(number));
    }

    private void Task6Run(){
        System.out.println("Podaj liczbę: ");
        double number = inputData.InputDouble();
        System.out.println("Pierwiastek kwadratowy liczby "+number +" wynosi "+tasksLab1.Task6(number));
    }

    private void Task7Run(){
        System.out.println("Podaj liczbę: ");
        int limit1 = inputData.InputInt();
        System.out.println("Podaj liczbę: ");
        int limit2 = inputData.InputInt();
        System.out.println("Losowe liczby z przedziału ["+limit1+","+limit2+"]:");
        int a = RandomInt(limit1, limit2);
        int b = RandomInt(limit1, limit2);
        int c = RandomInt(limit1, limit2);
        System.out.println("a = "+a+"\nb = "+b+"\nc = "+c+"\n");
        if(tasksLab1.Task7(a,b,c)){
            System.out.println("Można zbudować trójkąt prostokątny");
        }
        else{
            System.out.println("Nie można zbudować trójkąt prostokątnego");
        }
    }

    private int RandomInt(int x, int y){
        return (random.nextInt(y - x +1)+x);
    }
}