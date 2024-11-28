package refLv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Kiosk {
    Scanner sc = new Scanner(System.in);

    // 시스템 메세지 담당
    private final SystemTools sysMenu = new SystemTools();

    // 각 카테고리 메뉴, 장바구니
    private final Menu burgerMenu = sysMenu.setBurgerMenu();
    private final Menu drinkMenu = sysMenu.setDrinkMenu();
    private final Menu dessertsMenu = sysMenu.setDessertsMenu();
    private final MyBasket myBasket = new MyBasket();

    // 카테고리 메뉴 리스트화.
    private final ArrayList<Menu> menuArr = new ArrayList<>(Arrays.asList(burgerMenu,drinkMenu,dessertsMenu));

    public void start(){
        while (true) {
            sysMenu.printFirstOptionMenu();
            int choice = sc.next().charAt(0) - '0';
            sc.nextLine();

            // 맨 처음 분기점 : 버거/음료/디저트/장바구니/종료/오류
            if(choice > 0 && choice <= menuArr.size()){
                System.out.println(menuArr.get(choice-1).getName().toUpperCase() + " MENU를 선택하셨습니다.");
                System.out.println();

                MenuItem chosenMenu = menuArr.get(choice - 1).showMenuScreen();
                if (chosenMenu != null) {
                    myBasket.addOnCart(chosenMenu);
                }
            }
            else if (choice == 9) {
                myBasket.showBasketMenu();
            }
            else if (choice == 0) {
                SystemTools.exitProcess();
                sc.close();
                return;
            }
            else {
                SystemTools.wrong();
            }
        }
    }
}
