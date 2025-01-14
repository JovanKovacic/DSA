import random
import matplotlib.pyplot as plt

lista = []

def napuniListu():

    for x in range(20):
        lista.append(random.randint(1, 500))

    return lista

def bubbleSort(lista):

    plt.figure(figsize=(10, 6))
    plt.title("Bubble Sort - Koraci sortiranja")
    plt.xlabel("Indeks")
    plt.ylabel("Vrednost")
    
    plt.bar(range(len(lista)), lista, color='blue', alpha=0.6)
    plt.pause(0.5)

    for i in range(len(lista) - 1):
        for j in range(len(lista) - i - 1):
            if lista[j] > lista[j + 1]:
                lista[j], lista[j + 1] = lista[j + 1], lista[j]

        plt.clf()
        plt.bar(range(len(lista)), lista, color='blue', alpha=0.6)
        plt.title(f"Bubble Sort - Korak {i + 1}")
        plt.xlabel("Indeks")
        plt.ylabel("Vrednost")
        plt.pause(0.7) 
    
    plt.clf()
    plt.bar(range(len(lista)), lista, color='green', alpha=0.6)
    plt.title("Bubble Sort - Posle sortiranja")
    plt.xlabel("Indeks")
    plt.ylabel("Vrednost")
    plt.show()

napuniListu()
print("Nesortitana lista")
print(lista)
bubbleSort(lista)
print("Sortitana lista")
print(lista)