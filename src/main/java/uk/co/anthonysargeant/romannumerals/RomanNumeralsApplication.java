package uk.co.anthonysargeant.romannumerals;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import uk.co.anthonysargeant.romannumerals.generator.RomanNumeralGenerator;

import static java.lang.String.format;

@SpringBootApplication
public class RomanNumeralsApplication implements CommandLineRunner {

    private final RomanNumeralGenerator romanNumeralGenerator;

    @Autowired
    public RomanNumeralsApplication(RomanNumeralGenerator romanNumeralGenerator) {
        this.romanNumeralGenerator = romanNumeralGenerator;
    }

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(RomanNumeralsApplication.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);
    }

    @Override
    public void run(String... strings) throws Exception {
        try {
            if (strings.length == 1) {
                int number = Integer.parseInt(strings[0]);
                System.out.println(format("%d => %s", number, romanNumeralGenerator.generate(number)));
            } else {
                System.out.println("The Roman Numerals Generator can only convert a single number!");
            }
        } catch (NumberFormatException e) {
            System.out.println("The Roman Numerals Generator can only convert numbers (integers)!");
        } catch (IllegalArgumentException e) {
            System.out.println(ExceptionUtils.getMessage(e));
        }
    }
}
