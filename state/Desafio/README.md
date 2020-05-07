O jogo do Mario é um excelente exemplo de troca de comportamento de um objeto em tempo de execução, um problema resolvido pelo Padrão STATE. 


A seguir temos uma lista de estados possíveis, seguido do comportamento absorvido pelo objeto após cada uma das ações:

	* Se Mario pequeno -> Mario grande e Mario fogo
	* Se Mario grande -> Mario fogo
	* Se Mario fogo -> Mario ganha 1000 pontos
	* Se Mario capa -> Mario fogo

Contudo, todas estas condições devem ser checadas para realizar esta única troca de estado. Agora imagine o vários estados e a complexidade para realizar a troca destes estados: Mario pequeno, Mario grande, Mario flor e Mario pena:

	* Pegar Cogumelo:
	** Se Mario pequeno -> Mario grande
	** Se Mario grande -> 1000 pontos
	** Se Mario fogo -> 1000 pontos
	** Se Mario capa -> 1000 pontos

	* Pegar Flor:
	** Se Mario pequeno -> Mario grande e Mario fogo
	** Se Mario grande -> Mario fogo
	** Se Mario fogo -> 1000 pontos
	** Se Mario capa -> Mario fogo

	* Pegar Pena:
	** Se Mario pequeno -> Mario grande e Mario capa
	** Se Mario grande -> Mario capa
	** Se Mario fogo -> Mario fogo
	** Se Mario capa -> 1000 pontos

	* Levar Dano:
	** Se Mario pequeno -> Mario morto
	** Se Mario grande -> Mario pequeno
	** Se Mario fogo -> Mario grande
	** Se Mario capa -> Mario grande

Implemente os comportamentos de forma a satisfazer o cronograma acima, utilizando a interface MarioState.
O Código das classes Principal e Mario não devem ser alterados.