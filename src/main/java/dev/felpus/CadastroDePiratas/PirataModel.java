package dev.felpus.CadastroDePiratas;
import jakarta.persistence.*;


// Entity transforma uma classe uma entidade do DB
@Entity
@Table(name = "tb_cadastro")
public class PirataModel {

    @Id //Fala q o atributo abaixo e o ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
    int idade;
    String tripulação;
    String email;

    public PirataModel() {
    }

    public PirataModel(String nome, int idade, String tripulação, String email) {
        this.nome = nome;
        this.idade = idade;
        this.tripulação = tripulação;
        this.email = email;
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

    public String getTripulação() {
        return tripulação;
    }

    public void setTripulação(String tripulação) {
        this.tripulação = tripulação;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}