// Assignment 3
// Interface Sellable
interface Sellable {
    void displayItemDetails();
    double getPrice();
}

// Abstract base class Product
abstract class Product {
    private String name;
    private String category;

    public Product(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    // Subclasses must implement how discount is calculated
    public abstract double calculateDiscount();

    @Override
    public String toString() {
        return "Product[name=" + name + ", category=" + category + "]";
    }
}

// Electronic item
class ElectronicItem extends Product implements Sellable {
    private double basePrice;    // original price
    private double warrantyYears; // example extra field

    public ElectronicItem(String name, String category, double basePrice, double warrantyYears) {
        super(name, category);
        this.basePrice = basePrice;
        this.warrantyYears = warrantyYears;
    }

    @Override
    public double calculateDiscount() {
        // Example logic:
        // If warranty > 2 years, discount 5%. Otherwise discount 2%.
        if (warrantyYears > 2) {
            return basePrice * 0.05;
        } else {
            return basePrice * 0.02;
        }
    }

    @Override
    public void displayItemDetails() {
        System.out.println("Electronic Item: " + getName());
        System.out.println("Category: " + getCategory());
        System.out.println("Base price: ₹" + basePrice);
        System.out.println("Warranty: " + warrantyYears + " years");
        System.out.println("Discount: ₹" + String.format("%.2f", calculateDiscount()));
        System.out.println("Final Price: ₹" + String.format("%.2f", getPrice()));
    }

    @Override
    public double getPrice() {
        return basePrice - calculateDiscount();
    }
}

// Clothing item
class ClothingItem extends Product implements Sellable {
    private double basePrice;
    private String size;
    private String brand;

    public ClothingItem(String name, String category, double basePrice, String size, String brand) {
        super(name, category);
        this.basePrice = basePrice;
        this.size = size;
        this.brand = brand;
    }

    @Override
    public double calculateDiscount() {
        // Example logic:
        // If brand is “PremiumBrand”, discount 10%, else discount 5%
        if ("PremiumBrand".equalsIgnoreCase(brand)) {
            return basePrice * 0.10;
        } else {
            return basePrice * 0.05;
        }
    }

    @Override
    public void displayItemDetails() {
        System.out.println("Clothing Item: " + getName());
        System.out.println("Category: " + getCategory());
        System.out.println("Brand: " + brand);
        System.out.println("Size: " + size);
        System.out.println("Base price: ₹" + basePrice);
        System.out.println("Discount: ₹" + String.format("%.2f", calculateDiscount()));
        System.out.println("Final Price: ₹" + String.format("%.2f", getPrice()));
    }

    @Override
    public double getPrice() {
        return basePrice - calculateDiscount();
    }
}

// Demo / Test
public class OnlineMarketing {
    public static void main(String[] args) {
        Sellable e1 = new ElectronicItem("Smartphone X", "Electronics", 50000, 3);
        Sellable e2 = new ElectronicItem("Bluetooth Speaker", "Audio", 5000, 1);
        Sellable c1 = new ClothingItem("T-Shirt", "Apparel", 1000, "M", "RegularBrand");
        Sellable c2 = new ClothingItem("Jacket", "Apparel", 5000, "L", "PremiumBrand");

        Sellable[] items = { e1, e2, c1, c2 };

        for (Sellable item : items) {
            item.displayItemDetails();
            System.out.println("-------------------------------");
        }
    }
}
