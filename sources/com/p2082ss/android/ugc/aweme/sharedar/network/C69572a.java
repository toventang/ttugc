package com.p2082ss.android.ugc.aweme.sharedar.network;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.sharedar.network.a */
public final class C69572a {

    /* renamed from: a */
    public static final AbstractC89244h f155396a = C89250i.m154773a((AbstractC89171a) C69573a.f155398a);

    /* renamed from: b */
    public static final C69572a f155397b = new C69572a();

    private C69572a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.sharedar.network.a$a */
    static final class C69573a extends AbstractC89220m implements AbstractC89171a<API> {

        /* renamed from: a */
        public static final C69573a f155398a = new C69573a();

        static {
            Covode.recordClassIndex(81916);
        }

        C69573a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ API invoke() {
            return C63244g.m114602a().mo73257C().createDefaultRetrofit(API.class);
        }
    }

    static {
        Covode.recordClassIndex(81915);
    }
}
