# hyperSkill_ConnectFour

Описание

До этого этапа два игрока могут сыграть только одну игру. Мы собираемся это изменить. На этом этапе реализуйте возможность играть в несколько игр.

После установки размеров доски спросите игроков, хотят ли они сыграть одну или несколько игр. В последнем случае сохраните и распечатайте партитуру. Когда игрок выигрывает игру, он получает 2 очка. Если ничья, дайте 1 очко каждому игроку.

Если игроки выбрали вариант с несколькими играми, чередуйте первый ход для каждой новой игры. Однако у каждого проигрывателя сохраняется один и тот же символ диска (см. Пример 3).

Цели

После настройки размеров доски игроки видят следующее:

Do you want to play single or multiple games?
For a single game, input 1 or press Enter
Input a number of games:
Only positive digits are valid as for input (except 0). If a player inputs anything else, print Invalid input and ask for another try (see Example 4).

If players input 1 or press Enter, start a single game and print the following message:

<1st player's name> VS <2nd player's name>
 X 
Single game
In this case, the gameplay remains the same (see Examples 1, 2).

If players input an integer that is bigger than 1, start the multiple game mode and print the following message:

<1st player's name> VS <2nd player's name>
<Rows> X <Columns>
Total <Number of games> games
Print the score after each finished game in the following format:

Score
<1st player's name>: 2 <2nd player's name>: 2
Перед началом игры выведите номер игры: Game #<Number of game>(см. Пример 3). Игроки делают первый ход по очереди, но каждый игрок сохраняет один и тот же символ диска на протяжении всех игр.

В любой момент игры, если игроки вводят endданные, ваша программа должна вывести Game over!и завершить игру (см. Пример 5).

Примеры
Символ "больше, чем", за которым следует пробел (> ), представляет ввод пользователя. Обратите внимание, что это не часть ввода.

Пример 1. одиночная игра (ввод игроков 1)

Connect Four
First player's name:
> Lily
Second player's name:
> James
Set the board dimensions (Rows x Columns)
Press Enter for default (6 x 7)
> 5 X 8
Do you want to play single or multiple games?
For a single game, input 1 or press Enter
Input a number of games:
> 1
Lily VS James
5 X 8 board
Single game
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Lily's turn:
> 3
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ο║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
James's turn:
> 3
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║*║ ║ ║ ║ ║ ║
║ ║ ║ο║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Lily's turn:
> 4
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║*║ ║ ║ ║ ║ ║
║ ║ ║ο║ο║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
James's turn:
> 4
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║*║*║ ║ ║ ║ ║
║ ║ ║ο║ο║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Lily's turn:
> 5
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║*║*║ ║ ║ ║ ║
║ ║ ║ο║ο║ο║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
James's turn:
> 5
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║*║*║*║ ║ ║ ║
║ ║ ║ο║ο║ο║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Lily's turn:
> 6
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║*║*║*║ ║ ║ ║
║ ║ ║ο║ο║ο║ο║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Player Lily won
Game over!
Example 2: a single game (players input Enter)

Connect Four
First player's name:
> Lily
Second player's name:
> James
Set the board dimensions (Rows x Columns)
Press Enter for default (6 x 7)
> 5x6
Do you want to play single or multiple games?
For a single game, input 1 or press Enter
Input a number of games:
>
Lily VS James
5 X 6 board
Single game
 1 2 3 4 5 6
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╝
Lily's turn:
> 5
 1 2 3 4 5 6
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ο║ ║
╚═╩═╩═╩═╩═╩═╝
James's turn:
> 6
 1 2 3 4 5 6
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ο║*║
╚═╩═╩═╩═╩═╩═╝
Lily's turn:
> 5
 1 2 3 4 5 6
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ο║ ║
║ ║ ║ ║ ║ο║*║
╚═╩═╩═╩═╩═╩═╝
James's turn:
> 6
 1 2 3 4 5 6
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ο║*║
║ ║ ║ ║ ║ο║*║
╚═╩═╩═╩═╩═╩═╝
Lily's turn:
> 5
 1 2 3 4 5 6
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ο║ ║
║ ║ ║ ║ ║ο║*║
║ ║ ║ ║ ║ο║*║
╚═╩═╩═╩═╩═╩═╝
James's turn:
> 6
 1 2 3 4 5 6
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ο║*║
║ ║ ║ ║ ║ο║*║
║ ║ ║ ║ ║ο║*║
╚═╩═╩═╩═╩═╩═╝
Lily's turn:
> 5
 1 2 3 4 5 6
