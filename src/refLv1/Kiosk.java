package refLv1;


import java.util.Arrays;
import java.util.Scanner;

public class Kiosk {
    Scanner sc = new Scanner(System.in);
    private Menu menu;
    boolean TNF = true;

    public void start(){
        while (TNF) {
            System.out.println("[ SHAKESHACK MENU ]");
            System.out.println("1. Burgers");
            System.out.println("2. Drinks");
            System.out.println("3. Desserts");
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
                default:
                    wrong();
                    continue;
            }

            System.out.println(menu.getName().toUpperCase() + "MENU를 선택하셨습니다.");
            System.out.println();

            menu.showMenuScreen();

        }
    }

    public void setBurgerMenu(){
        this.menu = new Menu(
                Arrays.asList(
                        new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거")
                        ,new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거")
                        ,new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거")
                        ,new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거")
                ), "Burger");
    }

    public void setDrinkMenu(){
        this.menu = new Menu(
                Arrays.asList(
                        new MenuItem("Coke", 1.5, "'ㅍㅅ'같은 가짜콜라가 아닌 진짜 콜라!")
                        ,new MenuItem("Sprite", 1.5, "칠성보다 맛있는 절대존엄 사이다")
                        ,new MenuItem("MilkShake", 2.0, "다른 맛을 만들기 귀찮아서 배리에이션은 옆집 멍멍이나 줘버린 밀크쉐이크")
                        ,new MenuItem("Water", 0.8, "햄버거 먹으면서 물을? 진짜로? 굳이?")
                ), "Drinks"
        );
    }

    public void setDessertsMenu(){
        this.menu = new Menu(
                Arrays.asList(
                        new MenuItem("Custard FishBread", 2.0, "팥붕의 시대는 갔다. 달콤한 슈크림 붕어빵")
                        ,new MenuItem("Apple Pie", 2.0, "난 이거 먹는 사람 잘 못봤는데 맛있나?")
                        ,new MenuItem("Chicken nugget 6pcs", 2.0, "나의 의경시절을 달래준 영혼의 소울메이트")
                        ,new MenuItem("Big Chestnuts Bread", 4.5, "노력할만큼 했다 에라 모르겠는 메?뉴")
                ), "Desserts"
        );
    }

    public static void wrong(){
        System.out.println("잘못된 숫자를 입력하셨습니다. 처음부터 다시 시도해주세요");
        System.out.println();
    }

    public static void exitProcess(){
        System.out.println("프로그램을 종료합니다.");
    }

}
