package sv;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static List<SinhVien> listSV = new ArrayList<>();
	static {
		listSV.add(new SinhVien("A", 20, 10.0, 10.0, 5.0));
		listSV.add(new SinhVien("B", 20, 10.0, 10.0, 6.0));
		listSV.add(new SinhVien("C", 2, 0.0, 0.0, 0.0));
		listSV.add(new SinhVien("D", 20, 10.0, 5.0, 5.0));
		listSV.add(new SinhVien("Ta", 20, 10.0, 10.0, 10.0));

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		while (true) {
			System.out.println("-+-----------------------------+-");
			System.out.println("-+ 1. Nhập thông tin sinh viên +-");
			System.out.println("-+ 2. Xem thông tin sinh viên  +-");
			System.out.println("-+ 3. Dừng chương trình        +-");
			System.out.println("-+-----------------------------+-");
			System.out.print("Chọn: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("-+ 1. Nhập thông tin sinh viên +-");
				themSinhVien();
				break;
			}
			case 2: {
				System.out.println("-+ 2. Xem thông tin sinh viên  +-");
				thongTinSinhVien();
				break;
			}
			case 3: {
				System.out.println("Bai bae");
				System.exit(0);
				break;
			}
			default:
				System.out.println("Chọn sai kìa bé");
			}
		}
	}

	public static void themSinhVien() {
		Scanner sc = new Scanner(System.in);
		String choice;
		do {
			SinhVien sv = new SinhVien();
			System.out.print("Nhập tên: ");
			sv.setHoTen(sc.nextLine());
			System.out.print("Nhập tuổi: ");
			sv.setTuoi(sc.nextInt());
			System.out.print("Điểm toán: ");
			sv.setDiemToan(sc.nextDouble());
			System.out.print("Điểm lý: ");
			sv.setDiemLy(sc.nextDouble());
			System.out.print("Điểm hóa: ");
			sv.setDiemHoa(sc.nextDouble());
			listSV.add(sv);
			System.out.print("Tiếp tục nhập sinh viên? (Y/N)");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("Y"));
	}
	
	public static void thongTinSinhVien() {
		System.out.printf("%-15s %-15s %15s %10s %10s %10s \n"
				, "Tên", "Tổng điểm" ,"Điểm Trung bình", "CNTT(26)", "DTVT(20)", "DT(18.5)");
		for (SinhVien sv : listSV) {
			sv.thongTinSinhVien();
		}
	}
}
