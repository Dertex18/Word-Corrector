package app;

public class Corrector {

    public String handleData(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        for (String str : strs) {
            if ( str != null && str.contains("b")) {
                str = str.replace("b", "o").replace("B", "O");
            }

            stringBuilder.append(count++)
                    .append(") ")
                    .append(str)
                    .append("\n");
        }
        return stringBuilder.toString();
    }
}
