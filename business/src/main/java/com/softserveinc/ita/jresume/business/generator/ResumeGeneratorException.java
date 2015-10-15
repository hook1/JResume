package com.softserveinc.ita.jresume.business.generator;

/**
 * @author Andriy Zykhor
 * 
 */
public class ResumeGeneratorException extends Exception {
    
    /**
     * universal version identifier for {@link ResumeGeneratorException} class.
     */
    private static final long serialVersionUID = -2657266239730113455L;
    
    /**
     * Constructs an {@code XstlTransformerException} with the specified detail
     * message.
     * 
     * @param message
     *            The detail message (which is saved for later retrieval by the
     *            {@link #getMessage()} method)
     */
    public ResumeGeneratorException(final String message) {
        super(message);
    }
    
    /**
     * Constructs an {@code ResumeGeneratorException} with the specified detail
     * message and cause.
     * 
     * @param message
     *            The detail message (which is saved for later retrieval by the
     *            {@link #getMessage()} method)
     * 
     * @param cause
     *            The cause (which is saved for later retrieval by the
     *            {@link #getCause()} method). (A null value is permitted, and
     *            indicates that the cause is nonexistent or unknown.)
     * 
     */
    public ResumeGeneratorException(final String message,
            final Throwable cause) {
        super(message, cause);
    }
    
}
