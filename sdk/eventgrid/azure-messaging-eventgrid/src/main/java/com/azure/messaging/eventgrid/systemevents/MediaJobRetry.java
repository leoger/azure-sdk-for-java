// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for MediaJobRetry. */
public enum MediaJobRetry {
    /** Enum value DoNotRetry. */
    DO_NOT_RETRY("DoNotRetry"),

    /** Enum value MayRetry. */
    MAY_RETRY("MayRetry");

    /** The actual serialized value for a MediaJobRetry instance. */
    private final String value;

    MediaJobRetry(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a MediaJobRetry instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed MediaJobRetry object, or null if unable to parse.
     */
    @JsonCreator
    public static MediaJobRetry fromString(String value) {
        MediaJobRetry[] items = MediaJobRetry.values();
        for (MediaJobRetry item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
