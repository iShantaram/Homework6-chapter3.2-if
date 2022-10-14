public class Main {
    public static void main(String[] args) {
        // HW6
        // Task1
        System.out.println("\nTask 1:");
        int clientOS = 1; // 0 - iOS, 1 - Android
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Task2
        System.out.println("\nTask 2:");
        int clientDeviceYear = 2015; // если < 2015, то требуется облегченная версия приложения
        System.out.print("Установите ");
        if (clientDeviceYear < 2015) {
            System.out.print("облегченную ");
        }
        if (clientOS == 0) {
            System.out.println("версию приложения для iOS по ссылке");
        } else {
            System.out.println("версию приложения для Android по ссылке");
        }

        // Task3
        System.out.println("\nTask 3:");
        int year = 2016;
        if (year%4 == 0) {
            if (year%25 == 0) {
                if (year%16 == 0) {
                    System.out.println("Год " + year + " является високосным");
                } else {
                    System.out.println("Год " + year + " не является високосным");
                }
            } else {
                System.out.println("Год " + year + " является високосным");
            }
        } else {
            System.out.println("Год " + year + " не является високосным");
        }

        // Task4
        System.out.println("\nTask 4:");
        int deliveryDistance = 95; // >= 0 и < 100
        int daysForDelivery = 1;
        if (deliveryDistance > 20) {
            daysForDelivery++;
        }
        if (deliveryDistance > 60) {
            daysForDelivery++;
        }
        System.out.println("Потребуется дней: " + daysForDelivery);

        // Task5
        System.out.println("\nTask 5:");
        int monthNumber = 0;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber + " месяц принадлежит сезону Зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " месяц принадлежит сезону Весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " месяц принадлежит сезону Лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " месяц принадлежит сезону Осень.");
                break;
            default:
                System.out.println("Такого месяца нет в году.");
        }

    }
}