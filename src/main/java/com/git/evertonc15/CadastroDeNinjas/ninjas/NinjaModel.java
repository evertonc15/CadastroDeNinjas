package com.git.evertonc15.CadastroDeNinjas.ninjas;

import com.git.evertonc15.CadastroDeNinjas.missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "tb_cadastro")
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome, email;
    private int idade;

    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;

}
