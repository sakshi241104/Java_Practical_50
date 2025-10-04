public class HtmlListBuilder {
    public static void main(String[] args) {
        String[] items = { "Apples", "Bananas", "Oranges" };

        StringBuilder sb = new StringBuilder();
        sb.append("<ul>");

        for (String item : items) {
            sb.append("<li>");
            sb.append(item);
            sb.append("</li>");
        }

        sb.append("</ul>");

        String htmlList = sb.toString();
        System.out.println(htmlList);
    }
}
