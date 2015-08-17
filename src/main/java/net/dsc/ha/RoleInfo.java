/**
 *    Copyright 2013, Big Switch Networks, Inc.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License"); you may
 *    not use this file except in compliance with the License. You may obtain
 *    a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *    WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *    License for the specific language governing permissions and limitations
 *    under the License.
 **/

package net.dsc.ha;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;


public class RoleInfo {
    private final HARole role;
    private final String roleChangeDescription;
    private final Date roleChangeDateTime;

    public RoleInfo(HARole role, String description, Date dt) {
        this.role = role;
        this.roleChangeDescription = description;
        this.roleChangeDateTime = dt;
    }

    public HARole getRole() {
        return role;
    }

    @JsonProperty(value="change-description")
    public String getRoleChangeDescription() {
        return roleChangeDescription;
    }

    @JsonProperty(value="change-date-time")
    public Date getRoleChangeDateTime() {
        return roleChangeDateTime;
    }

}