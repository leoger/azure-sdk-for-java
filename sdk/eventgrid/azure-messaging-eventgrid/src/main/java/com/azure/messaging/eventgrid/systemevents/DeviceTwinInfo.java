// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The DeviceTwinInfo model. */
@Fluent
public final class DeviceTwinInfo {
    /*
     * Authentication type used for this device: either SAS, SelfSigned, or
     * CertificateAuthority.
     */
    @JsonProperty(value = "authenticationType")
    private String authenticationType;

    /*
     * Count of cloud to device messages sent to this device.
     */
    @JsonProperty(value = "cloudToDeviceMessageCount")
    private Float cloudToDeviceMessageCount;

    /*
     * Whether the device is connected or disconnected.
     */
    @JsonProperty(value = "connectionState")
    private String connectionState;

    /*
     * The unique identifier of the device twin.
     */
    @JsonProperty(value = "deviceId")
    private String deviceId;

    /*
     * A piece of information that describes the content of the device twin.
     * Each etag is guaranteed to be unique per device twin.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /*
     * The ISO8601 timestamp of the last activity.
     */
    @JsonProperty(value = "lastActivityTime")
    private String lastActivityTime;

    /*
     * Properties JSON element.
     */
    @JsonProperty(value = "properties")
    private DeviceTwinInfoProperties properties;

    /*
     * Whether the device twin is enabled or disabled.
     */
    @JsonProperty(value = "status")
    private String status;

    /*
     * The ISO8601 timestamp of the last device twin status update.
     */
    @JsonProperty(value = "statusUpdateTime")
    private String statusUpdateTime;

    /*
     * An integer that is incremented by one each time the device twin is
     * updated.
     */
    @JsonProperty(value = "version")
    private Float version;

    /*
     * The thumbprint is a unique value for the x509 certificate, commonly used
     * to find a particular certificate in a certificate store. The thumbprint
     * is dynamically generated using the SHA1 algorithm, and does not
     * physically exist in the certificate.
     */
    @JsonProperty(value = "x509Thumbprint")
    private DeviceTwinInfoX509Thumbprint x509Thumbprint;

    /**
     * Get the authenticationType property: Authentication type used for this device: either SAS, SelfSigned, or
     * CertificateAuthority.
     *
     * @return the authenticationType value.
     */
    public String getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: Authentication type used for this device: either SAS, SelfSigned, or
     * CertificateAuthority.
     *
     * @param authenticationType the authenticationType value to set.
     * @return the DeviceTwinInfo object itself.
     */
    public DeviceTwinInfo setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the cloudToDeviceMessageCount property: Count of cloud to device messages sent to this device.
     *
     * @return the cloudToDeviceMessageCount value.
     */
    public Float getCloudToDeviceMessageCount() {
        return this.cloudToDeviceMessageCount;
    }

    /**
     * Set the cloudToDeviceMessageCount property: Count of cloud to device messages sent to this device.
     *
     * @param cloudToDeviceMessageCount the cloudToDeviceMessageCount value to set.
     * @return the DeviceTwinInfo object itself.
     */
    public DeviceTwinInfo setCloudToDeviceMessageCount(Float cloudToDeviceMessageCount) {
        this.cloudToDeviceMessageCount = cloudToDeviceMessageCount;
        return this;
    }

    /**
     * Get the connectionState property: Whether the device is connected or disconnected.
     *
     * @return the connectionState value.
     */
    public String getConnectionState() {
        return this.connectionState;
    }

    /**
     * Set the connectionState property: Whether the device is connected or disconnected.
     *
     * @param connectionState the connectionState value to set.
     * @return the DeviceTwinInfo object itself.
     */
    public DeviceTwinInfo setConnectionState(String connectionState) {
        this.connectionState = connectionState;
        return this;
    }

