package com.p2082ss.android.ugc.aweme.shortvideo.upload.p3882c;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.c.g */
public final class C73883g {

    /* renamed from: a */
    public final List<Integer> f165872a;

    /* renamed from: b */
    public final List<Integer> f165873b;

    /* renamed from: c */
    public final String f165874c;

    /* renamed from: d */
    public final String f165875d;

    /* renamed from: e */
    public final String f165876e;

    static {
        Covode.recordClassIndex(86629);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C73883g)) {
            return false;
        }
        C73883g gVar = (C73883g) obj;
        return C89219l.m154714a(this.f165872a, gVar.f165872a) && C89219l.m154714a(this.f165873b, gVar.f165873b) && C89219l.m154714a(this.f165874c, gVar.f165874c) && C89219l.m154714a(this.f165875d, gVar.f165875d) && C89219l.m154714a(this.f165876e, gVar.f165876e);
    }

    public final int hashCode() {
        List<Integer> list = this.f165872a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<Integer> list2 = this.f165873b;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str = this.f165874c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f165875d;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f165876e;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "PublishEndingWatermarkParam(sourceVideoSize=" + this.f165872a + ", outputVideoSize=" + this.f165873b + ", outputVideoPath=" + this.f165874c + ", workspace=" + this.f165875d + ", watermarkVideoPath=" + this.f165876e + ")";
    }

    public C73883g(List<Integer> list, List<Integer> list2, String str, String str2, String str3) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(list2, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        this.f165872a = list;
        this.f165873b = list2;
        this.f165874c = str;
        this.f165875d = str2;
        this.f165876e = str3;
    }
}
