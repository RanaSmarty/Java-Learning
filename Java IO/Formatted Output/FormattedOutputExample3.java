public class FormattedOutputExample3 {
    public static void main(String[] args) {
        
        double pi = Math.PI;

        String result = String.format("Value of π up to 4 decimals: %.4f", pi);
        System.out.println(result);

        return; 
    }
}
