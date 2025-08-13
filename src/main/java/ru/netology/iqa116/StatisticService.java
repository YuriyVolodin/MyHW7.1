package ru.netology.iqa116;

public class StatisticService {
    public long findMax(long[] incomes) {
        long currentMax = incomes[0];
        for (long income : incomes) {
            if (currentMax <= income) {
                currentMax = income;
            }
        }
        return currentMax;
    }
    public long findMin(long[] incomes) {
        long currentMin = incomes[0];
        for (long income : incomes) {
            if (income < currentMin) {
                currentMin = income;
            }
        }
        return currentMin;
    }
}