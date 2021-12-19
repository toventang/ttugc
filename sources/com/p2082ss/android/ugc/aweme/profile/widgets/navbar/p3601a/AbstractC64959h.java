package com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a;

import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.AbstractC65076c;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.a.h */
public abstract class AbstractC64959h<AREA extends AbstractC65076c> extends AbstractC64941c<AREA, C23187b> {

    /* renamed from: h */
    private AbstractC64958g f146796h;

    /* renamed from: i */
    private final C12786i f146797i = new C12786i(bW_(), new C64960a(this, null));

    static {
        Covode.recordClassIndex(76427);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public List<AREA> mo104287w() {
        return C89086z.INSTANCE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public List<AREA> mo104288x() {
        return C89086z.INSTANCE;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.a.h$a */
    public static final class C64960a extends AbstractC89220m implements AbstractC89171a<C64939a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146798a;

        /* renamed from: b */
        final /* synthetic */ String f146799b;

        static {
            Covode.recordClassIndex(76428);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64960a(AbstractC12748a aVar, String str) {
            super(0);
            this.f146798a = aVar;
            this.f146799b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.navbar.a.a, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.C64939a invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f146798a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.navbar.a.a> r1 = com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.C64939a.class
                java.lang.String r0 = r3.f146799b
                java.lang.Object r0 = r2.mo20606b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64959h.C64960a.invoke():java.lang.Object");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo104289y() {
        AbstractC64958g gVar = this.f146796h;
        if (gVar == null) {
            C89219l.m154710a("service");
        }
        gVar.mo104275a(mo104273v());
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final void mo104290z() {
        AbstractC64958g gVar = this.f146796h;
        if (gVar == null) {
            C89219l.m154710a("service");
        }
        gVar.mo104279b(mo104273v());
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64941c, com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: f */
    public void mo20518f() {
        super.mo20518f();
        this.f146796h = (AbstractC64958g) C12801d.m23023b(this, C89204ab.m154669a(AbstractC64958g.class));
        C64939a aVar = (C64939a) this.f146797i.getValue();
        if (aVar != null) {
            aVar.f146759a.put(mo104273v(), mo104287w());
            aVar.f146760b.put(mo104273v(), mo104288x());
        }
        mo104286a(new C64961b(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.a.h$b */
    public static final class C64961b extends AbstractC89220m implements AbstractC89172b<C23187b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC64959h f146800a;

        static {
            Covode.recordClassIndex(76429);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64961b(AbstractC64959h hVar) {
            super(1);
            this.f146800a = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23187b bVar) {
            C23187b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            this.f146800a.mo104269a(bVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo104286a(AbstractC89172b<? super C23187b, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        AbstractC64958g gVar = this.f146796h;
        if (gVar == null) {
            C89219l.m154710a("service");
        }
        gVar.mo104276a(mo104273v(), bVar);
    }
}
