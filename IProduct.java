/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.productsalereport;

/**
 *
 * @author Student
 */
public interface IProduct {
    int GetTotalProductsSold();        // Total sales for all the products and months
    
    double GetAverageProductSold();    // Average sales per product per month
    
    String GetMostPopularProduct();    // Name (and total) of the best-selling product
}
    

