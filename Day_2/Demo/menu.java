public class menu {
    public static int userChoice()
   {
       int chonn;
       System.out.println ("Bấm phím 1: Tao Danh Sach");
        System.out.println ("Bấm phím 2: Hien Thi Danh Sach");
        System.out.println ("Nhấn phím 3: Xoa Sinh Vien");
        System.out.println ("Bấm phím 4: Cap nhat sinh vien");
        System.out.println ("Nhấn phím 5: Thoat");
        System.out.println("-------------------------");
       chonn = Main.in.nextInt();
       return  chonn;
   }
}