# Sequência de Fibonacci
Na matemática, a sucessão de Fibonacci, é uma sequência de números inteiros, começando normalmente por 0 e 1 ou 1 e 1,
na qual cada termo subsequente corresponde à soma dos dois anteriores.
(Fonte: <a href="https://pt.wikipedia.org/wiki/Sequência_de_Fibonacci" target="_blank">Wikipédia</a>) </br>
A sequência de Fibonacci é um padrão numérico que pode aparecer em vários seres vivos. Foi descrita pela
primeira vez no século XII pelo italiano Leonardo Fibonacci. Essa sequência é muito comum na natureza e pode ser
observada em vários seres vivos, como insetos, plantas, no rosto humano, até mesmo no rabo de um camaleão e em 
várias estruturas em um mesmo ser vivo.
(Fonte: <a href="https://planetabiologia.com/a-sequencia-de-fibonacci-na-natureza/">Planeta Biologia</a>)
</br> </br>
No projeto em Python <a href="https://github.com/juniorcavicchioli/fibonacci/blob/main/fibonacci.py">fibonacci.py</a>
estão duas funções importantes: <b>formula_fechada</b> e <b>formula_recusiva</b>. </br>
A função <b>formula_recursiva</b> utiliza da fórmula recursiva para encontrar o enésimo termo da sequência. </br>
<a href="https://www.ime.unicamp.br/~deleo/MA220/a03.pdf" target="_blank">
![fórmula recursiva](https://user-images.githubusercontent.com/101985616/206966245-3eed2f00-b914-4a08-a5f2-df2eac2fedad.png)
</a>
</br>
A função <b>formula_fechada</b> utiliza da formula fechada da sequência para também encontrar o enésimo termo com a
diferença de que é mais rápido já que, diferente da formula recursiva, não precisa passar por todos os termos anteriores
para chegar ao termo desejado. </br>
<a href="https://www.ime.unicamp.br/~deleo/MA220/a03.pdf" target="_blank">
![fórmula fechada](https://user-images.githubusercontent.com/101985616/206967548-bf707cff-de07-4d8a-96eb-bd62f0a31184.png)
</a>
</br>
O restante das funçõs consistem em duas que servem apenas para o menu e a função <b>fibonacci_lista</b>
serve para armazenar numa lista a sequência até o enésimo termo escolhido. O menu te permite usar as duas fórmulas para encontrar
o termo que deseja e também uma lista com todos os termos até o enésimo termo escolhido.
</br> </br>
Já a pasta Fibonacci contém o projeto em Java. A classe 
<a href="https://github.com/juniorcavicchioli/fibonacci/blob/main/Fibonacci/src/br/com/fiap/tads/rm94548/ddd/fibonacci/Fibonacci.java">
Fibonacci</a> tem a lógica semelhante do programa em Python com a diferença de sintaxe e as nomenclaturas respeitam o 
<a href="https://pt.wikipedia.org/wiki/CamelCase">camelCase</a>, então o método <b>formulaFechada</b> equivale à função <b>formula_fecheada</b>
do projeto em Python assim como o método <b>formulaRecursiva</b> equivale à função <b>formula_recursiva</b>.
