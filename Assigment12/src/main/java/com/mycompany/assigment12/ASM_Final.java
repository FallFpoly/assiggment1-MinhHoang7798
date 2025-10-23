//Name : Phạm Minh Hoàng 
//Mssv : PS47440
package com.mycompany.assigment12;

import java.util.ArrayList;
import java.util.Scanner;

public class ASM_Final {

    static ArrayList<NhanVien> ds = new ArrayList<>();

    // Menu
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int cn;
        do {
            System.out.println("\n+-----------------DANH SACH CHUC NANG------------------+");
            System.out.println("CN 1 : Nhap DS Nhan Vien");
            System.out.println("CN 2 : Xuat DS Nhan Vien");
            System.out.println("CN 3 : Tim Nhan Vien");
            System.out.println("CN 4 : Xoa NV theo ma");
            System.out.println("CN 5 : Cap nhat thong tin NV theo ma");
            System.out.println("CN 6 : Tim cac NV theo khoang luong");
            System.out.println("CN 7 : Sap xep NV theo ho va ten");
            System.out.println("CN 8 : Sap xep NV theo thu nhap");
            System.out.println("CN 9 : Xuat 5 NV co thu nhap cao nhat");
            System.out.println("CN 10 : Ket thuc Chuong Trinh");
            System.out.println("\n+----------------------------------------------------+");
            System.out.print("Lua chon CN : ");
            cn = sc.nextInt();

            switch (cn) {
                case 1:
                    System.out.println("CN 1 : Nhap DS Nhan Vien");
                    nhap(sc);
                    break;
                case 2:
                    System.out.println("CN 2 : Xuat DS Nhan Vien");
                    xuat();
                    break;
                case 3:
                    System.out.println("CN 3 : Tim NV");
                    tim(sc);
                    break;
                case 4:
                    System.out.println("CN 4 : Xoa NV theo ma");
                    xoa(sc);
                    break;
                case 5:
                    System.out.println("CN 5 : Cap nhat thong tin NV theo ma");
                    capNhat(sc);
                    break;
                case 6:
                    System.out.println("CN 6 : Tim cac NV theo khoang luong");
                    timKhoang(sc);
                    break;
                case 7:
                    System.out.println("CN 7 : Sap xep NV theo ho va ten");
                    sapXepTen();
                    break;
                case 8:
                    System.out.println("CN 8 : Sap xep NV theo thu nhap");
                    sapXepThuNhap();
                    break;
                case 9:
                    System.out.println("CN 9 : Xuat 5 NV co thu nhap cao nhat");
                    xuatTop5();
                    break;
                case 10:
                    System.out.println("CN 10 : Ket Thuc");
                    break;

                default:
                    System.out.println("CN ko ton tai! Vui long chon lai ! ");
                    break;
            }
        } while (cn != 10);
    }

    //PT nhập DS NV
    public static void nhap(Scanner sc) {
        System.out.print("SL Nhan Vien: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("NV Thu : " + (i + 1));
            System.out.print("Chon loai (1: Hanh chinh, 2: Tiep thi, 3: Truong phong): ");
            int loai = sc.nextInt();
            sc.nextLine();
            System.out.print("Ma NV : ");
            String ma = sc.nextLine();
            System.out.print("Ho ten : ");
            String ten = sc.nextLine();
            System.out.print("Luong : ");
            double luong = sc.nextDouble();

            NhanVien nv;
            if (loai == 1) {

                // Tạo NV hành chính
                nv = new NhanVien(ma, ten, luong) {
                    @Override
                    public double getThuNhap() {
                        return getLuong();
                    }
                };
            } else if (loai == 2) {
                System.out.print("Doanh so: ");
                double dsach = sc.nextDouble();
                System.out.print("Hoa hong: ");
                double hh = sc.nextDouble();
                nv = new TiepThi(ma, ten, luong, dsach, hh);
            } else if (loai == 3) {
                System.out.print("Luong trach nhiem: ");
                double tn = sc.nextDouble();
                nv = new TruongPhong(ma, ten, luong, tn);
            } else {
                System.out.println("Loai ko hop le!");
                i--;
                continue;
            }
            ds.add(nv);
        }
    }

    // PT xuất toàn bộ DS NV ra màn hình.
    public static void xuat() {
        if (ds.isEmpty()) {
            System.out.println("DS rong!");
            return;
        }
        for (NhanVien nv : ds) {
            System.out.println(nv);
        }
    }

    // PT tìm NV theo mã và hiển thị tt nếu tìm thấy.
    public static void tim(Scanner sc) {
        sc.nextLine();
        System.out.print("Nhap ma NV can tim: ");
        String ma = sc.nextLine();
        boolean found = false;
        for (NhanVien nv : ds) {
            if (nv.getMaNV().equals(ma)) {
                System.out.println(nv);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay!");
        }
    }

    // PT xóa NV theo mã
    public static void xoa(Scanner sc) {
        sc.nextLine();
        System.out.print("Nhap ma NV can xoa: ");
        String ma = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).getMaNV().equals(ma)) {
                ds.remove(i);
                System.out.println("Da xoa!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay!");
        }
    }

    // PT cập nhật thông tin NV theo Ma
    public static void capNhat(Scanner sc) {
        sc.nextLine();
        System.out.print("Nhap ma NV can cap nhat: ");
        String ma = sc.nextLine();
        boolean found = false;
        for (NhanVien nv : ds) {
            if (nv.getMaNV().equals(ma)) {
                System.out.print("Cap nhat ho ten moi: ");
                String ten = sc.nextLine();
                nv.setHoTen(ten);
                System.out.print("Cap nhat luong moi: ");
                double luong = sc.nextDouble();
                nv.setLuong(luong);
                if (nv instanceof TiepThi) {
                    System.out.print("Cap nhat doanh so moi: ");
                    double dsach = sc.nextDouble();
                    ((TiepThi) nv).setDoanhSo(dsach);
                    System.out.print("Cap nhat hoa hong moi: ");
                    double hh = sc.nextDouble();
                    ((TiepThi) nv).setHoaHong(hh);
                } else if (nv instanceof TruongPhong) {
                    System.out.print("Cap nhat luong trach nhiem moi: ");
                    double tn = sc.nextDouble();
                    ((TruongPhong) nv).setTrachNhiem(tn);
                }

                System.out.println("Da cap nhat!");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay!");
        }
    }

    // PT tìm và hiển thị NV
    public static void timKhoang(Scanner sc) {
        System.out.print("Nhap luong min: ");
        double min = sc.nextDouble();
        System.out.print("Nhap luong max: ");
        double max = sc.nextDouble();
        boolean found = false;
        for (NhanVien nv : ds) {
            if (nv.getLuong() >= min && nv.getLuong() <= max) {
                System.out.println(nv);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay!");
        }
    }

    // PT sắp xếp danh sách NV theo họ tên tăng dần
    public static void sapXepTen() {
        for (int i = 0; i < ds.size() - 1; i++) {
            for (int j = i + 1; j < ds.size(); j++) {
                if (ds.get(i).getHoTen().compareTo(ds.get(j).getHoTen()) > 0) {
                    NhanVien temp = ds.get(i);
                    ds.set(i, ds.get(j));
                    ds.set(j, temp);
                }
            }
        }
        System.out.println("Da sap xep theo ten!");
    }

    // PT sắp xếp danh sách NV theo thu nhập giảm dần
    public static void sapXepThuNhap() {
        for (int i = 0; i < ds.size() - 1; i++) {
            for (int j = i + 1; j < ds.size(); j++) {
                if (ds.get(i).getThuNhap() < ds.get(j).getThuNhap()) { // sắp xếp theo giảm dần
                    NhanVien temp = ds.get(i);
                    ds.set(i, ds.get(j));
                    ds.set(j, temp);
                }
            }
        }
        System.out.println("Da sap xep theo thu nhap giam dan!");
    }

    // PT xuất top 5 NV có thu nhập cao nhất sau khi sắp xếp.
    public static void xuatTop5() {
        // Sap xep giam dan thu nhap
        sapXepThuNhap();
        int count = 0;
        for (NhanVien nv : ds) {
            if (count >= 5) {
                break;
            }
            System.out.println(nv);
            count++;
        }
        if (count == 0) {
            System.out.println("DS rong!");
        }
    }

    // PT main khởi chạy
    public static void main(String[] args) {
        menu();
    }
}
