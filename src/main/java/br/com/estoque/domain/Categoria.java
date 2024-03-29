package br.com.estoque.domain;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@SequenceGenerator(name = "categoria_id_seq", sequenceName = "categoria_id_seq", allocationSize = 1)
@Table(name = "categoria")
public class Categoria implements Serializable {

  private static final long serialVersionUID = 1361294950533607735L;

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "categoria_id_seq")
  private Long id;
  private String descricao;

}
