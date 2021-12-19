package com.p2082ss.android.ugc.aweme.filter.repository.internal.main;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50704l;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.p2987a.C50690b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.main.d */
public final class C50759d implements AbstractC50704l {

    /* renamed from: a */
    private final String f117154a;

    static {
        Covode.recordClassIndex(59927);
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50704l
    /* renamed from: b */
    public final String mo86053b(int i) {
        return this.f117154a;
    }

    public C50759d(String str) {
        C89219l.m154721d(str, "");
        this.f117154a = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50704l
    /* renamed from: a */
    public final String mo86052a(int i) {
        return i + ".zip";
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50704l
    /* renamed from: c */
    public final String mo86054c(int i) {
        return C50690b.m94983a(C50690b.m94983a(this.f117154a) + i);
    }
}
