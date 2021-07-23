/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * Copyright 2020-2021 The JReleaser authors.
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
package org.jreleaser.ant.tasks;

import org.jreleaser.util.PlatformUtils;

import java.util.Collections;
import java.util.List;

/**
 * @author Andres Almiray
 * @since 0.6.0
 */
abstract class AbstractPlatformAwareJReleaserTask extends AbstractJReleaserTask {
    protected boolean selectCurrentPlatform;
    protected List<String> selectPlatforms;

    public void setSelectCurrentPlatform(boolean selectCurrentPlatform) {
        this.selectCurrentPlatform = selectCurrentPlatform;
    }

    public void setSelectPlatforms(List<String> selectPlatforms) {
        this.selectPlatforms = selectPlatforms;
    }

    @Override
    protected List<String> collectSelectedPlatforms() {
        if (selectCurrentPlatform) return Collections.singletonList(PlatformUtils.getCurrentFull());
        return selectPlatforms;
    }
}