import random

def napuniNiz(niz, size):
    for x in range(size):
        niz.append(random.randint(-100, 100))

def selectionSort(niz):
    for i in range(len(niz)):
        min = i
        
        for j in range(i+1, len(niz)):
            if niz[j] < niz[min]:
                min = j
        niz[i], niz[min] = niz[min], niz[i]
        
size = 10
niz = []

napuniNiz(niz, size)
print(f"Nesortiran niz:{niz}")

selectionSort(niz)
print(f"Sortiran niz:{niz}")



