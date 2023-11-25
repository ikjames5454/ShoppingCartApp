package org.shoppingCart.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Items {
    @Id
    private String id;
    private String name;
    private int price;
}
