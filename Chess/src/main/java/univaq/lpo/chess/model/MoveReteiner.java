package univaq.lpo.chess.model;

import java.util.ArrayDeque;
import java.util.Deque;

public class MoveReteiner {
    private Deque<Integer> moves;
    private final int maxMoves = 5;
    public MoveReteiner(){
        this.moves = new ArrayDeque<Integer>();

    }
    public void add(Integer move){
        if(this.moves.size() == this.maxMoves){
            this.moves.pollLast();
        }
        this.moves.addFirst(move);
    }
    public Integer get(){
        if(this.moves.isEmpty()){
            return null;
        }
        return this.moves.pollFirst();
    }
}
