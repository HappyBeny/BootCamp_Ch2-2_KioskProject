# BootCamp_Ch2-2_KioskProject
# 0️⃣목차
## 1️⃣ 프로젝트 설명
## 2️⃣ 구현한 기능
## 3️⃣ 클래스/메서드 설명
## 4️⃣ 기술 스택
<br><br><br>

## 1️⃣ 프로젝트 설명
- 햄버거 가게에서 사용할 수 있도록 만든 메뉴 선택과 장바구니 기능을 갖춘 키오스크
<br><br>

## 2️⃣ 구현한 기능
- 사용자가 원하는 메뉴를 출력해주는 기능<br>

- 사용자가 선택한 메뉴를 장바구니에 추가/삭제 해주는 기능<br>

- 장바구니에 담겨있는 메뉴의 총 금액을 계산하고, 결제하는 기능<br>

- 결제 후 장바구니를 초기화하는 기능
<br><br>

## 3️⃣ 클래스/메서드 설명

<details><summary> Main 클래스
</summary>

- 키오스크를 속성값으로 갖고, start 메서드를 불러오는 메인 클래스입니다.
</details>

<details><summary> SystemTools 클래스</summary>

<ul>
  <details><summary> 메서드</summary>
  <ul>
    <li>`void printFirstOptionMenu` : 가장 처음 선택지를 출력</li>
    <li>`Menu setBurgerMenu`, `Menu setDrinkMenu`, `Menu setDessertsMenu` : 준비해둔 메뉴 리스트를 Menu 타입으로 반환해주는 메서드.</li>
    <li>`static void wrong` : 잘못된 입력을 받을 시 출력되는 메세지를 담은 메서드</li>
    <li>`static void prevMenu` : 이전 메뉴로 돌아가기를 선택했을 때 출력되는 메세지를 담은 메서드.</li>
    <li>`static void exitProcess` : 프로그램 종료 시 출력되는 메세지를 담은 메서드</li>
  </ul>
  </details>
</ul>

</details>

<details><summary> Kiosk 클래스
</summary>
<details>
<summary> 속성값
</summary>

- `Scanner sc` : 사용자의 입력을 받기 위한 스캐너<br>

- `SystemTools sysMenu` : 시스템 메세지를 출력하기 위한 도구<br>

- `Menu burgerMenu`, `Menu drinkMenu`, `Menu dessertsMenu` : 각 카테고리의 MenuItem을 리스트로 담아둠<br>

- `MyBasket myBasket` : 물건 담기, 삭제, 결제가 가능한 장바구니<br>

- `ArrayList\<Menu> menuArr` : 세 가지 Menu들을 담아둔 리스트<br>
</details>

<details><summary> 메서드
</summary>

- `void start` : 초기 메뉴화면을 보여주고, 입력값에 따라 각 카테고리/장바구니/종료 로 접근할 수 있게 하는 메서드
</details>
</details>

<details><summary> Menu 클래스
</summary>
<details><summary> 속성값</summary>

- `List<MenuItem> menuList`: 메뉴 항목 리스트를 저장하는 필드.<br>

- `String name`: 메뉴의 이름을 저장하는 필드.<br>
</details> 

<details><summary> 생성자</summary>

- `Menu(List<MenuItem> menuList, String name)`: 메뉴 리스트와 이름을 초기화하는 생성자.<br>
</details> 

<details><summary> 메서드</summary>

- `MenuItem showMenuScreen()`: 메뉴 화면을 출력하고, 사용자의 선택에 따라 메뉴 항목을 반환하거나 장바구니 추가 로직을 처리하는 메서드.<br>
- `String getName()`: 메뉴의 이름을 반환하는 메서드.<br>
</details>
</details>

<details><summary> MenuItem 클래스</summary>
<details><summary> 속성값</summary>

- `String name`: 메뉴의 이름을 저장하는 필드.<br>
- `double price`: 메뉴의 가격을 저장하는 필드.<br>
- `String description`: 메뉴의 설명을 저장하는 필드.<br>

</details>

<details><summary> 생성자</summary>

- `MenuItem(String name, double price, String description)`: 메뉴의 이름, 가격, 설명을 초기화하는 생성자.<br>

</details>

<details><summary> 메서드</summary>

- `String getMenuInfo()`: 메뉴 이름, 가격, 설명을 포맷팅된 문자열로 반환하는 메서드.<br>
- `String getName()`: 메뉴의 이름을 반환하는 메서드.<br>
- `double getPrice()`: 메뉴의 가격을 반환하는 메서드.<br>
- `String getDescription()`: 메뉴의 설명을 반환하는 메서드.<br>

</details>
</details>

<details><summary> MyBasket 클래스</summary>
<details><summary> 속성값</summary>

- `List<MenuItem> itemCart`: 장바구니에 추가된 `MenuItem` 리스트를 저장하는 필드.<br>
- `Scanner sc`: 사용자 입력을 받기 위한 스캐너.<br>

</details>

<details><summary> 메서드</summary>

- `void addOnCart(MenuItem item)`: 장바구니에 메뉴 아이템을 추가하는 메서드.<br>
- `void showBasketMenu()`: 장바구니 메뉴를 출력하고, 사용자 입력에 따라 삭제, 결제 또는 이전 메뉴로 돌아가는 메서드.<br>
- `private void deleteItem()`: 사용자 선택에 따라 장바구니에서 특정 아이템을 삭제하는 메서드.<br>
- `private void payProcess()`: 장바구니 총 금액을 계산하고 결제를 진행하는 메서드.<br>

</details>
</details>

<details><summary> PrevMenuException 클래스</summary>

- 이전 메뉴로 돌아가는 상황을 처리하기 위해 정의된 사용자 정의 예외 클래스.

</details>


<br><br>

## 4️⃣ 기술 스택
- Language: Java
- IDE: IntelliJ IDEA
- Framework: Java Collections Framework
<br><br>
