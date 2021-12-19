package com.p2082ss.android.ugc.aweme.search.p3696l;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42411h;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42426m;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.l.g */
public final class C67617g {

    /* renamed from: a */
    public static final ExecutorService f151495a = C40780g.m82242a(C40787l.m82269a(EnumC40793o.SERIAL).mo70028a());

    /* renamed from: b */
    static final C27910f f151496b = GsonHolder.m138942a().mo46682b();

    /* renamed from: c */
    public static final C67617g f151497c = new C67617g();

    /* renamed from: d */
    private static final AbstractC89244h f151498d = C89250i.m154773a((AbstractC89171a) C67618a.f151499a);

    /* renamed from: a */
    public static boolean m119768a() {
        return ((Boolean) f151498d.getValue()).booleanValue();
    }

    private C67617g() {
    }

    /* renamed from: com.ss.android.ugc.aweme.search.l.g$b */
    public static final class RunnableC67619b implements Runnable {

        /* renamed from: a */
        public static final RunnableC67619b f151500a = new RunnableC67619b();

        static {
            Covode.recordClassIndex(79258);
        }

        RunnableC67619b() {
        }

        public final void run() {
            C67617g.f151496b.mo46665a(C42426m.class);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.l.g$a */
    static final class C67618a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C67618a f151499a = new C67618a();

        static {
            Covode.recordClassIndex(79257);
        }

        C67618a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C16048b.m29633a().mo25421a(true, "search_json_lazy_parse", true));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.search.l.g$c */
    public static final class CallableC67620c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f151501a;

        /* renamed from: b */
        final /* synthetic */ int f151502b;

        /* renamed from: c */
        final /* synthetic */ C42426m f151503c;

        static {
            Covode.recordClassIndex(79259);
        }

        CallableC67620c(String str, int i, C42426m mVar) {
            this.f151501a = str;
            this.f151502b = i;
            this.f151503c = mVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            C42426m mVar = (C42426m) C67617g.f151496b.mo46670a(this.f151501a, C42426m.class);
            if (mVar == null) {
                return null;
            }
            List<C42411h> list = mVar.f98850c;
            if (list.size() <= this.f151502b) {
                return null;
            }
            mVar.setRequestId(this.f151503c.getRequestId());
            mVar.f98850c = list.subList(this.f151502b, list.size());
            return mVar;
        }
    }

    static {
        Covode.recordClassIndex(79256);
    }

    /* renamed from: a */
    public static void m119767a(C42426m mVar) {
        C89219l.m154721d(mVar, "");
        if (m119768a()) {
            List<C42411h> list = mVar.f98850c;
            int size = list.size();
            String str = mVar.f98852f;
            C89219l.m154716b(list, "");
            if ((!list.isEmpty()) && str != null && ((C42411h) C89070n.m154586h((List) list)).f98808r) {
                mVar.f98853g = C1731i.m5640b(new CallableC67620c(str, size, mVar), f151495a);
            }
        }
    }
}
