package com.github.vbauer.houdini.exception.base;

/**
 * @author Vladislav Bauer
 */
@SuppressWarnings("serial")
public abstract class ObjectConverterException extends RuntimeException {

    /**
     * {@inheritDoc}
     */
    @Override
    public String getMessage() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
