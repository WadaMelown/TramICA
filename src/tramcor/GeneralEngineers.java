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
public class GeneralEngineers extends ErrorHandling
{
    @Override
    public void setNext(ErrorHandling High)
    {
        nextInChain = High;
    }
    @Override
    public void processError(Error error)
    {
        if(error.getError() == ErrorLevel.HIGH)
        {
            
            System.out.println("Handled By GeneralEngineers");
        }
        else
        {
            nextInChain.processError(error);
        }
    }

}