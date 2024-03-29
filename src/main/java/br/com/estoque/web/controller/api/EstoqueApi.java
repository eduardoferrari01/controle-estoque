package br.com.estoque.web.controller.api;

import java.util.List;

import br.com.estoque.domain.Estoque;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Estoque Controller", description = "/rest/estoque")
public interface EstoqueApi extends ApiController<Estoque> {

	@Operation(summary = "Cadastro de um novo estoque.", description = "Esta operação tem por objetivo cadastrar um novo estoque.")

	@ApiResponses(value = { @ApiResponse(responseCode = "201", description = "Sucesso ao cadastrar um novo estoque."),
			@ApiResponse(responseCode = "400", description = "Cadastro inválido."),
			@ApiResponse(responseCode = "401", description = "Cadastro não autorizado."),
			@ApiResponse(responseCode = "500", description = "Erro interno ao tentar realizar o cadastro.") })
	void save(Estoque estoque);

	@Operation(summary = "Altera um estoque existente.", description = "Esta operação tem por objetivo alterar estoque existente.")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "202", description = "Sucesso ao alterar um estoque existente."),
			@ApiResponse(responseCode = "400", description = "Alteração inválida."),
			@ApiResponse(responseCode = "401", description = "Alteração não autorizada."),
			@ApiResponse(responseCode = "500", description = "Erro interno ao tentar realizar a alteração.") })
	void edit(Estoque estoque);

	@Operation(summary = "Consulta todo estoques.", description = "Esta operação tem por objetivo consulta todos os estoques.")

	@ApiResponses(value = { @ApiResponse(responseCode = "200", description = "Sucesso ao consultar todos os estoques."),
			@ApiResponse(responseCode = "400", description = "Consulta inválida."),
			@ApiResponse(responseCode = "401", description = "Consulta não autorizada."),
			@ApiResponse(responseCode = "404", description = "Nenhum estoque encontrado para a consulta."),
			@ApiResponse(responseCode = "500", description = "Erro interno ao tentar  realizar a consulta.") })

	List<Estoque> findAll();

	@Operation(summary = "Consulta um estoque existe por id.", description = "Esta consulta tem por objetivo consultar um estoque existente por id.")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Sucesso ao consultar um estoque existente por id."),
			@ApiResponse(responseCode = "400", description = "Consulta inválida."),
			@ApiResponse(responseCode = "401", description = "Consulta não autorizada."),
			@ApiResponse(responseCode = "404", description = "Nenhum estoque encontrado para a consulta por id."),
			@ApiResponse(responseCode = "500", description = "Erro interno ao tentar realizar a consulta por id.") })
	Estoque findById(Long id);

	@Operation(summary = "Exclui um estoque existente.", description = "Esta operação tem por objetivo excluir um estoque existente.")

	@ApiResponses(value = {
			@ApiResponse(responseCode = "204", description = "Sucesso ao excluir um estoque existente."),
			@ApiResponse(responseCode = "400", description = "Exclusão inválida."),
			@ApiResponse(responseCode = "401", description = "Exclusão não autorizada."),
			@ApiResponse(responseCode = "500", description = "Erro interno ao tentar realizar a exclusão.") })
	void delete(Long id);
}
