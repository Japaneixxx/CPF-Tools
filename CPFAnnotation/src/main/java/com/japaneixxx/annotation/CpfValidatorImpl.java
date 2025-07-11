package com.japaneixxx.annotation;

import com.japaneixxx.utils.CPFVerify; // <-- Sua biblioteca existente de CPF
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

/**
 * Implementação do validador para a anotação @ValidCPF.
 * Utiliza a lógica da sua biblioteca CpfUtils.
 */
public class CpfValidatorImpl implements ConstraintValidator<ValidCPF, String> {

    @Override
    public void initialize(ValidCPF constraintAnnotation) {
        // Você pode inicializar configurações da anotação aqui, se houver.
        // Por exemplo, se a anotação ValidCPF tivesse um atributo para permitir CPF nulo.
    }

    @Override
    public boolean isValid(String cpf, ConstraintValidatorContext context) {
        // Se o CPF for nulo ou vazio, o @NotNull ou @NotBlank deve ser usado separadamente.
        // Esta validação foca apenas na validade do formato/dígitos.
        if (cpf == null || cpf.trim().isEmpty()) {
            return true; // Ou false, dependendo da sua regra.
            // Geralmente, null/empty são tratados por @NotNull/@NotBlank.
        }

        // CHAMA O SEU MÉTODO DE VALIDAÇÃO EXISTENTE!
        return CPFVerify.verifyCPF(cpf); // <-- Supondo que CpfUtils.isValid(String) exista na sua lib
    }
}