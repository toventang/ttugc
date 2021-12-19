package com.bytedance.ies.bullet.kit.lynx;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.kit.lynx.p1152a.C16374c;
import com.bytedance.ies.bullet.kit.lynx.p1153b.AbstractC16390c;
import com.bytedance.ies.bullet.kit.lynx.p1153b.AbstractC16391d;
import com.bytedance.ies.bullet.p1129c.AbstractC16253f;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16206g;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16207h;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16213l;
import com.bytedance.ies.bullet.p1129c.p1132c.C16238z;
import com.bytedance.ies.bullet.p1129c.p1136e.p1137a.C16248b;
import com.bytedance.ies.bullet.service.base.AbstractC16597ag;
import com.bytedance.ies.bullet.service.base.C16565a;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16576j;
import com.bytedance.ies.bullet.service.base.p1165c.AbstractC16628b;
import com.lynx.tasm.LynxEnv;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

public final class LynxKitApi extends ILynxKitApi<C16417i> {

    /* renamed from: a */
    public static final C16367a f39357a = new C16367a((byte) 0);

    /* renamed from: f */
    private static volatile boolean f39358f;

    /* renamed from: b */
    private Throwable f39359b;

    /* renamed from: c */
    private final Class<C16417i> f39360c = C16417i.class;

    /* renamed from: d */
    private C16248b f39361d;

    /* renamed from: e */
    private AbstractC16409d f39362e;

    static {
        Covode.recordClassIndex(18662);
    }

    /* renamed from: com.bytedance.ies.bullet.kit.lynx.LynxKitApi$a */
    public static final class C16367a {
        static {
            Covode.recordClassIndex(18663);
        }

        private C16367a() {
        }

        public /* synthetic */ C16367a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16203d
    /* renamed from: b */
    public final C16248b mo25711b() {
        return this.f39361d;
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.ILynxKitApi
    /* renamed from: h */
    public final boolean mo25951h() {
        return f39358f;
    }

    @Override // com.bytedance.ies.bullet.kit.lynx.ILynxKitApi
    /* renamed from: i */
    public final Throwable mo25952i() {
        return this.f39359b;
    }

    /* renamed from: j */
    private final boolean m30392j() {
        AbstractC16628b bVar = (AbstractC16628b) mo25790b_(AbstractC16628b.class);
        if (bVar != null) {
            bVar.mo26386a(this);
        }
        AbstractC16628b bVar2 = (AbstractC16628b) mo25790b_(AbstractC16628b.class);
        if (bVar2 != null) {
            return bVar2.mo26388b();
        }
        return false;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16216o, com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16203d
    /* renamed from: d */
    public final String mo25713d() {
        C89219l.m154709a((Object) LynxEnv.m56706b(), "");
        String g = LynxEnv.m56707g();
        C89219l.m154709a((Object) g, "");
        return g;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16203d
    /* renamed from: c */
    public final void mo25712c() {
        C16565a b;
        MethodCollector.m26663i(11787);
        AbstractC16597ag agVar = (AbstractC16597ag) mo25790b_(AbstractC16597ag.class);
        if (agVar == null || (b = agVar.mo26367b()) == null || !b.f39697d) {
            m30393k();
            MethodCollector.m26664o(11787);
            return;
        }
        LynxEnv b2 = LynxEnv.m56706b();
        C89219l.m154709a((Object) b2, "");
        synchronized (b2) {
            try {
                AbstractC16576j.C16578b.m30778a(this, "ensure lynx init be sync", null, null, 6);
                m30393k();
            } finally {
                MethodCollector.m26664o(11787);
            }
        }
    }

    /* renamed from: k */
    private final void m30393k() {
        C16415g gVar;
        AbstractC16409d dVar;
        if (!f39358f) {
            AbstractC16576j.C16578b.m30778a(this, "start to init lynx lib", null, null, 6);
            if (!C16374c.C16375a.m30429a().f39367a) {
                C16248b bVar = this.f39361d;
                if (bVar == null || (dVar = this.f39362e) == null || (gVar = dVar.mo26040a(bVar)) == null) {
                    gVar = new C16415g((byte) 0);
                }
                C16374c.C16375a.m30429a().mo25966a(gVar.f39418a);
            }
            try {
                f39358f = m30392j();
            } catch (Exception e) {
                printReject(e, "init lynx failed");
                f39358f = false;
                this.f39359b = e;
            }
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.lynx.LynxKitApi$b */
    public static final class C16368b implements AbstractC16207h<AbstractC16409d> {

        /* renamed from: a */
        final /* synthetic */ Object f39363a;

        static {
            Covode.recordClassIndex(18664);
        }

        C16368b(Object obj) {
            this.f39363a = obj;
        }

        /* Return type fixed from 'com.bytedance.ies.bullet.c.c.g' to match base method */
        @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16207h
        /* renamed from: a */
        public final /* synthetic */ AbstractC16409d mo25761a(C16248b bVar) {
            C89219l.m154719c(bVar, "");
            return ((AbstractC16390c) this.f39363a).mo26020a(bVar);
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.lynx.LynxKitApi$c */
    public static final class C16369c implements AbstractC16213l<AbstractC16412e, AbstractC16405c> {

        /* renamed from: a */
        final /* synthetic */ Object f39364a;

        static {
            Covode.recordClassIndex(18665);
        }

        C16369c(Object obj) {
            this.f39364a = obj;
        }

        /* Return type fixed from 'com.bytedance.ies.bullet.c.c.m' to match base method */
        @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16213l
        /* renamed from: a */
        public final /* synthetic */ AbstractC16412e mo25785a(C16248b bVar) {
            C89219l.m154719c(bVar, "");
            return ((AbstractC16391d) this.f39364a).mo26021g(bVar);
        }

        /* Return type fixed from 'com.bytedance.ies.bullet.c.c.e' to match base method */
        @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16213l
        /* renamed from: b */
        public final /* synthetic */ AbstractC16405c mo25786b(C16248b bVar) {
            C89219l.m154719c(bVar, "");
            return ((AbstractC16391d) this.f39364a).mo26022h(bVar);
        }
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16203d
    /* renamed from: a */
    public final AbstractC16213l<AbstractC16412e, AbstractC16405c> mo25706a(Object obj) {
        C89219l.m154719c(obj, "");
        if (obj instanceof AbstractC16391d) {
            return new C16369c(obj);
        }
        return null;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16203d
    /* renamed from: a */
    public final /* synthetic */ void mo25709a(AbstractC16208i iVar) {
        C89219l.m154719c(iVar, "");
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16203d
    /* renamed from: b */
    public final AbstractC16207h<AbstractC16409d> mo25710b(Object obj) {
        C89219l.m154719c(obj, "");
        if (obj instanceof AbstractC16390c) {
            return new C16368b(obj);
        }
        return null;
    }

    @Override // com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16203d
    /* renamed from: a */
    public final /* synthetic */ void mo25708a(AbstractC16206g gVar, C16248b bVar) {
        C89219l.m154719c(bVar, "");
        this.f39362e = (AbstractC16409d) gVar;
        this.f39361d = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C16417i mo25705a(C16238z zVar, List<String> list, AbstractC16253f fVar, C16248b bVar) {
        C89219l.m154719c(zVar, "");
        C89219l.m154719c(list, "");
        C89219l.m154719c(fVar, "");
        C89219l.m154719c(bVar, "");
        mo25712c();
        return new C16417i(this, zVar, list, fVar, bVar);
    }
}
