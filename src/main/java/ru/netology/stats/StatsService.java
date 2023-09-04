package ru.netology.stats;

public class StatsService {
    public int getSum(int[] sales) {

        int totalSale = 0;

        for (int sale : sales) {

            totalSale += sale;

        }
        return totalSale;

    }

    public int averageSalesAmount(int[] sales) {
        //int totalSale = getSum(sales);
        //int averageSale = totalSale / sales.length;
        //  return averageSale;
        int averageSale =  getSum(sales) / sales.length;
        return averageSale;
       // return getSum(sales) / sales.length;
    }

    public int amountMaxSale(int[] sales) {
        int amountMax = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[amountMax]) {
                amountMax = i;
            }
        }
        return amountMax + 1;
    }

    public int amountMinSale(int[] sales) {
        int amountMin = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[amountMin]) {
                amountMin = i;
            }
        }
        return amountMin + 1;

    }

    public int belowAverage(int[] sales) {
        int belowAverageMonth = 0;
        for (int sale : sales) {
            if (sale < averageSalesAmount(sales)) {
                belowAverageMonth++;
            }

        }
        return belowAverageMonth;

    }

    public int aboveAverage(int[] sales) {
        int aboveAverageMonth = 0;
        for (int sale : sales) {
            if (sale > averageSalesAmount(sales)) {
                aboveAverageMonth++;
            }

        }
        return aboveAverageMonth;

    }
}

