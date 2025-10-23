//Name : Phạm Minh Hoàng 
//Mssv : PS47440
package com.mycompany.assigment12;

public class TruongPhong extends NhanVien {

    private double trachNhiem;

    // Constructor 
    public TruongPhong() {
    }

    public TruongPhong(String maNV, String hoTen, double luong, double trachNhiem) {
        super(maNV, hoTen, luong);
        this.trachNhiem = trachNhiem;
    }

    // Getter , Setter 
    public double getTrachNhiem() {
        return trachNhiem;
    }

    public void setTrachNhiem(double trachNhiem) {
        this.trachNhiem = trachNhiem;
    }

    //override
    @Override
    public double getThuNhap() {
        return getLuong() + trachNhiem;
    }

    @Override
    public String toString() {
        return super.toString() + ", Luong trach nhiem: " + trachNhiem;
    }
}
