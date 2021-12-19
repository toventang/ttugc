package com.bytedance.ies.xelement.defaultimpl.player.engine.p1369a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.AbstractC19179c;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.AbstractC19193b;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.C19194c;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19161f;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19164i;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19168m;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.C19169n;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.EnumC19170o;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1378b.AbstractC19176c;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19183c;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19186f;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19187g;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19188h;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.EnumC19189i;
import com.bytedance.ies.xelement.defaultimpl.player.engine.p1369a.p1371b.C19069a;
import com.bytedance.ies.xelement.defaultimpl.player.engine.p1369a.p1374c.C19118b;
import com.bytedance.ies.xelement.defaultimpl.player.engine.p1369a.p1374c.C19121c;
import com.bytedance.ies.xelement.defaultimpl.player.engine.p1369a.p1375d.C19137a;
import com.bytedance.ies.xelement.p1364b.C18993a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.a */
public final class C19060a implements AbstractC19179c {

    /* renamed from: a */
    public boolean f45149a;

    /* renamed from: b */
    public final Context f45150b;

    /* renamed from: c */
    public final C18993a f45151c;

    /* renamed from: d */
    private final AbstractC89244h f45152d = C89250i.m154773a((AbstractC89171a) C19063c.f45158a);

    /* renamed from: e */
    private final AbstractC89244h f45153e = C89250i.m154773a((AbstractC89171a) new C19061a(this));

    /* renamed from: f */
    private final AbstractC89244h f45154f = C89250i.m154773a((AbstractC89171a) new C19062b(this));

    /* renamed from: g */
    private final C19118b f45155g;

    static {
        Covode.recordClassIndex(21823);
    }

    /* renamed from: p */
    private final C19137a m35409p() {
        return (C19137a) this.f45152d.getValue();
    }

    /* renamed from: q */
    private final C19069a m35410q() {
        return (C19069a) this.f45153e.getValue();
    }

