package com.p2082ss.android.account.share.data.read;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.account.share.data.read.a */
public final class C29358a {

    /* renamed from: a */
    public String f69691a;

    /* renamed from: b */
    public String f69692b;

    /* renamed from: c */
    public final String f69693c;

    /* renamed from: d */
    public final boolean f69694d;

    /* renamed from: e */
    public final String f69695e;

    /* renamed from: f */
    public int f69696f;

    static {
        Covode.recordClassIndex(35747);
    }

    public final String toString() {
        return "ReadResult(isSuccess=" + this.f69694d + ", errorMsg='" + this.f69695e + "', readType=" + this.f69696f + ", fromPkg='" + this.f69693c + "', key='" + this.f69691a + "', value='" + this.f69692b + "')";
    }

    public C29358a(String str, boolean z, String str2, int i) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        this.f69693c = str;
        this.f69694d = z;
        this.f69695e = str2;
        this.f69696f = i;
        this.f69691a = "";
        this.f69692b = "";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C29358a(String str, boolean z, String str2, int i, byte b) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str2, 0);
    }
}
