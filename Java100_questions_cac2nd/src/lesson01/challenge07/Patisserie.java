/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題7 10分割して販売する
 *
 * マカロンが大きすぎて売上が芳しくないので
 * 1個のマカロンを10分割して0.1個から販売することにします。
 * (値段も0.1倍～)
 * ただし合計金額と在庫は小数を切り捨て、
 * 常に整数で表示します。
 *
 * 問題6の答えを改変し、以下の実行例を参考に処理を記述してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >5
 * ショコラ      >1.5
 * ピスターシュ  >2.5
 *
 * シトロン     5.0個
 * ショコラ     1.5個
 * ピスターシュ 2.5個
 *
 * 合計個数    9.0個
 * 合計金額   2470円
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 */

package lesson01.challenge07;

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

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//標準入力のための準備

		System.out.println("\nそれぞれ何個ずつ買いますか？（最大30個まで）\n");

		System.out.print("シトロン >");
		String citronBuyCounterstr = reader.readLine();//シトロンの購入個数の入力待ち
		double citronBuyCount = Double.parseDouble(citronBuyCounterstr);//入力した文字列を数値に変換。Doubleの場合

		System.out.print("ショコラ >");
		String chocolaBuyCounterstr = reader.readLine();
		double chocolaBuyCount = Double.parseDouble(chocolaBuyCounterstr);

		System.out.print("ピスターシュ >");
		String pistacheBuyCounterstr = reader.readLine();
		double pistacheBuyCount = Double.parseDouble(pistacheBuyCounterstr);

		System.out.println("\nシトロン" + citronBuyCount + "個");//それぞれの購入個数を表示している
		System.out.println("ショコラ" + chocolaBuyCount + "個");
		System.out.println("ピスターシュ" + pistacheBuyCount + "個");

		//		07
		double totalBuyCount = citronBuyCount + chocolaBuyCount + pistacheBuyCount;//double(少数)型の変数totalBuyCountに購入個数の合計を代入
		int totalPrice = (int) (citronBuyCount * 250 + chocolaBuyCount * 280 + pistacheBuyCount * 320);
		//int型の変数totalPriceにdouble型の変数○○BuyCount*値段をint型に変換（キャスト）したものを代入している

		//05
		System.out.println("\n合計個数" + totalBuyCount + "個");//加算
		System.out.println("合計金額" + totalPrice + "円");

		System.out.println("\nをお買いあげですね。\n承りました。\n");
		//06 07
		citronStock = (int) (citronStock - citronBuyCount);//右辺は差が少数になるためint型に変換し整数で表現するようにしている
		chocolaStock = (int) (chocolaStock - chocolaBuyCount);
		pistacheStock = (int) (pistacheStock - pistacheBuyCount);

		System.out.println("本日のおすすめ商品です。\n");
		System.out.println("シトロン      \\250 ・・・　残り" + citronStock + "個");//減算して残りを表示
		System.out.println("ショコラ      \\280 ・・・　残り" + chocolaStock + "個");
		System.out.println("ピスターシュ  \\320 ・・・　残り" + pistacheStock + "個");
	}

}
