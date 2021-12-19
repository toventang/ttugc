package com.p1795d.p1796a.p1797a.p1798a.p1802c;

import com.bytedance.covode.number.Covode;
import com.p1795d.p1796a.p1797a.p1798a.p1799a.AbstractC23762c;
import com.p1795d.p1796a.p1797a.p1798a.p1799a.C23761b;
import com.p1795d.p1796a.p1797a.p1798a.p1799a.C23763d;
import com.p1795d.p1796a.p1797a.p1798a.p1799a.C23764e;
import com.p1795d.p1796a.p1797a.p1798a.p1800b.C23781l;
import com.p1795d.p1796a.p1797a.p1798a.p1802c.C23784b;
import com.p1795d.p1796a.p1797a.p1798a.p1807h.C23810a;
import java.util.Collections;

/* renamed from: com.d.a.a.a.c.f */
public final class C23791f implements AbstractC23762c, C23784b.AbstractC23786a {

    /* renamed from: c */
    private static C23791f f56289c;

    /* renamed from: a */
    public float f56290a;

    /* renamed from: b */
    public C23763d f56291b;

    /* renamed from: d */
    private final C23764e f56292d;

    /* renamed from: e */
    private final C23761b f56293e;

    /* renamed from: f */
    private C23783a f56294f;

    static {
        Covode.recordClassIndex(27899);
    }

    private C23791f(C23764e eVar, C23761b bVar) {
        this.f56292d = eVar;
        this.f56293e = bVar;
    }

    /* renamed from: a */
    public static C23791f m44969a() {
        if (f56289c == null) {
            f56289c = new C23791f(new C23764e(), new C23761b());
        }
        return f56289c;
    }

    /* renamed from: b */
    public final void mo39260b() {
        C23784b.f56272a.f56277f = this;
        C23784b.f56272a.mo39250a();
        if (C23784b.f56272a.mo39251b()) {
            C23810a.m45014a();
        }
        this.f56291b.mo39219a();
    }

    @Override // com.p1795d.p1796a.p1797a.p1798a.p1802c.C23784b.AbstractC23786a
    /* renamed from: a */
    public final void mo39253a(boolean z) {
        if (z) {
            C23810a.m45014a();
        } else {
            C23810a.m45015b();
        }
    }

    @Override // com.p1795d.p1796a.p1797a.p1798a.p1799a.AbstractC23762c
    /* renamed from: a */
    public final void mo39218a(float f) {
        this.f56290a = f;
        if (this.f56294f == null) {
            this.f56294f = C23783a.f56269a;
        }
        for (C23781l lVar : Collections.unmodifiableCollection(this.f56294f.f56271c)) {
            lVar.f56260c.mo39265a(f);
        }
    }
}
