package dev.felpus.CadastroDePiratas;
import jakarta.persistence.*;


// Entity transforma uma classe uma entidade do DB
@Entity
@Table(name = "tb_cadastro")
public class PirataModel {

    @Id //Fala q o atributo abaixo e o ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idade;
    private String tripulacao;
    private Boolean isAlive;
    private String email;

    public PirataModel() {
    }

    public PirataModel(Long id, String nome, int idade, String tripulacao, Boolean isAlive, String email) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.tripulacao = tripulacao;
        this.isAlive = isAlive;
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

    public String getTripulacao() {
        return tripulacao;
    }

    public void setTripulacao(String tripulacao) {
        this.tripulacao = tripulacao;
    }

    public Boolean getAlive() {
        return isAlive;
    }

    public void setAlive(Boolean alive) {
        isAlive = alive;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}