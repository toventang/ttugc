package com.bytedance.ies.xelement.defaultimpl.player.engine.p1369a.p1374c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.AbstractC19179c;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.AbstractC19192a;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.C19169n;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.EnumC19157b;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.EnumC19167l;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.EnumC19170o;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.EnumC19172q;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1378b.AbstractC19176c;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1378b.AbstractC19178d;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1378b.C19175b;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19183c;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19186f;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19188h;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.EnumC19189i;
import com.bytedance.ies.xelement.defaultimpl.player.engine.p1369a.p1370a.C19064a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.c.c */
public final class C19121c implements AbstractC19159d, AbstractC19178d, AbstractC19183c, AbstractC19192a {

    /* renamed from: a */
    private final AbstractC89244h f45273a = C89250i.m154773a((AbstractC89171a) C19122a.f45275a);

    /* renamed from: b */
    private final AbstractC19179c f45274b;

    static {
        Covode.recordClassIndex(21884);
    }

    /* renamed from: c */
    private final C19064a<AbstractC19176c> m35644c() {
        return (C19064a) this.f45273a.getValue();
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19183c
    /* renamed from: a */
    public final void mo30499a(AbstractC19186f fVar) {
        m35644c().mo30411a(new C19124c(fVar));
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.c.c$a */
    static final class C19122a extends AbstractC89220m implements AbstractC89171a<C19064a<AbstractC19176c>> {

        /* renamed from: a */
        public static final C19122a f45275a = new C19122a();

        static {
            Covode.recordClassIndex(21885);
        }

        C19122a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C19064a<AbstractC19176c> invoke() {
            return new C19064a();
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d
    /* renamed from: b */
    public final void mo30459b() {
        m35644c().mo30411a(C19133l.f45286a);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d
    /* renamed from: d */
    public final void mo30462d() {
        m35644c().mo30411a(C19134m.f45287a);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d
    /* renamed from: e */
    public final void mo30463e() {
        m35644c().mo30411a(C19123b.f45276a);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.AbstractC19192a
    /* renamed from: a */
    public final void mo30373a() {
        this.f45274b.mo30391b((AbstractC19183c) this);
        this.f45274b.mo30388b((AbstractC19159d) this);
        m35644c().mo30411a(C19136o.f45289a);
        m35644c().f45159a.clear();
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.c.c$b */
    static final class C19123b extends AbstractC89220m implements AbstractC89172b<AbstractC19176c, C89391z> {

        /* renamed from: a */
        public static final C19123b f45276a = new C19123b();

        static {
            Covode.recordClassIndex(21886);
        }

        C19123b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC19176c cVar) {
            AbstractC19176c cVar2 = cVar;
            C89219l.m154719c(cVar2, "");
            cVar2.mo30463e();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.c.c$c */
    static final class C19124c extends AbstractC89220m implements AbstractC89172b<AbstractC19176c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC19186f f45277a;

        static {
            Covode.recordClassIndex(21887);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19124c(AbstractC19186f fVar) {
            super(1);
            this.f45277a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC19176c cVar) {
            AbstractC19176c cVar2 = cVar;
            C89219l.m154719c(cVar2, "");
            cVar2.mo30499a(this.f45277a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.c.c$d */
    static final class C19125d extends AbstractC89220m implements AbstractC89172b<AbstractC19176c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ EnumC19157b f45278a;

        static {
            Covode.recordClassIndex(21888);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19125d(EnumC19157b bVar) {
            super(1);
            this.f45278a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC19176c cVar) {
            AbstractC19176c cVar2 = cVar;
            C89219l.m154719c(cVar2, "");
            cVar2.mo30454a(this.f45278a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.c.c$e */
    static final class C19126e extends AbstractC89220m implements AbstractC89172b<AbstractC19176c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ EnumC19167l f45279a;

        static {
            Covode.recordClassIndex(21889);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19126e(EnumC19167l lVar) {
            super(1);
            this.f45279a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC19176c cVar) {
            AbstractC19176c cVar2 = cVar;
            C89219l.m154719c(cVar2, "");
            cVar2.mo30455a(this.f45279a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.c.c$f */
    static final class C19127f extends AbstractC89220m implements AbstractC89172b<AbstractC19176c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ EnumC19189i f45280a;

        static {
            Covode.recordClassIndex(21890);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19127f(EnumC19189i iVar) {
            super(1);
            this.f45280a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC19176c cVar) {
            AbstractC19176c cVar2 = cVar;
            C89219l.m154719c(cVar2, "");
            cVar2.mo30501a_(this.f45280a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.c.c$g */
    static final class C19128g extends AbstractC89220m implements AbstractC89172b<AbstractC19176c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C19169n f45281a;

        static {
            Covode.recordClassIndex(21891);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19128g(C19169n nVar) {
            super(1);
            this.f45281a = nVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC19176c cVar) {
            AbstractC19176c cVar2 = cVar;
            C89219l.m154719c(cVar2, "");
            cVar2.mo30456a(this.f45281a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.c.c$h */
    static final class C19129h extends AbstractC89220m implements AbstractC89172b<AbstractC19176c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ EnumC19170o f45282a;

        static {
            Covode.recordClassIndex(21892);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19129h(EnumC19170o oVar) {
            super(1);
            this.f45282a = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC19176c cVar) {
            AbstractC19176c cVar2 = cVar;
            C89219l.m154719c(cVar2, "");
            cVar2.mo30457a(this.f45282a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.c.c$i */
    static final class C19130i extends AbstractC89220m implements AbstractC89172b<AbstractC19176c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ long f45283a;

        static {
            Covode.recordClassIndex(21893);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19130i(long j) {
            super(1);
            this.f45283a = j;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC19176c cVar) {
            AbstractC19176c cVar2 = cVar;
            C89219l.m154719c(cVar2, "");
            cVar2.mo30453a(this.f45283a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.c.c$j */
    static final class C19131j extends AbstractC89220m implements AbstractC89172b<AbstractC19176c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ long f45284a;

        static {
            Covode.recordClassIndex(21894);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19131j(long j) {
            super(1);
            this.f45284a = j;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC19176c cVar) {
            AbstractC19176c cVar2 = cVar;
            C89219l.m154719c(cVar2, "");
            cVar2.mo30460b(this.f45284a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.c.c$k */
    static final class C19132k extends AbstractC89220m implements AbstractC89172b<AbstractC19176c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC19188h f45285a;

        static {
            Covode.recordClassIndex(21895);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19132k(AbstractC19188h hVar) {
            super(1);
            this.f45285a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC19176c cVar) {
            AbstractC19176c cVar2 = cVar;
            C89219l.m154719c(cVar2, "");
            cVar2.mo30500a_(this.f45285a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.c.c$l */
    static final class C19133l extends AbstractC89220m implements AbstractC89172b<AbstractC19176c, C89391z> {

        /* renamed from: a */
        public static final C19133l f45286a = new C19133l();

        static {
            Covode.recordClassIndex(21896);
        }

        C19133l() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC19176c cVar) {
            AbstractC19176c cVar2 = cVar;
            C89219l.m154719c(cVar2, "");
            cVar2.mo30459b();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.c.c$m */
    static final class C19134m extends AbstractC89220m implements AbstractC89172b<AbstractC19176c, C89391z> {

        /* renamed from: a */
        public static final C19134m f45287a = new C19134m();

        static {
            Covode.recordClassIndex(21897);
        }

        C19134m() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC19176c cVar) {
            AbstractC19176c cVar2 = cVar;
            C89219l.m154719c(cVar2, "");
            cVar2.mo30462d();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.c.c$n */
    static final class C19135n extends AbstractC89220m implements AbstractC89172b<AbstractC19176c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ EnumC19172q f45288a;

        static {
            Covode.recordClassIndex(21898);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19135n(EnumC19172q qVar) {
            super(1);
            this.f45288a = qVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC19176c cVar) {
            AbstractC19176c cVar2 = cVar;
            C89219l.m154719c(cVar2, "");
            cVar2.mo30458a(this.f45288a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.c.c$o */
    static final class C19136o extends AbstractC89220m implements AbstractC89172b<AbstractC19176c, C89391z> {

        /* renamed from: a */
        public static final C19136o f45289a = new C19136o();

        static {
            Covode.recordClassIndex(21899);
        }

        C19136o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC19176c cVar) {
            AbstractC19176c cVar2 = cVar;
            C89219l.m154719c(cVar2, "");
            cVar2.mo30490a();
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d
    /* renamed from: a */
    public final void mo30453a(long j) {
        m35644c().mo30411a(new C19130i(j));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19183c
    /* renamed from: a_ */
    public final void mo30500a_(AbstractC19188h hVar) {
        m35644c().mo30411a(new C19132k(hVar));
    }

    public C19121c(AbstractC19179c cVar) {
        C89219l.m154719c(cVar, "");
        this.f45274b = cVar;
        cVar.mo30380a((AbstractC19183c) this);
        cVar.mo30375a((AbstractC19159d) this);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19183c
    /* renamed from: a_ */
    public final void mo30501a_(EnumC19189i iVar) {
        C89219l.m154719c(iVar, "");
        m35644c().mo30411a(new C19127f(iVar));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d
    /* renamed from: b */
    public final void mo30460b(long j) {
        m35644c().mo30411a(new C19131j(j));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d
    /* renamed from: a */
    public final void mo30454a(EnumC19157b bVar) {
        C89219l.m154719c(bVar, "");
        m35644c().mo30411a(new C19125d(bVar));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1378b.AbstractC19178d
    /* renamed from: b */
    public final void mo30390b(AbstractC19176c cVar) {
        C89219l.m154719c(cVar, "");
        C19064a<AbstractC19176c> c = m35644c();
        cVar.mo30490a();
        c.mo30413b(cVar);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d
    /* renamed from: a */
    public final void mo30455a(EnumC19167l lVar) {
        C89219l.m154719c(lVar, "");
        m35644c().mo30411a(new C19126e(lVar));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d
    /* renamed from: a */
    public final void mo30456a(C19169n nVar) {
        m35644c().mo30411a(new C19128g(nVar));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d
    /* renamed from: a */
    public final void mo30457a(EnumC19170o oVar) {
        C89219l.m154719c(oVar, "");
        m35644c().mo30411a(new C19129h(oVar));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d
    /* renamed from: a */
    public final void mo30458a(EnumC19172q qVar) {
        C89219l.m154719c(qVar, "");
        m35644c().mo30411a(new C19135n(qVar));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1378b.AbstractC19178d
    /* renamed from: a */
    public final void mo30379a(AbstractC19176c cVar) {
        C89219l.m154719c(cVar, "");
        AbstractC19179c cVar2 = this.f45274b;
        C19175b bVar = new C19175b(cVar2, cVar2, cVar2, cVar2, cVar2, cVar2, cVar2);
        C19064a<AbstractC19176c> c = m35644c();
        cVar.mo30491a(bVar);
        c.mo30412a(cVar);
    }
}
