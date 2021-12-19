package com.p2082ss.android.ugc.aweme.photo;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;

/* renamed from: com.ss.android.ugc.aweme.photo.l */
final /* synthetic */ class C62875l implements AbstractC88983w {

    /* renamed from: a */
    private final PhotoModule f142589a;

    /* renamed from: b */
    private final int f142590b;

    /* renamed from: c */
    private final int f142591c;

    static {
        Covode.recordClassIndex(73706);
    }

    C62875l(PhotoModule photoModule, int i, int i2) {
        this.f142589a = photoModule;
        this.f142590b = i;
        this.f142591c = i2;
    }

    @Override // p4560f.p4561a.AbstractC88983w
    public final void subscribe(AbstractC88982v vVar) {
        PhotoModule photoModule = this.f142589a;
        int i = this.f142590b;
        int i2 = this.f142591c;
        String a = photoModule.f142538c.mo100820a();
        photoModule.f142536a.mo56586a(a, i, i2, new C62881p(vVar, a));
    }
}
