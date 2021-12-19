package com.p2082ss.android.ugc.aweme.services.external.p3712ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.shortvideo.reaction.ReactionParams;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.services.external.ui.ReactConfig */
public final class ReactConfig {
    private final int minDuration;
    private final String originVideo;
    private final String outputDir;
    private final ReactionParams params;
    private final User reactionFromAuthor;

    static {
        Covode.recordClassIndex(79876);
    }

    /* renamed from: com_ss_android_ugc_aweme_services_external_ui_ReactConfig_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode */
    public static int m120121x2e6d22f8(int i) {
        return i;
    }

    public static /* synthetic */ ReactConfig copy$default(ReactConfig reactConfig, String str, String str2, ReactionParams reactionParams, User user, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = reactConfig.originVideo;
        }
        if ((i2 & 2) != 0) {
            str2 = reactConfig.outputDir;
        }
        if ((i2 & 4) != 0) {
            reactionParams = reactConfig.params;
        }
        if ((i2 & 8) != 0) {
            user = reactConfig.reactionFromAuthor;
        }
        if ((i2 & 16) != 0) {
            i = reactConfig.minDuration;
        }
        return reactConfig.copy(str, str2, reactionParams, user, i);
    }

    public final String component1() {
        return this.originVideo;
    }

    public final String component2() {
        return this.outputDir;
    }

    public final ReactionParams component3() {
        return this.params;
    }

    public final User component4() {
        return this.reactionFromAuthor;
    }

    public final int component5() {
        return this.minDuration;
    }

    public final ReactConfig copy(String str, String str2, ReactionParams reactionParams, User user, int i) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(reactionParams, "");
        C89219l.m154721d(user, "");
        return new ReactConfig(str, str2, reactionParams, user, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReactConfig)) {
            return false;
        }
        ReactConfig reactConfig = (ReactConfig) obj;
        return C89219l.m154714a(this.originVideo, reactConfig.originVideo) && C89219l.m154714a(this.outputDir, reactConfig.outputDir) && C89219l.m154714a(this.params, reactConfig.params) && C89219l.m154714a(this.reactionFromAuthor, reactConfig.reactionFromAuthor) && this.minDuration == reactConfig.minDuration;
    }

    public final int hashCode() {
        String str = this.originVideo;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.outputDir;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        ReactionParams reactionParams = this.params;
        int hashCode3 = (hashCode2 + (reactionParams != null ? reactionParams.hashCode() : 0)) * 31;
        User user = this.reactionFromAuthor;
        if (user != null) {
            i = user.hashCode();
        }
        return ((hashCode3 + i) * 31) + m120121x2e6d22f8(this.minDuration);
    }

    public final String toString() {
        return "ReactConfig(originVideo=" + this.originVideo + ", outputDir=" + this.outputDir + ", params=" + this.params + ", reactionFromAuthor=" + this.reactionFromAuthor + ", minDuration=" + this.minDuration + ")";
    }

    public final int getMinDuration() {
        return this.minDuration;
    }

    public final String getOriginVideo() {
        return this.originVideo;
    }

    public final String getOutputDir() {
        return this.outputDir;
    }

    public final ReactionParams getParams() {
        return this.params;
    }

    public final User getReactionFromAuthor() {
        return this.reactionFromAuthor;
    }

    public ReactConfig(String str, String str2, ReactionParams reactionParams, User user, int i) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(reactionParams, "");
        C89219l.m154721d(user, "");
        this.originVideo = str;
        this.outputDir = str2;
        this.params = reactionParams;
        this.reactionFromAuthor = user;
        this.minDuration = i;
    }
}
