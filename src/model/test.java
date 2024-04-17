/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Administrator
 */
public class test {

    public static void main(String[] args) {
        double rate = 10.3546645;

        System.out.println("Su dung phuong thuc Math.round()");
        // lam tron len gom 1 so thap phan, nhan va chia cho 10
        System.out.println((double) Math.round(rate * 10) / 10);
        // lam tron len gom 2 so thap phan, nhan va chia cho 100
        System.out.println((double) Math.round(rate * 100) / 100);
        // lam tron len gom 3 so thap phan, nhan va chia cho 1000
        System.out.println((double) Math.round(rate * 1000) / 1000);

        System.out.println("Su dung phuong thuc Math.ceil()");
        // lam tron len gom 1 so thap phan, nhan va chia cho 10
        System.out.println((double) Math.ceil(rate * 10) / 10);
        // lam tron len gom 2 so thap phan, nhan va chia cho 100
        System.out.println((double) Math.ceil(rate * 100) / 100);
        // lam tron len gom 3 so thap phan, nhan va chia cho 1000
        System.out.println((double) Math.ceil(rate * 1000) / 1000);
    }
}
