package com.p2082ss.android.ugc.aweme.out;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.external.p2916b.C47134e;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.external.IUIService;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.out.b */
public final class C62749b implements AsyncAVService {

    /* renamed from: a */
    private final AbstractC89244h f142235a = C89250i.m154773a((AbstractC89171a) C62750a.f142236a);

    static {
        Covode.recordClassIndex(73571);
    }

    /* renamed from: com.ss.android.ugc.aweme.out.b$a */
    static final class C62750a extends AbstractC89220m implements AbstractC89171a<C47134e> {

        /* renamed from: a */
        public static final C62750a f142236a = new C62750a();

        static {
            Covode.recordClassIndex(73572);
        }

        C62750a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C47134e invoke() {
            return new C47134e();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.AsyncAVService
    public final IUIService uiService() {
        return (C47134e) this.f142235a.getValue();
    }
}
