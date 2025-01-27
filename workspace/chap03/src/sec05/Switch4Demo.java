package sec05;

public class Switch4Demo {
    public static void main(String[] args) {
        show("호랑이");
        show("참새");
        show("고등어");
        show("곰팡이");
    }

    static void show(String bio) {
        String kind = switch (bio) {
            case "호랑이", "사자" -> "포유류";
            case "독수리", "참새" -> "조류";
            case "고등어", "연어" -> "어류";
            default -> {
                System.out.print("어이쿠! ");
                yield "...";
            }
        };
        System.out.printf("%s는 %s이다.\n", bio, kind);
    }
}
