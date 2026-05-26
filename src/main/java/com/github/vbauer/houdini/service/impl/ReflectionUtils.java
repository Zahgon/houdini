package com.github.vbauer.houdini.service.impl;

import com.google.common.annotations.VisibleForTesting;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.UndeclaredThrowableException;

/**
 * Util-class which provides additional operation to work with reflection mechanism.
 *
 * @author Vladislav Bauer
 */
final class ReflectionUtils {

    private ReflectionUtils() {
        throw new UnsupportedOperationException();
    }

    /**
     * Get class without possible proxies. It works only with Hibernate library.
     * Otherwise it returns the {@link Object#getClass()}.
     *
     * @param object object
     * @param <T> type of the result object
     * @return type of the object without some proxy wrappers
     */
    @SuppressWarnings("unchecked")
    @VisibleForTesting
    static <T> Class<T> getClassWithoutProxies(final T object) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Get array of classes which represents un-proxy classes of the given objects.
     *
     * @param sources array with objects
     * @return un-proxy classes
     */
    @VisibleForTesting
    static Class<?>[] getClassesWithoutProxies(final Object[] sources) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Convert exception to the {@link RuntimeException}.
     *
     * @param ex exception
     */
    @VisibleForTesting
    static void handleReflectionException(final Exception ex) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @VisibleForTesting
    static void handleInvocationTargetException(final InvocationTargetException ex) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @VisibleForTesting
    static void rethrowRuntimeException(final Throwable ex) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
