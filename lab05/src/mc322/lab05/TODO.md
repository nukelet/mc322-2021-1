## Bugs

## Implement
- Gabriel:
    - Maybe have a Game class that encapsulates the Board operations?
    - Make pieces unable to capture other pieces of the same color
    - Make sure that a piece is forced to capture if there are pieces available to be captured
    - Track whether it's black or white's move
        - Keep track of whether the last move was a capture?
    - Implement executaJogoConsole() in AppDama
    - Make Position an immutable class (`final`)
    - Command class

- Remove debug messages that print to stdin (printing to stderr is fine)
- Fix bug where the Queen is not being forced to capture a piece right after promotion (see Board.doPawnMove() for details)
