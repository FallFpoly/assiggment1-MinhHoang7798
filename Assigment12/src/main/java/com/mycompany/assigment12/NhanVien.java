//Name : Phạm Minh Hoàng 
//Mssv : PS47440
package com.mycompany.assigment12;

public abstract class NhanVien {

    private String maNV;
    private String hoTen;
    private double luong;

    public NhanVien() {
    }

    // Constructor
    public NhanVien(String maNV, String hoTen, double luong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    // getter , setter
    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    // PT tính thu nhập
    public abstract double getThuNhap();

    // PT tính thuế thu nhập
    public double getThueThuNhap() {
        double tn = getThuNhap();
        if (tn < 9000000) {
            return 0;
        } else if (tn <= 15000000) {
            return tn * 0.10;
        } else {
            return tn * 0.12;
        }
    }

    // PT override
    @Override
    public String toString() {
        return "Ma NV: " + maNV + ", Ho ten: " + hoTen + ", Luong: " + luong + ", Thu nhap: " + getThuNhap() + ", Thue: " + getThueThuNhap();
    }
}
