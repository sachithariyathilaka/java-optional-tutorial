package io.github.sachithariyathilaka;

import java.util.Optional;

/**
 * Main class for the tutorial.
 *
 * @author  Sachith Ariyathilaka
 * @version 1.0.0
 * @since   2024/04/23
 */
public class JavaOptionalTutorial {

    public static void main(String[] args) {
        JavaOptionalTutorial javaOptionalTutorial = new JavaOptionalTutorial();
        String brand = "Toyota";

        // Without optional class
        javaOptionalTutorial.withoutOptional(brand);
        javaOptionalTutorial.withoutOptional(null);

        // Of nullable static method
        javaOptionalTutorial.ofNullable(brand);
        javaOptionalTutorial.ofNullable(null);

        // Of static method
        javaOptionalTutorial.of(brand);
        javaOptionalTutorial.of(null);

        // Empty static method
        javaOptionalTutorial.empty();

        // Is present method
        javaOptionalTutorial.isPresent(brand);
        javaOptionalTutorial.isPresent(null);

        // If present method
        javaOptionalTutorial.ifPresent(brand);
        javaOptionalTutorial.ifPresent(null);

        // Get method
        javaOptionalTutorial.get(brand);
        javaOptionalTutorial.get(null);

        // Or else method
        javaOptionalTutorial.orElse(brand);
        javaOptionalTutorial.orElse(null);

        // Or else get method
        javaOptionalTutorial.orElseGet(brand);
        javaOptionalTutorial.orElseGet(null);

        // Filter method
        javaOptionalTutorial.filter(brand);
        javaOptionalTutorial.filter(null);

        // Equals method
        javaOptionalTutorial.equals(brand);
        javaOptionalTutorial.equals(null);
    }

    /**
     * Java method for test null point exception without optional class.
     *
     * @param   brand the brand
     */
    private void withoutOptional(String brand) {
        print(brand.toUpperCase());
    }

    /**
     * Java method for test the ofNullable method.
     *
     * @param   brand the brand
     */
    private void ofNullable(String brand) {
        Optional<String> optionalBrand = Optional.ofNullable(brand);
        if (optionalBrand.isPresent())
            print(optionalBrand.get().toUpperCase());
        else
            print(null);
    }

    /**
     * Java method for test the of method.
     *
     * @param   brand the brand
     */
    private void of(String brand) {
        Optional<String> optionalBrand = Optional.of(brand);
        print(optionalBrand.get().toUpperCase());
    }

    /**
     * Java method for test the empty method.
     */
    private void empty() {
        Optional<String> optionalBrand = Optional.empty();
        print(String.valueOf(optionalBrand.isPresent()));
    }

    /**
     * Java method for test the isPresent method.
     *
     * @param   brand the brand
     */
    private void isPresent(String brand) {
        Optional<String> optionalBrand = Optional.ofNullable(brand);
        print(String.valueOf(optionalBrand.isPresent()));
    }

    /**
     * Java method for test the ifPresent method.
     *
     * @param   brand the brand
     */
    private void ifPresent(String brand) {
        Optional<String> optionalBrand = Optional.ofNullable(brand);
        optionalBrand.ifPresent(this::print);
    }

    /**
     * Java method for test the get method.
     *
     * @param   brand the brand
     */
    private void get(String brand) {
        Optional<String> optionalBrand = Optional.ofNullable(brand);
        if (optionalBrand.isPresent())
            print(optionalBrand.get().toUpperCase());
        else
            print(null);
    }

    /**
     * Java method for test the orElse method.
     *
     * @param   brand the brand
     */
    private void orElse(String brand) {
        Optional<String> optionalBrand = Optional.ofNullable(brand);
        print(optionalBrand.orElse("No Brand"));
    }

    /**
     * Java method for test the orElseGet method.
     *
     * @param   brand the brand
     */
    private void orElseGet(String brand) {
        Optional<String> optionalBrand = Optional.ofNullable(brand);
        print(optionalBrand.orElseGet(() -> {
            StringBuilder instance = new StringBuilder();
            for (int i=0; i<10; i++)
                instance.append(i);

            return instance.toString();
        }));
    }

    /**
     * Java method for test the filter method.
     *
     * @param   brand the brand
     */
    private void filter(String brand) {
        Optional<String> optionalBrand = Optional.ofNullable(brand);
        print(optionalBrand.filter(instance -> instance.length() > 3).orElse("No Brand"));
    }

    /**
     * Java method for test the equals method.
     *
     * @param   brand the brand
     */
    private void equals(String brand) {
        Optional<String> optionalBrand = Optional.ofNullable(brand);
        print(String.valueOf(optionalBrand.equals(Optional.empty())));
    }

    /**
     * Print the brand.
     *
     * @param   brand the brand
     */
    private void print(String brand) {
        System.out.println("Vehicle brand is: " + brand);
    }
}
