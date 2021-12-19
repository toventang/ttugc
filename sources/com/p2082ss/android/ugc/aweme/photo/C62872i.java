package com.p2082ss.android.ugc.aweme.photo;

import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88434g;

/* renamed from: com.ss.android.ugc.aweme.photo.i */
final /* synthetic */ class C62872i implements AbstractC88434g {

    /* renamed from: a */
    private final PhotoModule f142582a;

    /* renamed from: b */
    private final boolean f142583b;

    /* renamed from: c */
    private final int f142584c;

    /* renamed from: d */
    private final int f142585d;

    static {
        Covode.recordClassIndex(73703);
    }

    C62872i(PhotoModule photoModule, boolean z, int i, int i2) {
        this.f142582a = photoModule;
        this.f142583b = z;
        this.f142584c = i;
        this.f142585d = i2;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88434g
    public final Object apply(Object obj) {
        PhotoModule photoModule = this.f142582a;
        boolean z = this.f142583b;
        int i = this.f142584c;
        int i2 = this.f142585d;
        String str = (String) obj;
        if (z) {
            return AbstractC88979t.m154294a(new C62878m(photoModule, i, i2)).mo143292d(new C62882q(photoModule, str));
        }
        return AbstractC88979t.m154314c(new CallableC62883r(str));
    }
}
