frase = input("Digite a frase: ")
letra = input("Digite a letra: ")
aux = ""

for c in frase:
   if(c.upper == letra or c.lower == letra.lower):
      aux = aux + "*"
else:
      aux = aux + c

print(aux)

