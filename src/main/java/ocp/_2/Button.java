package ocp._2;

/**
 * @Author : Wu.D.J
 * @Create : 2020.11.03
 */
public class Button {

    private int token;

    private ButtonServer buttonServer;

    public Button(int token, ButtonServer buttonServer) {
        this.token = token;
        this.buttonServer = buttonServer;
    }

    public void process() {
        buttonServer.buttonPressed(token);
    }

}
