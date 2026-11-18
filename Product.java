/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productsalereport;

/**
 *
 * @author Student
 */
public class Product implements IProduct {
    
     private final String[] names;   // single-dimensional array: product names
    private final int[][] sales;    // two-dimensional array: [product][month]

    public Product(String[] names, int[][] sales) {
        this.names = names;
        this.sales = sales;
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int[] productSales : sales) {
            for (int monthSales : productSales) {
                total += monthSales;
            }
        }
        return total;
    }

    @Override
    public double GetAverageProductSold() {
        int count = sales.length * sales[0].length;
        return (double) GetTotalProductsSold() / count;
    }

    @Override
    public String GetMostPopularProduct() {
        int bestIndex = 0, bestTotal = -1;
        for (int i = 0; i < sales.length; i++) {
            int productTotal = 0;
            for (int monthSales : sales[i]) productTotal += monthSales;
            if (productTotal > bestTotal) { bestTotal = productTotal; bestIndex = i; }
        }
        // Sample output shows the best single-month figure for the winning product
        int peak = 0;
        for (int monthSales : sales[bestIndex]) peak = Math.max(peak, monthSales);
        return names[bestIndex] + "(" + peak + ")";
    }
}
