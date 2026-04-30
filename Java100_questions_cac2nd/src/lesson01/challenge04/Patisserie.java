/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題4 注文を受ける
 *
 * 3種類のマカロンを任意の個数購入できるようにします。
 * [問題3]までの表示を行った後で
 * 実行例を参考に処理を追記してください。
 * （ >8 は >を表示した後で入力待ち状態になり、
 *   ユーザーがキーボードから8を入力したイメージです。）
 *
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
 * をお買いあげですね。
 * 承りました。
 */

package lesson01.challenge04;

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
		System.out.println("\nをお買いあげですね。\n承りました。");
	}

}
