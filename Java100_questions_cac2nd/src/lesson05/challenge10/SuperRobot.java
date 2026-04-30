package lesson05.challenge10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//ここに問題8で作成したクラス(変更なし)を記述してください。
class Robot {
	int energy;
	String name;
	int water;

	void pumpWater() {
		//randomWater();削除

		System.out.println("水を" + water + "リットル出します");
	}

	void randomWater() {
		water = (int) (Math.random() * 9) + 1;
	}

	void setWater(int water) {
		//フィールドの変数waterにメソッドの引数として受け取ったwaterを代入している
		//「this.」はフィールドを明示するため
		this.water = water;
	}

	void makeOmlet(int eggNum, int butterNum) {
		int bestOmletNum1 = eggNum / 2;
		int bestOmletNum2 = butterNum / 5;

		if (bestOmletNum1 > bestOmletNum2) {
			System.out.println(bestOmletNum2 + "人分のオムレツを作成しました。");
		} else {
			System.out.println(bestOmletNum1 + "人分のオムレツを作成しました。");
		}

	}

	int getWater() {
		//int型の変数waterを返しているから
		//void型で値を返してはいけない
		return water;
	}

	String makeEggDishes(int flourNum, int sugarNum, int eggNum, int butterNum) {
		if (flourNum >= 170 && sugarNum >= 50 && eggNum >= 1 && butterNum >= 80) {
			return "クッキー";
		} else if (eggNum >= 2 && butterNum >= 5) {
			return "オムレツ";
		} else if (eggNum > 0) {
			return "ゆで卵";
		} else {
			return null;
		}

	}

	//10追加
	String makeLuxuryDish(int eggNum, int butterNum, int cheeseNum, int baconNum) {
		if (eggNum >= 2 && butterNum >= 10 && cheeseNum >= 20 && baconNum >= 30) {
			return "カルボナーラ";
		} else if (eggNum >= 2 && butterNum >= 5 && cheeseNum >= 10) {
			return "チーズオムレツ";
		} else {
			return null;
		}
	}

}

//ここに次の条件を満たすクラスを作成してください。
//クラス名：ClearRobot
//メソッド名：clearTable(引数int[] ingredients
//戻り値void、渡された配列を0でクリアする)
class ClearRobot {
	void clearTable(int[] ingredients) {
		for (int i = 0; i < ingredients.length; i++) {
			ingredients[i] = 0;
		}

	}
}

public class SuperRobot {

	public static void main(String[] args) throws IOException {

		System.out.println("Rさん：");
		System.out.println("あとかたづけをしてくれるロボットも欲しいところですね。\n");
		System.out.println("G博士：");
		System.out.println("そうれはもう作ってあるぞ。\n");
		System.out.println("Rさん：");
		System.out.println("えっ！どうやって使うんですか？\n");
		System.out.println("G博士：");
		System.out.println("今まで使ってきた材料をまとめて、料理と一緒に渡すときれいにしてくれるんじゃ。\n");
		System.out.println("Rさん：");
		System.out.println("早速やってみます。\n");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("小麦粉の量を入力してください（グラム）＞");
		String flourNumStr = br.readLine();
		int flourNum = Integer.parseInt(flourNumStr);

		System.out.print("\n砂糖の量を入力してください（グラム）＞");
		String sugarNumStr = br.readLine();
		int sugarNum = Integer.parseInt(sugarNumStr);

		System.out.print("\n卵の個数を入力してください＞");
		String eggNumStr = br.readLine();
		int eggNum = Integer.parseInt(eggNumStr);

		System.out.print("\nバターの量を入力してください（グラム）＞");
		String butterNumStr = br.readLine();
		int butterNum = Integer.parseInt(butterNumStr);

		//１０追加
		System.out.print("\nチーズの量を入力してください（グラム）＞");
		String cheeseNumStr = br.readLine();
		int cheeseNum = Integer.parseInt(cheeseNumStr);

		System.out.print("\nベーコンの量を入力してください（グラム）＞");
		String baconNumStr = br.readLine();
		int baconNum = Integer.parseInt(baconNumStr);

		//ここでRobotクラスのインスタンスを作り、
		//（インスタンス名はrobot）
		//makeEggDishesを実行する。
		//標準出力でメニューを表示する。
		Robot robot = new Robot();
		String result = robot.makeEggDishes(flourNum, sugarNum, eggNum, butterNum);

		if (result == null) {
			System.out.println("\n何も作れません。");
		} else {
			System.out.println("\n" + result + "が出来ました。");

		}

		//10追加
		String luxuryresult = robot.makeLuxuryDish(eggNum, butterNum, cheeseNum, baconNum);
		if (result == null) {
			System.out.println("\n何も作れません。");
		} else {
			System.out.println("\n" + luxuryresult + "が出来ました。");

		}

		System.out.println("\nあとかたづけをします。\n");
		int[] ingredients = new int[6];
		ingredients[0] = flourNum;
		ingredients[1] = sugarNum;
		ingredients[2] = eggNum;
		ingredients[3] = butterNum;
		//10追加
		ingredients[4] = cheeseNum;
		ingredients[5] = baconNum;

		//ここでClearRobotクラスのインスタンスを作り、
		//（インスタンス名はclearRobot）
		//clearTableを実行する。
		ClearRobot clearRobot = new ClearRobot();
		clearRobot.clearTable(ingredients);

		System.out.println("小麦粉  ：" + ingredients[0] + "g");
		System.out.println("砂糖    ：" + ingredients[1] + "g");
		System.out.println("卵      ：" + ingredients[2] + "個");
		System.out.println("バター  ：" + ingredients[3] + "g");
		//１０追加
		System.out.println("チーズ  ：" + ingredients[2] + "個");
		System.out.println("ベーコン：" + ingredients[3] + "g");

		System.out.println("\nきれいになりました。");
	}

}