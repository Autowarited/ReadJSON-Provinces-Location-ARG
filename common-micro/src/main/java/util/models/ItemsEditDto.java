package util.models;


import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder

public class ItemsEditDto {

    private List<Long> listItems;
}
