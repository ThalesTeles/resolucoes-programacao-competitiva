CEDULAS = [100, 50, 20, 10, 5, 2, 1]

valor = int(input())
print(valor)

for cedula in CEDULAS:
    quantidade = valor // cedula
    print(f"{quantidade} notas(s) de R$ {cedula},00")
    valor %= cedula
