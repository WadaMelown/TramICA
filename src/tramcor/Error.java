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
public class Error 
{
    private ErrorLevel level;

    public Error(ErrorLevel level)
    {
        this.level = level;
    }
    public ErrorLevel getError()
    {
        return level;       
    }

}