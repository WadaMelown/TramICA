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
public class Electricians extends ErrorHandling
{

    @Override
    public void setNext(ErrorHandling High1)
    {
        nextInChain = High1;
    }
    
    @Override
    public void processError(Error error)
    {
        if(error.getError() == ErrorLevel.HIGH1)
        {
            
            System.out.println("Handled By Electricians");
        }
        else
        {
            nextInChain.processError(error);
        }
    }


}
