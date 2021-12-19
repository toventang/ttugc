package com.p2082ss.android.ugc.aweme.watermark;

import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.watermark.n */
public final class C81504n {

    /* renamed from: a */
    public final List<String> f182221a;

    /* renamed from: b */
    public final String f182222b;

    /* renamed from: c */
    public final String f182223c;

    /* renamed from: d */
    public int f182224d;

    /* renamed from: e */
    public final int f182225e;

    /* renamed from: f */
    public final int f182226f;

    /* renamed from: g */
    public List<Integer> f182227g;

    static {
        Covode.recordClassIndex(94877);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C81504n)) {
            return false;
        }
        C81504n nVar = (C81504n) obj;
        return C89219l.m154714a(this.f182221a, nVar.f182221a) && C89219l.m154714a(this.f182222b, nVar.f182222b) && C89219l.m154714a(this.f182223c, nVar.f182223c) && this.f182224d == nVar.f182224d && this.f182225e == nVar.f182225e && this.f182226f == nVar.f182226f && C89219l.m154714a(this.f182227g, nVar.f182227g);
    }

    public final int hashCode() {
        List<String> list = this.f182221a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.f182222b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f182223c;
        int hashCode3 = (((((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f182224d) * 31) + this.f182225e) * 31) + this.f182226f) * 31;
        List<Integer> list2 = this.f182227g;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "VideoEndingWatermarkData(endingEffectResources=" + this.f182221a + ", endingFrame=" + this.f182222b + ", endingAudioPath=" + this.f182223c + ", inputMediaDuration=" + this.f182224d + ", endingWatermarkFadeInDuration=" + this.f182225e + ", endingWatermarkRetentionDuration=" + this.f182226f + ", originalVideoSize=" + this.f182227g + ")";
    }

    /* renamed from: a */
    public final void mo125219a(List<Integer> list) {
        C89219l.m154721d(list, "");
        this.f182227g = list;
    }

    public C81504n(List<String> list, String str, String str2, List<Integer> list2) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(list2, "");
        this.f182221a = list;
        this.f182222b = str;
        this.f182223c = str2;
        this.f182224d = 0;
        this.f182225e = 1000;
        this.f182226f = LiveNetAdaptiveHurryTimeSetting.DEFAULT;
        this.f182227g = list2;
    }

    public /* synthetic */ C81504n(List list, String str, String str2, List list2, byte b) {
        this(list, str, str2, list2);
    }
}
