public class Skeleton extends Boss {
    private int arrows;

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    public Skeleton(int health, int damage, Weapon weapon, int arrows) {
        super(health, damage, weapon);
        this.arrows = arrows;
    }

    @Override
    public String printInfo() {
        return "Здоровье: " + this.getHealth() + "\nУрон: "
                + this.getDamage() + "\nОружие: "
                + this.getWeapon().getWeaponType() + "\nимя оружия: "
                + this.getWeapon().getName() + "\nколичество стрел: " + this.getArrows();
    }
}
