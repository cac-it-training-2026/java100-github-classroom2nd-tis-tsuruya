/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		int citronStock = 30;//int型の変数citronStockに30を代入
		int chocolaStock = 30;
		int pistacheStock = 30;

		System.out.println("本日のおすすめ商品です。\n");
		System.out.println("シトロン　　　\\250 ・・・　残り" + citronStock + "個");
		System.out.println("ショコラ　　　\\280 ・・・　残り" + chocolaStock + "個");
		System.out.println("ピスターシュ  \\320 ・・・　残り" + pistacheStock + "個");

		System.out.println("\nそれぞれ何個ずつ買いますか？（最大30個まで）\n");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//標準入力のための準備

		System.out.print("シトロン >");
		String citronBuyCounterstr = reader.readLine();//シトロンの購入個数の入力待ち
		int citronBuyCount = Integer.parseInt(citronBuyCounterstr);//入力した文字列を数値に変換

		System.out.print("ショコラ >");
		String chocolaBuyCounterstr = reader.readLine();
		int chocolaBuyCount = Integer.parseInt(chocolaBuyCounterstr);

		System.out.print("ピスターシュ >");
		String pistacheBuyCounterstr = reader.readLine();
		int pistacheBuyCount = Integer.parseInt(pistacheBuyCounterstr);

		System.out.println("\nシトロン" + citronBuyCount + "個");//それぞれの購入個数を表示している
		System.out.println("ショコラ" + chocolaBuyCount + "個");
		System.out.println("ピスターシュ" + pistacheBuyCount + "個");
		System.out.println("\nをお買いあげですね。\n承りました。\n");

		//05
		System.out.println("合計個数" + (citronBuyCount + chocolaBuyCount + pistacheBuyCount) + "個");//加算
		System.out
				.println("合計金額" + ((citronBuyCount * 250) + (chocolaBuyCount * 280) + (pistacheBuyCount) * 320) + "円");
		//06
		System.out.println("本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250 ・・・　残り" + (citronStock - citronBuyCount) + "個");//減算して残りを表示
		System.out.println("ショコラ      \\280 ・・・　残り" + (chocolaStock - chocolaBuyCount) + "個");
		System.out.println("ピスターシュ  \\320 ・・・　残り" + (pistacheStock - pistacheBuyCount) + "個");
	}

}
