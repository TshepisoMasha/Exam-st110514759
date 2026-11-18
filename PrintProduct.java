/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.productsalereport;

/**
 *
 * @author Student
 */
public class PrintProduct {
   
  public void PrintHeader() {
        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("*".repeat(45));
    }
    public void PrintTotalProductSales(int total) {
        System.out.println("TOTAL PRODUCT SALES: " + total);
    }
    public void PrintAverageProductSales(double average) {
        System.out.printf("AVERAGE PRODUCT SALES: %.0f%n", average);
    }
    public void PrintMostPopularProduct(String product) {
        System.out.println("MOST POPULAR PRODUCT: " + product);
    }

}
    

