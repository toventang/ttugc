package com.p2082ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.ba */
public final class C34406ba {

    /* renamed from: a */
    public static final C34406ba f81323a = new C34406ba();

    /* renamed from: b */
    private static final AbstractC89244h f81324b = C89250i.m154773a((AbstractC89171a) C34407a.f81325a);

    /* renamed from: a */
    public static DetailFeedService m70397a() {
        return (DetailFeedService) f81324b.getValue();
    }

    private C34406ba() {
    }

    /* renamed from: com.ss.android.ugc.aweme.ba$a */
    static final class C34407a extends AbstractC89220m implements AbstractC89171a<DetailFeedService> {

        /* renamed from: a */
        public static final C34407a f81325a = new C34407a();

        static {
            Covode.recordClassIndex(41351);
        }

        C34407a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DetailFeedService invoke() {
            return DetailFeedServiceImpl.m65254b();
        }
    }

    static {
        Covode.recordClassIndex(41350);
    }
}
