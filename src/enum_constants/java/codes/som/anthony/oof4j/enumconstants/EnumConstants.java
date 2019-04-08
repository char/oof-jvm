package codes.som.anthony.oof4j.enumconstants;

public class EnumConstants {
    public static void main(String[] args) {
        for (MyEnum e : MyEnum.class.getEnumConstants()) {
            System.out.println(e);
        }
    }
}
