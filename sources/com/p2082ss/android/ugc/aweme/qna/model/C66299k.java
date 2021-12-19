package com.p2082ss.android.ugc.aweme.qna.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.model.k */
public final class C66299k {

    /* renamed from: a */
    public final String f149073a;

    /* renamed from: b */
    public final String f149074b;

    /* renamed from: c */
    public final String f149075c;

    static {
        Covode.recordClassIndex(77808);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66299k)) {
            return false;
        }
        C66299k kVar = (C66299k) obj;
        return C89219l.m154714a(this.f149073a, kVar.f149073a) && C89219l.m154714a(this.f149074b, kVar.f149074b) && C89219l.m154714a(this.f149075c, kVar.f149075c);
    }

    public final int hashCode() {
        String str = this.f149073a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f149074b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f149075c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "VideoThumbnailData(questionId=" + this.f149073a + ", awemeId=" + this.f149074b + ", url=" + this.f149075c + ")";
    }

    public C66299k(String str, String str2, String str3) {
        this.f149073a = str;
        this.f149074b = str2;
        this.f149075c = str3;
    }
}
