package com.nttdata.bootcoinservice.Model;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;

@Getter
@Builder(toBuilder = true)
public class Usuario {

    @Id
    private String id;

    private  String NombreUsuario;
    private  String Apellido;
    private String TipoDocumento;
    private  String NroCelular;
    private  String Correo;

}
