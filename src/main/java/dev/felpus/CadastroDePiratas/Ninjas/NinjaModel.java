package dev.felpus.CadastroDePiratas.Ninjas;
import dev.felpus.CadastroDePiratas.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;


// Entity transforma uma classe uma entidade do DB
@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    @Id //Fala q o atributo abaixo e o ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private int idade;

    private String email;

    //Mais de um ninja pra uma unica "missao"
    @ManyToOne
    @JoinColumn(name = "missoes_id") //Foreing key ou chave estrangeira
    private MissoesModel missoes;


    /*
    private List<MissoesModel> missoes; //TENHO Q CRIAR ISSO, tem q atribuir x ninja (pode ter mais de um ninja na missao, mas cada ninja pode apenas 1 missao por vez) em x missao
    //A TABELA DEVE TER ID, MISSAO E DIFICULDADE, Ex: rank c
    */


    public NinjaModel() {
    }

    public NinjaModel(Long id, String nome, int idade, String email) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}