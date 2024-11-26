package Lv4;


import java.util.List;
import java.util.Scanner;

public class Kiosk {
    Scanner sc = new Scanner(System.in);
    private List<MenuItem> menuList;

    public Kiosk(List<MenuItem> menuList) {
        this.menuList = menuList;
    }

    public void start(){
        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");
            for (int i = 0; i < menuList.size(); i++) {
                System.out.println((i+1) + ". " + menuList.get(i).getMenuInfo());
            }
            System.out.println("0. 종료");
            char choice = sc.next().charAt(0);
            sc.nextLine();

            if (choice == 0) {
                break;
            } else if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                System.out.println();
            } else {
                System.out.println("잘못된 번호를 입력하셨습니다.");
                System.out.println();
            }
        }
    }
}
