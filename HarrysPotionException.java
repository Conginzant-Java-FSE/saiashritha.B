public class HarrysPotionException {
        // Custom Exception
        //private static final org.slf4j.Logger log =org.slf4j.LoggerFactory.getLogger(PotionBrewing.class);

        static class PotionExplosionException extends RuntimeException {
            public PotionExplosionException(String message) {
                super(message);
            }
        }


        public static void brewPotion(int dragonBloodDrops) {
            if (dragonBloodDrops < 5) {
                System.out.println("Potion did not explode. Brewing successful!");
            } else {
                System.out.println("Potion Exploded!");
                throw new PotionExplosionException("Dragon Blood added and exploded!");
            }
        }

        public static void main(String[] args) {
            try {
                brewPotion(6);
            } catch (PotionExplosionException p) {
                System.out.println("Brewing Failed!");
                System.out.println("Reason: " + p.getMessage());
            }
        }
    }


