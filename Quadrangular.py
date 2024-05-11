#listagem de times
def inicia_times(lst):
    nomes = ["Real Madrid", "Bayern Munich", 
             "Borussia Dortmund", "Barcelona"]
    for nome in nomes:
        lst.append(nome)
        lst.append(0) #Vitórias
        lst.append(0) #empates
        lst.append(0) #derrotas
        lst.append(0) #saldo de gols
        #Outro for?
#partidas
def define_partidas():
    nomes = ["Real Madrid", "Bayern Munich", "Borussia Dortmund", "Barcelona"]
    lista = [nomes[0], "", nomes[1], "", nomes[2], "", nomes[3], "",
             nomes[0], "", nomes[3], "", nomes[2], "", nomes[0], "",
             nomes[0], "", nomes[2], "", nomes[1], "", nomes[3], ""]
    return lista
#menu do sistema
def menu():
    print("Quandrangular Futebol")
    print("1 - Classificação\n2 - Partida\n3 - Sair")
    return int(input("Escolha: "))
#pontuação 
def mostra_classificacao(lista):
    print("\nTabela classificação")
    i = 0
    while i < len(lista):
        pts = 3 * lista[i+1] + lista[i+2]
        print(f"{lista[i]}\t {pts} \t\t\t SG: {lista[i+4]}")
        i = i + 5
#gols feitos nas partidas
def adiciona_vitoria(nome_ganhador, delta_gols, teams):
    i = 0
    while i < len(teams) and teams[i] != nome_ganhador:
        i = i + 5
    if i >= len(teams):
        print(f"{nome_ganhador} não encontrado")
    else:
        teams[i+1] = teams[i+1] + 1
        teams[i+4] = teams[i+4] + delta_gols








def informa_resultado_partida(matches, teams):
    i = 0
    while i < len(matches) and matches[i+1] != "":
        i = i + 4
    print(f"{matches[i]} X {matches[i+2]}")
    gols1 = int(input(f"Gols {matches[i]}: "))
    gols2 = int(input(f"Gols {matches[i+2]}: "))

    matches[i+1] = gols1
    matches[i+3] = gols2
    if gols1 > gols2:
        adiciona_vitoria(matches[i], gols1 - gols2, teams)
        #adiciona_derrota(matches[i+2], gols1 - gols2, teams)
    elif gols1 < gols2:
        adiciona_vitoria(matches[i+2], gols2 - gols1, teams)
        #adiciona_derrota(matches[i], gols2 - gols1, teams)
    else:
        #adiciona_empate(matches[i], matches[i+2], teams)
        print("TODO")



times = []
inicia_times(times)
print(times)
partidas = define_partidas()
print(partidas)

opcao = menu()
while opcao != 3:
    if opcao == 1:
        mostra_classificacao(times)
    elif opcao == 2:
        informa_resultado_partida(partidas, times)

    opcao = menu()


    
