public class Weapon {
    private WeaponType weaponType;
    private String name;

    public Weapon(WeaponType weaponType, String name) {
        this.weaponType = weaponType;
        this.name = name;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        this.weaponType = weaponType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
