package refLv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    Scanner sc = new Scanner(System.in);
    private SystemMenus sysMenu = new SystemMenus();
//    private Menu menu;
    private final Menu burgerMenu = sysMenu.setBurgerMenu();
    private final Menu drinkMenu = sysMenu.setDrinkMenu();
    private final Menu dessertsMenu = sysMenu.setDessertsMenu();
    private final MyBasket myBasket = new MyBasket();
    private Menu[] menuArr = {burgerMenu, drinkMenu, dessertsMenu};

    public void start(){
        while (true) {
            sysMenu.printFirstOptionMenu();
            int choice = sc.next().charAt(0) - '0';
            sc.nextLine();

            if(choice > 0 && choice < menuArr.length){
                System.out.println(menuArr[choice-1].getName().toUpperCase() + " MENU를 선택하셨습니다.");
                System.out.println();

                MenuItem chosenMenu = menuArr[choice - 1].showMenuScreen();
                if (chosenMenu != null) {
                    myBasket.addOnCart(chosenMenu);
                } else {
                    System.out.println("잘못된 입력입니다. 초기 메뉴로 돌아갑니다.");
                    System.out.println();
                }
            }

//            switch (choice) {
//                case '1':
//                    burgerMenu.showMenuScreen();
//                    break;
//                case '2':
//                    drinkMenu.showMenuScreen();
//                    break;
//                case '3':
//                    dessertsMenu.showMenuScreen();
//                    break;
//                case '0':
//                    exitProcess();
//                    sc.close();
//                    return;
//                case '9':
//                    myBasket.showBasketMenu();
//                    break;
//                default:
//                    wrong();
//                    continue;
//            }
//
//            System.out.println(menu.getName().toUpperCase() + "MENU를 선택하셨습니다.");
//            System.out.println();
//
//            MenuItem chosenMenu = menu.showMenuScreen();
//            if (chosenMenu != null) {
//                myBasket.addOnCart(chosenMenu);
//            } else {
//                System.out.println("잘못된 입력입니다. 초기 메뉴로 돌아갑니다.");
//            }

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
