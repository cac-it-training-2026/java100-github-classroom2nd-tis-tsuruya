/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		int citronStock = 30;
		int chocolaStock = 30;
		int pistacheStock = 30;

		System.out.println("本日のおすすめ商品です。\n");
		System.out.println("シトロン　　　\\250 ・・・　残り" + citronStock + "個");
		System.out.println("ショコラ　　　\\280 ・・・　残り" + chocolaStock + "個");
		System.out.println("ピスターシュ  \\320 ・・・　残り" + pistacheStock + "個");

		System.out.println("\nそれぞれ何個ずつ買いますか？（最大30個まで）\n");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("シトロン >");
		String citronBuyCounterstr = reader.readLine();
		int citronBuyCount = Integer.parseInt(citronBuyCounterstr);

		System.out.print("ショコラ >");
		String chocolaBuyCounterstr = reader.readLine();
		int chocolaBuyCount = Integer.parseInt(chocolaBuyCounterstr);

		System.out.print("ピスターシュ >");
		String pistacheBuyCounterstr = reader.readLine();
		int pistacheBuyCount = Integer.parseInt(pistacheBuyCounterstr);

		System.out.println("\nシトロン" + citronBuyCount + "個");
		System.out.println("ショコラ" + chocolaBuyCount + "個");
		System.out.println("ピスターシュ" + pistacheBuyCount + "個");

		//05
		System.out.println("合計個数" + (citronBuyCount + chocolaBuyCount + pistacheBuyCount) + "個");
		System.out
				.println("合計金額" + ((citronBuyCount * 250) + (chocolaBuyCount * 280) + (pistacheBuyCount) * 320) + "円");
		System.out.println("\nをお買いあげですね。\n承りました。\n");
	}

}
