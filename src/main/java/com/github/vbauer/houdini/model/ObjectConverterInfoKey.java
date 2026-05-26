package com.github.vbauer.houdini.model;

import java.util.Arrays;
import java.util.Objects;

/**
 * Class represents key information about input and output parameters for object converter.
 *
 * @param <R> class type
 * @author Vladislav Bauer
 */
public final class ObjectConverterInfoKey<R> {

    private final Class<?>[] sources;

    private final Class<R> target;

    public ObjectConverterInfoKey(final Class<R> target, final Class<?>... sources) {
        this.target = target;
        this.sources = sources;
    }

    /**
     * Get array with input parameter classes.
     *
     * @return source classes
     */
    @SuppressWarnings("all")
    public Class<?>[] getSources() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Get target / output class.
     *
     * @return target class
     */
    @SuppressWarnings("all")
    public Class<R> getTarget() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    @SuppressWarnings("unchecked")
    @Override
    public boolean equals(final Object obj) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /*
     * Internal API.
     */
    private boolean hasSameTarget(final ObjectConverterInfoKey<R> other) {
        return Objects.equals(getTarget(), other.getTarget());
    }

    private boolean hasSameSources(final ObjectConverterInfoKey<R> other) {
        final Class<?>[] selfSources = getSources();
        final Class<?>[] otherSources = other.getSources();
        final int selfLength = selfSources.length;
        final int otherLength = otherSources.length;
        if (selfLength != otherLength) {
            return false;
        } else if (selfLength == 0) {
            return true;
        }
        for (int i = 0; i < selfLength; i++) {
            final Class<?> selfClass = selfSources[i];
            final Class<?> otherClass = otherSources[i];
            if (!Objects.equals(selfClass, otherClass) && !Objects.equals(selfClass, Object.class) && !Objects.equals(otherClass, Object.class)) {
                return false;
            }
        }
        return true;
    }
}
