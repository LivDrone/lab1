public class Main {



    public void main(String[] args) {// Instance of this class
        GameLogic gl = new GameLogic();
        GameView gv = new GameView();
        GameController gc = new GameController(gl,gv);

    }

}