    /* renamed from: r */
    private final C19121c m35411r() {
        return (C19121c) this.f45154f.getValue();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19181b
    /* renamed from: a */
    public final void mo30383a(AbstractC19188h hVar) {
        if (m35412s()) {
            m35409p().mo30383a(hVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19181b
    /* renamed from: a */
    public final void mo30384a(EnumC19189i iVar) {
        C89219l.m154719c(iVar, "");
        if (m35412s()) {
            m35409p().mo30384a(iVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19181b
    /* renamed from: a */
    public final void mo30381a(AbstractC19186f fVar, C19194c cVar) {
        if (m35412s()) {
            m35409p().mo30381a(fVar, cVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.AbstractC19173b
    /* renamed from: a */
    public final void mo30385a(AbstractC19193b<AbstractC19186f, C19169n> bVar) {
        C89219l.m154719c(bVar, "");
        this.f45155g.mo30385a(bVar);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.AbstractC19173b
    /* renamed from: a */
    public final void mo30386a(C19194c cVar) {
        if (m35412s()) {
            this.f45155g.mo30386a(cVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19185e
    /* renamed from: a */
    public final void mo30382a(AbstractC19187g gVar) {
        C89219l.m154719c(gVar, "");
        if (m35412s()) {
            m35409p().mo30382a(gVar);
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.a$b */
    static final class C19062b extends AbstractC89220m implements AbstractC89171a<C19121c> {

        /* renamed from: a */
        final /* synthetic */ C19060a f45157a;

        static {
            Covode.recordClassIndex(21825);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19062b(C19060a aVar) {
            super(0);
            this.f45157a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C19121c invoke() {
            return new C19121c(this.f45157a);
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.a$c */
    static final class C19063c extends AbstractC89220m implements AbstractC89171a<C19137a> {

        /* renamed from: a */
        public static final C19063c f45158a = new C19063c();

        static {
            Covode.recordClassIndex(21826);
        }

        C19063c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C19137a invoke() {
            return new C19137a();
        }
    }

    /* renamed from: s */
    private final boolean m35412s() {
        if (!this.f45149a) {
            return true;
        }
        return false;
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.a$a */
    static final class C19061a extends AbstractC89220m implements AbstractC89171a<C19069a> {

        /* renamed from: a */
        final /* synthetic */ C19060a f45156a;

        static {
            Covode.recordClassIndex(21824);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19061a(C19060a aVar) {
            super(0);
            this.f45156a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C19069a invoke() {
            return new C19069a(this.f45156a.f45150b, this.f45156a.f45151c);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.AbstractC19192a
    /* renamed from: a */
    public final void mo30373a() {
        if (!this.f45149a) {
            m35411r().mo30373a();
            m35409p().mo30373a();
            m35410q().mo30373a();
            this.f45149a = true;
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19158c
    /* renamed from: b */
    public final EnumC19170o mo30387b() {
        if (m35412s()) {
            return m35410q().mo30387b();
        }
        return EnumC19170o.PLAYBACK_STATE_STOPPED;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19158c
    /* renamed from: c */
    public final long mo30394c() {
        if (m35412s()) {
            return m35410q().mo30394c();
        }
        return 0;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19158c
    /* renamed from: d */
    public final long mo30396d() {
        if (m35412s()) {
            return m35410q().mo30419h().mo30483d();
        }
        return 0;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19158c
    /* renamed from: e */
    public final long mo30398e() {
        if (m35412s()) {
            return m35410q().mo30419h().mo30485e();
        }
        return 0;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19158c
    /* renamed from: f */
    public final long mo30400f() {
        if (m35412s()) {
            return m35410q().mo30400f();
        }
        return 0;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19166k
    /* renamed from: g */
    public final C19194c mo30402g() {
        if (m35412s()) {
            return m35410q().mo30420i().f45230a;
        }
        return null;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19181b
    /* renamed from: h */
    public final boolean mo30403h() {
        if (m35412s()) {
            return m35409p().mo30403h();
        }
        return false;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19181b
    /* renamed from: i */
    public final boolean mo30404i() {
        if (m35412s()) {
            return m35409p().mo30503c().mo30510a();
        }
        return false;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19181b
    /* renamed from: j */
    public final boolean mo30405j() {
        if (m35412s()) {
            return m35409p().mo30503c().mo30511b();
        }
        return false;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19181b
    /* renamed from: k */
    public final AbstractC19188h mo30406k() {
        if (m35412s()) {
            return m35409p().mo30503c().f45301a;
        }
        return null;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19181b
    /* renamed from: l */
    public final EnumC19189i mo30407l() {
        if (m35412s()) {
            return m35409p().mo30503c().f45302b;
        }
        return EnumC19189i.SEQUENCE;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19181b
    /* renamed from: m */
    public final AbstractC19186f mo30408m() {
        if (m35412s()) {
            return m35409p().mo30408m();
        }
        return null;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19181b
    /* renamed from: n */
    public final AbstractC19186f mo30409n() {
        if (m35412s()) {
            return m35409p().mo30503c().mo30513d();
        }
        return null;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19181b
    /* renamed from: o */
    public final AbstractC19186f mo30410o() {
        if (m35412s()) {
            return m35409p().mo30503c().mo30514e();
        }
        return null;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.AbstractC19173b
    /* renamed from: b */
    public final void mo30393b(C19194c cVar) {
        if (m35412s()) {
            this.f45155g.mo30393b(cVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19158c
    /* renamed from: c */
    public final void mo30395c(C19194c cVar) {
        if (m35412s()) {
            m35410q().mo30395c(cVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19158c
    /* renamed from: d */
    public final void mo30397d(C19194c cVar) {
        if (m35412s()) {
            m35410q().mo30397d(cVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19158c
    /* renamed from: e */
    public final void mo30399e(C19194c cVar) {
        if (m35412s()) {
            m35410q().mo30399e(cVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19158c
    /* renamed from: f */
    public final void mo30401f(C19194c cVar) {
        if (m35412s()) {
            m35410q().mo30401f(cVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19160e
    /* renamed from: a */
    public final void mo30375a(AbstractC19159d dVar) {
        C89219l.m154719c(dVar, "");
        if (m35412s()) {
            m35410q().mo30375a(dVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19160e
    /* renamed from: b */
    public final void mo30388b(AbstractC19159d dVar) {
        C89219l.m154719c(dVar, "");
        if (m35412s()) {
            m35410q().mo30388b(dVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19162g
    /* renamed from: a */
    public final void mo30376a(AbstractC19161f fVar) {
        C89219l.m154719c(fVar, "");
        if (m35412s()) {
            m35410q().mo30376a(fVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19162g
    /* renamed from: b */
    public final void mo30389b(AbstractC19161f fVar) {
        C89219l.m154719c(fVar, "");
        if (m35412s()) {
            m35410q().mo30389b(fVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19165j
    /* renamed from: a */
    public final void mo30377a(AbstractC19164i iVar) {
        C89219l.m154719c(iVar, "");
        if (m35412s()) {
            m35410q().mo30377a(iVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1378b.AbstractC19178d
    /* renamed from: b */
    public final void mo30390b(AbstractC19176c cVar) {
        C89219l.m154719c(cVar, "");
        if (m35412s()) {
            m35411r().mo30390b(cVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19158c
    /* renamed from: a */
    public final void mo30378a(C19169n nVar) {
        if (m35412s()) {
            m35410q().mo30378a(nVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19184d
    /* renamed from: b */
    public final void mo30391b(AbstractC19183c cVar) {
        C89219l.m154719c(cVar, "");
        if (m35412s()) {
            m35409p().mo30391b(cVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1378b.AbstractC19178d
    /* renamed from: a */
    public final void mo30379a(AbstractC19176c cVar) {
        C89219l.m154719c(cVar, "");
        if (m35412s()) {
            m35411r().mo30379a(cVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19185e
    /* renamed from: b */
    public final void mo30392b(AbstractC19187g gVar) {
        C89219l.m154719c(gVar, "");
        if (m35412s()) {
            m35409p().mo30392b(gVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19184d
    /* renamed from: a */
    public final void mo30380a(AbstractC19183c cVar) {
        C89219l.m154719c(cVar, "");
        if (m35412s()) {
            m35409p().mo30380a(cVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19158c
    /* renamed from: a */
    public final void mo30374a(long j, AbstractC19168m mVar) {
        if (m35412s()) {
            m35410q().mo30374a(j, mVar);
        }
    }

    public C19060a(Context context, C18993a aVar) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(aVar, "");
        this.f45150b = context;
        this.f45151c = aVar;
        C19118b bVar = new C19118b();
        this.f45155g = bVar;
        mo30379a((AbstractC19176c) bVar);
    }
}
