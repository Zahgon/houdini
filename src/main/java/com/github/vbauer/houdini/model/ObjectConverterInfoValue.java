package com.github.vbauer.houdini.model;

import java.lang.reflect.Method;

/**
 * Class represents internal information about object converter.
 *
 * @param <T> class type
 * @author Vladislav Bauer
 */
public final class ObjectConverterInfoValue<T> {

    private final Method method;

    private final T object;

    public ObjectConverterInfoValue(final Method method, final T object) {
        this.method = method;
        this.object = object;
    }

    /**
     * Get method that is used to convert data.
     *
     * @return method for conversion
     */
    public Method getMethod() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Get object that contains method for conversion.
     * @return root objectF
     */
    public T getObject() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
