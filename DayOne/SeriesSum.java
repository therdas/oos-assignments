public class SeriesSum {
    public static void main(String[] args) {
        if(args.length == 1) {
            int n = 0;
            
            try {
                n = Integer.parseInt(args[0]);
            } catch (Exception e) {
                System.out.println("Invalid number.");
                return;
            }
            double sum = 0.0;
            for(int i = 1; i <= n; ++i){
                sum += 1.0/(double)i;
            }
            System.out.println(String.format("%.2f", sum));
        } else {
            System.out.println("Invalid argument.\nUsage: SeriesSum [n: integer]");
        }
    }
}
