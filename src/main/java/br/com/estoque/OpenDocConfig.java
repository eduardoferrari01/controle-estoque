package br.com.estoque;

import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(info = @Info(title = "Estoque API", version = "1.0", description = "Esta api tem por objetivo controlar o estoque"))
public class OpenDocConfig {

}
