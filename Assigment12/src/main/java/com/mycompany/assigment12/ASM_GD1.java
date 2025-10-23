/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.assigment12;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class ASM_GD1 {

    static ArrayList<ASM_GD1> ds = new ArrayList<>();

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int cn;
        do {
            System.out.println("+-----------------DANH SACH CHUC NANG------------------+");
            System.out.println("Chuc nang 1 : Nhap danh sach nhan vien");
            System.out.println("Chuc nang 2 : Xuat danh sach nhan vien");
            System.out.println("Chuc nang 3 : Tim nhan vien");
            System.out.println("Chuc nang 4 : Xoa nhan vien theo ma");
            System.out.println("Chuc nang 5 : Cap nhat thong tin nhan vien theo ma");
            System.out.println("Chuc nang 6 : Tim cac nhan vien theo khoang luong");
            System.out.println("Chuc nang 7 : Sap xep nhan vien theo ho va ten");
            System.out.println("Chuc nang 8 : Sap xep nhan vien theo thu nhap");
            System.out.println("Chuc nang 9 : xuat 5 nhan vien co thu nhap cao nhat");
            System.out.println("Chuc nang 10: Back");
            System.out.println("\n+----------------------------------------------------+");
            System.out.print("Lua chon CN : ");
            cn = sc.nextInt();
            switch (cn) {
                case 1:
                    System.out.println("Chuc nang 1 : Nhap danh sach nhan vien");
                    //   nhap();
                    break;
                case 2:
                    System.out.println("Chuc nang 2 : Xuat danh sach nhan vien");
                    //   xuat();
                    break;
                case 3:
                    System.out.println("Chuc nang 3 : Tim nhan vien");
                    break;
                case 4:
                    System.out.println("Chuc nang 4 : Xoa nhan vien theo ma");
                    break;
                case 5:
                    System.out.println("Chuc nang 5 : Cap nhat thong tin nhan vien theo ma");
                    break;
                case 6:
                    System.out.println("Chuc nang 6 : Tim cac nhan vien theo khoang luong");
                    break;
                case 7:
                    System.out.println("Chuc nang 7 : Sap xep nhan vien theo ho va ten");

                    break;
                case 8:
                    System.out.println("Chuc nang 8 : Sap xep nhan vien theo thu nhap");

                    break;
                case 9:
                    System.out.println("Chuc nang 9 : Xuat 5 nhan vien co thu nhap cao nhat");

                    break;
                case 10:
                    System.out.println("Chuc nang 10: Quay lai Menu");
                    break;
               
                default:
                    System.out.println("Chuc nang khong ton tai! Vui long chon lai ! ");
                    break;
            }
        } while (cn != 10);
    }

//    //goi phuong thuc nhap
//    public static void nhap() {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("nhap n= ");
//        int n = sc.nextInt();
//        for (int i = 0; i < n; i++) {
//            System.out.println("nhap pt thu " + i + ": ");
//            ASM_GD1 nv = new ASM_GD1();//khởi tạo đối tương nv
//            nv.nhap();
//            ds.add(nv);
//        }
//    }
//    //goi PT XUAT
//    public static void xuat() {
//        for (int i = 0; i < ds.size(); i++) {
//            System.out.println("xuat pt thu " + i + ": ");
//            System.out.println("ho ten: " + ds.get(i).getTen());
//            System.out.println("luong: " + ds.get(i).getLuong());
//        }
//    }
    //goi pt xuat Lương
    //goi pt tímv
    public static void main(String[] args) {
        menu();
    }
}
