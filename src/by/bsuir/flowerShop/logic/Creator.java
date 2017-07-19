package by.bsuir.flowerShop.logic;


import by.bsuir.flowerShop.entity.*;

public class Creator {
    public static Bucket createBucket1(){
        Bucket bucket = new Bucket();
        bucket.addAcessory(new Acessory("Ленточка", 0.7));
        bucket.addFlower( new FieldFlower("Ромашка", "Белая", "Поле", 200, 2, 5));
        bucket.addFlower(new GardenFlower("Роза", "Красная", "Ботанический Сад", 300, 1, 8.5));
        return bucket;
    }

    public static Bucket createBucket2(){
        Bucket bucket = new Bucket();
        AbstractFlower flower;
        Acessory acessory;
        acessory = new Acessory("Обертка", 0.7);
        bucket.addAcessory(acessory);

        return bucket;
    }
}
