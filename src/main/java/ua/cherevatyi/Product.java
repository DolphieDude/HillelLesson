package ua.cherevatyi;

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
    private String description;
}
