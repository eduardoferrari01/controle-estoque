package br.com.estoque.domain;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@SequenceGenerator(name = "produto_id_seq", sequenceName = "produto_id_seq", allocationSize = 1)
@Table(name = "produto")
public class Produto implements Serializable {

  private static final long serialVersionUID = -4280341935600596146L;

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto_id_seq")
  private Long id;
  private String descricao;
  private Double preco;

  @ManyToOne
  @JoinColumn(name = "id_categoria")
  private Categoria categoria;

}
