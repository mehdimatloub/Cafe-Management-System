package com.example.cafe.wrapper;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserWrapper {
    private int  id;
    private String name;
    private String email;
    private  String ContactNumber;
    private  String status;

    public UserWrapper(int id, String name, String email, String ContactNumber, String status) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.ContactNumber = ContactNumber;
        this.status = status;
    }
}
