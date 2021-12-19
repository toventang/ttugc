package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2730de.C40964c;
import com.p2082ss.android.ugc.aweme.property.C65378br;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.ag */
public final class C73367ag {
    static {
        Covode.recordClassIndex(86104);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a.ag$a */
    static final class C73368a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C73368a f164859a = new C73368a();

        static {
            Covode.recordClassIndex(86105);
        }

        C73368a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (C65378br.m117074a()) {
                C40964c cVar = C40964c.C40968c.f95804a;
                C89219l.m154716b(cVar, "");
                if (cVar.mo70144a()) {
                    z = true;
                    C84911q.m145928d("AVSecurityMobHelper open camera in background be intercepted");
                    return Boolean.valueOf(z);
                }
            }
            z = false;
            return Boolean.valueOf(z);
        }
    }
}
