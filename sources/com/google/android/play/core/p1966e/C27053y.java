package com.google.android.play.core.p1966e;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.AbstractC26920bk;
import com.google.android.play.core.p1963b.C26918bi;
import com.google.android.play.core.p1966e.p1968b.C27018a;
import com.google.android.play.core.p1966e.p1968b.C27029l;
import java.io.File;

/* renamed from: com.google.android.play.core.e.y */
public final class C27053y implements AbstractC27003ai {

    /* renamed from: a */
    private AbstractC26920bk<Context> f64022a;

    /* renamed from: b */
    private AbstractC26920bk<C27048t> f64023b;

    /* renamed from: c */
    private AbstractC26920bk<C27010ap> f64024c;

    /* renamed from: d */
    private AbstractC26920bk<C27006al> f64025d = C26918bi.m53470a(C27007am.m53662a(this.f64022a));

    /* renamed from: e */
    private AbstractC26920bk<C27050v> f64026e;

    /* renamed from: f */
    private AbstractC26920bk<C27013as> f64027f;

    /* renamed from: g */
    private AbstractC26920bk<File> f64028g;

    /* renamed from: h */
    private AbstractC26920bk<C27018a> f64029h;

    /* renamed from: i */
    private AbstractC26920bk<C26999ae> f64030i;

    /* renamed from: j */
    private AbstractC26920bk<AbstractC27030c> f64031j;

    static {
        Covode.recordClassIndex(32529);
    }

    /* synthetic */ C27053y(C27015au auVar) {
        C27016av avVar = new C27016av(auVar);
        this.f64022a = avVar;
        this.f64023b = C26918bi.m53470a(new C27049u(avVar));
        this.f64024c = C26918bi.m53470a(new C27038j(auVar));
        AbstractC26920bk<C27050v> a = C26918bi.m53470a(new C27051w(this.f64022a));
        this.f64026e = a;
        this.f64027f = C26918bi.m53470a(new C27014at(this.f64023b, this.f64024c, this.f64025d, a));
        AbstractC26920bk<File> a2 = C26918bi.m53470a(new C27037i(this.f64022a));
        this.f64028g = a2;
        AbstractC26920bk<C27018a> a3 = C26918bi.m53470a(new C27029l(this.f64022a, a2, this.f64025d));
        this.f64029h = a3;
        AbstractC26920bk<C26999ae> a4 = C26918bi.m53470a(new C27000af(this.f64027f, a3, this.f64028g));
        this.f64030i = a4;
        this.f64031j = C26918bi.m53470a(new C27039k(auVar, a4));
    }

    @Override // com.google.android.play.core.p1966e.AbstractC27003ai
    /* renamed from: a */
    public final AbstractC27030c mo44712a() {
        return this.f64031j.mo44411a();
    }
}
