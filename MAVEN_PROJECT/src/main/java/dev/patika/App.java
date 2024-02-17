package dev.patika;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class App {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("market");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();
        /*
        Supplier supplier = new Supplier();
        supplier.setAddress("Adres");
        supplier.setCompany("Patika");
        supplier.setContact("5555");
        supplier.setMail("info@patika.dev");
        supplier.setPerson("Mustafa");
        entityManager.persist(supplier);

        Category category = new Category();
        category.setName("Telefonlar");
        entityManager.persist(category);

        Code code = new Code();
        code.setGroup("1112233");
        code.setSerial("44456");
        entityManager.persist(code);

        Product product = new Product();
        product.setName("Iphone 15 pro");
        product.setPrice(1234);
        product.setStock(100);
        product.setCode(code);
        product.setSupplier(supplier);
        product.setCategory(category);
        entityManager.persist(product);*/

        /*Code code = new Code();
        code.setGroup("1112233");
        code.setSerial("44456");
        entityManager.persist(code);

        Product product = new Product();
        product.setName("SAMSUNG");
        product.setPrice(1234);
        product.setStock(100);
        product.setCode(code);
        product.setSupplier(supplier);
        entityManager.persist(product);*/


        /*Product product = entityManager.find(Product.class,1);
        System.out.println(product.toString());*/
        /*Code code = entityManager.find(Code.class,2);
        System.out.println(code.getProduct().getName());*/


        /*Color blue = new Color("Blue");
        Color red = new Color("Red");
        Color yellow = new Color("Yellow");
        entityManager.persist(blue);
        entityManager.persist(red);
        entityManager.persist(yellow);


        List<Color> colorList = new ArrayList<>();
        colorList.add(blue);
        colorList.add(red);
        product.setColorList(colorList);

        entityManager.persist(product);
         */
       /* Product product = entityManager.find(Product.class, 1);
        System.out.println(product.getColorList().toString());*/

        Color color = entityManager.find(Color.class, 1);
        System.out.println(color.getProductList().toString());

        transaction.commit();

    }
}