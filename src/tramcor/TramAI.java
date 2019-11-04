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
public class TramAI extends ErrorHandling
{

    @Override
    public void setNext(ErrorHandling Low)
    {
        nextInChain = Low;
    }
    
    @Override
    public void processError(Error error)
    {
        if(error.getError() == ErrorLevel.LOW)
        {
            
            System.out.println("Handled By TramAI");
        }
        else
        {
            nextInChain.processError(error);
        }
    }


}
