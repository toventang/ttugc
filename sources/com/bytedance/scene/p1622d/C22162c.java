package com.bytedance.scene.p1622d;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.scene.d.c */
public final class C22162c extends C22160b {

    /* renamed from: a */
    private List<C22160b> f52401a = new ArrayList();

    static {
        Covode.recordClassIndex(25966);
    }

    /* renamed from: c */
    public final C22160b mo36345c() {
        C22160b bVar = new C22160b();
        m41643a(bVar);
        return bVar;
    }

    @Override // com.bytedance.scene.p1622d.C22160b
    /* renamed from: a */
    public final void mo36342a() {
        for (C22160b bVar : this.f52401a) {
            bVar.mo36342a();
        }
        super.mo36342a();
    }

    /* renamed from: a */
    private void m41643a(C22160b bVar) {
        C22170j.m41654a();
        this.f52401a.add(bVar);
    }
}
