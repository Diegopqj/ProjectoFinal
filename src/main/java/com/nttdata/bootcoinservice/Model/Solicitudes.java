package com.nttdata.bootcoinservice.Model;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;

@Getter
@Builder(toBuilder = true)
//@Document(collection = Constants.CREDITS_COLLECTION)
public class Solicitudes {
    @Id
    private String id;
    private String NroTransaccion;
    private String NroDocumento;
    private  Double Monto;
    private  Double MontoPago;
    private String Glosa;
}
