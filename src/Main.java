public class Main {

    /**
     * Mean Methods
     */

    public static int meanTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int meanHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int meanHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int meanRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int meanRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        double sum = 0.0;
        for (int i: retailEstimatesTonnesPerYear){
            sum += i;
        }
        double mean = sum/retailEstimatesTonnesPerYear.length + 0.5;
        return (int) mean;

    }

    public static int meanFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int meanFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        return -1;
    }

    /**
     * Median Methods
     */

    public static int medianTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int medianHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int medianHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int medianRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int medianRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int medianFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int medianFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        return -1;
    }

    /**
     * Min Methods
     */

    public static int minTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int minRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int minFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int minFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        return -1;
    }

    /**
     * Max Methods
     */
    
    public static int maxTotalWasteKgPerCapitaPerYear(int[] totalWasteKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxHouseholdEstimateKgPerCapitaPerYear(int[] householdEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxHouseholdEstimateTonnesPerYear(int[] householdEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int maxRetailEstimateKgPerCapitaPerYear(int[] retailEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxRetailEstimateTonnesPerYear(int[] retailEstimatesTonnesPerYear)
    {
        return -1;
    }

    public static int maxFoodServiceEstimateKgPerCapitaPerYear(int[] foodServiceEstimatesKgPerCapitaPerYear)
    {
        return -1;
    }

    public static int maxFoodServiceEstimateTonnesPerYear(int[] foodServiceEstimatesTonnesPerYear)
    {
        return -1;
    }

    /**
     * Misc Methods
     */

    public static int getCountryTotalWastePerYear(String country, String[] countries, int[] totalWasteKgPerCapitaPerYear)
    {
        for (int i = 0; i<countries.length; i++) {
            if (countries[i].equals(country)) {
                return totalWasteKgPerCapitaPerYear[i];
            }
        }
        return -1;
    }

    public static String getCountryWithMostWastePerCapita(String[] countries, int[] totalWasteKgPerCapitaPerYear)
    {
        int maxWaste = Integer.MIN_VALUE;
        String countryWithMostWaste = "";
        for (int i = 0; i<totalWasteKgPerCapitaPerYear.length; i++) {
            if (totalWasteKgPerCapitaPerYear[i] > maxWaste) {
                maxWaste = totalWasteKgPerCapitaPerYear[i];
                countryWithMostWaste = countries[i];
            }
        }
        return countryWithMostWaste;
    }

    public static String[] getCountriesWithHighestPovertyPercentage(String[] countries, double[] percentagesShareInPoverty)
    {
        double maxPovertyPercentage = Double.MIN_VALUE;
        int count = 0;
        for (double percentage: percentagesShareInPoverty) {
            if (percentage > maxPovertyPercentage) {
                maxPovertyPercentage = percentage;
            }
        }
        for (double percentage: percentagesShareInPoverty) {
            if (percentage == maxPovertyPercentage) {
                count++;
            }
        }
        String[] countriesWithHighestPoverty = new String[count];
        int index = 0;
        for (int i = 0; i<percentagesShareInPoverty.length; i++) {
            if (percentagesShareInPoverty[i] == maxPovertyPercentage) {
                countriesWithHighestPoverty[index] = countries[i];
                index++;
            }
        }
        return countriesWithHighestPoverty;
    }

    public static String[] getCountriesWithHighConfidence(String[] countries, String[] confidences)
    {
        int highConfidenceCount = 0;

        for (String confidence : confidences) {
            if (confidence.equals("High Confidence")) {
                highConfidenceCount++;
            }
        }
        String[] countriesWithHighConfidence = new String[highConfidenceCount];
        int index = 0;

        for (int i = 0; i < confidences.length; i++) {
            if (confidences[i].equals("High Confidence")) {
                countriesWithHighConfidence[index] = countries[i];
                index++;
            }
        }
        return countriesWithHighConfidence;
    }
}
