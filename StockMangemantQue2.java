package que1;

import java.util.Scanner;

public class StockMangemant {//all stock prosses on by one
    String stockName;
    int numberOfShare;
    int ShrePrice;

    //constructor
    public StockMangemant(String stockName, int numberOfShare, int shrePrice) {
        this.stockName = stockName;
        this.numberOfShare = numberOfShare;
        ShrePrice = shrePrice;
    }

    //value of stock calculate method
    void calculationOfStock() {
        String ShareName = stockName;
        int totalValueOfStock = numberOfShare * ShrePrice;
        int totalStock = numberOfShare;
        int sharePrice = ShrePrice;
        System.out.println("total value of the stock is :" + totalValueOfStock + "\t " +
                "stockName:" + " " + ShareName + "\t " + "numberOfShare:" + totalStock + " \t" + "ShrePrice:" + ShrePrice);
    }

    //main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.See portfolio press OR 2.Portfolio");
        int hint = scanner.nextInt();

        //using switch case to choice
        switch (hint) {
            case (1):
                System.out.println("1.Adani 2.MRF 3.ITC");//to see one by one stock history
                int hint2 = scanner.nextInt();
                if (hint2 == 1) {
                    StockMangemant stockMangemant = new StockMangemant("addani", 12, 12);
                    stockMangemant.calculationOfStock();

                } else if (hint2 == 2) {
                    StockMangemant stockMangemant = new StockMangemant("MRF", 40, 72000);
                    stockMangemant.calculationOfStock();

                } else {
                    StockMangemant stockMangemant = new StockMangemant("ITC", 120, 420);
                    stockMangemant.calculationOfStock();

                }
                break;

            case (2):
                PortFolio portFolio = new PortFolio();
                portFolio.portFolio();
                break;
        }

        // stockMangemant.portFolio();
    }
}

class PortFolio {
    String stockName;
    int numberOfShare;
    int ShrePrice;

    void portFolio() {

        stockName = "adani";
        numberOfShare = 20;
        ShrePrice = 1108;
        System.out.println("total value of the stock is :" + (numberOfShare * ShrePrice) + "\t " +
                "stockName:" + " " + stockName + "\t " + "numberOfShare:" + numberOfShare + " \t" + "ShrePrice:" + ShrePrice);

        stockName = "MRF";
        numberOfShare = 40;
        ShrePrice = 72000;
        System.out.println("total value of the stock is :" + (numberOfShare * ShrePrice) + "\t " +
                "stockName:" + " " + stockName + "\t " + "numberOfShare:" + numberOfShare + " \t" + "ShrePrice:" + ShrePrice);

        stockName = "ITC";
        numberOfShare = 120;
        ShrePrice = 420;
        System.out.println("total value of the stock is :" + (numberOfShare * ShrePrice) + "\t " +
                "stockName:" + " " + stockName + "\t " + "numberOfShare:" + numberOfShare + " \t" + "ShrePrice:" + ShrePrice);}
}