package edu.ifba.model;

import java.util.UUID;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Estado {
    private UUID id;
    private String nome;

}
