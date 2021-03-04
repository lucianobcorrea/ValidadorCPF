# Validador de CPF
Este validador de CPF valida o CPF digitado pela usuário baseado nos dois dígitos verificadores. Pode-se digitar com a forma padrão:
########### ou com caracteres especiais: ###.###.###-##. Ele não verifica se o CPF existe na Receita Federal, somente o valida.

# Regra para validação do CPF
O CPF é formado por 11 dígitos numéricos que seguem a máscara "###.###.###-##", onde a verificação
do CPF acontece utilizando os 9 primeiros dígitos, verificando se o resultado corresponde aos dois
últimos dígitos. Assuma como exemplo o CPF fictício "529.982.247-25".

# Validar o primeiro dígito
Primeiramente multiplica-se os 9 primeiros dígitos pela sequência decrescente de números de 10 à 2,
somando os resultados. Exemplo: 5 * 10 + 2 * 9 + 9 * 8 + 9 * 7 + 8 * 6 + 2 * 5 + 2 * 4 + 4 * 3 + 7 * 2 = 295
Em seguida, multiplica-se o resultado por 10 e divide-se por 11. Exemplo: 295 * 10 / 11
O resultado necessário é o resto da divisão. Se o resto for igual ao primeiro dígito verificador, a primeira
parte da validação está correta. Caso o resto da divisão seja igual a 10, deve-se considerar = 0.
Assumindo o valor fictício "529.982.247-25", temos o seguinte: 268 e resto = 2. Correto!

# Validar o segundo dígito
A validação do segundo dígito é semelhante à primeira, porém deve-se considerar os 9 primeiros dígitos,
mais o primeiro dígito verificador. Deve-se multiplicar os 10 números pela sequência decrescente de 11 a
2. Exemplo: 5 * 11 + 2 * 10 + 9 * 9 + 9 * 8 + 8 * 7 + 2 * 6 + 2 * 5 + 4 * 4 + 7 * 3 + 2 * 2 = 347
Seguindo o processo anterior, multiplica-se por 10 e divide-se por 11. Exemplo: 347 * 10 / 11
Verifica-se o resto novamente. Exemplo: 315 e resto = 5. Correto!
A partir desta verificação pode-se concluir que o CPF 529.982.247-25 é válido!

## Exemplo de saída no console para CPF válido
<h1 align="left">
    <img src="CPF válido com caracteres.png"/>
<h1 align="right">
    <img src="CPF válido.png"/>
</h1>

## Exemplo de saída no console para CPF inválido
<h1 align="left">
    <img src="CPF inválido com caracteres.png"/>
<h1 align="right">
    <img src="CPF inválido.png"/>
</h1>




