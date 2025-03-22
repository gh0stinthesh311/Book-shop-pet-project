package io.github.gh0stinthesh311.author;

public class AuthorDTO {
    private String name;

    public AuthorDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

//Constructor Overloading
//
//Why:
//It's simple to implement and avoids adding unnecessary complexity.
//Fits well when there are a few variations in the data returned by the DTO.
//Easy to understand and modify as your project evolves.
//
//public class UserDTO {
//    private String name;
//    private String email;
//    private String phoneNumber;
//
//    // Constructor for basic info
//    public UserDTO(String name, String email) {
//        this.name = name;
//        this.email = email;
//    }
//
//    // Constructor for detailed info
//    public UserDTO(String name, String email, String phoneNumber) {
//        this.name = name;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
//    }
//
//    // Getters and setters
//}