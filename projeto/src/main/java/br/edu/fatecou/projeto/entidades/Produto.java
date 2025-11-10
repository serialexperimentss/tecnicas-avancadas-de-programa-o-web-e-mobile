package br.edu.fatecou.projeto.entidades;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import jakarta.persistence.Entity;

@Data
@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private Long Id;

    //atributos
    private String nome;
    private Integer quantidade;
    private Double preco;
    
}
