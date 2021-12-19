package com.p2082ss.android.ugc.aweme.services.external.p3712ui;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.external.ui.PublishConfig */
public final class PublishConfig {
    private String challenge;
    public String creationId;
    public String enterFrom;
    private String musicId;
    public String shootway;
    private String videoId;
    private String videoPath;

    static {
        Covode.recordClassIndex(79873);
    }

    /* renamed from: com.ss.android.ugc.aweme.services.external.ui.PublishConfig$Builder */
    public static class Builder {
        private PublishConfig config = new PublishConfig(null);

        static {
            Covode.recordClassIndex(79874);
        }

        public final PublishConfig build() {
            return this.config;
        }

        public final Builder challenge(String str) {
            C89219l.m154721d(str, "");
            this.config.setChallenge(str);
            return this;
        }

        public final Builder creationId(String str) {
            C89219l.m154721d(str, "");
            this.config.setCreationId(str);
            return this;
        }

        public final Builder enterFrom(String str) {
            C89219l.m154721d(str, "");
            this.config.setEnterFrom(str);
            return this;
        }

        public final Builder musicId(String str) {
            C89219l.m154721d(str, "");
            this.config.setMusicId(str);
            return this;
        }

        public final Builder shootWay(String str) {
            C89219l.m154721d(str, "");
            this.config.setShootway(str);
            return this;
        }

        public final Builder videoId(String str) {
            C89219l.m154721d(str, "");
            this.config.setVideoId(str);
            return this;
        }

        public final Builder videoPath(String str) {
            C89219l.m154721d(str, "");
            this.config.setVideoPath(str);
            return this;
        }
    }

    private PublishConfig() {
    }

    public final String getChallenge() {
        return this.challenge;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final String getVideoId() {
        return this.videoId;
    }

    public final String getVideoPath() {
        return this.videoPath;
    }

    public final String getCreationId() {
        String str = this.creationId;
        if (str == null) {
            C89219l.m154710a("creationId");
        }
        return str;
    }

    public final String getEnterFrom() {
        String str = this.enterFrom;
        if (str == null) {
            C89219l.m154710a("enterFrom");
        }
        return str;
    }

    public final String getShootway() {
        String str = this.shootway;
        if (str == null) {
            C89219l.m154710a("shootway");
        }
        return str;
    }

    public final void setChallenge(String str) {
        this.challenge = str;
    }

    public final void setMusicId(String str) {
        this.musicId = str;
    }

    public final void setVideoId(String str) {
        this.videoId = str;
    }

    public final void setVideoPath(String str) {
        this.videoPath = str;
    }

    public /* synthetic */ PublishConfig(C89214g gVar) {
        this();
    }

    public final void setCreationId(String str) {
        C89219l.m154721d(str, "");
        this.creationId = str;
    }

    public final void setEnterFrom(String str) {
        C89219l.m154721d(str, "");
        this.enterFrom = str;
    }

    public final void setShootway(String str) {
        C89219l.m154721d(str, "");
        this.shootway = str;
    }
}
