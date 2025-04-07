package com.git.evertonc15.CadastroDeNinjas.missoes;

import com.git.evertonc15.CadastroDeNinjas.ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome, dificuldade;

    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninja;

}
