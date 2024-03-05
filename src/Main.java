import java.util.*;

public class Main {
    public static void main(String[] args) {

        Notebook notebook1 = new Notebook("Lenovo", 8, 650, "Windows", "Black", 3.0);
        Notebook notebook2 = new Notebook("Asus", 16, 1000, "Windows", "Black", 4.3);
        Notebook notebook3 = new Notebook("Apple", 8, 500, "MacOS", "White", 1.2);
        Notebook notebook4 = new Notebook("Dell", 8, 150, "Linux", "Grey", 2.4);
        Notebook notebook5 = new Notebook("Apple", 8, 500, "MacOS", "White", 1.2);
        Notebook notebook6 = new Notebook("HP", 16, 1000, "Windows", "Grey", 1.8);
        Notebook notebook7 = new Notebook("HP", 8, 500, "Windows", "Black", 1.5);
        Notebook notebook8 = new Notebook("Apple", 8, 650, "MacOS", "Grey", 1.4);
        Notebook notebook9 = new Notebook("Lenovo", 8, 500, "Windows", "Grey", 1.3);
        Notebook notebook10 = new Notebook("Lenovo", 16, 1500, "Windows", "White", 3.5);

        Set<Notebook> notebookSet = new HashSet<>();
        notebookSet.add(notebook1);
        notebookSet.add(notebook2);
        notebookSet.add(notebook3);
        notebookSet.add(notebook4);
        notebookSet.add(notebook5);
        notebookSet.add(notebook6);
        notebookSet.add(notebook7);
        notebookSet.add(notebook8);
        notebookSet.add(notebook9);
        notebookSet.add(notebook10);

//        for (Notebook notebook: notebookSet){
//            System.out.println(notebook);
//        }
        Map<String, String> filters = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("""
                    Выберите критерий сравнения:
                    1 - Фирма
                    2 - ОЗУ
                    3 - Обьъём ЖД
                    4 - Операционная система
                    5 - Цвет
                    6 - Вес
                    0 - Выход""");


            String input = scanner.nextLine();

            if (input.equals("0")) {
                break;
            }

            else if (input.equals("1")) {
                System.out.println("Введите интересующую вас фирму:");
                String firm = String.valueOf(scanner.nextLine());
                filters.put("Firm", String.valueOf(firm));
                for (Notebook n : notebookSet) {
                    if (n.getFirm().equals(filters.get("Firm"))) {
                        System.out.println(n);
                    }
                }
            }

            else if (input.equals("2")) {
                System.out.println("Введите минимальное кол-во ОЗУ:");
                int ram = Integer.valueOf(scanner.nextLine());
                filters.put("Ram", String.valueOf(ram));
                for (Notebook n : notebookSet) {
                    if (n.getRam() >= ram) {
                        System.out.println(n);
                    }
                }
            }

            else if (input.equals("3")) {
                System.out.println("Введите минимальный объём ЖД:");
                int hardDisc = Integer.valueOf(scanner.nextLine());
                filters.put("HardDisc", String.valueOf(hardDisc));
                for (Notebook n : notebookSet) {
                    if (n.getHardDiscSize() >= hardDisc) {
                        System.out.println(n);
                    }
                }
            }

            else if (input.equals("4")) {
                System.out.println("Введите интересующую вас операционную систему:");
                String oS = String.valueOf(scanner.nextLine());
                filters.put("OS", String.valueOf(oS));
                for (Notebook n : notebookSet) {
                    if (n.getoS().equals(filters.get("OS"))) {
                        System.out.println(n);
                    }
                }
            }

            else if (input.equals("5")) {
                System.out.println("Введите интересующий вас цвет:");
                String color = String.valueOf(scanner.nextLine());
                filters.put("Color", String.valueOf(color));
                for (Notebook n : notebookSet) {
                    if (n.getColor().equals(filters.get("Color"))) {
                        System.out.println(n);
                    }
                }
            }

            else if (input.equals("6")) {
                System.out.println("Введите максимальный вес:");
                Double weight = Double.valueOf(scanner.nextLine());
                filters.put("Weight", String.valueOf(weight));
                for (Notebook n : notebookSet) {
                    if (n.getWeight() <= weight) {
                        System.out.println(n);
                    }
                }
            }

            else {
                System.out.println("Некорректный ввод, попробуйте ещё раз");
            }

        }


        scanner.close();
        }

    }


