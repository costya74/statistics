package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
//            sales[minMonth] продажи в месяц min
//            sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;

    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
//            sales[minMonth] продажи в месяц max
//            sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            } // следующий рассматриваемый месяц имеет номер на 1 больше
            month = month + 1;
        } // добавляем единицу, т.к. отсчет идет с нуля
        return maxMonth + 1;
    }

    public int sumSales(int[] sales) {
        // логика
        int sumSale = 0;
        for (int sale : sales) {  //            sale - продажи в рассматриваемом месяце
            sumSale += sale;      //        другой вариант sumSale = sumSale + sale;
        }
        return sumSale;
    }

    public int avgSalesAmount(int[] sales) {

        return sumSales(sales) / sales.length;
    }

    public int amountBelowAvg(int[] sales) {  // количество месяцев продажи < среднего
       int result = 0;
        int avgSalesAmount = avgSalesAmount(sales); // объявляем обращаться к средней переменной  и она будет sale(продажи)
               for (int sale : sales) {
            if (sale < avgSalesAmount) {
                result += 1;
            }
        }
                return result;
    }

    public int amountAboveAvg(int[] sales) {  // количество месяцев продажи > среднего
        int result = 0;
        int avgSalesAmount = avgSalesAmount(sales);
        for (int sale : sales) {
            if (sale > avgSalesAmount) {
                result += 1;
            }
        }
        return result;
    }
}
