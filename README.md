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
