/*
 * Copyright (C) 2013 salesforce.com, inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.auraframework.builder;

import java.util.List;
import java.util.Set;

import org.auraframework.def.ComponentDefRef;
import org.auraframework.def.StyleDef;

/**
 */
public interface StyleDefBuilder extends DefBuilder<StyleDef, StyleDef> {

    StyleDefBuilder setClassName(String className);

    StyleDefBuilder setComponents(List<ComponentDefRef> components);

    StyleDefBuilder setThemeReferences(Set<String> themeReferences);

}
