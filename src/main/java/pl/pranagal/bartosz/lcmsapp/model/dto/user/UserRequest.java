package pl.pranagal.bartosz.lcmsapp.model.dto.user;

import lombok.Data;

@Data
public class UserRequest {

    private String username;
    private String password;
    private String mail;
    private String name;
    private String surname;
}
