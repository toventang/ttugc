package com.bytedance.lynx.hybrid;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.p1515a.AbstractC21151e;
import com.bytedance.lynx.hybrid.p1515a.C21147a;
import com.bytedance.lynx.hybrid.p1522h.C21196a;
import com.bytedance.lynx.hybrid.service.p1537b.C21351a;
import java.util.HashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.bytedance.lynx.hybrid.d */
public final class C21170d {

    /* renamed from: e */
    public static final AbstractC89244h f50218e = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C21172b.f50225a);

    /* renamed from: f */
    public static final C21171a f50219f = new C21171a((byte) 0);

    /* renamed from: a */
    public boolean f50220a;

    /* renamed from: b */
    public Application f50221b;

    /* renamed from: c */
    public HashMap<C21196a, AbstractC21151e> f50222c = new HashMap<>();

    /* renamed from: d */
    public C21147a f50223d;

    /* renamed from: com.bytedance.lynx.hybrid.d$a */
    public static final class C21171a {

        /* renamed from: a */
        static final /* synthetic */ AbstractC89286i[] f50224a = {new C89232y(C89204ab.m154669a(C21171a.class), "instance", "getInstance()Lcom/bytedance/lynx/hybrid/HybridEnvironment;")};

        /* renamed from: a */
        public static C21170d m39868a() {
            return (C21170d) C21170d.f50218e.getValue();
        }

        private C21171a() {
        }

        static {
            Covode.recordClassIndex(24787);
        }

        public /* synthetic */ C21171a(byte b) {
            this();
        }
    }

    /* renamed from: com.bytedance.lynx.hybrid.d$b */
    static final class C21172b extends AbstractC89220m implements AbstractC89171a<C21170d> {

        /* renamed from: a */
        public static final C21172b f50225a = new C21172b();

        static {
            Covode.recordClassIndex(24788);
        }

        C21172b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C21170d invoke() {
            return new C21170d();
        }
    }

    /* renamed from: a */
    public final Application mo34735a() {
        Application application = this.f50221b;
        if (application == null) {
            C89219l.m154710a("context");
        }
        return application;
    }

    static {
        Covode.recordClassIndex(24786);
    }

    /* renamed from: a */
    public final <T> T mo34736a(C21196a aVar, Class<T> cls) {
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(cls, "");
        AbstractC21151e eVar = this.f50222c.get(aVar);
        if (eVar != null) {
            return (T) eVar.mo34721a(cls);
        }
        return null;
    }

    /* renamed from: a */
    public final <T> void mo34737a(C21196a aVar, Class<T> cls, T t) {
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(cls, "");
        if (this.f50222c.get(aVar) == null) {
            this.f50222c.put(aVar, new C21351a());
        }
        AbstractC21151e eVar = this.f50222c.get(aVar);
        if (eVar != null) {
            eVar.mo34722a(cls, t);
        }
    }
}