║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ο║ ║
║ ║ ║ ║ ║ο║*║
║ ║ ║ ║ ║ο║*║
║ ║ ║ ║ ║ο║*║
╚═╩═╩═╩═╩═╩═╝
Player Lily won
Game over!
Example 3: multiple games

Connect Four
First player's name:
> Lily
Second player's name:
> James
Set the board dimensions (Rows x Columns)
Press Enter for default (6 x 7)
> 6x7
Do you want to play single or multiple games?
For a single game, input 1 or press Enter
Input a number of games:
> 3
Lily VS James
6 X 7 board
Total 3 games
Game #1
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Lily's turn:
> 1
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
James's turn:
> 1
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║*║ ║ ║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Lily's turn:
> 2
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║*║ ║ ║ ║ ║ ║ ║
║ο║ο║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
James's turn:
> 2
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║*║*║ ║ ║ ║ ║ ║
║ο║ο║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Lily's turn:
> 3
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║*║*║ ║ ║ ║ ║ ║
║ο║ο║ο║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
James's turn:
> 3
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║*║*║*║ ║ ║ ║ ║
║ο║ο║ο║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Lily's turn:
> 4
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║*║*║*║ ║ ║ ║ ║
║ο║ο║ο║ο║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Player Lily won
Score
Lily: 2 James: 0
Game #2
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
James's turn:
> 4
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║*║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Lily's turn:
> 5
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║*║ο║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
James's turn:
> 4
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║*║ ║ ║ ║
║ ║ ║ ║*║ο║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Lily's turn:
> 5
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║*║ο║ ║ ║
║ ║ ║ ║*║ο║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
James's turn:
> 4
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║*║ ║ ║ ║
║ ║ ║ ║*║ο║ ║ ║
║ ║ ║ ║*║ο║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Lily's turn:
> 5
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║*║ο║ ║ ║
║ ║ ║ ║*║ο║ ║ ║
║ ║ ║ ║*║ο║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
James's turn:
> 4
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║*║ ║ ║ ║
║ ║ ║ ║*║ο║ ║ ║
║ ║ ║ ║*║ο║ ║ ║
║ ║ ║ ║*║ο║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Player James won
Score
Lily: 2 James: 2
Game #3
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Lily's turn:
> 7
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ο║
╚═╩═╩═╩═╩═╩═╩═╝
James's turn:
> 1
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║*║ ║ ║ ║ ║ ║ο║
╚═╩═╩═╩═╩═╩═╩═╝
Lily's turn:
> 6
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║*║ ║ ║ ║ ║ο║ο║
╚═╩═╩═╩═╩═╩═╩═╝
James's turn:
> 2
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║*║*║ ║ ║ ║ο║ο║
╚═╩═╩═╩═╩═╩═╩═╝
Lily's turn:
> 5
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║*║*║ ║ ║ο║ο║ο║
╚═╩═╩═╩═╩═╩═╩═╝
James's turn:
> 3
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║*║*║*║ ║ο║ο║ο║
╚═╩═╩═╩═╩═╩═╩═╝
Lily's turn:
> 4
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║*║*║*║ο║ο║ο║ο║
╚═╩═╩═╩═╩═╩═╩═╝
Player Lily won
Score
Lily: 4 James: 2
Game over!
Пример 4: неверный ввод

Connect Four
First player's name:
> Lily
Second player's name:
> James
Set the board dimensions (Rows x Columns)
Press Enter for default (6 x 7)
> 5x8
Do you want to play single or multiple games?
For a single game, input 1 or press Enter
Input a number of games:
> 0
Invalid input
Do you want to play single or multiple games?
For a single game, input 1 or press Enter
Input a number of games:
> One
Invalid input
Do you want to play single or multiple games?
For a single game, input 1 or press Enter
Input a number of games:
> 1 1
Invalid input
Do you want to play single or multiple games?
For a single game, input 1 or press Enter
Input a number of games:
> 5
Lily VS James
5 X 8 board
Total 5 games
Game #1
 1 2 3 4 5 6 7 8
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╩═╝
Lily's turn:
> end
Game over!
Пример 5: выход

Connect Four
First player's name:
> Lily
Second player's name:
> James
Set the board dimensions (Rows x Columns)
Press Enter for default (6 x 7)
> 5x7
Do you want to play single or multiple games?
For a single game, input 1 or press Enter
Input a number of games:
> 3
Lily VS James
5 X 7 board
Total 3 games
Game #1
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Lily's turn:
> 1
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ο║ ║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
James's turn:
> 2
 1 2 3 4 5 6 7
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ ║ ║ ║ ║ ║ ║ ║
║ο║*║ ║ ║ ║ ║ ║
╚═╩═╩═╩═╩═╩═╩═╝
Lily's turn:
> end
Game over!
