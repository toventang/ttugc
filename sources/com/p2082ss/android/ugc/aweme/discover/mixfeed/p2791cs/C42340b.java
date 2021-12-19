package com.p2082ss.android.ugc.aweme.discover.mixfeed.p2791cs;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.api.p2765a.C41855a;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.ClickSearchResponse;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.cs.b */
public final class C42340b {

    /* renamed from: a */
    public final int f98635a;

    /* renamed from: b */
    public final String f98636b;

    /* renamed from: c */
    public final String f98637c;

    /* renamed from: d */
    public final C41855a<ClickSearchResponse> f98638d;

    /* renamed from: e */
    public final boolean f98639e;

    static {
        Covode.recordClassIndex(50285);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42340b)) {
            return false;
        }
        C42340b bVar = (C42340b) obj;
        return this.f98635a == bVar.f98635a && C89219l.m154714a(this.f98636b, bVar.f98636b) && C89219l.m154714a(this.f98637c, bVar.f98637c) && C89219l.m154714a(this.f98638d, bVar.f98638d) && this.f98639e == bVar.f98639e;
    }

    public final int hashCode() {
        int i = this.f98635a * 31;
        String str = this.f98636b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f98637c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        C41855a<ClickSearchResponse> aVar = this.f98638d;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        int i3 = (hashCode2 + i2) * 31;
        boolean z = this.f98639e;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return i3 + i4;
    }

    public final String toString() {
        return "ClickSearchData(awemeIndex=" + this.f98635a + ", aid=" + this.f98636b + ", query=" + this.f98637c + ", result=" + this.f98638d + ", useAnimation=" + this.f98639e + ")";
    }

    public /* synthetic */ C42340b() {
        this(-1, null, null, null, true);
    }

    public C42340b(int i, String str, String str2, C41855a<ClickSearchResponse> aVar, boolean z) {
        this.f98635a = i;
        this.f98636b = str;
        this.f98637c = str2;
        this.f98638d = aVar;
        this.f98639e = z;
    }
}
