# Lista de Herança - Java no VS Code

## Abrir e executar
1. No GitHub, clique em Code > Download ZIP e extraia o arquivo, ou clone o repositório.
2. Abra o VS Code > Arquivo > Abrir Pasta e escolha a pasta do projeto (a pasta que contém src).
3. Nas Extensões (Ctrl+Shift+X), instale **Extension Pack for Java**, da Microsoft. Se já estiver instalada, siga adiante.
4. É necessário um **JDK**, não apenas o Java de execução. Use JDK 21 ou superior para as versões atuais das extensões. Se o VS Code pedir um JDK, use a opção de instalação indicada por ele e reinicie o VS Code.
5. Aguarde o Java terminar de carregar o projeto.
6. Abra **src/Main.java** e clique em **Run** / **Executar**, acima de `public static void main`. Os resultados aparecem no terminal.

Para executar só uma história, abra seu Main.java: por exemplo, src/historia1/Main.java, e clique em Run acima do método main.
Também pode usar Executar e Depurar, escolhendo a configuração da história desejada.

Não precisa criar outro projeto, usar Maven ou copiar as classes manualmente.

## Alternativa no Windows
Com o JDK no PATH, dê dois cliques em executar_windows.bat. Ele compila e executa todas as histórias. Para conferir o JDK no terminal: `javac -version`.

## Organização
- historia1: Pessoa, Cliente, Funcionario e Main.
- historia2: Funcionario, Gerente e Main.
- historia3: Veiculo, Carro, Moto e Main.
- historia4: Conta, ContaCorrente, ContaPoupanca e Main.
- historia5: Produto, ProdutoFisico, ProdutoDigital e Main.
- src/Main.java: executa as cinco demonstrações.

Cada história possui seu próprio pacote. Assim, os dois Funcionario não entram em conflito.
Os dados usados no Main são exemplos fictícios, sem entrada pelo teclado.

## Resultado esperado dos cálculos
- História 2: funcionário R$ 300,00; gerente R$ 600,00 (salário igual: R$ 3.000,00).
- História 3: carro com 4 portas; moto com 160 cilindradas.
- História 4: corrente R$ 399,00; poupança R$ 408,00. Saque de R$ 1.000,00 recusado.
- História 5: livro de R$ 100,00 e 2 kg custa R$ 110,00; e-book de R$ 100,00 custa R$ 90,00.
O separador decimal pode aparecer como ponto ou vírgula, conforme a configuração do Java.

## Entendendo o código
**Herança:** reúne o que é comum na classe pai. `Cliente extends Pessoa` significa que Cliente também é uma Pessoa.
**private:** restringe o acesso direto ao atributo à própria classe. Os getters permitem consultar esses valores.
**super(...):** chama o construtor da classe pai para inicializar a parte herdada do objeto.
**@Override:** indica que a filha está sobrescrevendo um método herdado.
**super.toString():** reaproveita o texto que o pai já montou e acrescenta os dados da filha.
**protected:** permite que subclasses acessem saldo, como solicitado na atividade. Em Java, também permite acesso no mesmo pacote.
**Polimorfismo:** a chamada de um método sobrescrito usa a implementação correspondente ao objeto criado.

### História 1
Nome e CPF ficam em Pessoa. Cliente acrescenta email, e Funcionario acrescenta salario. Os getters de Pessoa podem ser chamados nas filhas.
### História 2
Funcionario calcula salario * 0.10. Gerente sobrescreve calcularBonificacao para usar getSalario() * 0.20, porque salario é privado.
### História 3
Veiculo descreve placa, modelo e diária. Carro e Moto usam super.toString() para completar essa descrição.
### História 4
Depositar soma ao saldo. Sacar retorna true se conseguir retirar, e false se o valor for inválido ou faltar saldo. ContaCorrente inclui R$ 1,00 no total debitado; se o saldo não cobrir tudo, não retira nem cobra a tarifa. ContaPoupanca aplica taxa fracionária: 0.02 = 2%. Os exemplos usam double para manter a atividade simples; sistemas financeiros reais normalmente usam BigDecimal.
### História 5
Produto retorna o preço base. ProdutoFisico soma peso * 5 (peso em kg). ProdutoDigital multiplica o preço por 0.90, deixando 90% do valor após o desconto de 10%.

## Para revisar aprendendo
Altere os salários, as diárias, o peso e a taxa nos arquivos Main.java. Antes de executar, calcule o resultado esperado e compare com o terminal.
