package refLv1;

import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    private List<MenuItem> menuList;
    private String name;

    public Menu(List<MenuItem> menuList, String name) {
        this.menuList = menuList;
        this.name = name;
    }

    public MenuItem showMenuScreen() {
        try {
            System.out.println("[[[" + this.name.toUpperCase() + " MENU]]]");
            for (int i = 0; i < menuList.size(); i++) {
                System.out.println((i + 1) + ". " + menuList.get(i).getMenuInfo());
            }
            System.out.println("0. Go to main menu");
            // 여기까지가 메뉴 출력

            char choice = sc.next().charAt(0);
            int choiceInt = Integer.parseInt(String.valueOf(choice));
            sc.nextLine();
            // 사용자 응답 받고 int값에 대입.

            if (choiceInt <= menuList.size() && choiceInt > 0) {
                System.out.println(menuList.get(choiceInt - 1).getName().toUpperCase() + "를 선택하셨습니다.");
                System.out.println();
                System.out.println("장바구니에 추가하시겠습니까?    [ Y / N ]");
                char choice2 = sc.next().charAt(0);
                sc.nextLine();
                System.out.println();

                if (choice2 == 'Y') {
                    System.out.println(menuList.get(choiceInt-1).getName() + "메뉴를 장바구니에 추가합니다.");
                    System.out.println();
                    return menuList.get(choiceInt-1);
                } else {
                    return null;
                }

            } else if (choiceInt == 0) {
                System.out.println("이전 단계로 돌아갑니다.");
                System.out.println();
                return null;
            } else {
               throw new Exception();
            }
        } catch (Exception e) {
            Kiosk.wrong();
        }
        return null;
    }

   /* public void showMenuScreen() {
        try {
            System.out.println("[[[" + this.name.toUpperCase() + " MENU]]]");
            for (int i = 0; i < menuList.size(); i++) {
                System.out.println((i + 1) + ". " + menuList.get(i).getMenuInfo());
            }
            System.out.println("0. Go to main menu");
            char choice = sc.next().charAt(0);
            int choiceInt = Integer.parseInt(String.valueOf(choice));
            sc.nextLine();
            if (choiceInt <= menuList.size() && choiceInt > 0) {
                System.out.println(menuList.get(choiceInt - 1).getName().toUpperCase() + "를 선택하셨습니다.");
                System.out.println("장바구니에 추가하시겠습니까?    [ Y / N ]");
                System.out.println();
            } else if (choiceInt == 0) {
                System.out.println("이전 단계로 돌아갑니다.");
                System.out.println();
            } else {
               throw new Exception();
            }
        } catch (Exception e) {
            Kiosk.wrong();
        }
    }*/

    public String getName() {
        return name;
    }
}
