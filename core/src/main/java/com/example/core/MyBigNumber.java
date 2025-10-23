package com.example.core;

public class MyBigNumber {
    private static StringBuilder logs;

    public static String sum(String str1, String str2) {
        logs = new StringBuilder();

        if (str1 == null || str1.isEmpty()) str1 = "0";
        if (str2 == null || str2.isEmpty()) str2 = "0";

        while(str1.length() < str2.length()) {
            str1 = "0" + str1;
        }
        while(str2.length() < str1.length()) {
            str2 = "0" + str2;
        }

        String result = "";
        int remember = 0;
        for(int i = str1.length() - 1; i >= 0; i--) {
            int n1 = str1.charAt(i) - '0';
            int n2 = str2.charAt(i) - '0';
            int total = n1 + n2 + remember;
            int number = total % 10;
            remember = total / 10;

            logs.append("Cộng ").append(n1).append(" + ").append(n2);
            if (total >= 10) logs.append(" (nhớ 1)");
            logs.append(" = ").append(total).append(" => ghi ").append(number).append("<br>");

            result = number + result;
        }
        if (remember > 0) {
            result = remember + result;
            logs.append("Cuối cùng còn nhớ ").append(remember)
                    .append(", ghi thêm ").append(remember).append(" ở đầu<br>");
        }
        return result;
    }

    public static String getLogs() {
        return logs.toString();
    }
}
