def formula_fechada(n):
    """
    Encontra o enésimo termo sem a necessidade de percorrer toda a
    sequência até chegar nele.
    :param n: enésimo termo que deseja ser encontrado
    :return: o número inteiro na posição n
    """
    fn = 1/5**0.5*(1/2+5**0.5/2)**n-1/5**0.5*(1/2-5**0.5/2)**n
    return round(fn)


def formula_recursiva(n):
    """
    Percorre a sequência de fibonacci usando um looping para descobrir
    todos os antecessores do enésimo número até encontrá-lo.
    A variável fn armazena o valor do termo da última casa da sequência
    de fibonacci encontrada. A variável u armazena o último valor e a
    variável p armazena o penúltimo termo.
    :param n: enésimo termo que deseja ser encontrado
    :return: o número inteiro na posição n
    """
    if n == 1 or n == 2:
        fn = 1
    else:
        u, p = 1
        i = 3
        while i <= n:
            fn = u + p
            p = u
            u = fn
            i += 1
    return fn


def fibonacci_lista(n):
    """
    Armazena numa lista a sequência de fibonacci somente até o enésimo termo
    :param n: enésimo termo
    :return: uma lista
    """
    lista = []
    i = 1
    while len(lista) < n:
        lista.append(formula_fechada(i))
        i += 1
    return lista


# funções para o menu
def transformar_int(num):
    try:
        num = int(num)
        if num > 0:
            return num
        else:
            print("Por favor, insira um número inteiro maior do que 0.")
    except ValueError:
        print("Por favor, insira um número inteiro maior do que 0.")


def verificar_int():
    while True:
        num = input("Digite o enésimo termo ou [.] para cancelar\n->")
        if num != '.':
            num = transformar_int(num)
            if type(num) == int:
                break
        else:
            break
    return num


# menu para colocar em prática as funções.
while True:
    opcao = input("==============-FIBONACCI-==============\n"
                  "1. Gerar o enésimo número usando uma fórmula fechada\n"
                  "2. Gerar o enésimo número usando uma formula recursiva\n"
                  "3. Gerar uma lista com a sequência até o enésimo termo\n"
                  "0. Sair\n"
                  "-> ")
    if opcao == "1":
        enesimo = verificar_int()
        if enesimo != '.':
            print(f"O termo de número {enesimo} é {formula_fechada(enesimo)}.")
    elif opcao == "2":
        enesimo = verificar_int()
        if enesimo != '.':
            print(f"O termo de número {enesimo} é {formula_fechada(enesimo)}.")
    elif opcao == "3":
        enesimo = verificar_int()
        if enesimo != '.':
            print(f"Lista até o termo de número {enesimo}:")
            print(fibonacci_lista(enesimo))
    elif opcao == "0":
        print("O macaco está acenando. Tchau!")
        break
    else:
        print("Digite uma opção válida.")