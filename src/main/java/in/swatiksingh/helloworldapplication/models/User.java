package in.swatiksingh.helloworldapplication.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {

    @Id
    private String id;
    private String name;
    private String email;

}
