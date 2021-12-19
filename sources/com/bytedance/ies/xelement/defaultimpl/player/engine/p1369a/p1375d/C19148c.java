package com.bytedance.ies.xelement.defaultimpl.player.engine.p1369a.p1375d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.AbstractC19192a;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19183c;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19184d;
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

/* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.d.c */
public final class C19148c implements AbstractC19183c, AbstractC19184d, AbstractC19192a {

    /* renamed from: a */
    private final AbstractC89244h f45305a = C89250i.m154773a((AbstractC89171a) C19149a.f45306a);

    static {
        Covode.recordClassIndex(21911);
    }

    /* renamed from: b */
    private final C19064a<AbstractC19183c> m35699b() {
        return (C19064a) this.f45305a.getValue();
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.d.c$a */
    static final class C19149a extends AbstractC89220m implements AbstractC89171a<C19064a<AbstractC19183c>> {

        /* renamed from: a */
        public static final C19149a f45306a = new C19149a();

        static {
            Covode.recordClassIndex(21912);
        }

        C19149a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C19064a<AbstractC19183c> invoke() {
            return new C19064a();
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.AbstractC19192a
    /* renamed from: a */
    public final void mo30373a() {
        m35699b().f45159a.clear();
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.d.c$b */
    static final class C19150b extends AbstractC89220m implements AbstractC89172b<AbstractC19183c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC19186f f45307a;

        static {
            Covode.recordClassIndex(21913);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19150b(AbstractC19186f fVar) {
            super(1);
            this.f45307a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC19183c cVar) {
            AbstractC19183c cVar2 = cVar;
            C89219l.m154719c(cVar2, "");
            cVar2.mo30499a(this.f45307a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.d.c$c */
    static final class C19151c extends AbstractC89220m implements AbstractC89172b<AbstractC19183c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ EnumC19189i f45308a;

        static {
            Covode.recordClassIndex(21914);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19151c(EnumC19189i iVar) {
            super(1);
            this.f45308a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC19183c cVar) {
            AbstractC19183c cVar2 = cVar;
            C89219l.m154719c(cVar2, "");
            cVar2.mo30501a_(this.f45308a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.d.c$d */
    static final class C19152d extends AbstractC89220m implements AbstractC89172b<AbstractC19183c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC19188h f45309a;

        static {
            Covode.recordClassIndex(21915);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19152d(AbstractC19188h hVar) {
            super(1);
            this.f45309a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC19183c cVar) {
            AbstractC19183c cVar2 = cVar;
            C89219l.m154719c(cVar2, "");
            cVar2.mo30500a_(this.f45309a);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19183c
    /* renamed from: a_ */
    public final void mo30500a_(AbstractC19188h hVar) {
        m35699b().mo30411a(new C19152d(hVar));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19184d
    /* renamed from: a */
    public final void mo30380a(AbstractC19183c cVar) {
        C89219l.m154719c(cVar, "");
        m35699b().mo30412a(cVar);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19183c
    /* renamed from: a_ */
    public final void mo30501a_(EnumC19189i iVar) {
        C89219l.m154719c(iVar, "");
        m35699b().mo30411a(new C19151c(iVar));
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19184d
    /* renamed from: b */
    public final void mo30391b(AbstractC19183c cVar) {
        C89219l.m154719c(cVar, "");
        m35699b().mo30413b(cVar);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19183c
    /* renamed from: a */
    public final void mo30499a(AbstractC19186f fVar) {
        m35699b().mo30411a(new C19150b(fVar));
    }
}
