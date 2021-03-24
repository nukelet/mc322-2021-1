# "Encaixotando" TADs

## Pilha

| Membros       |
| -------       |
| `int stack[]` |
| `int size`    |


| Métodos       |
| -------       |
| `constructor` |
| `push(n)`     |
| `pop()`       |

### Implementação dos métodos

```
constructor:
    size = 0
```

```
push(n):
    stack[size] = n
    size += 1
```

```
pop():
    if size > 0:
        size -= 1
        return stack[size+1]
```

## Fila

| Membros       |
| -------       |
| `int queue[]` |
| `int size`    |


| Métodos       |
| -------       |
| `constructor` |
| `enqueue(n)`  |
| `dequeue()`   |

### Implementação dos métodos 

```
constructor:
    size = 0
```

```
enqueue(n):
    queue[size] = n
    size -= 1
```

```
dequeue():
    if size > 0:
        head = queue[0]
        size -= 1
        for i from 0 to size-1:
            queue[i] = queue[i+1]
        return head
```
> Nota: essa implementação do método `dequeue()` em complexidade `O(n)` não é ideal e pode ser melhorada para complexidade `O(1)` (amortizada) usando uma lista ligada/array circular/array dinâmico em vez de um array estático comum.
