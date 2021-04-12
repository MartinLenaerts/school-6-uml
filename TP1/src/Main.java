import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        Company company = new Company(1);
        Individual individual = new Individual(1);


        Details billing = new Details("billing street","billing city","00000","billing country");
        Details shipping = new Details("shipping street","shipping city","00000","shipping country");
        Contact contact  = new Contact("Steve","Jobs","Steve","steve.jobs@apple.com");
        Company apple = new Company(1,"Apple Inc","Apple","0202020202","0202020202",billing,shipping,contact);



        Feature feature1 = new Feature(1,"feature1","feature1 description");
        Feature feature2 = new Feature(1,"feature2","feature2 description");
        Feature feature3 = new Feature(1,"feature3","feature3 description");

        ArrayList<Feature> features = new ArrayList<Feature>();
        features.add(feature1);
        features.add(feature2);
        features.add(feature3);

        Product phone = new Product(1,"phone",LockingType.HL,Rehost.Leave_as_it_is,"phone",new Product(),features);
        Product product1 = new Product(1,"iphone 27",LockingType.HL,Rehost.Enable,"iphone du futur",phone,features);
        Product product2 = new Product(1,"iphone 2756",LockingType.HL,Rehost.Enable,"iphone du futur ++",phone,features);


        HashSet<Product> products = new HashSet<>();
        products.add(product1);
        products.add(product2);

        Entitlement entitlement = new Entitlement("1",EntitlementType.type1,new Date(),new Date(),"comment" , apple , products);

    }
}
