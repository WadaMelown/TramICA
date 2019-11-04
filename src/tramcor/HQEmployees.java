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
public class HQEmployees extends ErrorHandling
{
    @Override
    public void setNext(ErrorHandling Medium)
    {
        nextInChain = Medium;
    }
    @Override
    public void processError(Error error)
    {
        if(error.getError() == ErrorLevel.MEDIUM)
        {
            
            System.out.println("Handled By HQEmployees");
        }
        else
        {
            nextInChain.processError(error);
        }
    }

}