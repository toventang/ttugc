package com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4133c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40898m;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78851a;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78852b;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4132b.C78859b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a.c.a */
public final class C78860a extends AbstractC78851a {
    static {
        Covode.recordClassIndex(92009);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.a.a.c.a$a */
    public static final class C78861a implements AbstractC40898m {

        /* renamed from: a */
        final /* synthetic */ C78860a f177258a;

        static {
            Covode.recordClassIndex(92010);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C78861a(C78860a aVar) {
            this.f177258a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.p2722cy.p2723a.AbstractC40898m
        /* renamed from: a */
        public final void mo70095a(String str, String str2) {
            C89219l.m154721d(str, "");
            this.f177258a.f177239b.mo122711a("upload pictures", "success");
            this.f177258a.f177239b.f177276a = System.currentTimeMillis();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78860a(C78859b bVar) {
        super(bVar);
        C89219l.m154721d(bVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4129a.p4130a.p4131a.AbstractC78856e
    /* renamed from: a */
    public final void mo122701a(Object obj) {
        this.f177239b.f177276a = System.currentTimeMillis();
        AbstractC63154aa aaVar = (AbstractC63154aa) C63244g.m114602a().mo73291s();
        if (aaVar == null || this.f177240c.f177253j == null) {
            this.f177239b.mo122711a("upload pictures", "failed.");
            AbstractC78852b bVar = this.f177240c.f177252i;
            if (bVar != null) {
                bVar.mo122694a();
                return;
            }
            return;
        }
        aaVar.mo101552k().mo101567b(new C78861a(this));
    }
}
