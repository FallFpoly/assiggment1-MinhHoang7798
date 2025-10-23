//Name : Phạm Minh Hoàng 
//Mssv : PS47440

package com.mycompany.assigment12;

public class HanhChinh extends NhanVien {

    public HanhChinh() {
    }

    public HanhChinh(String maNV, String hoTen, double luong) {
        super(maNV, hoTen, luong);
    }

    @Override
    public double getThuNhap() {
        return getLuong();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
