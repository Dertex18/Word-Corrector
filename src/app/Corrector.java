package app;

public class Corrector {

    public String handleData(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
            if (str != null && str.contains("b")) {
                str = str.replace("b", "o");
            }

            stringBuilder.append(count++)
                    .append(") ")
                    .append(str);

            if (i < strs.length - 1) {
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }
}
