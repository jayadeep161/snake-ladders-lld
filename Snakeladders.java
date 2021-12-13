package hostel;

public class Snakeladders {

    private int head;
    private int tail;
    Snakeladders(int head,int tail){
        this.head=head;
        this.tail=tail;
    }
    public int getTail(){
        return tail;
    }
}
class snake extends Snakeladders{
    snake(int head,int tail){
        super(head,tail);
    }
}
class ladder extends Snakeladders{
    ladder(int head,int tail){
        super(head, tail);
    }
}
