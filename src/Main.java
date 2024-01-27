public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(50);
        boss.setDefenseType("Armor");

        System.out.println("Boss Information:");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Defense Type: " + boss.getDefenseType());
    }
    public static Hero[] createHeroes() {
        Hero[] heroes = new Hero[3];

        heroes[0] = new Hero(100, 20, "Flight");

        heroes[1] = new Hero(120, 25);

        heroes[2] = new Hero(90, 18, "Super Strength");

        return heroes;
    }
}