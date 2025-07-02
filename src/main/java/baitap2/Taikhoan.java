//package baitap2;
//
//    public abstract class TaiKhoan {
//        //thuộc tính
//        private String soTaiKhoan;
//        private String chuTaiKhoan;
//        private double soDu;
//
//
//        public String getChuTaiKhoan() {
//            return chuTaiKhoan;
//        }
//
//        public double getSoDu() {
//            return soDu;
//        }
//
//        public void guiTien(double soTien) {
//            if (soTien > 0) {
//                soDu += soTien;
//            }
//        }
//
//        public void rutTien(double soTien) {
//            if (soTien > 0 && soTien <= soDu) {
//                soDu -= soTien;
//            }
//        }
//
//        public abstract double tinhLai();
//
//        public void hienThiThongTin() {
//            System.out.println("Số tài khoản: " + soTaiKhoan);
//            System.out.println("Chủ tài khoản: " + chuTaiKhoan);
//            System.out.println("Số dư: " + soDu);
//            System.out.println("Số tiền lãi: " + tinhLai());
//        }
//    }
//
