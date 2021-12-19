package com.p2082ss.android.ugc.aweme.feed.cache;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.feed.cache.k */
public final class C49332k {

    /* renamed from: a */
    public static final C49332k f113372a = new C49332k();

    /* renamed from: b */
    private static final AbstractC89244h f113373b = C89250i.m154773a((AbstractC89171a) C49333a.f113374a);

    /* renamed from: a */
    public static Keva m92422a() {
        return (Keva) f113373b.getValue();
    }

    private C49332k() {
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.cache.k$a */
    static final class C49333a extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C49333a f113374a = new C49333a();

        static {
            Covode.recordClassIndex(58134);
        }

        C49333a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("repo_multi_process_mob_event", 1);
        }
    }

    static {
        Covode.recordClassIndex(58133);
    }
}
