print("Bem-vindo à Biblioteca FIAP")

opcao = 12357

while opcao != 6:
    print("Bem-vindo à Biblioteca FIAP")
    print("1 - Reserva Livro\n2 - Castra Livro")
    print("3 - Devolução\n4 - Consulta Livro")
    print("5 - Cadastro do Leitor\n6 - Sair")
    opcao = int(input("Digite a opção desejada"))

    if opcao == 1:
        isbn = input("Informe o isbn livro: ")
        Leitor = input("CPF dp leitor: ")
        print("disponível a partir do dia: 25/04/2024")
        confirmmacao = input("Deseja reservar (s/n): ")
    elif opcao == 2:
        pass
    elif opcao == 3:
        pass
    elif opcao == 4:
        pass
    elif  opcao == 5:
        nome = input("informe o nome: ") 
        cpf = input("informe o CPF: ")
        celular = input("Celular: ")
        rm = int(input("RM: "))
        print("Cadastro efetuado com sucesso!")
    elif opcao == 6:
        print("Até logo!")
    else:
        print("Opção Inválida!\n")    
