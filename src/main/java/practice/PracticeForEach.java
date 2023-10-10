package practice;

public class PracticeForEach {
	public static void main(String[] args) {
        String[] employees = {"田原", "福尾", "倉成", "濱野", "前村", "重永", "山田", "佐藤", "鈴木", "高橋","大岩","おおいわ"};

        System.out.println("社員名一覧:");

        for (String employee : employees) {
            System.out.println(employee);
        }
    }

}
