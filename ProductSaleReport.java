/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.productsalereport;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class ProductSaleReport {

    public static void main(String[] args) {
 String[] names = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        int[][] sales = new int[names.length][3];
        Scanner input = new Scanner(System.in);

        // Populate the 2D array: one row per product, one column per month
        for (int p = 0; p < names.length; p++) {
            for (int m = 0; m < 3; m++) {
                System.out.print("Enter number of sales for month " + (m + 1)
                        + " for " + names[p] + " mattress: ");
                sales[p][m] = input.nextInt();
            }
            System.out.println();
        }

        IProduct product = new Product(names, sales);
        PrintProduct printer = new PrintProduct();
        printer.PrintHeader();
        printer.PrintTotalProductSales(product.GetTotalProductsSold());
        printer.PrintAverageProductSales(product.GetAverageProductSold());
        printer.PrintMostPopularProduct(product.GetMostPopularProduct());
    }
}
    

