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
@SequenceGenerator(name = "estoque_id_seq", sequenceName = "estoque_id_seq", allocationSize = 1)
@Table(name = "estoque")
public class Estoque implements Serializable {

  private static final long serialVersionUID = 5751611338114418400L;

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estoque_id_seq")
  private Long id;
  private Integer quantidade;
  private String localizacao;
  @ManyToOne
  @JoinColumn(name = "id_produto", unique = true)
  private Produto produto;
  private Double valorTotal;

}
