package com.cuatroa.retotres.model;

import java.util.Date;
import java.util.Map;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Modela una coleccion de ordenes de pedido, tiene las siguiente relaciones embebidas:
 * 
 * Para esos casos la clave o llave en los Map debe se de tipo Integer
 * 
 * @author Laurita
 */
@Document(collection = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    public static String PENDING = "Pendiente";
    public static String APROVED = "Aprobada";
    public static String REJECTED = "Rechazada";
    
    @Id
    private Integer id;
    private Date registerDay;
    private String status;
    private User salesMan;
    
    private Map<String, Accessory> products;
    private Map<String, Integer> quantities;    
}
