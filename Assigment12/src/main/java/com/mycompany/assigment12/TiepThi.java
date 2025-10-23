//Name : Phạm Minh Hoàng 
//Mssv : PS47440
package com.mycompany.assigment12;

public class TiepThi extends NhanVien {

    private double doanhSo;
    private double HoaHong;

    //Constructor
    public TiepThi() {
    }

    public TiepThi(String maNV, String hoTen, double luong, double doanhSo, double HoaHong) {
        super(maNV, hoTen, luong);
        this.doanhSo = doanhSo;
        this.HoaHong = HoaHong;
    }

    //Getter , Setter
    public double getDoanhSo() {
        return doanhSo;
    }

    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }

    public double getHoaHong() {
        return HoaHong;
    }

    public void setHoaHong(double hueHong) {
        this.HoaHong = HoaHong;
    }

    //override
    @Override
    public double getThuNhap() {
        return getLuong() + (doanhSo * HoaHong);
    }

    @Override
    public String toString() {
        return super.toString() + ", Doanh so: " + doanhSo + ", Hue hong: " + HoaHong;
    }
}
