package practice_4.task_2;

public class Tester {
    public static void main(String[] args) {
        TShirt tShirt = new TShirt(ClothingSize.XXS, 29.99, "Red");
        Pants pants = new Pants(ClothingSize.M, 59.99, "Blue");
        Pants pants_fo_w = new Pants(ClothingSize.S, 39.99, "Black");
        // Skirt skirt = new Skirt(ClothingSize.S, 39.99, "Black");
        Tie tie = new Tie(ClothingSize.L, 19.99, "Gray");

        Atelier atelier = new Atelier();
        atelier.dressWomen(new WomenClothing[]{tShirt, pants_fo_w});
        System.out.println();
        atelier.dressMan(new MenClothing[]{tShirt, pants, tie});
    }
}
