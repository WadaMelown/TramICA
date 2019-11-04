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
public class TramEngineers extends ErrorHandling
{

    @Override
    public void setNext(ErrorHandling High2)
    {
        nextInChain = High2;
    }
    
    @Override
    public void processError(Error error)
    {
        if(error.getError() == ErrorLevel.HIGH2)
        {
            
            System.out.println("Handled By TramEngineers");
        }
        else
        {
            nextInChain.processError(error);
        }
    }


}
