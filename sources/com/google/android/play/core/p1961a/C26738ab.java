package com.google.android.play.core.p1961a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.AbstractC26920bk;
import com.google.android.play.core.p1963b.C26918bi;

/* renamed from: com.google.android.play.core.a.ab */
public final class C26738ab {

    /* renamed from: a */
    AbstractC26920bk<AbstractC26739b> f63353a;

    /* renamed from: b */
    private AbstractC26920bk<Context> f63354b;

    /* renamed from: c */
    private AbstractC26920bk<C26759u> f63355c;

    /* renamed from: d */
    private AbstractC26920bk<C26757s> f63356d;

    /* renamed from: e */
    private AbstractC26920bk<C26743e> f63357e;

    /* renamed from: f */
    private AbstractC26920bk<C26746h> f63358f;

    static {
        Covode.recordClassIndex(32210);
    }

    /* synthetic */ C26738ab(C26748j jVar) {
        C26750l lVar = new C26750l(jVar);
        this.f63354b = lVar;
        AbstractC26920bk<C26759u> a = C26918bi.m53470a(new C26760v(lVar));
        this.f63355c = a;
        this.f63356d = C26918bi.m53470a(new C26758t(this.f63354b, a));
        AbstractC26920bk<C26743e> a2 = C26918bi.m53470a(new C26744f(this.f63354b));
        this.f63357e = a2;
        AbstractC26920bk<C26746h> a3 = C26918bi.m53470a(new C26747i(this.f63356d, a2, this.f63354b));
        this.f63358f = a3;
        this.f63353a = C26918bi.m53470a(new C26749k(a3));
    }
}
