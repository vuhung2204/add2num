package com.example.core;

public class MyBigNumber {
    private static StringBuilder logs;

    public static String sum(String stn1, String stn2) {
        logs = new StringBuilder();

        if (stn1 == null || stn1.isEmpty()) stn1 = "0";
        if (stn2 == null || stn2.isEmpty()) stn2 = "0";

        char[] a = stn1.toCharArray();
        char[] b = stn2.toCharArray();
        int i = a.length - 1;
        int j = b.length - 1;
        int carry = 0;
        int count = 1;
        StringBuilder result = new StringBuilder(Math.max(a.length, b.length) + 1);

        while (i >= 0 || j >= 0 || carry > 0) {
            int n1 = (i >= 0) ? a[i--] - '0' : 0;
            int n2 = (j >= 0) ? b[j--] - '0' : 0;
            int carryBefore = carry;
            int total = n1 + n2 + carryBefore;
            int digit = total % 10;
            int newCarry = total / 10;

            result.append((char) (digit + '0'));

            logs.append("Bước ")
                    .append(count)
                    .append(": ")
                    .append((i + 1 >= 0 ? n1 : "0"))
                    .append(" + ")
                    .append((j + 1 >= 0 ? n2 : "0"));
            if (carryBefore > 0) {
                logs.append(" + nhớ ").append(carryBefore);
            }
            logs.append(" = ").append(total)
                    .append(" => ghi ").append(digit);
            if (newCarry > 0) {
                logs.append(" (nhớ ").append(newCarry).append(")");
            }
            logs.append("<br>");

            carry = newCarry;
            count++;
        }

        result.reverse();
        int index = 0;
        while (index < result.length() - 1 && result.charAt(index) == '0') {
            index++;
        }
        if (index > 0) result.delete(0, index);

        logs.append("Kết quả cuối cùng: ").append(result).append("<br>");
        return result.toString();
    }

    public static String getLogs() {
        return logs.toString();
    }
}
