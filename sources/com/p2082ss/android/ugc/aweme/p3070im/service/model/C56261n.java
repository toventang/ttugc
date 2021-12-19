package com.p2082ss.android.ugc.aweme.p3070im.service.model;

import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.service.model.n */
public final class C56261n implements AbstractC81914b {

    /* renamed from: a */
    public final String f128338a;

    /* renamed from: b */
    public final String f128339b;

    /* renamed from: c */
    public final long f128340c = InteractFirstFrameTimeOutDurationSetting.DEFAULT;

    static {
        Covode.recordClassIndex(66074);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56261n)) {
            return false;
        }
        C56261n nVar = (C56261n) obj;
        return C89219l.m154714a(this.f128338a, nVar.f128338a) && C89219l.m154714a(this.f128339b, nVar.f128339b) && this.f128340c == nVar.f128340c;
    }

    public final int hashCode() {
        String str = this.f128338a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f128339b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        long j = this.f128340c;
        return ((hashCode + i) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "ShareUndoEvent(awemeId=" + this.f128338a + ", identity=" + this.f128339b + ", duration=" + this.f128340c + ")";
    }

    public C56261n(String str, String str2) {
        C89219l.m154721d(str2, "");
        this.f128338a = str;
        this.f128339b = str2;
    }
}
