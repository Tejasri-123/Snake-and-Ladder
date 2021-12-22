import java.util.*;

class Data {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter board size");
        int boardSize = Integer.parseInt(sc.nextLine());

        System.out.println("Enter No.of Dices");
        int NoOfDices = Integer.parseInt(sc.nextLine());

        System.out.println("Enter No.of Snakes");
        int NoOfSnakes = Integer.parseInt(sc.nextLine());
        HashMap<Integer, Integer> smap = new HashMap<>();
        for (int i = 0; i < NoOfSnakes; i++) {
            String[] a = sc.nextLine().split(" ");
            smap.put(Integer.parseInt(a[0]), Integer.parseInt(a[1]));

        }
        System.out.println("Enter No.Of Ladders");
        int NoOfLadders = Integer.parseInt(sc.nextLine());
        HashMap<Integer, Integer> lmap = new HashMap<>();
        for (int i = 0; i < NoOfLadders; i++) {
            String[] b = sc.nextLine().split(" ");
            lmap.put(Integer.parseInt(b[0]), Integer.parseInt(b[1]));

        }
        System.out.println("Enter No.Of Players");
        int NoOfPlayers = Integer.parseInt(sc.nextLine());
        Queue<Player> playerlist = new LinkedList<Player>();
        for (int i = 0; i < NoOfPlayers; i++) {
            String c = sc.nextLine();
            Player p = new Player(c);
            playerlist.add(p);

        }

        Board board = new Board(smap, lmap, playerlist, boardSize);
        board.Play();

    }

}