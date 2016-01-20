# TetrisGame


I have created tetris game on the console and it does not contains user interaction.
Tetris game contains squares, cells, pieces and grid. 
I have not implemented key listener event. 
Game plays randomly by itself. 
I have created 7 pieces with 4 squares.
Pieces made from 4 squares. 
These are lineshape, jshape, lshape, squareshape, sshape, tshape,zhape.
Then I implemented a timer in grid class and it create a piece(squares) or move squares(piece) 
until piece stop(moveStopped). 
I have created cells and implement in grid class in order to print grid object.
I have printed grid with movement of piece object. 
I control full lines with filled in grid class if it is full,
then delete whole line and fall down filled object with one cell. 
Piece moves randomly, I have implemented this in piece class. 
A piece falls down with one by one and it turns left or right or it does not turn. 
In order to stop piece, it moves to end of grid object or grid contains another piece under this piece.
I have checked this via canmove method and it moves via move and moveSquares methods. I have filled cells in this class.       
