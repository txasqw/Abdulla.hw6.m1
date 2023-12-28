public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss(600, 40, new Weapon(WeaponType.SWORD, "lll"));
        System.out.println(boss.printInfo());
        Skeleton skeleton = new Skeleton(500, 30, new Weapon(WeaponType.BOW, "name"), 20);
        Skeleton skeleton2 = new Skeleton(500, 30, new Weapon(WeaponType.BOW, "name"), 20);
        skeleton.printInfo();
        skeleton2.printInfo();
    }
}