package com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a;

import android.view.View;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.navigation.p1723a.AbstractC23189c;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3602b.AbstractC65076c;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.a.c */
public abstract class AbstractC64941c<AREA extends AbstractC65076c, ACTION extends AbstractC23189c> extends AbstractC12748a {

    /* renamed from: g */
    public AbstractC64958g f146763g;

    /* renamed from: h */
    private final C12786i f146764h = new C12786i(bW_(), new C64942a(this, null));

    /* renamed from: i */
    private final AbstractC89244h f146765i = C89250i.m154773a((AbstractC89171a) new C64943b(this));

    static {
        Covode.recordClassIndex(76409);
    }

    /* renamed from: a */
    public abstract void mo104269a(ACTION action);

    /* renamed from: u */
    public final View mo104272u() {
        return (View) this.f146765i.getValue();
    }

    /* renamed from: v */
    public abstract AREA mo104273v();

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.a.c$a */
    public static final class C64942a extends AbstractC89220m implements AbstractC89171a<C64870a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146766a;

        /* renamed from: b */
        final /* synthetic */ String f146767b;

        static {
            Covode.recordClassIndex(76410);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64942a(AbstractC12748a aVar, String str) {
            super(0);
            this.f146766a = aVar;
            this.f146767b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.h.a.a, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.core.a r0 = r3.f146766a
                com.bytedance.assem.arch.core.AssemSupervisor r0 = r0.bD_()
                com.bytedance.assem.arch.core.d r2 = r0.f30984f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.h.a.a> r1 = com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a.class
                java.lang.String r0 = r3.f146767b
                java.lang.Object r0 = r2.mo20606b(r1, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.widgets.navbar.p3601a.AbstractC64941c.C64942a.invoke():java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.navbar.a.c$b */
    static final class C64943b extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ AbstractC64941c f146768a;

        static {
            Covode.recordClassIndex(76411);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64943b(AbstractC64941c cVar) {
            super(0);
            this.f146768a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            AbstractC64958g gVar = this.f146768a.f146763g;
            if (gVar == null) {
                C89219l.m154710a("service");
            }
            return gVar.mo104285d(this.f146768a.mo104273v());
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12748a
    /* renamed from: f */
    public void mo20518f() {
        super.mo20518f();
        this.f146763g = (AbstractC64958g) C12801d.m23023b(this, C89204ab.m154669a(AbstractC64958g.class));
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final boolean mo104271t() {
        String str;
        C64870a aVar = (C64870a) this.f146764h.getValue();
        if (aVar != null) {
            str = aVar.f146658a;
        } else {
            str = null;
        }
        return C89219l.m154714a((Object) str, (Object) "from_main");
    }

    /* renamed from: a */
    public final void mo104270a(boolean z) {
        AbstractC64958g gVar = this.f146763g;
        if (gVar == null) {
            C89219l.m154710a("service");
        }
        gVar.mo104281b(mo104273v(), z);
    }
}
