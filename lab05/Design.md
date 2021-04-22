## Ideia
- Classes Pawn, Queen
- Classe Piece: ponteiro pra Pawn e Queen
- Classe Board: matriz de objetos Piece
- Talvez uma classe Position de modo que Board tem uma matriz de position
- O que fazer quando tem mais de uma peça disponível pra ser comida?
- Classe que traduz da notação de movimento "a2:c3" pros índices da matriz
- Classe pra "stringificar" o estado do tabuleiro?

## Piece
- `enum type {PAWN, QUEEN}`
- `Position pos` ?
- `private Pawn pawn`
- `private Queen queen`
- `updatePosition(Position newPos)`
- `promoteToQueen()` ?
- `isValidMove(Position newPos)`
- `toString()`

## Position
- `Position(String pos)`
- `public int x, y`

## Pawn
- `Position pos`
- `public isValidMove(Position pos)`

## Queen
- `int posX, posY`
- `public isValidMove(Position pos)`

## Board
- `Piece[][] board = new Piece[8][8]`
- `doMove(Position pos1, Position pos2)`
- `toString()`

## CSVParser

## AppDama
- `String[] moves`
- `executaJogo()`
