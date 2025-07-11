# Gerador e Validador de CPF para Java
Uma biblioteca Java simples e leve para gerar e validar números de CPF (Cadastro de Pessoas Físicas) do Brasil.

Este projeto oferece um conjunto de ferramentas estáticas para lidar com a geração de CPFs válidos, inclusive por região fiscal, e para a verificação da validade de um número de CPF, seguindo as regras da Receita Federal.
## ✨ Funcionalidades
* Geração de CPFs Válidos: Crie números de CPF aleatórios que passam no teste do dígito verificador.

* Geração por Região Fiscal: Gere um CPF que corresponda a um estado ou região específica.

* Validação Completa: Verifique se um CPF é matematicamente válido.

* Flexibilidade de Formato: A validação aceita CPFs com ou sem formatação (ex: 123.456.789-00 ou 12345678900).

* Tratamento de Casos Inválidos: Rejeita CPFs com formato incorreto ou com todos os dígitos repetidos (ex: 111.111.111-11), que são inválidos.
## 🚀 Como Usar
Como os métodos são estáticos, você não precisa instanciar nenhum objeto. 

Basta importar as classes e chamar os métodos diretamente.

Exemplos de Uso
```java
import com.japaneixxx.utils.CPFGen;
import com.japaneixxx.utils.CPFVerify;

public class Main {
public static void main(String[] args) {
        // 1. Gerando um CPF aleatório
        String cpfAleatorio = CPFGen.generateCPF();
        System.out.println("CPF Aleatório Gerado: " + cpfAleatorio);

        // 2. Gerando um CPF para uma região específica (ex: São Paulo - Região 8)
        String cpfSP = CPFGen.generateCPF(8);
        System.out.println("CPF de São Paulo Gerado: " + cpfSP);

        // 3. Verificando a validade dos CPFs gerados
        boolean isAleatorioValido = CPFVerify.verifyCPF(cpfAleatorio);
        System.out.println("O CPF aleatório é válido? " + isAleatorioValido); // Deve retornar true

        boolean isSPValido = CPFVerify.verifyCPF(cpfSP);
        System.out.println("O CPF de SP é válido? " + isSPValido); // Deve retornar true

        // 4. Verificando um CPF inválido (com dígitos repetidos)
        boolean isInvalido = CPFVerify.verifyCPF("111.111.111-11");
        System.out.println("O CPF '111.111.111-11' é válido? " + isInvalido); // Deve retornar false

        // 5. Verificando um CPF com dígito verificador incorreto
        boolean isDigitoIncorreto = CPFVerify.verifyCPF("123.456.789-10");
        System.out.println("O CPF '123.456.789-10' é válido? " + isDigitoIncorreto); // Deve retornar false
    }
}
```
## 🗺️ Tabela de Regiões Fiscais
O 9º dígito do CPF indica a Região Fiscal onde o documento foi originalmente emitido. Use o número da região ao chamar o método `CPFGen.generateCPF(int regiao)`.

| Dígito (Região) | Estados                                                        | 
| :------------- | :------------------------------------------------------------- | 
|        1        | DF, GO, MT, MS, TO                                             | 
|        2        | AM, PA, RR, AP, AC, RO                                         | 
|        3        | CE, MA, PI                                                     | 
|        4        | PB, PE, AL, RN                                                 | 
|        5        | BA, SE                                                         | 
|        6        | MG                                                             | 
|        7        | RJ, ES                                                         | 
|        8        | SP                                                             | 
|        9        | PR, SC                                                         | 
|        0        | RS                                                             |

## 🛠️ API
`com.japaneixxx.utils.CPFGen`

•`public static String generateCPF()`

 * Gera um CPF válido com região fiscal aleatória.

 * *Retorna*: Uma String com o CPF formatado (NNN.NNN.NNN-DD).

•`public static String generateCPF(int regiao)`

 * Gera um CPF válido para a região fiscal especificada.

 * *Parâmetros*: regiao (um inteiro de 0 a 9).

 * *Retorna*: Uma String com o CPF formatado.com.japaneixxx.utils.CPFVerify

•`public static boolean verifyCPF(String cpf)`

 * Verifica se a string fornecida corresponde a um CPF válido.

 * *Parâmetros*: cpf (uma String que pode ou não estar formatada).

 * *Retorna*: true se o CPF for válido, false caso contrário.
