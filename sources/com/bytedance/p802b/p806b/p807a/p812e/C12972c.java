package com.bytedance.p802b.p806b.p807a.p812e;

import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.b.b.a.e.c */
public final class C12972c {

    /* renamed from: a */
    public static volatile C12972c f31599a = new C12972c();

    /* renamed from: b */
    public Set<AbstractC12974d> f31600b = new HashSet();

    /* renamed from: c */
    public AbstractC12971b f31601c;

    /* renamed from: d */
    public int f31602d = 80;

    /* renamed from: e */
    public int f31603e = 5;

    static {
        Covode.recordClassIndex(14808);
    }

    /* renamed from: a */
    public final synchronized void mo20828a(AbstractC12971b bVar) {
        this.f31601c = bVar;
    }

    /* renamed from: a */
    public final synchronized void mo20829a(AbstractC12974d dVar) {
        if (dVar != null) {
            this.f31600b.add(dVar);
        }
    }
}
