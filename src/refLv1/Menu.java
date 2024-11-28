package refLv1;

import java.io.IOException;
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

            // 사용자 응답 받고 int값에 대입
            char choice = sc.next().charAt(0);
            int choiceInt = Integer.parseInt(String.valueOf(choice));
            sc.nextLine();
            // 사용자 응답 받고 int값에 대입.

            // 메뉴 선택 후 장바구니 추가 프로세스
            if (choiceInt <= menuList.size() && choiceInt > 0) {
                while (true) {
                    System.out.println(menuList.get(choiceInt - 1).getName().toUpperCase() + "를 선택하셨습니다.");
                    System.out.println();
                    System.out.println("장바구니에 추가하시겠습니까?    [ Y / N ]");
                    char choice2 = sc.next().charAt(0);
                    sc.nextLine();
                    if (choice2 == 'Y' || choice2 == 'y') {
                        System.out.println(menuList.get(choiceInt - 1).getName() + "메뉴를 장바구니에 추가합니다.");
                        System.out.println();
                        return menuList.get(choiceInt - 1);
                    } else if (choice2 == 'N' || choice2 == 'n') {
                        System.out.println("장바구니 등록을 취소합니다.");
                        return null;
                    } else {
                        SystemMenus.wrong();
                    }
                }

            } else if (choiceInt == 0) {
                throw new PrevMenuException();
            } else {
               throw new Exception();
            }
            // 메뉴 선택 후 장바구니 추가 프로세스

            //예외 처리 프로세스
        } catch (PrevMenuException e) {
            SystemMenus.prevMenu();
            return null;
        } catch (Exception e){
            SystemMenus.wrong();
            return null;
        }
    }

    public String getName() {
        return name;
    }
}
