package br.com.estoque.web.controller.api;

import java.util.List;

import br.com.estoque.domain.Produto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Produto Controller", description = "/rest/produto")
public interface ProdutoApi extends ApiController<Produto> {

	@Operation(summary = "Cadastro de um novo produto.", description = "Esta operação tem por objetivo cadastrar um novo produto.", responses = {
			@ApiResponse(responseCode = "201", description = "Sucesso ao cadastrar um novo produto."),
			@ApiResponse(responseCode = "400", description = "Cadastro inválido."),
			@ApiResponse(responseCode = "401", description = "Cadastro não autorizado."),
			@ApiResponse(responseCode = "500", description = "Erro interno ao tentar realizar o cadastro.") })
	void save(Produto produto);

	@Operation(summary = "Altera um produto existente.", description = "Esta operação tem por objetivo alterar produto existente.", responses = {
			@ApiResponse(responseCode = "202", description = "Sucesso ao alterar um produto existente."),
			@ApiResponse(responseCode = "400", description = "Alteração inválida."),
			@ApiResponse(responseCode = "401", description = "Alteração não autorizada."),
			@ApiResponse(responseCode = "500", description = "Erro interno ao tentar realizar a alteração.") })
	void edit(Produto produto);

	@Operation(summary = "Consulta todos produtos.", description = "Esta operação tem por objetivo consulta todos os produtos.", responses = {
			@ApiResponse(responseCode = "200", description = "Sucesso ao consultar todos os produtos."),
			@ApiResponse(responseCode = "400", description = "Consulta inválida."),
			@ApiResponse(responseCode = "401", description = "Consulta não autorizada."),
			@ApiResponse(responseCode = "404", description = "Nenhum produto encontrado para a consulta."),
			@ApiResponse(responseCode = "500", description = "Erro interno ao tentar  realizar a consulta.") })
	List<Produto> findAll();

	@Operation(summary = "Consulta um produto existente por id.", description = "Esta consulta tem por objetivo consultar um produto existente por id.")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Sucesso ao consultar um produto existente por id."),
			@ApiResponse(responseCode = "400", description = "Consulta inválida."),
			@ApiResponse(responseCode = "401", description = "Consulta não autorizada."),
			@ApiResponse(responseCode = "404", description = "Nenhum produto encontrado para a consulta por id."),
			@ApiResponse(responseCode = "500", description = "Erro interno ao tentar realizar a consulta por id.") })
	Produto findById(Long id);

	@Operation(summary = "Exclui um produto existente.", description = "Esta operação tem por objetivo excluir um produto existente.")

	@ApiResponses(value = {
			@ApiResponse(responseCode = "204", description = "Sucesso ao excluir um produto existente."),
			@ApiResponse(responseCode = "400", description = "Exclusão inválida."),
			@ApiResponse(responseCode = "401", description = "Exclusão não autorizada."),
			@ApiResponse(responseCode = "500", description = "Erro interno ao tentar realizar a exclusão.") })
	void delete(Long id);
}
