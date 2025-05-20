package edu.ifba.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cidade {
    private UUID id;
    private String nome;
    private Estado estado;
}
