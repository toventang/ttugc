package com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c;

import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.j */
public final class C19190j implements AbstractC19188h {

    /* renamed from: a */
    public final AbstractC19186f f45333a;

    /* renamed from: b */
    private final AbstractC89244h f45334b = C89250i.m154773a((AbstractC89171a) new C19191a(this));

    /* renamed from: c */
    private int f45335c;

    static {
        Covode.recordClassIndex(21953);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19188h
    /* renamed from: c */
    public final int mo30540c() {
        return this.f45335c;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19188h
    /* renamed from: a */
    public final String mo30537a() {
        String id;
        AbstractC19186f fVar = this.f45333a;
        if (fVar == null || (id = fVar.getId()) == null) {
            return "";
        }
        return id;
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19188h
    /* renamed from: b */
    public final List<AbstractC19186f> mo30539b() {
        return (List) this.f45334b.getValue();
    }

    /* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.api.c.j$a */
    static final class C19191a extends AbstractC89220m implements AbstractC89171a<List<? extends AbstractC19186f>> {

        /* renamed from: a */
        final /* synthetic */ C19190j f45336a;

        static {
            Covode.recordClassIndex(21954);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19191a(C19190j jVar) {
            super(0);
            this.f45336a = jVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<? extends AbstractC19186f> invoke() {
            if (this.f45336a.f45333a == null) {
                return C89086z.INSTANCE;
            }
            return C89070n.m154525d(this.f45336a.f45333a);
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1379c.AbstractC19188h
    /* renamed from: a */
    public final void mo30538a(int i) {
        this.f45335c = i;
    }

    public C19190j(AbstractC19186f fVar) {
        this.f45333a = fVar;
    }
}
