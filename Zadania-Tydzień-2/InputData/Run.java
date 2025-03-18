package InputData;

public class Run {

    InputData inputData = new InputData();
    TasksLab2 tasksLab2 = new TasksLab2();

    public void RunMenu(){
        Menu();
    }

    private void Menu() {
        System.out.println("1. Zadanie 1");
        System.out.println("2. Zadanie 2");
        System.out.println("3. Zadanie 3");
        System.out.println("4. Zadanie 4");
        System.out.println("5. Zadanie 5");
        System.out.println("6. Zadanie 6");
        System.out.println("7. Wyjście");
        System.out.println("Wybierz zadanie: ");

        int choose = inputData.InputInt();

        switch (choose){
            case 1: Task1Run(); break;
            case 2: Task2Run(); break;
            case 3: Task3Run(); break;
            case 4: Task4Run(); break;
            case 5: Task5Run(); break;
            case 6: Task6Run(); break;
            case 7: tasksLab2.Close(); break;
            default:
                System.out.println("Błędne dane, wybierz ponownie."); break;
        }
    }

    private void Task1Run(){
        System.out.println("Podaj wartości a,b,c: ");
        double a = inputData.InputInt();
        double b = inputData.InputInt();
        double c = inputData.InputInt();
        tasksLab2.Task1(a,b,c);
    }

    private void Task2Run(){
        System.out.println("Podaj a: ");
        double a = inputData.InputDouble();
        System.out.println("Podaj b: ");
        double b = inputData.InputDouble();
        System.out.println("Podaj c: ");
        double c = inputData.InputDouble();
        tasksLab2.Task2(a,b,c);
    }

    private void Task3Run(){
        System.out.println("Podaj liczbę x: ");
        int x = inputData.InputInt();
        System.out.println("Podaj liczbę y: ");
        int y = inputData.InputInt();
        System.out.println("Podaj liczbę z: ");
        int z = inputData.InputInt();
        System.out.println("Liczby przed sortowaniem: "+x +", "+y +", "+z);
        tasksLab2.Task3(x,y,z);
    }

    private void Task4Run(){
        System.out.println("Wpisz true - Tak albo false - Nie jeśli");
        System.out.print("Pada deszcz?: ");
        boolean deszcz = inputData.InputBoolean();
        System.out.print("Jest autobus?: ");
        boolean bus = inputData.InputBoolean();
        tasksLab2.Task4(deszcz,bus);
    }

    private void Task5Run(){
        System.out.println("Wpisz true - Tak albo false - Nie jeśli");
        System.out.print("Jest zniżka na samochód?: ");
        boolean znizka = inputData.InputBoolean();
        System.out.print("Otrzymałeś premię?: ");
        boolean podwyzka = inputData.InputBoolean();
        tasksLab2.Task5(znizka,podwyzka);
    }

    private void Task6Run(){
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Iloczyn");
        System.out.println("4. Iloraz");
        System.out.println("5. Reszta z dzielenia");
        System.out.println("Wybierz operacje: ");
        int choose = inputData.InputInt();
        System.out.println("Podaj x: ");
        int x = inputData.InputInt();
        System.out.println("Podaj y: ");
        int y = inputData.InputInt();
        tasksLab2.Task6(x,y, choose);
    }
}
