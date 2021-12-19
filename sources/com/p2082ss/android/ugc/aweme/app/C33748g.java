package com.p2082ss.android.ugc.aweme.app;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2317a.C33565a;
import com.p2082ss.android.ugc.aweme.app.p2317a.C33566b;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.SpringApiLimitConfig;
import com.p2082ss.android.ugc.aweme.lego.C58221f;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.app.g */
public final class C33748g {

    /* renamed from: a */
    static long f79946a = 60000;

    /* renamed from: b */
    static boolean f79947b;

    /* renamed from: c */
    static volatile boolean f79948c;

    /* renamed from: d */
    static boolean f79949d;

    /* renamed from: e */
    public static final C33748g f79950e = new C33748g();

    /* renamed from: f */
    private static boolean f79951f = true;

    /* renamed from: g */
    private static final AbstractC89244h f79952g = C89250i.m154773a((AbstractC89171a) C33752c.f79955a);

    private C33748g() {
    }

    /* renamed from: com.ss.android.ugc.aweme.app.g$c */
    static final class C33752c extends AbstractC89220m implements AbstractC89171a<SpringApiLimitConfig> {

        /* renamed from: a */
        public static final C33752c f79955a = new C33752c();

        static {
            Covode.recordClassIndex(40647);
        }

        C33752c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SpringApiLimitConfig invoke() {
            return m69097a();
        }

        /* renamed from: a */
        private static SpringApiLimitConfig m69097a() {
            try {
                IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
                C89219l.m154716b(iESSettingsProxy, "");
                return iESSettingsProxy.getSpringApiLimitConfig();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    /* renamed from: b */
    public static long m69095b() {
        if (!f79949d) {
            f79946a = m69096c();
            f79949d = true;
        }
        return f79946a;
    }

    static {
        Covode.recordClassIndex(40643);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m69093a() {
        C89219l.m154721d("", "");
        if (!f79948c || f79947b) {
            return false;
        }
        if (TextUtils.isEmpty("")) {
            return true;
        }
        C33565a a = C33566b.m68781a("");
        if (a == null || !a.f79723a) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static long m69096c() {
        SpringApiLimitConfig springApiLimitConfig = (SpringApiLimitConfig) f79952g.getValue();
        if (springApiLimitConfig == null || !m69094a(springApiLimitConfig)) {
            return 60000;
        }
        try {
            double random = Math.random();
            long longValue = springApiLimitConfig.getLimitEndTime().longValue();
            Long limitStartTime = springApiLimitConfig.getLimitStartTime();
            C89219l.m154716b(limitStartTime, "");
            double longValue2 = (double) (longValue - limitStartTime.longValue());
            Double.isNaN(longValue2);
            double d = random * longValue2;
            Long limitStartTime2 = springApiLimitConfig.getLimitStartTime();
            C89219l.m154716b(limitStartTime2, "");
            double longValue3 = (double) limitStartTime2.longValue();
            Double.isNaN(longValue3);
            return (long) (d + longValue3);
        } catch (Exception e) {
            e.printStackTrace();
            return 60000;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.g$a */
    public static final class C33749a<T> implements AbstractC88983w {

        /* renamed from: a */
        public static final C33749a f79953a = new C33749a();

        static {
            Covode.recordClassIndex(40644);
        }

        C33749a() {
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<Long> vVar) {
            C89219l.m154721d(vVar, "");
            if (!C33748g.f79949d) {
                long c = C33748g.m69096c();
                if (c != 60000) {
                    vVar.mo143031a(Long.valueOf(c));
                } else {
                    C58221f.f132577a = 60000;
                }
            } else if (C33748g.f79946a != 60000) {
                vVar.mo143031a(Long.valueOf(C33748g.f79946a));
            } else {
                C58221f.f132577a = 60000;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.g$b */
    public static final class C33750b implements AbstractC88986z<Long> {

        /* renamed from: com.ss.android.ugc.aweme.app.g$b$a */
        static final class RunnableC33751a implements Runnable {

            /* renamed from: a */
            public static final RunnableC33751a f79954a = new RunnableC33751a();

            static {
                Covode.recordClassIndex(40646);
            }

            RunnableC33751a() {
            }

            public final void run() {
                C33748g.f79947b = true;
            }
        }

        static {
            Covode.recordClassIndex(40645);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(Long l) {
            C33748g.f79946a = l.longValue();
            C33748g.f79948c = true;
            C33748g.f79949d = true;
            C58221f.f132577a = C33748g.f79946a;
            new Handler(Looper.getMainLooper()).postDelayed(RunnableC33751a.f79954a, C33748g.f79946a);
        }
    }

    /* renamed from: a */
    public static long m69092a(String str) {
        C33565a a;
        C89219l.m154721d(str, "");
        long b = m69095b();
        if (b == 60000 || (a = C33566b.m68781a(str)) == null) {
            return b;
        }
        if (a.f79723a) {
            return 2147483647L;
        }
        return a.f79724b;
    }

    /* renamed from: a */
    private static boolean m69094a(SpringApiLimitConfig springApiLimitConfig) {
        if (springApiLimitConfig != null) {
            try {
                long longValue = springApiLimitConfig.getEndTime().longValue();
                Long startTime = springApiLimitConfig.getStartTime();
                C89219l.m154716b(startTime, "");
                long currentTimeMillis = System.currentTimeMillis();
                if (longValue - startTime.longValue() < 0) {
                    return false;
                }
                Long startTime2 = springApiLimitConfig.getStartTime();
                C89219l.m154716b(startTime2, "");
                if (currentTimeMillis - startTime2.longValue() >= 0) {
                    Long endTime = springApiLimitConfig.getEndTime();
                    C89219l.m154716b(endTime, "");
                    if (currentTimeMillis - endTime.longValue() <= 0) {
                        return true;
                    }
                }
                return false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
