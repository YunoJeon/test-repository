package com.zerobase.cms.order.domain.product;

import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateProductItemForm {

    private Long id;
    private String name;
    private Integer price;
    private Integer count;
}
