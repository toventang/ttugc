package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.model.LiveReplayCover */
public final class LiveReplayCover {
    public final String liveCoverUrl;
    public final String liveId;

    static {
        Covode.recordClassIndex(75188);
    }

    public static /* synthetic */ LiveReplayCover copy$default(LiveReplayCover liveReplayCover, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = liveReplayCover.liveId;
        }
        if ((i & 2) != 0) {
            str2 = liveReplayCover.liveCoverUrl;
        }
        return liveReplayCover.copy(str, str2);
    }

    public final LiveReplayCover copy(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        return new LiveReplayCover(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveReplayCover)) {
            return false;
        }
        LiveReplayCover liveReplayCover = (LiveReplayCover) obj;
        return C89219l.m154714a(this.liveId, liveReplayCover.liveId) && C89219l.m154714a(this.liveCoverUrl, liveReplayCover.liveCoverUrl);
    }

    public final int hashCode() {
        String str = this.liveId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.liveCoverUrl;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "LiveReplayCover(liveId=" + this.liveId + ", liveCoverUrl=" + this.liveCoverUrl + ")";
    }

    public LiveReplayCover(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.liveId = str;
        this.liveCoverUrl = str2;
    }
}
