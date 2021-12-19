package com.p1795d.p1796a.p1797a.p1798a.p1800b;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p1795d.p1796a.p1797a.p1798a.C23759a;
import com.p1795d.p1796a.p1797a.p1798a.p1804e.C23801d;

/* renamed from: com.d.a.a.a.b.b */
public abstract class AbstractC23771b {
    static {
        Covode.recordClassIndex(27879);
    }

    /* renamed from: a */
    public abstract void mo39235a();

    /* renamed from: a */
    public abstract void mo39236a(View view);

    /* renamed from: b */
    public abstract void mo39237b();

    /* renamed from: b */
    public abstract void mo39238b(View view);

    /* renamed from: c */
    public abstract void mo39239c(View view);

    /* renamed from: a */
    public static AbstractC23771b m44929a(C23772c cVar, C23773d dVar) {
        if (C23759a.f56213a.f56268a) {
            C23801d.m44992a(cVar, "AdSessionConfiguration is null");
            C23801d.m44992a(dVar, "AdSessionContext is null");
            return new C23781l(cVar, dVar);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }
}
