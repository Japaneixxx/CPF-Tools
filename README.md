# Gerador e Validador de CPF para Java

Uma biblioteca Java simples e leve para gerar e validar números de CPF (Cadastro de Pessoas Físicas) do Brasil.

Este projeto oferece um conjunto de ferramentas estáticas para lidar com a geração de CPFs válidos, inclusive por região fiscal, e para a verificação da validade de um número de CPF, seguindo as regras da Receita Federal.

## ✨ Funcionalidades

* **Geração de CPFs Válidos:** Crie números de CPF aleatórios que passam no teste do dígito verificador.
* **Geração por Região Fiscal:** Gere um CPF que corresponda a um estado ou região específica.
* **Validação Completa:** Verifique se um CPF é matematicamente válido.
* **Flexibilidade de Formato:** A validação aceita CPFs com ou sem formatação (ex: 123.456.789-00 ou 12345678900).
* **Tratamento de Casos Inválidos:** Rejeita CPFs com formato incorreto ou com todos os dígitos repetidos (ex: 111.111.111-11), que são inválidos.
* **Validação Declarativa com Bean Validation:** Utilize a anotação `@ValidCPF` para integrar a validação de CPF diretamente em seus modelos (POJOs) com frameworks como Spring.

## 📦 Módulos do Projeto

Este projeto é composto por dois módulos Maven:

* **`CPFUtils`**: Contém as classes utilitárias estáticas para geração e verificação de CPF (`CPFGen` e `CPFVerify`). Este é o core da funcionalidade.
* **`CPFAnnotation`**: Fornece a anotação `@ValidCPF` e sua implementação (`CpfValidatorImpl`) para integração com a especificação Jakarta Bean Validation (JSR 380).

## 🚀 Como Usar

### Usando `CPFUtils` (Geração e Validação Manual)

Como os métodos são estáticos, você não precisa instanciar nenhum objeto. Basta importar as classes e chamar os métodos diretamente.

**Adicione a dependência ao seu `pom.xml` (apenas para o módulo `CPFUtils`):**

```xml
<dependency>
    <groupId>com.japaneixxx</groupId>
    <artifactId>CPFUtils</artifactId>
    <version>1.0.1-SNAPSHOT</version> </dependency>
```
Parceiro de Programacao
Ah, entendi! Mil desculpas, isso significa que eu não estou te fornecendo o README.md completo, e sim apenas os blocos que você precisaria preencher. Isso foi um erro fundamental na minha abordagem.

Minha intenção era que você preenchesse os blocos de código com o texto que eu enviei nas respostas anteriores, mas se o arquivo ficou faltando pedaços, é porque a estrutura principal não foi enviada inteira.

Vamos consertar isso agora.

Vou te enviar o README.md COMPLETO, de uma vez só. Desta vez, vou instruí-lo a usar uma forma de copiar e colar que deve ignorar qualquer formatação "oculta" que esteja causando problemas.

Por favor, siga estas instruções cuidadosamente:

Abra o arquivo README.md no seu editor de texto (VS Code, IntelliJ IDEA, Notepad++, etc.).

APAGUE TODO o conteúdo existente no arquivo README.md.

Copie o bloco de texto COMPLETO que forneço abaixo.

Importante: Copie tudo, do primeiro # Gerador e Validador de CPF para Java até a última linha do String message() default "CPF inválido";.

Cole o texto no seu arquivo README.md utilizando a opção "Colar Texto Sem Formatação" ou "Paste Plain Text". Isso é crucial para evitar que caracteres invisíveis ou formatação indesejada sejam colados.

No Windows: Após copiar, clique com o botão direito no editor e procure por opções como "Colar Texto Sem Formatação", "Colar Especial" -> "Texto Sem Formatação", ou "Paste Plain Text". Se não encontrar, tente Ctrl+Shift+V.

No Mac: Após copiar, tente Command+Shift+V.

