package com.p2082ss.android.ugc.aweme.discover.repo.gson;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.discover.model.TrendingTopicList;
import com.p2082ss.android.ugc.aweme.discover.p2771f.C41941b;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.discover.repo.gson.a */
public final class C42519a {

    /* renamed from: a */
    static final C27910f f99136a = GsonHolder.m138942a().mo46682b();

    /* renamed from: b */
    public static final ExecutorService f99137b = C40780g.m82248e();

    /* renamed from: c */
    public static final C42519a f99138c = new C42519a();

    /* renamed from: d */
    private static final AbstractC89244h f99139d = C89250i.m154773a((AbstractC89171a) C42520a.f99140a);

    /* renamed from: a */
    public static boolean m85003a() {
        return ((Boolean) f99139d.getValue()).booleanValue();
    }

    private C42519a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.repo.gson.a$c */
    public static final class RunnableC42522c implements Runnable {

        /* renamed from: a */
        public static final RunnableC42522c f99143a = new RunnableC42522c();

        static {
            Covode.recordClassIndex(50612);
        }

        RunnableC42522c() {
        }

        public final void run() {
            C42519a.f99136a.mo46665a(TrendingTopicList.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.repo.gson.a$a */
    static final class C42520a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C42520a f99140a = new C42520a();

        static {
            Covode.recordClassIndex(50610);
        }

        C42520a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C41941b.m83980b());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.repo.gson.a$b */
    public static final class CallableC42521b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f99141a;

        /* renamed from: b */
        final /* synthetic */ TrendingTopicList f99142b;

        static {
            Covode.recordClassIndex(50611);
        }

        public CallableC42521b(String str, TrendingTopicList trendingTopicList) {
            this.f99141a = str;
            this.f99142b = trendingTopicList;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            TrendingTopicList trendingTopicList = (TrendingTopicList) C42519a.f99136a.mo46670a(this.f99141a, TrendingTopicList.class);
            if (trendingTopicList != null && trendingTopicList.items.size() > this.f99142b.items.size()) {
                trendingTopicList.setItems(trendingTopicList.items.subList(this.f99142b.items.size(), trendingTopicList.items.size()));
            }
            return trendingTopicList;
        }
    }

    static {
        Covode.recordClassIndex(50609);
    }
}
