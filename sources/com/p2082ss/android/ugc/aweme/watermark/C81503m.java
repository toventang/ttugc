package com.p2082ss.android.ugc.aweme.watermark;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.watermark.m */
public final class C81503m {

    /* renamed from: a */
    public final String f182216a;

    /* renamed from: b */
    public final String f182217b;

    /* renamed from: c */
    public final int f182218c = 3000;

    /* renamed from: d */
    public int f182219d = 0;

    /* renamed from: e */
    public final String[] f182220e;

    static {
        Covode.recordClassIndex(94876);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C81503m)) {
            return false;
        }
        C81503m mVar = (C81503m) obj;
        return C89219l.m154714a(this.f182216a, mVar.f182216a) && C89219l.m154714a(this.f182217b, mVar.f182217b) && this.f182218c == mVar.f182218c && this.f182219d == mVar.f182219d && C89219l.m154714a(this.f182220e, mVar.f182220e);
    }

    public final int hashCode() {
        String str = this.f182216a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f182217b;
        int hashCode2 = (((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f182218c) * 31) + this.f182219d) * 31;
        String[] strArr = this.f182220e;
        if (strArr != null) {
            i = Arrays.hashCode(strArr);
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "VideoEndWatermarkData(endWatermarkFrame=" + this.f182216a + ", endAudioPath=" + this.f182217b + ", watermarkDuration=" + this.f182218c + ", inputMediaDuration=" + this.f182219d + ", transitions=" + Arrays.toString(this.f182220e) + ")";
    }

    public C81503m(String str, String str2, String[] strArr) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(strArr, "");
        this.f182216a = str;
        this.f182217b = str2;
        this.f182220e = strArr;
    }
}