Na maioria dos IDEs (IntelliJ, Eclipse, VS Code): Geralmente há uma opção "Paste Plain Text" ou "Paste Special".

Aqui está o conteúdo COMPLETO do README.md para você copiar e colar:

# Gerador e Validador de CPF para Java

Uma biblioteca Java simples e leve para gerar e validar números de CPF (Cadastro de Pessoas Físicas) do Brasil.

Este projeto oferece um conjunto de ferramentas estáticas para lidar com a geração de CPFs válidos, inclusive por região fiscal, e para a verificação da validade de um número de CPF, seguindo as regras da Receita Federal.

## ✨ Funcionalidades

* **Geração de CPFs Válidos:** Crie números de CPF aleatórios que passam no teste do dígito verificador.
* **Geração por Região Fiscal:** Gere um CPF que corresponda a um estado ou região específica.
* **Validação Completa:** Verifique se um CPF é matematicamente válido.
* **Flexibilidade de Formato:** A validação aceita CPFs com ou sem formatação (ex: 123.456.789-00 ou 12345678900).
* **Tratamento de Casos Inválidos:** Rejeita CPFs com formato incorreto ou com todos os dígitos repetidos (ex: 111.111.111-11), que são inválidos.
* **Validação Declarativa com Bean Validation:** Utilize a anotação `@ValidCPF` para integrar a validação de CPF diretamente em seus modelos (POJOs) com frameworks como Spring.

## 📦 Módulos do Projeto

Este projeto é composto por dois módulos Maven:

* **`CPFUtils`**: Contém as classes utilitárias estáticas para geração e verificação de CPF (`CPFGen` e `CPFVerify`). Este é o core da funcionalidade.
* **`CPFAnnotation`**: Fornece a anotação `@ValidCPF` e sua implementação (`CpfValidatorImpl`) para integração com a especificação Jakarta Bean Validation (JSR 380).

## 🚀 Como Usar

### Usando `CPFUtils` (Geração e Validação Manual)

Como os métodos são estáticos, você não precisa instanciar nenhum objeto. Basta importar as classes e chamar os métodos diretamente.

**Adicione a dependência ao seu `pom.xml` (apenas para o módulo `CPFUtils`):**

```xml
<dependency>
    <groupId>com.japaneixxx</groupId>
    <artifactId>CPFUtils</artifactId>
    <version>1.0.1-SNAPSHOT</version> </dependency>
```
Exemplos de Uso:
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
## Usando ```CPFAnnotation``` *(Validação com Bean Validation)*
Para usar a anotação ```@ValidCPF```, você precisará adicionar as dependências do ```CPFAnnotation``` e de uma implementação do Bean Validation (como Hibernate Validator).

Adicione as dependências ao seu ```pom.xml``` (para o módulo ```CPFAnnotation``` e as dependências de Bean Validation):
```XML
<dependency>
    <groupId>com.japaneixxx</groupId>
    <artifactId>CPFAnnotation</artifactId>
    <version>1.0.0-SNAPSHOT</version> </dependency>

<dependency>
    <groupId>jakarta.validation</groupId>
    <artifactId>jakarta.validation-api</artifactId>
    <version>3.0.2</version> </dependency>
<dependency>
    <groupId>org.hibernate.validator</groupId>
    <artifactId>hibernate-validator</artifactId>
    <version>8.0.1.Final</version> </dependency>
<dependency>
    <groupId>org.glassfish</groupId>
    <artifactId>jakarta.el</artifactId>
    <version>4.0.2</version> <scope>runtime</scope>
</dependency>
```

##Parceiro de Programacao
Ah, entendi! Mil desculpas, isso significa que eu não estou te fornecendo o README.md completo, e sim apenas os blocos que você precisaria preencher. Isso foi um erro fundamental na minha abordagem.

Minha intenção era que você preenchesse os blocos de código com o texto que eu enviei nas respostas anteriores, mas se o arquivo ficou faltando pedaços, é porque a estrutura principal não foi enviada inteira.

Vamos consertar isso agora.

