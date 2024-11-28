package refLv1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyBasket {
    Scanner sc = new Scanner(System.in);
    List<MenuItem> itemCart = new ArrayList<>();

    public void addOnCart(MenuItem item) {
        itemCart.add(item);
    }


    public void showBasketMenu() {
        while (true) {
            System.out.println("MY BASKET MENU를 선택하셨습니다.");
            System.out.println();

            System.out.println("[[[My Basket Menu]]]");
            System.out.println("[ItemList]");
            for (int i = 0; i < itemCart.size(); i++) {
                System.out.println((i+1) + ". " + itemCart.get(i).getName() + ", W " + itemCart.get(i).getPrice());
            }
            System.out.println();

            System.out.println("1. Delete item");
            System.out.println("2. Pay Money");
            System.out.println("0. Go to previous menu");
            char choice = sc.next().charAt(0);
            sc.nextLine();
            System.out.println();

            switch (choice) {
                case '1':
                    deleteItem();
                    return;
                case '2':
                    payProcess();
                case '0':
                    return;
            }
        }
    }

    private void deleteItem() {
        while (true) {
            System.out.println("[[[DELETE MENU]]]");
            System.out.println("Choose the item's number");
            char choice = sc.next().charAt(0);
            sc.nextLine();
            Integer choiceInt = Integer.parseInt(String.valueOf(choice));

            if (choiceInt > 0 && choiceInt <= itemCart.size()) {
                System.out.println(itemCart.get(choiceInt - 1).getName() + " 항목을 정말 삭제하시겠습니까?");
                System.out.println("[ Y / N ]");
                char choice2 = sc.next().charAt(0);
                if (choice2 == 'Y' || choice2 == 'y') {
                    System.out.println("MY BASKET에서 " + itemCart.get(choiceInt - 1).getName() + " 항목을 삭제했습니다.");
                    itemCart.remove(choiceInt - 1);
                    System.out.println();
                    break;
                } else if (choice2 == 'N' || choice2 == 'n'){
                    System.out.println("초기 화면으로 돌아갑니다.");
                    System.out.println();
                    break;
                } else {
                    SystemMenus.wrong();
                }
            } else {
                SystemMenus.wrong();
            }
        }
    }

    private void payProcess() {
        while (true) {
            double totalPrice = 0;
            for (int i = 0; i < itemCart.size(); i++) {
                totalPrice += itemCart.get(i).getPrice();
            }
            System.out.println("현재 장바구니 메뉴의 금액 합계는 " + totalPrice + "입니다. 결제하시겠습니까?    [ Y / N ]");
            char choiceYN = sc.next().charAt(0);

            if (choiceYN == 'Y' || choiceYN == 'y') {
                System.out.println("결제가 완료되었습니다.");
                itemCart.clear();
                break;
            } else if (choiceYN == 'N' || choiceYN == 'n') {
                System.out.println("결제를 취소합니다.");
                System.out.println();
                break;
            } else {
                SystemMenus.wrong();
            }
        }
    }
}
