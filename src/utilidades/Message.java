package utilidades;

/**
 *
 * @author Urko
 */
public class Message {

    private MessageType type;
    private Object object;

    public Message(MessageType type, Object object) {
        this.type = type;
        this.object = object;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

}
