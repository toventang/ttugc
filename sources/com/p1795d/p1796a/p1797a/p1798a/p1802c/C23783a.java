package com.p1795d.p1796a.p1797a.p1798a.p1802c;

import com.bytedance.covode.number.Covode;
import com.p1795d.p1796a.p1797a.p1798a.p1800b.C23781l;
import java.util.ArrayList;

/* renamed from: com.d.a.a.a.c.a */
public final class C23783a {

    /* renamed from: a */
    public static C23783a f56269a = new C23783a();

    /* renamed from: b */
    public final ArrayList<C23781l> f56270b = new ArrayList<>();

    /* renamed from: c */
    public final ArrayList<C23781l> f56271c = new ArrayList<>();

    static {
        Covode.recordClassIndex(27891);
    }

    private C23783a() {
    }

    /* renamed from: a */
    public final void mo39248a(C23781l lVar) {
        boolean a = mo39249a();
        this.f56271c.add(lVar);
        if (!a) {
            C23791f.m44969a().mo39260b();
        }
    }

    /* renamed from: a */
    public final boolean mo39249a() {
        return this.f56271c.size() > 0;
    }
}
