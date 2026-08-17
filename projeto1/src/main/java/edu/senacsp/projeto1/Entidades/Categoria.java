package edu.senacsp.projeto1.Entidades;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Categoria {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Nome", nullable = false, unique = true)
    private String nome;

    @OneToMany(mappedBy = "categoria")
    @Column(name = "Lista de Produtos")
    private List<Produto> produtos;

}
