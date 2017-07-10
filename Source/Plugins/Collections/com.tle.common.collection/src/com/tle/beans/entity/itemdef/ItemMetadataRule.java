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

package com.tle.beans.entity.itemdef;

import java.io.Serializable;
import java.util.Objects;

import com.tle.common.Check;

/**
 * @author Nicholas Read
 */
public class ItemMetadataRule implements Serializable
{
	private static final long serialVersionUID = 1L;

	private String id;
	private String name;
	private String script;

	public ItemMetadataRule()
	{
		super();
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getScript()
	{
		return script;
	}

	public void setScript(String script)
	{
		this.script = script;
	}

	@Override
	public boolean equals(Object obj)
	{
		if( this == obj )
		{
			return true;
		}

		if( !(obj instanceof ItemMetadataRule) )
		{
			return false;
		}

		return Objects.equals(id, ((ItemMetadataRule) obj).id);
	}

	@Override
	public int hashCode()
	{
		return Check.getHashCode(id, name, script);
	}
}