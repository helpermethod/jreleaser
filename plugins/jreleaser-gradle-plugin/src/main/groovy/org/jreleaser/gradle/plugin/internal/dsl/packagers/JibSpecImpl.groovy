/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * Copyright 2020-2023 The JReleaser authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jreleaser.gradle.plugin.internal.dsl.packagers

import groovy.transform.CompileStatic
import org.gradle.api.internal.provider.Providers
import org.gradle.api.model.ObjectFactory
import org.gradle.api.provider.MapProperty
import org.gradle.api.tasks.Internal
import org.jreleaser.gradle.plugin.dsl.packagers.JibSpec

import javax.inject.Inject

import static org.jreleaser.util.StringUtils.isNotBlank

/**
 *
 * @author Andres Almiray
 * @since 1.6.0
 */
@CompileStatic
class JibSpecImpl extends AbstractJibConfiguration implements JibSpec {
    String name
    final MapProperty<String, Object> matchers

    @Inject
    JibSpecImpl(ObjectFactory objects) {
        super(objects)

        matchers = objects.mapProperty(String, Object).convention(Providers.notDefined())
    }

    @Override
    void matcher(String key, Object value) {
        if (isNotBlank(key) && null != value) {
            matchers.put(key.trim(), value)
        }
    }

    @Override
    @Internal
    boolean isSet() {
        super.isSet() ||
            !matchers.present
    }

    org.jreleaser.model.internal.packagers.JibSpec toModel() {
        org.jreleaser.model.internal.packagers.JibSpec spec = new org.jreleaser.model.internal.packagers.JibSpec()
        spec.name = name
        toModel(spec)
        if (matchers.present) spec.matchers.putAll(matchers.get())
        spec
    }
}
