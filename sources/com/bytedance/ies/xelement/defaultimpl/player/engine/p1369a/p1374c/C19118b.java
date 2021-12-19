package com.bytedance.ies.xelement.defaultimpl.player.engine.p1369a.p1374c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.AbstractC19173b;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.C19155a;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.AbstractC19193b;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.common.C19194c;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19158c;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.C19169n;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1378b.AbstractC19174a;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1378b.C19175b;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19181b;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19185e;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19186f;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19187g;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19188h;
import com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.EnumC19189i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.c.b */
public final class C19118b extends AbstractC19174a implements AbstractC19173b, AbstractC19187g {

    /* renamed from: b */
    public static final C19119a f45270b = new C19119a((byte) 0);

    /* renamed from: c */
    private AbstractC19193b<AbstractC19186f, C19169n> f45271c = new C19155a();

    static {
        Covode.recordClassIndex(21881);
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.c.b$a */
    public static final class C19119a {
        static {
            Covode.recordClassIndex(21882);
        }

        private C19119a() {
        }

        public /* synthetic */ C19119a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1378b.AbstractC19176c, com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1378b.AbstractC19174a
    /* renamed from: a */
    public final void mo30490a() {
        AbstractC19185e eVar;
        super.mo30490a();
        this.f45271c = null;
        C19175b bVar = this.f45324a;
        if (bVar != null && (eVar = bVar.f45327c) != null) {
            eVar.mo30392b(this);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a.AbstractC19159d, com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1378b.AbstractC19174a
    /* renamed from: e */
    public final void mo30463e() {
        EnumC19189i iVar;
        AbstractC19181b bVar;
        AbstractC19181b bVar2;
        AbstractC19181b bVar3;
        AbstractC19181b bVar4;
        C19175b bVar5 = this.f45324a;
        AbstractC19186f fVar = null;
        if (bVar5 == null || (bVar4 = bVar5.f45330f) == null) {
            iVar = null;
        } else {
            iVar = bVar4.mo30407l();
        }
        if (iVar == EnumC19189i.SINGLE_LOOP) {
            C19175b bVar6 = this.f45324a;
            if (bVar6 != null && (bVar2 = bVar6.f45330f) != null && bVar2.mo30403h()) {
                C19175b bVar7 = this.f45324a;
                if (!(bVar7 == null || (bVar3 = bVar7.f45330f) == null)) {
                    fVar = bVar3.mo30408m();
                }
                m35633b(fVar, new C19194c("FROM_AUTO_SINGLE_LOOP"));
                return;
            }
            return;
        }
        C19175b bVar8 = this.f45324a;
        if (bVar8 != null && (bVar = bVar8.f45330f) != null && bVar.mo30404i()) {
            mo30393b(new C19194c("FROM_AUTO_PLAY_NEXT"));
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.AbstractC19173b
    /* renamed from: a */
    public final void mo30385a(AbstractC19193b<AbstractC19186f, C19169n> bVar) {
        C89219l.m154719c(bVar, "");
        this.f45271c = bVar;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19187g
    /* renamed from: a */
    public final EnumC19189i mo30498a(EnumC19189i iVar) {
        C89219l.m154719c(iVar, "");
        C89219l.m154719c(iVar, "");
        return iVar;
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.a.c.b$b */
    static final class C19120b extends AbstractC89220m implements AbstractC89172b<C19169n, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C19118b f45272a;

        static {
            Covode.recordClassIndex(21883);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19120b(C19118b bVar) {
            super(1);
            this.f45272a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C19169n nVar) {
            AbstractC19158c cVar;
            C19169n nVar2 = nVar;
            C19175b bVar = this.f45272a.f45324a;
            if (!(bVar == null || (cVar = bVar.f45329e) == null)) {
                cVar.mo30378a(nVar2);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19187g
    /* renamed from: a */
    public final AbstractC19188h mo30497a(AbstractC19188h hVar) {
        AbstractC19158c cVar;
        C19175b bVar = this.f45324a;
        if (!(bVar == null || (cVar = bVar.f45329e) == null)) {
            cVar.mo30401f(new C19194c("STOP_FROM_PLAYLIST_CHANGED"));
        }
        return hVar;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.AbstractC19173b
    /* renamed from: b */
    public final void mo30393b(C19194c cVar) {
        AbstractC19186f fVar;
        AbstractC19181b bVar;
        C19175b bVar2 = this.f45324a;
        if (bVar2 == null || (bVar = bVar2.f45330f) == null) {
            fVar = null;
        } else {
            fVar = bVar.mo30409n();
        }
        m35633b(fVar, cVar);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1378b.AbstractC19176c, com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1378b.AbstractC19174a
    /* renamed from: a */
    public final void mo30491a(C19175b bVar) {
        AbstractC19185e eVar;
        C89219l.m154719c(bVar, "");
        super.mo30491a(bVar);
        C19175b bVar2 = this.f45324a;
        if (bVar2 != null && (eVar = bVar2.f45327c) != null) {
            eVar.mo30382a(this);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19183c, com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1378b.AbstractC19174a
    /* renamed from: a */
    public final void mo30499a(AbstractC19186f fVar) {
        AbstractC19193b<AbstractC19186f, C19169n> bVar = this.f45271c;
        if (bVar != null) {
            bVar.mo30516a(fVar, new C19120b(this));
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.AbstractC19173b
    /* renamed from: a */
    public final void mo30386a(C19194c cVar) {
        AbstractC19186f fVar;
        AbstractC19181b bVar;
        C19175b bVar2 = this.f45324a;
        if (bVar2 == null || (bVar = bVar2.f45330f) == null) {
            fVar = null;
        } else {
            fVar = bVar.mo30410o();
        }
        m35633b(fVar, cVar);
    }

    /* renamed from: b */
    private final void m35633b(AbstractC19186f fVar, C19194c cVar) {
        AbstractC19158c cVar2;
        AbstractC19181b bVar;
        C19175b bVar2 = this.f45324a;
        if (!(bVar2 == null || (bVar = bVar2.f45330f) == null)) {
            bVar.mo30381a(fVar, cVar);
        }
        C19175b bVar3 = this.f45324a;
        if (bVar3 != null && (cVar2 = bVar3.f45329e) != null) {
            cVar2.mo30395c(cVar);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19187g
    /* renamed from: a */
    public final AbstractC19186f mo30496a(AbstractC19186f fVar, C19194c cVar) {
        AbstractC19158c cVar2;
        C19175b bVar = this.f45324a;
        if (!(bVar == null || (cVar2 = bVar.f45329e) == null)) {
            cVar2.mo30401f(new C19194c("STOP_FROM_DATA_SOURCE_CHANGED"));
        }
        return fVar;
    }
}
