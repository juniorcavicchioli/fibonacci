# Sequência de Fibonacci
<p align="right">
<img src="https://shields-io-visitor-counter.herokuapp.com/badge?page=juniorcavicchioli.fibonacci&color=1D70B8&logo=GitHub&logoColor=FFFFFF&style=flat-square"/>
</p>
Na matemática, a sucessão de Fibonacci, é uma sequência de números inteiros, começando normalmente por 0 e 1 ou 1 e 1,
na qual cada termo subsequente corresponde à soma dos dois anteriores.
(Fonte: <a href="https://pt.wikipedia.org/wiki/Sequência_de_Fibonacci" target="_blank">Wikipédia</a>) </br>
A sequência de Fibonacci é um padrão numérico que pode aparecer em vários seres vivos. Foi descrita pela
primeira vez no século XII pelo italiano Leonardo Fibonacci. Essa sequência é muito comum na natureza e pode ser
observada em vários seres vivos, como insetos, plantas, no rosto humano, até mesmo no rabo de um camaleão e em 
várias estruturas em um mesmo ser vivo.
(Fonte: <a href="https://planetabiologia.com/a-sequencia-de-fibonacci-na-natureza/">Planeta Biologia</a>)

<img src="https://user-images.githubusercontent.com/101985616/227748459-9c5606fd-6f88-42a4-9944-1cea516202c4.jpg"
     width="400em"/>

*Para descontrair: uma imagem de minha gata usando a sequência de Fibonacci para dormir bem.*

## Objetivo
Minha intenção com esse repositório é reforçar meu conhecimento de sintaxe e lógica em diferentes linguagens usando um mesmo problema simples.
Atualmente estão aqui um projeto em Python e em Java. </br> </br>
No projeto em Python <a href="https://github.com/juniorcavicchioli/fibonacci/blob/main/fibonacci.py">fibonacci.py</a>
estão duas funções importantes: `formula_fechada` e `formula_recusiva`. </br>
A função `formula_recursiva` utiliza da fórmula recursiva para encontrar o enésimo termo da sequência. </br>
<a href="https://www.ime.unicamp.br/~deleo/MA220/a03.pdf" target="_blank">
![fórmula recursiva](https://user-images.githubusercontent.com/101985616/206966245-3eed2f00-b914-4a08-a5f2-df2eac2fedad.png)
</a>
</br>
A função `formula_fechada` utiliza da formula fechada da sequência para também encontrar o enésimo termo com a
diferença de que é mais rápido já que, diferente da formula recursiva, não precisa passar por todos os termos anteriores
para chegar ao termo desejado. </br>
<a href="https://www.ime.unicamp.br/~deleo/MA220/a03.pdf" target="_blank">
![fórmula fechada](https://user-images.githubusercontent.com/101985616/206967548-bf707cff-de07-4d8a-96eb-bd62f0a31184.png)
</a>
</br>
O restante das funções consistem em duas que servem apenas para o menu e a função `fibonacci_lista`
serve para armazenar numa lista a sequência até o enésimo termo escolhido. O menu te permite usar as duas fórmulas para encontrar
o termo que deseja e também uma lista com todos os termos até o enésimo termo escolhido.
</br> </br>
Já a pasta Fibonacci contém o projeto em Java. A classe 
<a href="https://github.com/juniorcavicchioli/fibonacci/blob/main/Fibonacci/src/br/com/fiap/tads/rm94548/ddd/fibonacci/Fibonacci.java">
Fibonacci</a> tem a lógica semelhante do programa em Python com a diferença de sintaxe e as nomenclaturas respeitam o 
<a href="https://pt.wikipedia.org/wiki/CamelCase">camelCase</a>, então o método <b>formulaFechada</b> equivale à função <b>formula_fecheada</b>
do projeto em Python assim como o método <b>formulaRecursiva</b> equivale à função <b>formula_recursiva</b>.
</br>

Outra diferença está na estrutura do menu, que não utiliza de funções extras como no projeto Python, o que é irrelevante para o objetivo do
projeto.

## Autor
Feito por [@juniorcavicchioli](https://github.com/juniorcavicchioli?tab=repositories). Entre em contato!

LinkedIn: [Adilson Roberto Cavicchioli Junior](https://www.linkedin.com/in/adilson-roberto-cavicchioli-junior-6816b7192?lipi=urn%3Ali%3Apage%3Ad_flagship3_profile_view_base_contact_details%3BIpMh5bVEQOi82%2FRHJ6oxkg%3D%3D) <br>
Email: [cavicchioli.adilson@gmail.com](mailto:cavicchioli.adilson@gmail.com)
