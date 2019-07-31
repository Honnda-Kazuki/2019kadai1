/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itecafe;

import java.util.Scanner;

/**
 *
 * @author kbc19a30
 */
public class ITECafe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Item hotcoffee = new Item(0, "ホットコーヒー", 280);
        Item tea = new Item(1, "紅茶", 260);
        Item icecoffee = new Item(2, "アイスコーヒー", 200);
        Item icetea = new Item(3, "アイスティー", 260);
        Item shortcake = new Item(4, "ショートケーキ", 400);
        Item cheesecake = new Item(5, "チーズケーキ", 400);
        Item chocolatecake = new Item(6, "チョコレートケーキ", 450);
        Item chocolatebananaparfait = new Item(7, "チョコバナナパフェ", 390);
        Item strawberryparfait = new Item(8, "イチゴパフェ", 390);
        Item meatpasta = new Item(9, "ミートパスタ", 650);
        Item mixpizza = new Item(10, "ミックスピザ", 700);

        Item[] items = new Item[20];
        items[0] = hotcoffee;
        items[1] = tea;
        items[2] = icecoffee;
        items[3] = icetea;
        items[4] = shortcake;
        items[5] = cheesecake;
        items[6] = chocolatecake;
        items[7] = chocolatebananaparfait;
        items[8] = strawberryparfait;
        items[9] = meatpasta;
        items[10] = mixpizza;
        Scanner scan = new Scanner(System.in);

        int inputNum = 0;
        int goukei = 0;

        while (true) {
            System.out.println("■■■ITECafeシステム■■■");
            System.out.println(hotcoffee.getNo() + hotcoffee.getName());
            System.out.println(tea.getNo() + tea.getName());
            System.out.println(icecoffee.getNo() + icecoffee.getName());
            System.out.println(icetea.getNo() + icetea.getName());
            System.out.println(shortcake.getNo() + shortcake.getName());
            System.out.println(cheesecake.getNo() + cheesecake.getName());
            System.out.println(chocolatecake.getNo() + chocolatecake.getName());
            System.out.println(chocolatebananaparfait.getNo() + chocolatebananaparfait.getName());
            System.out.println(strawberryparfait.getNo() + strawberryparfait.getName());
            System.out.println(meatpasta.getNo() + meatpasta.getName());
            System.out.println(mixpizza.getNo() + mixpizza.getName());
            System.out.println("商品番号を入力してください");

            try {

                String inputStr;
                inputStr = scan.next();
                inputNum = Integer.parseInt(inputStr);
                System.out.println(inputNum);

                System.out.println(items[inputNum].getNo() + ":" + items[inputNum].getName()
                        + ":" + items[inputNum].getPrice() + "円が入力されました");
                
                goukei += items[inputNum].getPrice();
                
               

                //お会計をするか？
                System.out.println("終了なら 0 / 続ける 1");
                inputStr = scan.next();
                inputNum = Integer.parseInt(inputStr);

                if (inputNum == 0) {

                    System.out.println("代金を入力");
                    System.out.println("合計で"+goukei+"円になります");
                    int price = new java.util.Scanner(System.in).nextInt();
                    System.out.println(price + "円お預かりいたします。");
                    System.out.println(price - goukei  + "円のお返しになります");
                    System.out.println("ありがとうございました");

                    break;
                }

            } catch (NumberFormatException e) {
                System.out.println("【入力エラー：数値を入力してください】");

            }

        }

    }

}
