package Cau4;

public class HangHoa {
    private int maSanPham;
    private String tenSanPham;
    private String chungLoai;
    private int namSanXuat;
    private int namBaoHanh;
    private final String[] chuanLoaiHang = { "Giay", "Kim Loai", "Nhua" };

    public HangHoa(int _maSanPham, String _tenSanPham, String _chungLoai, int _namSanXuat, int _namBaoHanh) {
        if (checkChungLoai(_chungLoai)) {
            this.maSanPham = _maSanPham;
            this.tenSanPham = _tenSanPham;
            this.chungLoai = _chungLoai;
            this.namSanXuat = _namSanXuat;
            this.namBaoHanh = _namBaoHanh;
        } else {
            System.out.println("Lỗi chủng loại!! (Giay, Kim Loai, Nhua)");
            return;
        }
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getChungLoai() {
        return chungLoai;
    }

    public void setChungLoai(String chungLoai) {
        if (checkChungLoai(chungLoai)) {
            this.chungLoai = chungLoai;
        } else {
            System.out.println("Lỗi chủng loại!! (Giay, Kim Loai, Nhua)");
        }
    }

    public boolean checkChungLoai(String e) {
        for (int i = 0; i < this.chuanLoaiHang.length; i++) {
            if (e.toUpperCase().equals(chuanLoaiHang[i].toUpperCase())) {
                return true;
            }
        }
        return false;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public int getNamBaoHanh() {
        return namBaoHanh;
    }

    public void setNamBaoHanh(int namBaoHanh) {
        this.namBaoHanh = namBaoHanh;
    }

    @Override
    public String toString() {
        return "HangHoa [maSanPham=" + maSanPham + ", tenSanPham=" +
                tenSanPham + ", chungLoai=" + chungLoai
                + ", namSanXuat=" + namSanXuat + ", namBaoHanh="
                + namBaoHanh + "]";
    }
}
