package com.example.musicdb.model.binding;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.springframework.boot.context.properties.ConstructorBinding;

import javax.validation.constraints.Email;
@Getter @Setter @ConstructorBinding
public class UserRegisterBindingModel {


    @Length(min = 2, max = 20, message = "Username be between 3 and 20 characters")
    private String username;
    @Length(min = 2, max = 20, message = "Full Name must be between 5 and 20 characters")
    private String fullName;
    @Email(message = "must be valid email")
    private String email;
    @Length(min = 5, max = 20, message = "Password must be between 3 and 20 characters")
    private String password;
    @Length(min = 5, max = 20, message = "Password must be between 3 and 20 characters")
    private String confirmPassword;

}
