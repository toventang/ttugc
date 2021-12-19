package com.bytedance.jedi.ext.adapter.internal;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.jedi.ext.adapter.internal.g */
public final class C20668g {

    /* renamed from: a */
    public final List<JediViewHolderProxy> f48876a = new ArrayList();

    /* renamed from: b */
    public final C20662d f48877b;

    static {
        Covode.recordClassIndex(24204);
    }

    /* renamed from: a */
    public final void mo33920a() {
        if (this.f48876a.size() != 0) {
            for (T t : this.f48876a) {
                if (t != null) {
                    this.f48877b.mo33919b(t);
                }
            }
            this.f48876a.clear();
        }
    }

    /* renamed from: a */
    private final void m38916a(int i) {
        this.f48876a.add(i, null);
    }

    public C20668g(C20662d dVar) {
        C89219l.m154719c(dVar, "");
        this.f48877b = dVar;
    }

    /* renamed from: b */
    private final void m38917b(int i, JediViewHolderProxy jediViewHolderProxy) {
        if (i < this.f48876a.size()) {
            this.f48876a.set(i, jediViewHolderProxy);
        } else {
            this.f48876a.add(i, jediViewHolderProxy);
        }
    }

    /* renamed from: a */
    public final void mo33921a(int i, JediViewHolderProxy jediViewHolderProxy) {
        if (i >= 0 && i <= this.f48876a.size()) {
            if (jediViewHolderProxy != null) {
                m38917b(i, jediViewHolderProxy);
            } else {
                m38916a(i);
            }
        }
    }
}
