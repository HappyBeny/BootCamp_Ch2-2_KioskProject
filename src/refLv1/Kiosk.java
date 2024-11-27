package refLv1;

import java.util.Arrays;
import java.util.Scanner;

public class Kiosk {
    Scanner sc = new Scanner(System.in);
    private Menu menu;
    private final Menu burgerMenu = SystemMenus.setBurgerMenu();
    private final Menu drinkMenu = SystemMenus.setDrinkMenu();
    private final Menu dessertsMenu = SystemMenus.setDessertsMenu();
    private final MyBasket myBasket = new MyBasket();

    public void start(){
        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");
            System.out.println("1. Burgers");
            System.out.println("2. Drinks");
            System.out.println("3. Desserts");
            System.out.println("9. My Basket");
            System.out.println("0. Exit");
            char choice = sc.next().charAt(0);
            sc.nextLine();

            switch (choice) {
                case '1':
                    setBurgerMenu();
                    break;
                case '2':
                    setDrinkMenu();
                    break;
                case '3':
                    setDessertsMenu();
                    break;
                case '0':
                    exitProcess();
                    sc.close();
                    return;
                case '9':
                    myBasket.showBasketMenu();
                    break;
                default:
                    wrong();
                    continue;
            }

            System.out.println(menu.getName().toUpperCase() + "MENU를 선택하셨습니다.");
            System.out.println();

            MenuItem chosenMenu = menu.showMenuScreen();
            if (chosenMenu != null) {
                myBasket.addOnCart(chosenMenu);
            } else {
                System.out.println("잘못된 입력입니다. 초기 메뉴로 돌아갑니다.");
            }

        }
    }

    public static void wrong(){
        System.out.println("잘못된 입력입니다. 다시 시도해주세요");
        System.out.println();
    }

    public static void exitProcess(){
        System.out.println("프로그램을 종료합니다.");
    }

}