Vou te enviar o README.md COMPLETO, de uma vez só. Desta vez, vou instruí-lo a usar uma forma de copiar e colar que deve ignorar qualquer formatação "oculta" que esteja causando problemas.

Por favor, siga estas instruções cuidadosamente:

Abra o arquivo README.md no seu editor de texto (VS Code, IntelliJ IDEA, Notepad++, etc.).

APAGUE TODO o conteúdo existente no arquivo README.md.

Copie o bloco de texto COMPLETO que forneço abaixo.

Importante: Copie tudo, do primeiro # Gerador e Validador de CPF para Java até a última linha do String message() default "CPF inválido";.

Cole o texto no seu arquivo README.md utilizando a opção "Colar Texto Sem Formatação" ou "Paste Plain Text". Isso é crucial para evitar que caracteres invisíveis ou formatação indesejada sejam colados.

No Windows: Após copiar, clique com o botão direito no editor e procure por opções como "Colar Texto Sem Formatação", "Colar Especial" -> "Texto Sem Formatação", ou "Paste Plain Text". Se não encontrar, tente Ctrl+Shift+V.

No Mac: Após copiar, tente Command+Shift+V.

Na maioria dos IDEs (IntelliJ, Eclipse, VS Code): Geralmente há uma opção "Paste Plain Text" ou "Paste Special".

Aqui está o conteúdo COMPLETO do README.md para você copiar e colar:

# Gerador e Validador de CPF para Java

Uma biblioteca Java simples e leve para gerar e validar números de CPF (Cadastro de Pessoas Físicas) do Brasil.

Este projeto oferece um conjunto de ferramentas estáticas para lidar com a geração de CPFs válidos, inclusive por região fiscal, e para a verificação da validade de um número de CPF, seguindo as regras da Receita Federal.

## ✨ Funcionalidades

* **Geração de CPFs Válidos:** Crie números de CPF aleatórios que passam no teste do dígito verificador.
* **Geração por Região Fiscal:** Gere um CPF que corresponda a um estado ou região específica.
* **Validação Completa:** Verifique se um CPF é matematicamente válido.
* **Flexibilidade de Formato:** A validação aceita CPFs com ou sem formatação (ex: 123.456.789-00 ou 12345678900).
* **Tratamento de Casos Inválidos:** Rejeita CPFs com formato incorreto ou com todos os dígitos repetidos (ex: 111.111.111-11), que são inválidos.
* **Validação Declarativa com Bean Validation:** Utilize a anotação `@ValidCPF` para integrar a validação de CPF diretamente em seus modelos (POJOs) com frameworks como Spring.

## 📦 Módulos do Projeto

Este projeto é composto por dois módulos Maven:

* **`CPFUtils`**: Contém as classes utilitárias estáticas para geração e verificação de CPF (`CPFGen` e `CPFVerify`). Este é o core da funcionalidade.
* **`CPFAnnotation`**: Fornece a anotação `@ValidCPF` e sua implementação (`CpfValidatorImpl`) para integração com a especificação Jakarta Bean Validation (JSR 380).

## 🚀 Como Usar

### Usando `CPFUtils` (Geração e Validação Manual)

Como os métodos são estáticos, você não precisa instanciar nenhum objeto. Basta importar as classes e chamar os métodos diretamente.

**Adicione a dependência ao seu `pom.xml` (apenas para o módulo `CPFUtils`):**

