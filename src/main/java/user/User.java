package user;

import java.util.List;

import lombok.Getter;
import lombok.ToString;
import lombok.Builder;
import lombok.Singular;

@Builder @ToString @Getter
public class User {
    private String firstName;
    private String lastName;
    private int age;
    private int weight;
    private int height;

    @Singular
    private List<String> occupations;

    private String gender;
}
