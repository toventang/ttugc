package com.p2082ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.experiment.gz */
public final class C47001gz {

    /* renamed from: a */
    public static final C47001gz f109518a = new C47001gz();

    /* renamed from: b */
    private static final AbstractC89244h f109519b = C89250i.m154773a((AbstractC89171a) C47002a.f109520a);

    /* renamed from: a */
    public static boolean m90279a() {
        return ((Boolean) f109519b.getValue()).booleanValue();
    }

    private C47001gz() {
    }

    /* renamed from: com.ss.android.ugc.aweme.experiment.gz$a */
    static final class C47002a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C47002a f109520a = new C47002a();

        static {
            Covode.recordClassIndex(55603);
        }

        C47002a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C16048b.m29633a().mo25421a(true, "tryplay_preexecute", false));
        }
    }

    static {
        Covode.recordClassIndex(55602);
    }
}
