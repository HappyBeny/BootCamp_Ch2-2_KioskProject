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

    public void showMenuScreen() {
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

    }

    public List<MenuItem> getMenuList() {
        return menuList;
    }

    public String getName() {
        return name;
    }
}
