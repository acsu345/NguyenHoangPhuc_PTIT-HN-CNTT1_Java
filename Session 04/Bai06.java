import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai06 {
    public static void main(String[] args) {

        String review = "Cuon sach nay rat te, noi dung that la ngu ngoc va khong dang doc.";

        String[] blacklist = {"te", "ngu ngoc", "khong dang doc"};

        for (String badWord : blacklist) {
            String regex = "(?i)\\b" + badWord + "\\b";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(review);

            while (matcher.find()) {
                int len = matcher.group().length();
                String stars = "";
                for (int i = 0; i < len; i++) {
                    stars += "*";
                }
                review = review.replaceAll(regex, stars);
            }
        }

        if (review.length() > 200) {
            int cutIndex = review.lastIndexOf(" ", 200);
            if (cutIndex == -1) {
                cutIndex = 200;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(review.substring(0, cutIndex));
            sb.append("...");
            review = sb.toString();
        }

        System.out.println("Review sau khi xu ly: " + review);
    }
}
