package Ch08;


class C04Computer{
	String SN;
	String CPUSpec;
	String RAMSpec;
	String DISKSpec;
	void PowerON() {
		System.out.println(SN + "전원을 켭니다");
	}
	void PowerOFF() {
		System.out.println(SN + "전원을 끕니다");
	}
	void ShowInfo() {
		System.out.println("SN : " + SN);
		System.out.println("CPU : " + CPUSpec);
		System.out.println("RAM : " + RAMSpec);
		System.out.println("DISK : " + DISKSpec);
	}
}

public class C04ComputerMain {

	public static void main(String[] args) {
		C04Computer LGGram1122 = new C04Computer();
		LGGram1122.SN ="11-22-33";
		LGGram1122.CPUSpec="I7";
		LGGram1122.RAMSpec="16G";
		LGGram1122.DISKSpec="1T";
		LGGram1122.PowerON();
		LGGram1122.ShowInfo();
		LGGram1122.PowerOFF();
		
	}

}
