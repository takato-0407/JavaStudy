public class Task1_2 {

    public static void main(String[] args) {
        // ①「JAPAN」、「AMERICA」、「KOREA」を要素の値（初期値）とする配列 countryを作成しなさい。
        String[] country = new String[3];

        country[0] = "JAPAN"; // 1番目（先頭）の要素に 3 を代入 
        country[1] = "AMERICA"; // 2番目の要素に 1 を代入 
        country[2] = "KOREA"; 
        // ② ①で作成した配列の要素数を出力してください。
        System.out.println(country.length);
        // ③下記の値を保持した、要素数3のStringクラスの配列strArrayを作成しなさい。

        String[] strArray = new String[3];

        strArray[0] = "りんご"; // 1番目（先頭）の要素に 3 を代入 
        strArray[1] = "もも"; // 2番目の要素に 1 を代入 
        strArray[2] = "ぶどう"; 

        // ④ ③で作成した配列の2番目の要素を出力しなさい。
        System.out.println(strArray[2]);
        /* ⑤下記の処理について、何をしているのかコメントを記入してください。
         *  [ここへ記述]
         "int型で、intArrayに5つの数字を代入している"
         */
        int[] intArray = { 10, 20, 30, 40, 50 };

        // ⑥下記の処理について、何をしているのかコメントを記入してください。
        //出力する際に、intArraの[1]である20とintArray[4]である50を足算して出力しようとしている
        // [ここへ記述]
        System.out.println(intArray[1] + intArray[4]);
      }
}