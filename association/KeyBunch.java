class KeyBunch {
    
    String material;
    Key key;
    
    KeyBunch(String material, Key key) {
        this.material = material;
        this.key = key;
        System.out.println("created KeyBunch with String and Key");
    }
    
    public void display() {
        System.out.println("KeyBunch_material: " + material);
        key.show();
    }
}