package com.p2082ss.android.ugc.aweme.services.external.p3712ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.external.ui.EditConfig */
public final class EditConfig {
    public static final Companion Companion = new Companion(null);
    private String ccvid;
    private AVChallenge challenge;
    private List<? extends AVChallenge> challenges;
    private String channel;
    private boolean clear;
    private String creationId;
    private String enterFrom;
    private String hashtag;
    private Integer launchFlag;
    private MediaInfo mediaInfo;
    private String musicOrigin;
    private AbstractC89171a<C89391z> onEnterEditListener;
    private Integer requestCode;
    private String shareID;
    private String shootway;

    static {
        Covode.recordClassIndex(79853);
    }

    /* renamed from: com.ss.android.ugc.aweme.services.external.ui.EditConfig$Builder */
    public static class Builder {
        private EditConfig config = new EditConfig(null);

        static {
            Covode.recordClassIndex(79854);
        }

        public final EditConfig build() {
            return this.config;
        }

        public final Builder channel(String str) {
            this.config.setChannel(str);
            return this;
        }

        public final Builder clear(boolean z) {
            this.config.setClear(z);
            return this;
        }

        public final Builder creationId(String str) {
            this.config.setCreationId(str);
            return this;
        }

        public final Builder enterFrom(String str) {
            this.config.setEnterFrom(str);
            return this;
        }

        public final Builder hashtag(String str) {
            this.config.setHashtag(str);
            return this;
        }

        public final Builder musicOrigin(String str) {
            this.config.setMusicOrigin(str);
            return this;
        }

        public final Builder onEnterEdit(AbstractC89171a<C89391z> aVar) {
            this.config.setOnEnterEditListener(aVar);
            return this;
        }

        public final Builder shareID(String str) {
            this.config.setShareID(str);
            return this;
        }

        public final Builder shootWay(String str) {
            this.config.setShootway(str);
            return this;
        }

        public final Builder ccvid(String str) {
            C89219l.m154721d(str, "");
            this.config.setCcvid(str);
            return this;
        }

        public final Builder challenge(AVChallenge aVChallenge) {
            C89219l.m154721d(aVChallenge, "");
            this.config.setChallenge(aVChallenge);
            return this;
        }

        public final Builder challenges(List<? extends AVChallenge> list) {
            C89219l.m154721d(list, "");
            this.config.setChallenges(list);
            return this;
        }

        public final Builder launchFlag(int i) {
            this.config.setLaunchFlag(Integer.valueOf(i));
            return this;
        }

        public final Builder mediaInfo(MediaInfo mediaInfo) {
            C89219l.m154721d(mediaInfo, "");
            this.config.setMediaInfo(mediaInfo);
            return this;
        }

        public final Builder requestCode(int i) {
            this.config.setRequestCode(Integer.valueOf(i));
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.services.external.ui.EditConfig$Companion */
    public static final class Companion {
        static {
            Covode.recordClassIndex(79855);
        }

        private Companion() {
        }

        public /* synthetic */ Companion(C89214g gVar) {
            this();
        }
    }

    private EditConfig() {
    }

    public final String getCcvid() {
        return this.ccvid;
    }

    public final AVChallenge getChallenge() {
        return this.challenge;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.shortvideo.AVChallenge>, java.util.List<com.ss.android.ugc.aweme.shortvideo.AVChallenge> */
    public final List<AVChallenge> getChallenges() {
        return this.challenges;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final boolean getClear() {
        return this.clear;
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getHashtag() {
        return this.hashtag;
    }

    public final Integer getLaunchFlag() {
        return this.launchFlag;
    }

    public final MediaInfo getMediaInfo() {
        return this.mediaInfo;
    }

    public final String getMusicOrigin() {
        return this.musicOrigin;
    }

    public final AbstractC89171a<C89391z> getOnEnterEditListener() {
        return this.onEnterEditListener;
    }

    public final Integer getRequestCode() {
        return this.requestCode;
    }

    public final String getShareID() {
        return this.shareID;
    }

    public final String getShootway() {
        return this.shootway;
    }

    public final void setCcvid(String str) {
        this.ccvid = str;
    }

    public final void setChallenge(AVChallenge aVChallenge) {
        this.challenge = aVChallenge;
    }

    public final void setChallenges(List<? extends AVChallenge> list) {
        this.challenges = list;
    }

    public final void setChannel(String str) {
        this.channel = str;
    }

    public final void setClear(boolean z) {
        this.clear = z;
    }

    public final void setCreationId(String str) {
        this.creationId = str;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setHashtag(String str) {
        this.hashtag = str;
    }

    public final void setLaunchFlag(Integer num) {
        this.launchFlag = num;
    }

    public final void setMediaInfo(MediaInfo mediaInfo2) {
        this.mediaInfo = mediaInfo2;
    }

    public final void setMusicOrigin(String str) {
        this.musicOrigin = str;
    }

    public final void setOnEnterEditListener(AbstractC89171a<C89391z> aVar) {
        this.onEnterEditListener = aVar;
    }

    public final void setRequestCode(Integer num) {
        this.requestCode = num;
    }

    public final void setShareID(String str) {
        this.shareID = str;
    }

    public final void setShootway(String str) {
        this.shootway = str;
    }

    public /* synthetic */ EditConfig(C89214g gVar) {
        this();
    }
}
