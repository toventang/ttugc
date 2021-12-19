package com.bytedance.sdk.bdlynx.view;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.sdk.bdlynx.view.f */
public final class C22683f {

    /* renamed from: a */
    public String f53583a;

    /* renamed from: b */
    public String f53584b;

    /* renamed from: c */
    public String f53585c;

    /* renamed from: d */
    public long f53586d;

    static {
        Covode.recordClassIndex(26502);
    }

    public C22683f() {
        this(null, null, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22683f)) {
            return false;
        }
        C22683f fVar = (C22683f) obj;
        return C89219l.m154714a(this.f53583a, fVar.f53583a) && C89219l.m154714a(this.f53584b, fVar.f53584b) && C89219l.m154714a(this.f53585c, fVar.f53585c) && this.f53586d == fVar.f53586d;
    }

    public final int hashCode() {
        String str = this.f53583a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f53584b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f53585c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        long j = this.f53586d;
        return ((hashCode2 + i) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "ImgReWriterStatus(status=" + this.f53583a + ", originResUrl=" + this.f53584b + ", offlineResUrl=" + this.f53585c + ", duration=" + this.f53586d + ")";
    }

    /* renamed from: a */
    public final void mo36955a(String str) {
        C89219l.m154719c(str, "");
        this.f53583a = str;
    }

    /* renamed from: b */
    public final void mo36956b(String str) {
        C89219l.m154719c(str, "");
        this.f53585c = str;
    }

    private C22683f(String str, String str2, String str3) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        C89219l.m154719c(str3, "");
        this.f53583a = str;
        this.f53584b = str2;
        this.f53585c = str3;
        this.f53586d = 0;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C22683f(String str, String str2, String str3, int i) {
        this((i & 1) != 0 ? "fail" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}
