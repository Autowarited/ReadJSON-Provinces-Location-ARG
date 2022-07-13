package util.models;

import lombok.Getter;
import lombok.Setter;
import request.ProductRequest;

import java.util.List;

@Getter
@Setter
public class ItemEditStock {

    private List<ProductRequest> listProducts;

    private boolean isProveedor;
}
