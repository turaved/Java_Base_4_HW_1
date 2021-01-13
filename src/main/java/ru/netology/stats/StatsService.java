package ru.netology.stats;

public class StatsService {
    public long calculateTotalSum(long[] sales){
        long totalsum = 0;
        for (long sale : sales) {
            totalsum += sale;
        }
        return totalsum;
    }

    public long calculateAverageSalePerMonth(long[] sales){
        //long totalsum = 0;

        //for (long sale : sales) {
        //    totalsum += sale;
        //    }
        StatsService service = new StatsService();
        long totalsum = service.calculateTotalSum(sales);
        int amountmonthes = sales.length;
        long averagesumpermonth = totalsum / amountmonthes;

        return averagesumpermonth;
    }

    public long calculateMaxSaleMonthIndex(long[] sales){
        long maxsale = sales[0];
        int maxsaleindex = 1;
        int monthindex = 1;

        for (long sale : sales) {
            if (maxsale <= sale){
                maxsale = sale;
                maxsaleindex = monthindex;

            }
            monthindex += 1;
        }
        return maxsaleindex;
    }

    public long calculateMinSaleMonthIndex(long[] sales){
        long minsale = sales[0];
        int minsaleindex = 1;
        int monthindex = 1;

        for (long sale : sales) {
            if (minsale > sale){
                minsale = sale;
                minsaleindex = monthindex;

            }
            monthindex += 1;
        }
        return minsaleindex;
    }

    public long calculateLessAverageSalePerMonthAmount(long[] sales){
        //long totalsum = 0;

        //for (long sale : sales) {
        //    totalsum += sale;
        //}

        //int amountmonthes = sales.length;
        StatsService service = new StatsService();
        long averagesumpermonth = service.calculateAverageSalePerMonth(sales);//totalsum / amountmonthes;

        int amountmonthlessaverage = 0;
        for (long sale : sales) {
            if (sale < averagesumpermonth) {
                amountmonthlessaverage += 1;
            }
        }
        return amountmonthlessaverage;
    }

    public long calculateGreaterAverageSalePerMonthAmount(long[] sales){
        //long totalsum = 0;

        //for (long sale : sales) {
            //totalsum += sale;
        //}

        //int amountmonthes = sales.length;
        //long averagesumpermonth = totalsum / amountmonthes;
        StatsService service = new StatsService();
        long averagesumpermonth = service.calculateAverageSalePerMonth(sales);

        int amountmonthgreateraverage = 0;
        for (long sale : sales) {
            if (sale > averagesumpermonth) {
                amountmonthgreateraverage += 1;
            }
        }
        return amountmonthgreateraverage;
    }


}
