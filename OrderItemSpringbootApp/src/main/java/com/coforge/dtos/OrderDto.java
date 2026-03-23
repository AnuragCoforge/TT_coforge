
package com.coforge.dtos;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class OrderDto {

    private long orderId;
    private LocalDate ordDate;
    private double totalCost;
    private List<ItemDto> itemlist;
}
