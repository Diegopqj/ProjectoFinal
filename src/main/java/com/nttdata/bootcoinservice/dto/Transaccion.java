package com.nttdata.bootcoinservice.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(toBuilder = true)
public class Transaccion {

    private final String id;

    private final String monto;
    private final String tipodemoneda;
    private final String CCI;

}
