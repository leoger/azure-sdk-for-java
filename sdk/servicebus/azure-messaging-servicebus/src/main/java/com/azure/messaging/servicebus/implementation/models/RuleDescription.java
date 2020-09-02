// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.servicebus.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.time.OffsetDateTime;

/** The RuleDescription model. */
@JacksonXmlRootElement(
        localName = "RuleDescription",
        namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
@Fluent
public final class RuleDescription {
    /*
     * The filter property.
     */
    @JacksonXmlProperty(
            localName = "Filter",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private RuleFilterImpl filter;

    /*
     * The action property.
     */
    @JacksonXmlProperty(
            localName = "Action",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private RuleActionImpl action;

    /*
     * The exact time the rule was created.
     */
    @JacksonXmlProperty(
            localName = "CreatedAt",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private OffsetDateTime createdAt;

    /*
     * The name property.
     */
    @JacksonXmlProperty(
            localName = "Name",
            namespace = "http://schemas.microsoft.com/netservices/2010/10/servicebus/connect")
    private String name;

    /**
     * Get the filter property: The filter property.
     *
     * @return the filter value.
     */
    public RuleFilterImpl getFilter() {
        return this.filter;
    }

    /**
     * Set the filter property: The filter property.
     *
     * @param filter the filter value to set.
     * @return the RuleDescription object itself.
     */
    public RuleDescription setFilter(RuleFilterImpl filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Get the action property: The action property.
     *
     * @return the action value.
     */
    public RuleActionImpl getAction() {
        return this.action;
    }

    /**
     * Set the action property: The action property.
     *
     * @param action the action value to set.
     * @return the RuleDescription object itself.
     */
    public RuleDescription setAction(RuleActionImpl action) {
        this.action = action;
        return this;
    }

    /**
     * Get the createdAt property: The exact time the rule was created.
     *
     * @return the createdAt value.
     */
    public OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Set the createdAt property: The exact time the rule was created.
     *
     * @param createdAt the createdAt value to set.
     * @return the RuleDescription object itself.
     */
    public RuleDescription setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get the name property: The name property.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: The name property.
     *
     * @param name the name value to set.
     * @return the RuleDescription object itself.
     */
    public RuleDescription setName(String name) {
        this.name = name;
        return this;
    }
}
