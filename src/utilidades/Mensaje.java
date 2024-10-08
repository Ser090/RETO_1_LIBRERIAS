/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

/**
 *
 * @author 2dam
 */
public class Mensaje {

    private MensajeType type;
    private Object object;

    public Mensaje(MensajeType type, Object object) {
        this.type = type;
        this.object = object;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MensajeType type) {
        this.type = type;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

}
