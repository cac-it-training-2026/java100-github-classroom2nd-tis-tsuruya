package lesson02.challenge07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Detective {

	public static void main(String[] args) throws IOException {

		System.out.println("探偵：");
		System.out.println("ではここで犯人の身体的な特徴についておさらいしてみましょう。");
		System.out.println("あなたが思う犯人の身長を適当に入力してみてください。\n");
		System.out.print("ここに入力＞");

		//ここに入力処理を入れる
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();

		int height = Integer.parseInt(str);//入力した文字列（身長）を数値に変換

		//ここにif～else文を入れる
		if (height > 185) {
			System.out.println("\n探偵：");
			System.out.println("その身長だと犯行が可能ですね。");
		} else {
			System.out.println("\n探偵：");
			System.out.println("その身長だと犯行は無理ですね。");
		}

	}

}