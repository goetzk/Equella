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

package com.tle.web.sections;

import java.util.Collections;
import java.util.Map;

public class SimpleBookmarkModifier implements BookmarkModifier
{
	private final Map<String, String[]> vals;

	public SimpleBookmarkModifier(String key, String value)
	{
		vals = Collections.singletonMap(key, new String[]{value});
	}

	@Override
	public void addToBookmark(SectionInfo info, Map<String, String[]> bookmark)
	{
		bookmark.putAll(vals);
	}
}
