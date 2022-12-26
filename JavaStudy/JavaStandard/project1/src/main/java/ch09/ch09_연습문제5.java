package ch09;

public class ch09_연습문제5 {
    public static String delChar(String src, String delCh) {
        StringBuffer sb = new StringBuffer(src);

        for(int i = 0; i < delCh.length(); i++) {
            int index = 0;

            while(index < src.length()) {
                char delc = delCh.charAt(i);
                int delIndex = src.indexOf(delc, index);

                if(delIndex != -1) {
                    sb.deleteCharAt(delIndex);
                    src = sb.toString();
                }

                else {
                    break;
                }

                index = delIndex;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("(1!2@3^4~5)" + " -> " + delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
        System.out.println("(1 2 3 4\t5)" + " -> " + delChar("(1 2 3 4\t5)", " \t"));
    }
}
