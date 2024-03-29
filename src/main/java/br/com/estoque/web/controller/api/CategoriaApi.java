package br.com.estoque.web.controller.api;

import java.util.List;

import br.com.estoque.domain.Categoria	;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Categoria Controller", description = "/rest/categoria")
public interface CategoriaApi extends ApiController<Categoria> {

	@Operation(summary = "Cadastro de um nova categoria.", description = "Esta operação tem por objetivo cadastrar uma nova categoria.")

	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "Sucesso ao cadastrar uma nova categoria."),
			@ApiResponse(responseCode = "400", description = "Cadastro inválido."),
			@ApiResponse(responseCode = "401", description = "Cadastro não autorizado."),
			@ApiResponse(responseCode = "500", description = "Erro interno ao tentar realizar o cadastro.") })
	void save(Categoria categoria);

	@Operation(summary = "Altera uma categoria existente.", description = "Esta operação tem por objetivo alterar uma categoria existente.")

	@ApiResponses(value = {
			@ApiResponse(responseCode = "202", description = "Sucesso ao alterar uma categoria existente."),
			@ApiResponse(responseCode = "400", description = "Alteração inválida."),
			@ApiResponse(responseCode = "401", description = "Alteração não autorizada."),
			@ApiResponse(responseCode = "500", description = "Erro interno ao tentar realizar a alteração.") })
	void edit(Categoria categoria);

	@Operation(summary = "Consulta todas as categoria.", description = "Esta operação tem por objetivo consulta todas as categoria.")

	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Sucesso ao consultar todas as categorias."),
			@ApiResponse(responseCode = "400", description = "Consulta inválida."),
			@ApiResponse(responseCode = "401", description = "Consulta não autorizada."),
			@ApiResponse(responseCode = "404", description = "Nenhuma categoria encontrado para a consulta."),
			@ApiResponse(responseCode = "500", description = "Erro interno ao tentar  realizar a consulta.") })

	List<Categoria> findAll();

	@Operation(summary = "Consulta uma categoria existe por id.", description = "Esta consulta tem por objetivo consultar uma categoria existente por id.")

	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Sucesso ao consultar uma categoria existente por id."),
			@ApiResponse(responseCode = "400", description = "Consulta inválida."),
			@ApiResponse(responseCode = "401", description = "Consulta não autorizada."),
			@ApiResponse(responseCode = "404", description = "Nenhuma categoria encontrado para a consulta por id."),
			@ApiResponse(responseCode = "500", description = "Erro interno ao tentar realizar a consulta por id.") })
	Categoria findById(Long id);

	@Operation(summary = "Exclui uma categoria existente.", description = "Esta operação tem por objetivo excluir uma categoria existente.")

	@ApiResponses(value = {
			@ApiResponse(responseCode = "204", description = "Sucesso ao excluir uma categoria existente."),
			@ApiResponse(responseCode = "400", description = "Exclusão inválida."),
			@ApiResponse(responseCode = "401", description = "Exclusão não autorizada."),
			@ApiResponse(responseCode = "500", description = "Erro interno ao tentar realizar a exclusão.") })
	void delete(Long id);
}
