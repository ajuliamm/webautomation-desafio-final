package cucumber.utils;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;

import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;

public class ClientFake {

    private String name ;
    private String country ;
    private String city ;
    private String creditCart ;
    private Integer month;
    private Integer year;
    private Integer totalUltimaCompra;



    public ClientFake() {

        Faker faker = new Faker();

        FakeValuesService fakeValuesService = new FakeValuesService(
                new Locale("en-GB"), new RandomService());

        //this.email = fakeValuesService.bothify("????##@gmail.com");
        this.name = faker.name().fullName();
        this.country = faker.address().country();
        this.city = faker.address().city();
        this.creditCart = fakeValuesService.regexify("[1-9]{16}");

        /*
        Date startDate = new Date(2024, 0, 1); // 1 de janeiro de 2024
        Date endDate = new Date(2034, 11, 31); // 31 de dezembro de 2034
        Date randomDate = faker.date().between(startDate, endDate);
        this.month = randomDate.getMonth() + 1;
        this.year = randomDate.getYear();

         */

        // Define o intervalo de anos
        int startYear = 2024;
        int endYear = 2034;

        // Gera um ano aleatório entre 2024 e 2034
        int randomYear = ThreadLocalRandom.current().nextInt(startYear, endYear + 1);

        // Gera um mês aleatório de 1 a 12
        this.month = ThreadLocalRandom.current().nextInt(1, 13);

        // Armazena o ano
        this.year = randomYear;


    }

    public String getMonth() {
        return month.toString();
    }

    public String getCreditCart() {
        return creditCart;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year.toString();
    }

    public Integer getTotalUltimaCompra() {
        return totalUltimaCompra;
    }

    public void setTotalUltimaCompra(Integer totalUltimaCompra) {
        this.totalUltimaCompra = totalUltimaCompra;
    }
}
