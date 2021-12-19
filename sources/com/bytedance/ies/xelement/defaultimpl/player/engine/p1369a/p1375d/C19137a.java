package com.bytedance.ies.xelement.defaultimpl.player.engine.p1369a.p1375d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.C19194c;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19181b;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19183c;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19184d;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19185e;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19186f;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19187g;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19188h;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.EnumC19189i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.d.a */
public final class C19137a implements AbstractC19181b, AbstractC19184d, AbstractC19185e {

    /* renamed from: a */
    private final AbstractC89244h f45290a = C89250i.m154773a((AbstractC89171a) C19139b.f45294a);

    /* renamed from: b */
    private final AbstractC89244h f45291b = C89250i.m154773a((AbstractC89171a) new C19138a(this));

    /* renamed from: c */
    private final AbstractC89244h f45292c = C89250i.m154773a((AbstractC89171a) C19140c.f45295a);

    static {
        Covode.recordClassIndex(21900);
    }

    /* renamed from: d */
    private final C19153d m35661d() {
        return (C19153d) this.f45292c.getValue();
    }

    /* renamed from: b */
    public final C19148c mo30502b() {
        return (C19148c) this.f45290a.getValue();
    }

    /* renamed from: c */
    public final C19146b mo30503c() {
        return (C19146b) this.f45291b.getValue();
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.d.a$b */
    static final class C19139b extends AbstractC89220m implements AbstractC89171a<C19148c> {

        /* renamed from: a */
        public static final C19139b f45294a = new C19139b();

        static {
            Covode.recordClassIndex(21902);
        }

        C19139b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C19148c invoke() {
            return new C19148c();
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.d.a$c */
    static final class C19140c extends AbstractC89220m implements AbstractC89171a<C19153d> {

        /* renamed from: a */
        public static final C19140c f45295a = new C19140c();

        static {
            Covode.recordClassIndex(21903);
        }

        C19140c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C19153d invoke() {
            return new C19153d();
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19181b
    /* renamed from: k */
    public final AbstractC19188h mo30406k() {
        return mo30503c().f45301a;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19181b
    /* renamed from: l */
    public final EnumC19189i mo30407l() {
        return mo30503c().f45302b;
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.d.a$a */
    static final class C19138a extends AbstractC89220m implements AbstractC89171a<C19146b> {

        /* renamed from: a */
        final /* synthetic */ C19137a f45293a;

        static {
            Covode.recordClassIndex(21901);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19138a(C19137a aVar) {
            super(0);
            this.f45293a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C19146b invoke() {
            return new C19146b(this.f45293a.mo30502b());
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19181b
    /* renamed from: h */
    public final boolean mo30403h() {
        if (mo30503c().mo30512c() != null) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19181b
    /* renamed from: i */
    public final boolean mo30404i() {
        return mo30503c().mo30510a();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19181b
    /* renamed from: j */
    public final boolean mo30405j() {
        return mo30503c().mo30511b();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19181b
    /* renamed from: m */
    public final AbstractC19186f mo30408m() {
        return mo30503c().mo30512c();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19181b
    /* renamed from: n */
    public final AbstractC19186f mo30409n() {
        return mo30503c().mo30513d();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19181b
    /* renamed from: o */
    public final AbstractC19186f mo30410o() {
        return mo30503c().mo30514e();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.AbstractC19192a
    /* renamed from: a */
    public final void mo30373a() {
        mo30502b().mo30373a();
        m35661d().f45311a.clear();
        mo30503c().mo30515f();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19184d
    /* renamed from: a */
    public final void mo30380a(AbstractC19183c cVar) {
        C89219l.m154719c(cVar, "");
        mo30502b().mo30380a(cVar);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19184d
    /* renamed from: b */
    public final void mo30391b(AbstractC19183c cVar) {
        C89219l.m154719c(cVar, "");
        mo30502b().mo30391b(cVar);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19185e
    /* renamed from: b */
    public final void mo30392b(AbstractC19187g gVar) {
        C89219l.m154719c(gVar, "");
        m35661d().mo30392b(gVar);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19185e
    /* renamed from: a */
    public final void mo30382a(AbstractC19187g gVar) {
        C89219l.m154719c(gVar, "");
        m35661d().mo30382a(gVar);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19181b
    /* renamed from: a */
    public final void mo30383a(AbstractC19188h hVar) {
        mo30503c().mo30508a(m35661d().mo30497a(hVar));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19181b
    /* renamed from: a */
    public final void mo30384a(EnumC19189i iVar) {
        C89219l.m154719c(iVar, "");
        mo30503c().mo30509a(m35661d().mo30498a(iVar));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19181b
    /* renamed from: a */
    public final void mo30381a(AbstractC19186f fVar, C19194c cVar) {
        mo30503c().mo30507a(m35661d().mo30496a(fVar, cVar));
    }
}
