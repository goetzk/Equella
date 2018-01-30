/*
 * Copyright 2017 Apereo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tle.web.api.institution;

import javax.ws.rs.Path;

import com.tle.web.api.users.interfaces.RoleResource;
import io.swagger.annotations.Api;

/**
 * @author Aaron
 */
@Path("usermanagement/local/role/")
@Api(value = "Local roles", description = "usermanagement-local-role")
public interface EquellaRoleResource extends RoleResource
{
	// Nothing to add, just the path annotation at the top
}
