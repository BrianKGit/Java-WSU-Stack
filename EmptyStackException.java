/*
 * Author:      Brian Klein
 * Date:        11/29/17
 * Program:     EmptyStackException.java
 * Description: Handles EmptyStackException.
 */

public class EmptyStackException extends RuntimeException {

    public EmptyStackException(String error) {
        super(error);
    }
}
