/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tramcor;

/**
 *
 * @author s6105692
 */
public abstract class ErrorHandling 
{
    protected ErrorHandling nextInChain;

    public abstract void setNext(ErrorHandling nextInChain);
    public abstract void processError(Error request);    

}
