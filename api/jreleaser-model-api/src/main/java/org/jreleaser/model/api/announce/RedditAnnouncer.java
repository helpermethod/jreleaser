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
package org.jreleaser.model.api.announce;

/**
 * @author Oliver Weiler
 * @since 1.9.0
 */
public interface RedditAnnouncer extends Announcer {
    String TYPE = "reddit";

    String getSubReddit();

    String getClientId();

    String getSecret();

    String getUsername();

    String getPassword();

    String getReleaseUrl();

    String getTitle();
}
