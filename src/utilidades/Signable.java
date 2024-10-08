package utilidades;

/**
 *
 * @author Urko
 */
public interface Signable {

    public Message signUp(User user);

    public Message signIn(User user);
}
