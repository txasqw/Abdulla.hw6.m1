public class Boss extends GameEntity{
    private Weapon weapon;

    public String printInfo(){
        return  "Здоровье: " + this.getHealth() + "\nУрон: "
                + this.getDamage() + "\nОружие: "
                + this.getWeapon().getWeaponType() + "\nимя оружия: "
                + this.getWeapon().getName();
    }

    public Boss(int health, int damage, Weapon weapon) {
        this.setHealth(health);
        this.setDamage(damage);
        this.weapon = weapon;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
