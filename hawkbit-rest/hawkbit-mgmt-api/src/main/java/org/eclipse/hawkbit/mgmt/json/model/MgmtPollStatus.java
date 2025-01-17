/**
 * Copyright (c) 2015 Bosch Software Innovations GmbH and others
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.hawkbit.mgmt.json.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A json annotated rest model for PollStatus to RESTful API representation.
 *
 *
 *
 *
 */
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class MgmtPollStatus {

    @JsonProperty
    private Long lastRequestAt;

    @JsonProperty
    private Long nextExpectedRequestAt;

    @JsonProperty
    private boolean overdue;

    /**
     * @return the lastRequestAt
     */
    public Long getLastRequestAt() {
        return lastRequestAt;
    }

    /**
     * @param lastRequestAt
     *            the lastRequestAt to set
     */
    public void setLastRequestAt(final Long lastRequestAt) {
        this.lastRequestAt = lastRequestAt;
    }

    /**
     * @return the nextExpectedRequestAt
     */
    public Long getNextExpectedRequestAt() {
        return nextExpectedRequestAt;
    }

    /**
     * @param nextExpectedRequestAt
     *            the nextExpectedRequestAt to set
     */
    public void setNextExpectedRequestAt(final Long nextExpectedRequestAt) {
        this.nextExpectedRequestAt = nextExpectedRequestAt;
    }

    /**
     * @return the overdue
     */
    public boolean isOverdue() {
        return overdue;
    }

    /**
     * @param overdue
     *            the overdue to set
     */
    public void setOverdue(final boolean overdue) {
        this.overdue = overdue;
    }
}
