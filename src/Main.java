public class Main {
    public static void main(String[] args) {

      //String productName = " lavadora   ";
      //String date ="24/09/2023";
      String productFormatter = productFormatter("  zapatillas de deporte  ", "24/09/2023");

      System.out.println(productFormatter);
    }

    private static String productFormatter(String productName, String date) {
        productName = productName.trim();
        productName = productName.toUpperCase();
        productName = productName.replace(" ", "_");
        productName = productName.concat(" " + date);

        //return productName.concat(date).toUpperCase().trim().replace(" ", "_");
        return productName;
    }
}