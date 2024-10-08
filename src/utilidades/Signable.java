/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

/**
 *
 * @author Urko
 */
public interface Signable {

    public Mensaje signIn(User user);

    public Mensaje signUp(User user);

}
