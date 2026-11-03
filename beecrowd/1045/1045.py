# Inicialização

lados = []
for _ in range(3):
    lados.append(float(input()))

# Ordenar entrada
for i in range(len(lados)):
    chave = i
    j = i
    while 0 <= j < len(lados):
        j += 1
        if j < len(lados) and lados[j] > lados[chave]:
            chave = j
    lados[i], lados[chave] = lados[chave], lados[i]

if lados[0] >= lados[1] + lados[2]:
    print("NAO FORMA TRIANGULO")
else:
    if lados[0]**2 == lados[1]**2 + lados[2]**2:
        print("TRIANGULO RETANGULO")
    if lados[0]**2 > lados[1]**2 + lados[2]**2:
        print("TRIANGULO OBTUSANGULO")
    if lados[0]**2 < lados[1]**2 + lados[2]**2:
        print("TRIANGULO ACUTANGULO")

    if all(lados[0]==l for l in lados):
        print("TRIANGULO EQUILATERO")
    elif (lados[0] == lados[1] or
          lados[0] == lados[1] or
          lados[1] == lados[2]):
        print("TRIANGULO ISOSCELES")
