package com.p2082ss.android.ugc.aweme.share;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.i */
public final class C68959i {

    /* renamed from: a */
    public boolean f154271a;

    /* renamed from: b */
    public int f154272b;

    /* renamed from: c */
    public String f154273c;

    static {
        Covode.recordClassIndex(81273);
    }

    public C68959i() {
        this.f154272b = -1;
        this.f154273c = "";
    }

    /* renamed from: a */
    public final void mo109503a(String str) {
        C89219l.m154721d(str, "");
        this.f154273c = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C68959i(boolean z, String str) {
        this();
        C89219l.m154721d(str, "");
        this.f154271a = z;
        this.f154273c = str;
    }
}
