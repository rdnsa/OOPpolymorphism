class hewan {
    public void berbunyi() {
        System.out.println("hewan ini bersuara :");
    }
}

class Cat extends hewan {
    public void berbunyi() {
        System.out.println("kucing berbunyi Meong meong");
    }
}

class Dog extends hewan {
    public void berbunyi() {
        System.out.println("anjing berbunyi guk guk guk");
    }
}

class Main {
    public static void main(String[] args) {
        hewan binatang = new hewan();
        hewan KUCING = new Cat();
        hewan ANJING = new Dog();
        binatang.berbunyi();
        KUCING.berbunyi();
        ANJING.berbunyi();
    }
}

