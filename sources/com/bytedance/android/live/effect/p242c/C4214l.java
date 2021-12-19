package com.bytedance.android.live.effect.p242c;

import com.bytedance.android.live.effect.model.FilterModel;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88434g;

/* renamed from: com.bytedance.android.live.effect.c.l */
final /* synthetic */ class C4214l implements AbstractC88434g {

    /* renamed from: a */
    private final C4208j f11693a;

    static {
        Covode.recordClassIndex(4784);
    }

    C4214l(C4208j jVar) {
        this.f11693a = jVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88434g
    public final Object apply(Object obj) {
        return AbstractC88979t.m154294a(new C4216n(this.f11693a, (FilterModel) obj));
    }
}
