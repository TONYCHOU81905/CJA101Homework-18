package hw8;

//請設計一個Train類別,並包含以下屬性:
//- 班次 number,型別為int - 車種 type,型別為String - 出發地 start,型別為String
//- 目的地 dest,型別為String - 票價 price,型別為double
//• 設計對應的getter/setter方法,並在main方法裡透過建構子產生以下7個Train的物件,放到每小題
//需使用的集合裡
//- (202, “普悠瑪”, “樹林”, “花蓮”, 400)
//- (1254, “區間”, “屏東”, “基隆”, 700)
public class Train {

	private int number;
	private String type;
	private String start;
	private String des;
	private double price;

	public Train() {
	}

	public void setTrain(int number, String type, String start, String des, double price) {
		this.number = number;
		this.type = type;
		this.start = start;
		this.des = des;
		this.price = price;
	}

}
