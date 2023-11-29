# PROGRAMACIÓN MULTIHILO

## PLANTEAMIENTO

El programa genera una lista de todas las temperaturas máximas de los últimos 10 años que se han dado a diario en la ciudad. Se guarda en un array de enteros. Se busca encontrar la temperatura máxima utilizando programación multihilo.

## INSTRUCCIONES

- Para tener los datos, se rellena un array de 3.650 posiciones con valores aleatorios entre -30 y 50.
- El array se divide en varias partes iguales: cada hilo operará sobre una porción del array y buscará la temperatura máxima en su zona.
- Cuando se haya encontrado el máximo de cada subconjunto, se devolverá el valor máximo entre ellos. 
