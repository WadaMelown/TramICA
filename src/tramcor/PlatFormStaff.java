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
public class PlatFormStaff extends ErrorHandling
{
    @Override
    public void setNext(ErrorHandling Low1)
    {
        nextInChain = Low1;
    }
    @Override
    public void processError(Error error)
    {
        if(error.getError() == ErrorLevel.LOW1)
        {
            
            System.out.println("Handled By Platform Staff");
        }
        else
        {
            nextInChain.processError(error);
        }
    }

}