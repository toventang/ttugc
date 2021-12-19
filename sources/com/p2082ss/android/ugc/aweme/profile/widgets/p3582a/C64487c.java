package com.p2082ss.android.ugc.aweme.profile.widgets.p3582a;

import android.view.View;
import com.bytedance.assem.arch.p797d.AbstractC12769a;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64313x;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.a.c */
public final class C64487c extends AbstractC12769a {
    static {
        Covode.recordClassIndex(75950);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.a.c$a */
    static final class C64488a extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        public static final C64488a f146144a = new C64488a();

        static {
            Covode.recordClassIndex(75951);
        }

        C64488a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            if (!bool.booleanValue()) {
                AbstractC81915c.m141874a(new C64486b());
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        C12801d.m23020a(this, C89204ab.m154669a(AbstractC64313x.class), C64489d.f146145a, C64488a.f146144a);
    }
}
