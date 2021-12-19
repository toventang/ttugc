package com.p2082ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.aq */
public final class C38647aq {

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.aq$b */
    final /* synthetic */ class CallableC38649b implements Callable {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89171a f91328a;

        static {
            Covode.recordClassIndex(46190);
        }

        CallableC38649b(AbstractC89171a aVar) {
            this.f91328a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return this.f91328a.invoke();
        }
    }

    static {
        Covode.recordClassIndex(46188);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.aq$a */
    public static final class CallableC38648a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f91327a;

        static {
            Covode.recordClassIndex(46189);
        }

        CallableC38648a(AbstractC89171a aVar) {
            this.f91327a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f91327a.invoke();
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final void m78409a(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        C1731i.m5640b(new CallableC38648a(aVar), C1731i.f5564c);
    }

    /* renamed from: a */
    public static final boolean m78410a(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd == null || !awemeRawAd.isHardAd()) {
            return false;
        }
        return true;
    }
}
