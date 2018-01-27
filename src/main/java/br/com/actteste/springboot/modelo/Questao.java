package br.com.actteste.springboot.modelo;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Entity
@Table(name = "questao")
public class Questao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @NotNull
    private String pergunta;

    @NotNull
    private String tema;

    public Long getId() {
        return codigo;
    }

    public void setId(Long codigo) {
        this.codigo = codigo;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Questao questao = (Questao) o;
        return Objects.equals(codigo, questao.codigo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(codigo);
    }
}
