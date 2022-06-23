package musicdb.model.binding;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.springframework.boot.context.properties.ConstructorBinding;

@Getter @Setter @ConstructorBinding
public class UserLoginBindingModel {
    @Length(min = 2, max = 20, message = "Username be between 3 and 20 characters")
    private String username;
    @Length(min = 5, max = 20, message = "Password must be between 3 and 20 characters")
    private String password;
}
