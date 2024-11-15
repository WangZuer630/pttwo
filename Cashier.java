/**
 * Correct output of the program is:
 * 
Item : Banana Price : 1.5 Quantity : 2
Item : Orange Price : 3.5 Quantity : 1
Item : Banana Price : 1.5 Quantity : 5
No such item!
Item : Apple Price : 2.5 Quantity : 0
Total Price : 11.0
 *
 */

public class Cashier {
    private String[] item;
    private double[] price;
    private int[] quantity;
    public static void main(String[] args) {
        Cashier c = new Cashier();
        c.addItem("Apple", 2.5, 3);
        c.addItem("Banana", 1.5, 2);
        System.out.println("Item : " + c.getItem(1) + " Price : " + c.getPrice(1) + " Quantity : " + c.getQuantity(1));
        // Item : Banana Price : 1.5 Quantity : 2
        c.addItem("Orange", 3.5, 1);
        System.out.println("Item : " + c.getItem(2) + " Price : " + c.getPrice(2) + " Quantity : " + c.getQuantity(2));
        // Item : Orange Price : 3.5 Quantity : 1
        c.adjustQuantity(1, 5); //this is to change the quantity of the item at index 1 to 5
        System.out.println("Item : " + c.getItem(1) + " Price : " + c.getPrice(1) + " Quantity : " + c.getQuantity(1));
        // Item : Banana Price : 1.5 Quantity : 5

        try {
            c.getItem(3); //this will throw an exception as there is no item at index 3
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage()); 
            // No such item!
        }


        c.adjustQuantity(3, 0); //this will do nothing as there is no item at index 3
        c.adjustQuantity(2, -1); //this will do nothing as the quantity cannot be negative
        c.adjustQuantity(0, 0); 
        System.out.println("Item : " + c.getItem(0) + " Price : " + c.getPrice(0) + " Quantity : " + c.getQuantity(0));
        // Item : Apple Price : 2.5 Quantity : 0
        System.out.println("Total Price : " + c.getTotalPrice());
        // Total Price : 7.5
    }

    /**
     * According to the main method shown above, finish the implementation of the class Cashier.
     */
    public Cashier() {
        item = new String[0];
        price = new double[0];
        quantity = new int[0];
    }

    public void addItem(String item, double price, int quantity) {
        String[] tempItem = new String[this.item.length + 1];
        double[] tempPrice = new double[this.price.length + 1];
        int[] tempQuantity = new int[this.quantity.length + 1];
        for (int i = 0; i < this.item.length; i++) {
            tempItem[i] = this.item[i];
            tempPrice[i] = this.price[i];
            tempQuantity[i] = this.quantity[i];
        }
        tempItem[this.item.length] = item;
        tempPrice[this.price.length] = price;
        tempQuantity[this.quantity.length] = quantity;
        this.item = tempItem;
        this.price = tempPrice;
        this.quantity = tempQuantity;
    }

    public void adjustQuantity(int index, int quantity) {
        if (index < 0 || index >= this.quantity.length || quantity < 0) {
            return;
        }
        this.quantity[index] = quantity;
    }

    public String getItem(int index) {
        if (index < 0 || index >= item.length) {
            throw new ArrayIndexOutOfBoundsException("No such item!");
        }
        return item[index];
    }

    public double getPrice(int index) {
        if (index < 0 || index >= price.length) {
            throw new ArrayIndexOutOfBoundsException("No such item!");
        }
        return price[index];
    }

    public int getQuantity(int index) {
        if (index < 0 || index >= quantity.length) {
            throw new ArrayIndexOutOfBoundsException("No such item!");
        }
        return quantity[index];
    }

    public double getTotalPrice() {
        double total = 0;
        for (int i = 0; i < item.length; i++) {
            total += price[i] * quantity[i];
        }
        return total;
    }
}
