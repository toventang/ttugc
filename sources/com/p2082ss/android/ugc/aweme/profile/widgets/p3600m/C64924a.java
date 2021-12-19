package com.p2082ss.android.ugc.aweme.profile.widgets.p3600m;

import android.view.View;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12767q;
import com.bytedance.assem.arch.extensions.C12780d;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3587e.C64668a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.m.a */
public final class C64924a extends AbstractC12769a {

    /* renamed from: j */
    public View f146745j;

    static {
        Covode.recordClassIndex(76391);
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        this.f146745j = view.findViewById(R.id.f_s);
        C12780d.m23007a(this, new C64925a(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.m.a$a */
    static final class C64925a extends AbstractC89220m implements AbstractC89172b<Assembler, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64924a f146746a;

        static {
            Covode.recordClassIndex(76392);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64925a(C64924a aVar) {
            super(1);
            this.f146746a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            C89219l.m154721d(assembler2, "");
            assembler2.mo20582b(this.f146746a, C649261.f146747a);
            assembler2.mo20582b(this.f146746a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.widgets.p3600m.C64924a.C64925a.C649272 */

                /* renamed from: a */
                final /* synthetic */ C64925a f146748a;

                static {
                    Covode.recordClassIndex(76394);
                }

                {
                    this.f146748a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.mo20632a(C89204ab.m154669a(C64668a.class));
                    qVar2.f31050b = new C64668a();
                    qVar2.f31053e = this.f146748a.f146746a.f146745j;
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f146746a, C649283.f146749a);
            assembler2.mo20582b(this.f146746a, C649294.f146750a);
            assembler2.mo20582b(this.f146746a, C649305.f146751a);
            assembler2.mo20582b(this.f146746a, C649316.f146752a);
            assembler2.mo20582b(this.f146746a, C649327.f146753a);
            assembler2.mo20582b(this.f146746a, C649338.f146754a);
            return C89391z.f203057a;
        }
    }
}
