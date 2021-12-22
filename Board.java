import java.util.*;

class Board {
    private HashMap<Integer, Integer> snakes;
    private HashMap<Integer, Integer> ladders;
    private Queue<Player> players;
    private int BoardSize;

    public Board(HashMap<Integer, Integer> snakes, HashMap<Integer, Integer> ladders, Queue<Player> players,
            int BoardSize) {
        this.snakes = snakes;
        this.ladders = ladders;
        this.players = players;
        this.BoardSize = BoardSize;
    }

    public int getBoardSize() {
        return BoardSize;
    }

    public void Play() {
        while (true) {
            Player p1 = players.poll();
            int NewPosition = p1.getPosition();
            int FinalPosition = NewPosition + Dice.getDice();
            if (FinalPosition <= BoardSize) {
                if (snakes.containsKey(FinalPosition)) {
                    System.out.println(p1.getName() + " bitten by snake and moved to " + FinalPosition);
                    Snake.s1 = snakes.get(FinalPosition);
                    FinalPosition = s1.getEnding();
                } else if (ladders.containsKey(FinalPosition)) {
                    System.out.println(p1.getName() + " got a ladder and moved to" + FinalPosition);
                    Ladder.l1 = ladders.get(FinalPosition);
                    FinalPosition = l1.getEnding();

                } else {
                    System.out
                            .println(p1.getName() + "rolled a dice moved from " + NewPosition + "to " + FinalPosition);

                }

                if (NewPosition == BoardSize) {
                    System.out.println(p1.getName() + " won the game");
                    break;
                }
                p1.setPosition(NewPosition);
            }

            players.add(p1);

        }
    }
}
