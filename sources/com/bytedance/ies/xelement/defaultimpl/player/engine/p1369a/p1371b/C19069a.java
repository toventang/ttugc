package com.bytedance.ies.xelement.defaultimpl.player.engine.p1369a.p1371b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.C19194c;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19158c;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19160e;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19161f;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19162g;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19163h;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19164i;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19168m;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.C19169n;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.EnumC19170o;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.EnumC19172q;
import com.bytedance.ies.xelement.defaultimpl.player.engine.p1369a.p1371b.C19106d;
import com.bytedance.ies.xelement.defaultimpl.player.engine.p1369a.p1371b.p1372a.C19082c;
import com.bytedance.ies.xelement.defaultimpl.player.engine.p1369a.p1371b.p1373b.C19103a;
import com.bytedance.ies.xelement.p1364b.C18993a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89388w;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.a */
public final class C19069a implements AbstractC19158c, AbstractC19160e, AbstractC19162g {

    /* renamed from: a */
    public final Context f45163a;

    /* renamed from: b */
    public final C18993a f45164b;

    /* renamed from: c */
    private final AbstractC89244h f45165c = C89250i.m154773a((AbstractC89171a) new C19072c(this));

    /* renamed from: d */
    private final AbstractC89244h f45166d = C89250i.m154773a((AbstractC89171a) new C19073d(this));

    /* renamed from: e */
    private final AbstractC89244h f45167e = C89250i.m154773a((AbstractC89171a) new C19070a(this));

    /* renamed from: f */
    private final AbstractC89244h f45168f = C89250i.m154773a((AbstractC89171a) new C19071b(this));

    static {
        Covode.recordClassIndex(21832);
    }

    /* renamed from: k */
    private final C19104c m35461k() {
        return (C19104c) this.f45167e.getValue();
    }

    /* renamed from: h */
    public final C19106d mo30419h() {
        return (C19106d) this.f45165c.getValue();
    }

    /* renamed from: i */
    public final C19103a mo30420i() {
        return (C19103a) this.f45166d.getValue();
    }

