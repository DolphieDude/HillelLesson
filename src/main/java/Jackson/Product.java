package Jackson;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
//@Setter
@Builder(toBuilder = true)
@ToString
@EqualsAndHashCode

public class Product {
    private int id;
    private String name;
    @JsonIgnore
    private String description;
}
