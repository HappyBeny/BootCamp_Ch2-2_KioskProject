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

            System.out.println("[[[My Basket Menu]]]");
            System.out.println("[ItemList]");
            for (int i = 0; i < itemCart.size(); i++) {
                System.out.println((i+1) + ". " + itemCart.get(i).getName() + ", W" + itemCart.get(i).getPrice());
            }
            System.out.println();

            System.out.println("1. Delete item");
            System.out.println("2. Pay Money");
            System.out.println("0. Go to previous menu");
            char choice = sc.next().charAt(0);
            sc.nextLine();

            switch (choice) {
                case '1':
                    deleteItem();
                    break;
                case '2':

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
                if (choice2 == 'Y') {
                    itemCart.remove(choiceInt - 1);
                } else {
                    Kiosk.wrong();
                }
            } else {
                Kiosk.wrong();
            }
        }
    }
}