    /* renamed from: j */
    public final C19091b mo30421j() {
        return (C19091b) this.f45168f.getValue();
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.a$d */
    static final class C19073d extends AbstractC89220m implements AbstractC89171a<C19103a> {

        /* renamed from: a */
        final /* synthetic */ C19069a f45172a;

        static {
            Covode.recordClassIndex(21836);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19073d(C19069a aVar) {
            super(0);
            this.f45172a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C19103a invoke() {
            return new C19103a(this.f45172a);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19166k
    /* renamed from: g */
    public final C19194c mo30402g() {
        return mo30420i().f45230a;
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.a$a */
    static final class C19070a extends AbstractC89220m implements AbstractC89171a<C19104c> {

        /* renamed from: a */
        final /* synthetic */ C19069a f45169a;

        static {
            Covode.recordClassIndex(21833);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19070a(C19069a aVar) {
            super(0);
            this.f45169a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C19104c invoke() {
            C19104c cVar = new C19104c();
            cVar.mo30376a(this.f45169a.mo30420i());
            return cVar;
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.a$b */
    static final class C19071b extends AbstractC89220m implements AbstractC89171a<C19091b> {

        /* renamed from: a */
        final /* synthetic */ C19069a f45170a;

        static {
            Covode.recordClassIndex(21834);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19071b(C19069a aVar) {
            super(0);
            this.f45170a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C19091b invoke() {
            C19091b bVar = new C19091b();
            bVar.mo30375a(this.f45170a.mo30420i());
            return bVar;
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19158c
    /* renamed from: b */
    public final EnumC19170o mo30387b() {
        return mo30419h().mo30481c();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19158c
    /* renamed from: d */
    public final long mo30396d() {
        return mo30419h().mo30483d();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19158c
    /* renamed from: e */
    public final long mo30398e() {
        return mo30419h().mo30485e();
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.b.a$c */
    static final class C19072c extends AbstractC89220m implements AbstractC89171a<C19106d> {

        /* renamed from: a */
        final /* synthetic */ C19069a f45171a;

        static {
            Covode.recordClassIndex(21835);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19072c(C19069a aVar) {
            super(0);
            this.f45171a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C19106d invoke() {
            return new C19106d(this.f45171a.f45163a, this.f45171a.mo30421j(), this.f45171a.f45164b);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.AbstractC19192a
    /* renamed from: a */
    public final void mo30373a() {
        mo30421j().mo30461c().f45159a.clear();
        m35461k().f45236a.clear();
        mo30419h().mo30487f();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19158c
    /* renamed from: c */
    public final long mo30394c() {
        C19106d h = mo30419h();
        if (h.f45239a == null) {
            return 0;
        }
        return h.mo30470a().mo30435e();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19158c
    /* renamed from: f */
    public final long mo30400f() {
        C19106d h = mo30419h();
        if (h.f45239a == null) {
            return 0;
        }
        return h.mo30470a().mo30438h();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19160e
    /* renamed from: a */
    public final void mo30375a(AbstractC19159d dVar) {
        C89219l.m154719c(dVar, "");
        mo30421j().mo30375a(dVar);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19160e
    /* renamed from: b */
    public final void mo30388b(AbstractC19159d dVar) {
        C89219l.m154719c(dVar, "");
        mo30421j().mo30388b(dVar);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19158c
    /* renamed from: d */
    public final void mo30397d(C19194c cVar) {
        if (!m35461k().mo30466b(cVar)) {
            C19106d h = mo30419h();
            if (h.f45239a != null) {
                h.mo30470a().mo30431b();
            }
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19158c
    /* renamed from: e */
    public final void mo30399e(C19194c cVar) {
        if (!m35461k().mo30467c(cVar)) {
            mo30419h().mo30477b();
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19162g
    /* renamed from: a */
    public final void mo30376a(AbstractC19161f fVar) {
        C89219l.m154719c(fVar, "");
        m35461k().mo30376a(fVar);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19162g
    /* renamed from: b */
    public final void mo30389b(AbstractC19161f fVar) {
        C89219l.m154719c(fVar, "");
        m35461k().mo30389b(fVar);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19158c
    /* renamed from: c */
    public final void mo30395c(C19194c cVar) {
        if (!m35461k().mo30464a(cVar)) {
            C19106d h = mo30419h();
            h.mo30470a().mo30424a(h.f45240b);
            h.f45240b = 0;
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19158c
    /* renamed from: f */
    public final void mo30401f(C19194c cVar) {
        if (!m35461k().mo30468d(cVar)) {
            C19106d h = mo30419h();
            if (h.f45239a != null) {
                h.mo30470a().mo30423a();
            }
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19165j
    /* renamed from: a */
    public final void mo30377a(AbstractC19164i iVar) {
        C89219l.m154719c(iVar, "");
        mo30419h().mo30377a(iVar);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19158c
    /* renamed from: a */
    public final void mo30378a(C19169n nVar) {
        C19169n b = m35461k().mo30465b(nVar);
        mo30419h().mo30476a(b);
        mo30421j().mo30456a(b);
    }

    public C19069a(Context context, C18993a aVar) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(aVar, "");
        this.f45163a = context;
        this.f45164b = aVar;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19158c
    /* renamed from: a */
    public final void mo30374a(long j, AbstractC19168m mVar) {
        if (!m35461k().mo30469f()) {
            C19106d h = mo30419h();
            if (h.f45239a == null || h.mo30481c() == EnumC19170o.PLAYBACK_STATE_STOPPED) {
                h.f45240b = j;
                if (h.mo30470a() instanceof C19082c) {
                    AbstractC19163h a = h.mo30470a();
                    if (a != null) {
                        ((C19082c) a).f45202f = h.f45240b;
                        return;
                    }
                    throw new C89388w("null cannot be cast to non-null type");
                }
                return;
            }
            h.f45243e.mo30458a(EnumC19172q.SEEKING);
            h.mo30470a().mo30425a(j, new C19106d.C19111e(h, mVar));
        }
    }
}
