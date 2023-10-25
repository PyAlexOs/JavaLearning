package practice_4.task_2;

class Atelier {
    public void dressWomen(WomenClothing[] clothes) {
        System.out.println("Clothes for women:");
        for (WomenClothing clothing : clothes) {
            clothing.dressWomen();
        }
    }

    public void dressMan(MenClothing[] clothes) {
        System.out.println("Clothes for men:");
        for (MenClothing clothing : clothes) {
            clothing.dressMan();
        }
    }
}
