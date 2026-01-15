public class NasaLaunch1 {
        static class MissionAbortException extends Exception {
            MissionAbortException(String message, Throwable cause) {
                super(message, cause);
            }
        }

        public static void validateLaunch(int fuel, String weather)
                throws MissionAbortException {

            try {
                if (fuel < 80) {
                    throw new Exception("Fuel is less than 80%");
                }

                if (!"CLEAR".equals(weather)) {
                    throw new Exception("Weather is not clear");
                }

            } catch (Exception ex) {
                throw new MissionAbortException("Mission aborted", ex);
            }
        }

        public static void main(String[] args) {
            try {
                validateLaunch(60, "STORM");
                System.out.println("Mission launched successfully 🚀");

            } catch (MissionAbortException ex) {
                System.out.println("Launch failed!");
                System.out.println("Reason: " + ex.getCause().getMessage());
                System.out.println("Retrying mission...");
            }
        }
    }

