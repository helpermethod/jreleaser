package org.jreleaser.model.internal.announce;

import org.jreleaser.model.Active;

import java.util.Map;

import static org.jreleaser.model.api.announce.RedditAnnouncer.TYPE;

public class RedditAnnouncer extends AbstractAnnouncer<RedditAnnouncer, org.jreleaser.model.api.announce.RedditAnnouncer> {
    private final org.jreleaser.model.api.announce.RedditAnnouncer immutable = new org.jreleaser.model.api.announce.RedditAnnouncer() {
        @Override
        public String getSubReddit() {
            return null;
        }

        @Override
        public String getClientId() {
            return null;
        }

        @Override
        public String getSecret() {
            return null;
        }

        @Override
        public String getUsername() {
            return null;
        }

        @Override
        public String getPassword() {
            return null;
        }

        @Override
        public String getReleaseUrl() {
            return null;
        }

        @Override
        public String getTitle() {
            return null;
        }

        @Override
        public String getType() {
            return org.jreleaser.model.api.announce.RedditAnnouncer.TYPE;
        }

        @Override
        public String getName() {
            return null;
        }

        @Override
        public boolean isSnapshotSupported() {
            return false;
        }

        @Override
        public Active getActive() {
            return null;
        }

        @Override
        public boolean isEnabled() {
            return false;
        }

        @Override
        public Map<String, Object> asMap(boolean full) {
            return null;
        }

        @Override
        public String getPrefix() {
            return null;
        }

        @Override
        public Map<String, Object> getExtraProperties() {
            return null;
        }

        @Override
        public Integer getConnectTimeout() {
            return null;
        }

        @Override
        public Integer getReadTimeout() {
            return null;
        }
    }

    protected RedditAnnouncer() {
        super(TYPE);
    }

    @Override
    protected void asMap(boolean full, Map<String, Object> props) {

    }

    @Override
    public org.jreleaser.model.api.announce.RedditAnnouncer asImmutable() {
        return immutable;
    }
}
