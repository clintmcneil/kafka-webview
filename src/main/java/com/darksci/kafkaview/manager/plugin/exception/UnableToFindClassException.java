package com.darksci.kafkaview.manager.plugin.exception;

public class UnableToFindClassException extends LoaderException {

    public UnableToFindClassException(final String message, final Exception cause) {
        super(message, cause);
    }
}
