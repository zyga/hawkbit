/**
 * Copyright (c) 2017 Siemens AG
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.hawkbit.ddi.json.model;

import java.util.List;

import org.eclipse.hawkbit.ddi.rest.api.DdiRootControllerRestApi;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Provide action history information to the controller as part of response to
 * {@link DdiRootControllerRestApi#getControllerBasedeploymentAction} and
 * {@link DdiRootControllerRestApi#getControllerBaseconfirmationAction}:
 * 1. Current action status at the server; 2. List of messages from action history
 * that were sent to server earlier by the controller using
 * {@link DdiActionFeedback}.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonPropertyOrder({ "status", "messages" })
public class DdiActionHistory {

    @JsonProperty("status")
    private final String actionStatus;

    @JsonProperty("messages")
    private final List<String> messages;

    /**
     * Parameterized constructor for creating {@link DdiActionHistory}.
     *
     * @param actionStatus
     *            is the current action status at the server
     * @param messages
     *            is a list of messages retrieved from action history.
     */
    @JsonCreator
    public DdiActionHistory(@JsonProperty("status") final String actionStatus,
            @JsonProperty("messages") List<String> messages) {
        this.actionStatus = actionStatus;
        this.messages = messages;
    }

    @Override
    public String toString() {
        return "Action history [" + "status=" + actionStatus + ", messages={" + messages.toString() + "}]";
    }
}
