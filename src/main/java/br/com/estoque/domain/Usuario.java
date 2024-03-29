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
@SequenceGenerator(name = "usuario_id_seq", sequenceName = "usuario_id_seq", allocationSize = 1)
@Table(name = "usuario")
public class Usuario implements Serializable {

  private static final long serialVersionUID = 3864954131267343247L;

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_id_seq")
  private Long id;
  private String nome;
  private String senha;
  private String login;
  private String email;

}
