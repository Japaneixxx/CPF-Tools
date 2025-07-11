package com.japaneixxx.annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented // Inclui na Javadoc
@Constraint(validatedBy = CpfValidatorImpl.class) // <-- MUITO IMPORTANTE! Liga a anotação ao seu validador
@Target({ ElementType.FIELD, ElementType.PARAMETER }) // Onde pode ser aplicada: campos e parâmetros
@Retention(RetentionPolicy.RUNTIME) // Disponível em tempo de execução
public @interface ValidCPF {

    // Mensagem de erro padrão se a validação falhar
    String message() default "CPF inválido";

    // Grupos de validação (para cenários mais avançados, geralmente não precisa alterar)
    Class<?>[] groups() default {};

    // Carga útil (para passar informações adicionais, raramente usado em validações simples)
    Class<? extends Payload>[] payload() default {};
}