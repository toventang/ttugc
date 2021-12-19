package com.facebook.imagepipeline.p1889n;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.imagepipeline.common.EnumC24362c;
import com.facebook.imagepipeline.p1890o.C24636b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.imagepipeline.n.d */
public class C24586d implements AbstractC24545al {

    /* renamed from: a */
    public final C24636b f58412a;

    /* renamed from: b */
    public final String f58413b;

    /* renamed from: c */
    public final Object f58414c;

    /* renamed from: d */
    private final AbstractC24547an f58415d;

    /* renamed from: e */
    private final C24636b.EnumC24638b f58416e;

    /* renamed from: f */
    private boolean f58417f;

    /* renamed from: g */
    private EnumC24362c f58418g;

    /* renamed from: h */
    private boolean f58419h;

    /* renamed from: i */
    private boolean f58420i;

    /* renamed from: j */
    private final List<AbstractC24546am> f58421j = new ArrayList();

    static {
        Covode.recordClassIndex(28730);
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24545al
    /* renamed from: a */
    public final C24636b mo40413a() {
        return this.f58412a;
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24545al
    /* renamed from: b */
    public final String mo40415b() {
        return this.f58413b;
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24545al
    /* renamed from: c */
    public final AbstractC24547an mo40416c() {
        return this.f58415d;
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24545al
    /* renamed from: d */
    public final Object mo40417d() {
        return this.f58414c;
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24545al
    /* renamed from: e */
    public final C24636b.EnumC24638b mo40418e() {
        return this.f58416e;
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24545al
    /* renamed from: f */
    public final synchronized boolean mo40419f() {
        boolean z;
        MethodCollector.m26663i(3484);
        z = this.f58417f;
        MethodCollector.m26664o(3484);
        return z;
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24545al
    /* renamed from: g */
    public final synchronized EnumC24362c mo40420g() {
        EnumC24362c cVar;
        MethodCollector.m26663i(3486);
        cVar = this.f58418g;
        MethodCollector.m26664o(3486);
        return cVar;
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24545al
    /* renamed from: h */
    public final synchronized boolean mo40421h() {
        boolean z;
        MethodCollector.m26663i(3490);
        z = this.f58419h;
        MethodCollector.m26664o(3490);
        return z;
    }

    /* renamed from: i */
    public final synchronized List<AbstractC24546am> mo40443i() {
        MethodCollector.m26663i(3629);
        if (this.f58420i) {
            MethodCollector.m26664o(3629);
            return null;
        }
        this.f58420i = true;
        ArrayList arrayList = new ArrayList(this.f58421j);
        MethodCollector.m26664o(3629);
        return arrayList;
    }

    /* renamed from: a */
    public static void m47026a(List<AbstractC24546am> list) {
        if (list != null) {
            for (AbstractC24546am amVar : list) {
                amVar.mo34237a();
            }
        }
    }

    /* renamed from: b */
    public static void m47027b(List<AbstractC24546am> list) {
        if (list != null) {
            for (AbstractC24546am amVar : list) {
                amVar.mo40396b();
            }
        }
    }

    /* renamed from: c */
    public static void m47028c(List<AbstractC24546am> list) {
        if (list != null) {
            for (AbstractC24546am amVar : list) {
                amVar.mo40397c();
            }
        }
    }

    /* renamed from: d */
    public static void m47029d(List<AbstractC24546am> list) {
        if (list != null) {
            for (AbstractC24546am amVar : list) {
                amVar.mo40398d();
            }
        }
    }

    /* renamed from: a */
    public final synchronized List<AbstractC24546am> mo40440a(EnumC24362c cVar) {
        MethodCollector.m26663i(3509);
        if (cVar == this.f58418g) {
            MethodCollector.m26664o(3509);
            return null;
        }
        this.f58418g = cVar;
        ArrayList arrayList = new ArrayList(this.f58421j);
        MethodCollector.m26664o(3509);
        return arrayList;
    }

    /* renamed from: b */
    public final synchronized List<AbstractC24546am> mo40442b(boolean z) {
        MethodCollector.m26663i(3626);
        if (z == this.f58419h) {
            MethodCollector.m26664o(3626);
            return null;
        }
        this.f58419h = z;
        ArrayList arrayList = new ArrayList(this.f58421j);
        MethodCollector.m26664o(3626);
        return arrayList;
    }

    /* renamed from: a */
    public final synchronized List<AbstractC24546am> mo40441a(boolean z) {
        MethodCollector.m26663i(3507);
        if (z == this.f58417f) {
            MethodCollector.m26664o(3507);
            return null;
        }
        this.f58417f = z;
        ArrayList arrayList = new ArrayList(this.f58421j);
        MethodCollector.m26664o(3507);
        return arrayList;
    }

    @Override // com.facebook.imagepipeline.p1889n.AbstractC24545al
    /* renamed from: a */
    public final void mo40414a(AbstractC24546am amVar) {
        boolean z;
        MethodCollector.m26663i(3505);
        synchronized (this) {
            try {
                this.f58421j.add(amVar);
                z = this.f58420i;
            } finally {
                MethodCollector.m26664o(3505);
            }
        }
        if (z) {
            amVar.mo34237a();
        }
    }

    public C24586d(C24636b bVar, String str, AbstractC24547an anVar, Object obj, C24636b.EnumC24638b bVar2, boolean z, boolean z2, EnumC24362c cVar) {
        this.f58412a = bVar;
        this.f58413b = str;
        this.f58415d = anVar;
        this.f58414c = obj;
        this.f58416e = bVar2;
        this.f58417f = z;
        this.f58418g = cVar;
        this.f58419h = z2;
    }
}
