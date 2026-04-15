/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題9 新商品の開発
 *
 * 翌日から新商品を発売することにしました。
 * 新商品の名前は「三色マカロン」です。
 * シトロン、ショコラ、ピスターシュの３つの味が
 * 1個のマカロンに集約されているのが特徴で、
 * その配合率は前日の売上比で決まり、
 * 価格はマカロン１個あたりの平均売上価格に準じて
 * 自動的に決定されます。（ただし、1の位は切り捨て）
 *
 * 以下の実行例を参考に処理を追記、改変してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 * 明日の三色マカロンの配合率が決まりました！
 *
 * シトロンの味    ・・・ 50%
 * ショコラの味    ・・・ 17%
 * ピスターシュの味・・・ 32%
 *
 * が楽しめます！
 *
 * 値段は\270です。
 *
 */

package lesson01.challenge09;

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

		//08
		System.out.println("\n閉店時間となりました。\nまたのお越しをお待ちしております。");
		System.out.println("\n売上の割合");
		System.out.println("売上合計\t" + "\\" + totalPrice);
		System.out.println("\n内訳");

		int citronbreakedown = (int) (((citronBuyCount * 250) / totalPrice) * 100);//内訳の変数を作成し、各金額/合計金額を計算　int型に変換
		int chocolabreakedown = (int) (((chocolaBuyCount * 280) / totalPrice) * 100);
		int pistachebreakedown = (int) (((pistacheBuyCount * 320) / totalPrice) * 100);

		System.out.println("シトロン      \\" + (int) (citronBuyCount * 250) + "・・・　" + citronbreakedown + "%");
		System.out.println("ショコラ      \\" + (int) (chocolaBuyCount * 280) + "・・・　" + chocolabreakedown + "%");
		System.out.println("ピスターシュ  \\" + (int) (pistacheBuyCount * 320) + "・・・　" + pistachebreakedown + "%");

		//09
		System.out.println("\n明日の三色マカロンの配合率が決まりました！\n");
		System.out.println("シトロン      ・・・　" + citronbreakedown + "%");
		System.out.println("ショコラ      ・・・　" + chocolabreakedown + "%");
		System.out.println("ピスターシュ  ・・・　" + pistachebreakedown + "%");

		System.out.println("\nが楽しめます！\n");

		int AveragePrice = (int) (totalPrice / totalBuyCount);//int型の変数AveragePriceに合計金額÷合計個数

		System.out.println("値段は\\" + ((AveragePrice / 10) * 10) + "です");//10で割ってから10掛けて１の位切り捨て

	}

}
