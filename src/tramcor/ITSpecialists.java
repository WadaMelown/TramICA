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
public class ITSpecialists extends ErrorHandling
{
    @Override
    public void setNext(ErrorHandling Medium1)
    {
        nextInChain = Medium1;
    }
    @Override
    public void processError(Error error)
    {
        if(error.getError() == ErrorLevel.MEDIUM1)
        {
            
            System.out.println("Handled By ITSpecialists");
        }
        else
        {
            nextInChain.processError(error);
        }
    }

}