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
public interface Signable {

    public Message signUp(User user);

    public Message signIn(User user);
}
