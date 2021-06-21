package classMethod.human;

public class Human03 {
	public String name;
	public int age;
	public String professtion;
	
	public Human03(){
		this.name = "山田";
		this.age = 20;
		this.professtion = "プログラマー";
		
	}
	
	public String getprofile() {
		return "年齢は" + this.age + ",職業は" + this.professtion;
	}
	
	public void greet(String friend) {
		if (friend == null) {
			System.out.println("挨拶する友達がわかりません");
			return;
		}
		System.out.println(friend + "さん、こんにちは");
	}

}
