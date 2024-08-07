class Key {
    
    int weight;
    String brand;
    
    Key(int weight, String brand) {
        this.weight = weight;
        this.brand = brand;
        System.out.println("created Key with int and String");
    }
    
    void show() {
        System.out.println("Key_weight: " + weight);
        System.out.println("Key_brand: " + brand);
    }
}

