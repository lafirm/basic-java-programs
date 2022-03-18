/*  Accessor & Mutator Example - (w/o getter & setter)
"Accessor" and "Mutator" are just fancy names fot a getter and a setter. A getter, "Accessor", returns a class's variable or its value.
A setter, "Mutator", sets a class variable pointer or its value.
It helps us to access and modify the class variables w/o instantiating an object*/

import java.util.Scanner;

public class Product {
    String id, name;
    float qty, price, tax;
    void addProducts() {
    }

    float productValue() {
        float productValue = price * qty;
        return productValue;
    }

    float salesTaxValue() {
        float salesTaxValue = price * qty * 0.07f;
        return salesTaxValue;
    }

    public static void main(String[] args) {
        Product obj = new Product();
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Enter the Product ID: ");
        obj.id = keyboardInput.next();
        System.out.println("Enter the Product Name: ");
        obj.name = keyboardInput.next();
        System.out.println("Enter the Product Quantity: ");
        obj.qty = keyboardInput.nextFloat();
        System.out.println("Enter the Product Price: ");
        obj.price = keyboardInput.nextFloat();

        keyboardInput.close();

        System.out.println("ID" + "\t" + "Name" + "\t" + "Qty" + "\t" + "Price" + "\t" + "Product Value" + "\t"
                + "Sales Tax Value");
        System.out.println(obj.id + "\t" + obj.name + "\t" + obj.qty + "\t" + obj.price + "\t" + obj.productValue()
                + "\t" + "\t" + obj.salesTaxValue());
    }

}
