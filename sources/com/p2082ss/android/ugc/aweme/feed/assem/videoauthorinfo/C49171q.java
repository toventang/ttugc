package com.p2082ss.android.ugc.aweme.feed.assem.videoauthorinfo;

import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.q */
public final class C49171q implements AbstractC12853j {

    /* renamed from: a */
    public final String f113150a;

    /* renamed from: b */
    public final int f113151b;

    /* renamed from: c */
    public final C89378p<String, String> f113152c;

    /* renamed from: d */
    public final String f113153d;

    static {
        Covode.recordClassIndex(57965);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49171q)) {
            return false;
        }
        C49171q qVar = (C49171q) obj;
        return C89219l.m154714a(this.f113150a, qVar.f113150a) && this.f113151b == qVar.f113151b && C89219l.m154714a(this.f113152c, qVar.f113152c) && C89219l.m154714a(this.f113153d, qVar.f113153d);
    }

    public final int hashCode() {
        String str = this.f113150a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f113151b) * 31;
        C89378p<String, String> pVar = this.f113152c;
        int hashCode2 = (hashCode + (pVar != null ? pVar.hashCode() : 0)) * 31;
        String str2 = this.f113153d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "VideoAuthorInfoState(titleViewText=" + this.f113150a + ", titleViewVisible=" + this.f113151b + ", titleVerifyInfo=" + this.f113152c + ", postTimeText=" + this.f113153d + ")";
    }

    public /* synthetic */ C49171q() {
        this(null, 8, null, null);
    }

    public C49171q(String str, int i, C89378p<String, String> pVar, String str2) {
        this.f113150a = str;
        this.f113151b = i;
        this.f113152c = pVar;
        this.f113153d = str2;
    }
}
