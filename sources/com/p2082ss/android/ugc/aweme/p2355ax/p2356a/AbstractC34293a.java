package com.p2082ss.android.ugc.aweme.p2355ax.p2356a;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ax.a.a */
public abstract class AbstractC34293a implements AbstractC34345r {

    /* renamed from: a */
    public String f81082a;

    /* renamed from: b */
    public boolean f81083b;

    /* renamed from: c */
    public boolean f81084c;

    static {
        Covode.recordClassIndex(41237);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34345r
    /* renamed from: b */
    public void mo60719b() {
        this.f81084c = false;
    }

    public final String bF_() {
        String str = this.f81082a;
        if (str == null) {
            C89219l.m154710a("sessionId");
        }
        return str;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2355ax.p2356a.AbstractC34345r
    /* renamed from: a */
    public void mo60718a(String str, boolean z) {
        C89219l.m154721d(str, "");
        this.f81082a = str;
        this.f81083b = z;
        this.f81084c = true;
    }
}
