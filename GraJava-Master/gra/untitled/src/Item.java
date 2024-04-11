public enum Item {
    CRYSTAL_SWORD(10, 5, 3, Rarity.RARE, 0.05),
    GOLDEN_DRAGON_AMULET(15, 8, 2, Rarity.LEGENDARY, 0.01),
    RADIANT_POWER_BULLETS(5, 12, 1, Rarity.COMMON, 0.3),
    IMMORTALITY_POTION(20, 15, 0, Rarity.EPIC, 0.02),
    LIGHTNING_GLOVES(8, 10, 5, Rarity.RARE, 0.05),
    ANCIENT_SPELLBOOK(5, 20, 2, Rarity.UNCOMMON, 0.15),
    ETHEREAL_ELIXIR(12, 25, 1, Rarity.RARE, 0.05),
    DIAMOND_BACKPLATE(18, 5, 8, Rarity.UNCOMMON, 0.15),
    DRAGON_EGG(25, 5, 5, Rarity.EPIC, 0.02),
    RING_OF_INVISIBILITY(10, 10, 5, Rarity.RARE, 0.05),
    WIZARD_STAFF(5, 30, 3, Rarity.UNCOMMON, 0.15),
    JEWEL_OF_THE_UNIVERSE(30, 30, 5, Rarity.LEGENDARY, 0.01),
    HOLY_GRAIL(50, 50, 10, Rarity.MYTHIC, 0.001),
    CHAOS_ARTIFACT(15, 25, 15, Rarity.EPIC, 0.02),
    WIZARD_HAT(5, 15, 10, Rarity.UNCOMMON, 0.15),
    RAINBOW_EYE(20, 20, 5, Rarity.RARE, 0.05),
    CRYSTALLIZED_ETHER(10, 40, 3, Rarity.RARE, 0.05),
    GOLDEN_SCARAB(25, 10, 10, Rarity.UNCOMMON, 0.15),
    FORTUNE_MASCOT(10, 10, 10, Rarity.RARE, 0.05),
    JEWELLED_CHALICE(40, 20, 5, Rarity.EPIC, 0.02),
    SCROLL_OF_FATE(15, 35, 2, Rarity.EPIC, 0.02),
    AMULET_OF_COURAGE(35, 15, 5, Rarity.EPIC, 0.02),
    GOLDEN_SCALEMAIL(30, 20, 8, Rarity.LEGENDARY, 0.01),
    SPARKLING_GEMS(20, 25, 5, Rarity.RARE, 0.05),
    PRIMAL_ARMAMENT(25, 5, 20, Rarity.LEGENDARY, 0.01),
    PEARL_SHELL(10, 20, 10, Rarity.RARE, 0.05),
    BLACK_MIRROR(15, 15, 15, Rarity.EPIC, 0.02),
    DUSK_CASKET(30, 30, 5, Rarity.LEGENDARY, 0.01),
    VILLAGE_OF_DARK_SECRETS(10, 10, 10, Rarity.RARE, 0.05),
    SHAPE_SHIFT_SCROLL(5, 35, 3, Rarity.UNCOMMON, 0.15),
    SILVER_HORN_OF_PLENTY(25, 25, 5, Rarity.RARE, 0.05),
    ORB_OF_PROPHECY(20, 20, 10, Rarity.EPIC, 0.02),
    DIAMOND_WHISPER(10, 40, 5, Rarity.RARE, 0.05),
    CLOAK_OF_INVISIBILITY(5, 20, 15, Rarity.UNCOMMON, 0.15),
    STONE_HEART(30, 10, 20, Rarity.EPIC, 0.02),
    GOLDEN_DAGGER(15, 10, 25, Rarity.RARE, 0.05),
    CRYSTAL_BALL(10, 25, 10, Rarity.UNCOMMON, 0.15),
    ORACLE_MASK(25, 15, 15, Rarity.RARE, 0.05),
    AMULET_OF_TRUTH(20, 20, 15, Rarity.EPIC, 0.02),
    CHALICE_OF_ETERNAL_YOUTH(40, 30, 10, Rarity.LEGENDARY, 0.01),
    TORCH_OF_ENLIGHTENMENT(15, 30, 10, Rarity.RARE, 0.05),
    RING_OF_POWER(30, 20, 20, Rarity.EPIC, 0.02),
    STAFF_OF_ELEMENTS(10, 50, 5, Rarity.RARE, 0.05),
    SUN_JEWEL(25, 25, 15, Rarity.UNCOMMON, 0.15),
    CRYSTAL_WAND(20, 30, 10, Rarity.UNCOMMON, 0.15),
    PEARL_MEDALLION(15, 35, 8, Rarity.RARE, 0.05),
    ANCIENT_GEM(35, 25, 10, Rarity.EPIC, 0.02),
    AMULET_OF_DESTINY(30, 40, 5, Rarity.EPIC, 0.02),
    DIAMOND_ANGEL(20, 20, 20, Rarity.LEGENDARY, 0.01),
    BOOK_OF_ANCESTORS(25, 30, 15, Rarity.UNCOMMON, 0.15),
    RUNE_JEWELS(15, 15, 25, Rarity.RARE, 0.05),
    SILVER_RIBBON(30, 10, 25, Rarity.EPIC, 0.02),
    GLOWING_ORB(10, 25, 20, Rarity.RARE, 0.05),
    DARK_MASCOT(20, 30, 15, Rarity.EPIC, 0.02),
    GOLDEN_GROVE(25, 20, 20, Rarity.LEGENDARY, 0.01),
    CRYSTAL_GEM(15, 35, 10, Rarity.UNCOMMON, 0.15),
    RING_OF_DOMINION(35, 25, 15, Rarity.EPIC, 0.02),
    PEARL_AMULET(30, 30, 20, Rarity.EPIC, 0.02),
    SILVER_GUARDIAN(40, 20, 15, Rarity.LEGENDARY, 0.01),
    DIAMOND_WINGS(50, 50, 10, Rarity.MYTHIC, 0.001);

    private final int hpBonus;
    private final int manaBonus;
    private final int strengthBonus;
    private final Rarity rarity;
    private final double dropChance;

    Item(int hpBonus, int manaBonus, int strengthBonus, Rarity rarity, double dropChance) {
        this.hpBonus = hpBonus;
        this.manaBonus = manaBonus;
        this.strengthBonus = strengthBonus;
        this.rarity = rarity;
        this.dropChance = dropChance;
    }

    public int getHpBonus() {
        return hpBonus;
    }

    public int getManaBonus() {
        return manaBonus;
    }

    public int getStrengthBonus() {
        return strengthBonus;
    }

    public Rarity getRarity() {
        return rarity;
    }

    public double getDropChance() {
        return dropChance;
    }
}