    /**
     * Get the deviceId property: The unique identifier of the device twin.
     *
     * @return the deviceId value.
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * Set the deviceId property: The unique identifier of the device twin.
     *
     * @param deviceId the deviceId value to set.
     * @return the DeviceTwinInfo object itself.
     */
    public DeviceTwinInfo setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * Get the etag property: A piece of information that describes the content of the device twin. Each etag is
     * guaranteed to be unique per device twin.
     *
     * @return the etag value.
     */
    public String getEtag() {
        return this.etag;
    }

    /**
     * Set the etag property: A piece of information that describes the content of the device twin. Each etag is
     * guaranteed to be unique per device twin.
     *
     * @param etag the etag value to set.
     * @return the DeviceTwinInfo object itself.
     */
    public DeviceTwinInfo setEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the lastActivityTime property: The ISO8601 timestamp of the last activity.
     *
     * @return the lastActivityTime value.
     */
    public String getLastActivityTime() {
        return this.lastActivityTime;
    }

    /**
     * Set the lastActivityTime property: The ISO8601 timestamp of the last activity.
     *
     * @param lastActivityTime the lastActivityTime value to set.
     * @return the DeviceTwinInfo object itself.
     */
    public DeviceTwinInfo setLastActivityTime(String lastActivityTime) {
        this.lastActivityTime = lastActivityTime;
        return this;
    }

    /**
     * Get the properties property: Properties JSON element.
     *
     * @return the properties value.
     */
    public DeviceTwinInfoProperties getProperties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties JSON element.
     *
     * @param properties the properties value to set.
     * @return the DeviceTwinInfo object itself.
     */
    public DeviceTwinInfo setProperties(DeviceTwinInfoProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the status property: Whether the device twin is enabled or disabled.
     *
     * @return the status value.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Set the status property: Whether the device twin is enabled or disabled.
     *
     * @param status the status value to set.
     * @return the DeviceTwinInfo object itself.
     */
    public DeviceTwinInfo setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the statusUpdateTime property: The ISO8601 timestamp of the last device twin status update.
     *
     * @return the statusUpdateTime value.
     */
    public String getStatusUpdateTime() {
        return this.statusUpdateTime;
    }

    /**
     * Set the statusUpdateTime property: The ISO8601 timestamp of the last device twin status update.
     *
     * @param statusUpdateTime the statusUpdateTime value to set.
     * @return the DeviceTwinInfo object itself.
     */
    public DeviceTwinInfo setStatusUpdateTime(String statusUpdateTime) {
        this.statusUpdateTime = statusUpdateTime;
        return this;
    }

    /**
     * Get the version property: An integer that is incremented by one each time the device twin is updated.
     *
     * @return the version value.
     */
    public Float getVersion() {
        return this.version;
    }

    /**
     * Set the version property: An integer that is incremented by one each time the device twin is updated.
     *
     * @param version the version value to set.
     * @return the DeviceTwinInfo object itself.
     */
    public DeviceTwinInfo setVersion(Float version) {
        this.version = version;
        return this;
    }

    /**
     * Get the x509Thumbprint property: The thumbprint is a unique value for the x509 certificate, commonly used to find
     * a particular certificate in a certificate store. The thumbprint is dynamically generated using the SHA1
     * algorithm, and does not physically exist in the certificate.
     *
     * @return the x509Thumbprint value.
     */
    public DeviceTwinInfoX509Thumbprint getX509Thumbprint() {
        return this.x509Thumbprint;
    }

    /**
     * Set the x509Thumbprint property: The thumbprint is a unique value for the x509 certificate, commonly used to find
     * a particular certificate in a certificate store. The thumbprint is dynamically generated using the SHA1
     * algorithm, and does not physically exist in the certificate.
     *
     * @param x509Thumbprint the x509Thumbprint value to set.
     * @return the DeviceTwinInfo object itself.
     */
    public DeviceTwinInfo setX509Thumbprint(DeviceTwinInfoX509Thumbprint x509Thumbprint) {
        this.x509Thumbprint = x509Thumbprint;
        return this;
    }
}