```xml
<dependency>
    <groupId>com.japaneixxx</groupId>
    <artifactId>CPFUtils</artifactId>
    <version>1.0.1-SNAPSHOT</version> </dependency>
Exemplos de Uso:

Java

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
Usando CPFAnnotation (Validação com Bean Validation)
Para usar a anotação @ValidCPF, você precisará adicionar as dependências do CPFAnnotation e de uma implementação do Bean Validation (como Hibernate Validator).

Adicione as dependências ao seu pom.xml (para o módulo CPFAnnotation e as dependências de Bean Validation):

XML

<dependency>
    <groupId>com.japaneixxx</groupId>
    <artifactId>CPFAnnotation</artifactId>
    <version>1.0.0-SNAPSHOT</version> </dependency>

<dependency>
    <groupId>jakarta.validation</groupId>
    <artifactId>jakarta.validation-api</artifactId>
    <version>3.0.2</version> </dependency>
<dependency>
    <groupId>org.hibernate.validator</groupId>
    <artifactId>hibernate-validator</artifactId>
    <version>8.0.1.Final</version> </dependency>
<dependency>
    <groupId>org.glassfish</groupId>
    <artifactId>jakarta.el</artifactId>
    <version>4.0.2</version> <scope>runtime</scope>
</dependency>
```
Exemplo de Uso com @ValidCPF: 
```Java
import com.japaneixxx.annotation.ValidCPF;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import java.util.Set;
import jakarta.validation.ConstraintViolation;

public class Pessoa {

    @ValidCPF(message = "CPF inválido! Por favor, verifique o número.")
    private String cpf;

    // Construtor, getters e setters
    public Pessoa(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public static void main(String[] args) {
        // Configura o validador
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        // Exemplo 1: CPF Válido
        Pessoa pessoaValida = new Pessoa("123.456.789-00"); // Supondo que seja um CPF gerado pelo CPFGen
        Set<ConstraintViolation<Pessoa>> violationsValido = validator.validate(pessoaValida);
        System.out.println("CPF Válido: " + pessoaValida.getCpf() + " - Validação OK? " + violationsValido.isEmpty());

        // Exemplo 2: CPF Inválido (todos os dígitos repetidos)
        Pessoa pessoaInvalida1 = new Pessoa("111.111.111-11");
        Set<ConstraintViolation<Pessoa>> violationsInvalido1 = validator.validate(pessoaInvalida1);
        System.out.println("CPF Inválido (repetidos): " + pessoaInvalida1.getCpf() + " - Erros: " + violationsInvalido1.size());
        violationsInvalido1.forEach(v -> System.out.println("  - " + v.getMessage()));

        // Exemplo 3: CPF Inválido (dígitos verificadores incorretos)
        Pessoa pessoaInvalida2 = new Pessoa("123.456.789-10");
        Set<ConstraintViolation<Pessoa>> violationsInvalido2 = validator.validate(pessoaInvalida2);
        System.out.println("CPF Inválido (dígitos incorretos): " + pessoaInvalida2.getCpf() + " - Erros: " + violationsInvalido2.size());
        violationsInvalido2.forEach(v -> System.out.println("  - " + v.getMessage()));

        // Exemplo 4: CPF nulo (se não for @NotNull, passará na validação do @ValidCPF)
        Pessoa pessoaNula = new Pessoa(null);
        Set<ConstraintViolation<Pessoa>> violationsNula = validator.validate(pessoaNula);
        System.out.println("CPF Nulo: " + pessoaNula.getCpf() + " - Validação OK? " + violationsNula.isEmpty() + " (Use @NotNull para exigir preenchimento)");

        factory.close();
    }
}
```

## 🗺️ Tabela de Regiões Fiscais
O 9º dígito do CPF indica a Região Fiscal onde o documento foi originalmente emitido. Use o número da região ao chamar o método ```CPFGen.generateCPF(int regiao)```.

| Dígito (Região) | Estados                                                        | 
| :-------------: | :-------------------------------------------------------------: | 
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

```com.japaneixxx.annotation.ValidCPF```
•`@Target({ ElementType.FIELD, ElementType.PARAMETER })`

* Indica que esta anotação pode ser aplicada a campos de classe (atributos) e parâmetros de métodos/construtores.

•`@Retention(RetentionPolicy.RUNTIME)`

* A anotação estará disponível em tempo de execução para ser processada por um validador.

•`String message() default "CPF inválido";`

* Define a mensagem de erro padrão que será exibida se a validação falhar.
