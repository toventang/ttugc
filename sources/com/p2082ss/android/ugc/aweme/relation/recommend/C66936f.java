package com.p2082ss.android.ugc.aweme.relation.recommend;

import com.bytedance.assem.arch.extensions.AbstractC12779c;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.relation.recommend.f */
public final class C66936f implements AbstractC12779c {

    /* renamed from: a */
    public final C66994m f150233a;

    /* renamed from: b */
    public final String f150234b;

    /* renamed from: c */
    public final String f150235c;

    static {
        Covode.recordClassIndex(78513);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66936f)) {
            return false;
        }
        C66936f fVar = (C66936f) obj;
        return C89219l.m154714a(this.f150233a, fVar.f150233a) && C89219l.m154714a(this.f150234b, fVar.f150234b) && C89219l.m154714a(this.f150235c, fVar.f150235c);
    }

    public final int hashCode() {
        C66994m mVar = this.f150233a;
        int i = 0;
        int hashCode = (mVar != null ? mVar.hashCode() : 0) * 31;
        String str = this.f150234b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f150235c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "NewVersionRecFriendsDetail(config=" + this.f150233a + ", platforms=" + this.f150234b + ", skipPlatforms=" + this.f150235c + ")";
    }

    public C66936f(C66994m mVar, String str, String str2) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f150233a = mVar;
        this.f150234b = str;
        this.f150235c = str2;
    }
}
