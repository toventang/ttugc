package com.bytedance.frameworks.baselib.network.p980b;

import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.baselib.network.p980b.AbstractC14598c;

/* renamed from: com.bytedance.frameworks.baselib.network.b.a */
public final class C14596a extends AbstractRunnableC14597b {

    /* renamed from: a */
    public final boolean f35283a;

    /* renamed from: b */
    public final String f35284b;

    /* renamed from: g */
    private final Runnable f35285g;

    /* renamed from: h */
    private final AbstractC14598c.EnumC14599a f35286h;

    static {
        Covode.recordClassIndex(16687);
    }

    @Override // com.bytedance.frameworks.baselib.network.p980b.AbstractC14598c
    /* renamed from: b */
    public final int mo23472b() {
        return this.f35290f;
    }

    @Override // com.bytedance.frameworks.baselib.network.p980b.AbstractC14598c
    /* renamed from: a */
    public final AbstractC14598c.EnumC14599a mo23471a() {
        return this.f35286h;
    }

    public final void run() {
        if (this.f35285g != null && !mo23475c()) {
            this.f35285g.run();
        }
    }

    @Override // com.bytedance.frameworks.baselib.network.p980b.AbstractRunnableC14597b
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractRunnableC14597b mo23470a(int i) {
        this.f35290f = i;
        return this;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(AbstractC14598c cVar) {
        AbstractC14598c cVar2 = cVar;
        AbstractC14598c.EnumC14599a aVar = this.f35286h;
        AbstractC14598c.EnumC14599a a = cVar2.mo23471a();
        if (aVar == null) {
            aVar = AbstractC14598c.EnumC14599a.NORMAL;
        }
        if (a == null) {
            a = AbstractC14598c.EnumC14599a.NORMAL;
        }
        if (aVar == a) {
            return this.f35290f - cVar2.mo23472b();
        }
        return a.ordinal() - aVar.ordinal();
    }

    public C14596a(String str, AbstractC14598c.EnumC14599a aVar, int i, Runnable runnable, boolean z) {
        this.f35286h = aVar;
        str = C13627m.m24498a(str) ? getClass().getSimpleName() : str;
        this.f35289e = i;
        this.f35284b = str;
        this.f35285g = runnable;
        this.f35283a = z;
    }
}
