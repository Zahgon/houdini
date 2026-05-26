package com.github.vbauer.houdini.exception;

import com.github.vbauer.houdini.exception.base.MethodObjectConverterException;
import java.util.Arrays;

/**
 * @author Vladislav Bauer
 */
@SuppressWarnings("serial")
public class DuplicatedObjectConverterException extends MethodObjectConverterException {

    public DuplicatedObjectConverterException(final Class<?> returnType, final Class<?>... parameterTypes) {
        super(returnType, parameterTypes);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getMessage() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
