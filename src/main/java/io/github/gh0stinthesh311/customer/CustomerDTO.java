package io.github.gh0stinthesh311.customer;

public class CustomerDTO {

    private String name;

    public CustomerDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
