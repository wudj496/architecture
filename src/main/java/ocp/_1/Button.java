package ocp._1;

/**
 * @Author : Wu.D.J
 * @Create : 2020.11.03
 */
public class Button {

    public static final int SEND_BUTTON = -99;

    private Dialer dialer;

    private int token;

    public Button(Dialer dialer, int token) {
        this.dialer = dialer;
        this.token = token;
    }

    public void process() {
        switch (token) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                dialer.enterDigit(token);
                break;

            case SEND_BUTTON:
                dialer.dial();
                break;

            default:
                throw new UnsupportedOperationException("unknown button pressed: token = " + token);
        }
    }
}
