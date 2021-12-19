package com.p2082ss.android.ugc.aweme.commercialize.splash;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.AbstractC18020d;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.C48017a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.commercialize.splash.d */
public final class C38493d implements AbstractC18020d {

    /* renamed from: a */
    public static long f90921a;

    /* renamed from: b */
    public static long f90922b;

    /* renamed from: c */
    public static boolean f90923c;

    /* renamed from: d */
    public static boolean f90924d = true;

    /* renamed from: e */
    public static final C38493d f90925e = new C38493d();

    /* renamed from: f */
    private static final AbstractC89244h f90926f = C89250i.m154773a((AbstractC89171a) C38494a.f90931a);

    /* renamed from: g */
    private static int f90927g;

    /* renamed from: h */
    private static long f90928h;

    /* renamed from: i */
    private static int f90929i;

    /* renamed from: j */
    private static long f90930j;

    /* renamed from: b */
    public static long m78021b() {
        return ((Number) f90926f.getValue()).longValue();
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.topview.AbstractC18020d
    /* renamed from: a */
    public final void mo28749a() {
        f90924d = false;
    }

    private C38493d() {
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.splash.d$a */
    static final class C38494a extends AbstractC89220m implements AbstractC89171a<Long> {

        /* renamed from: a */
        public static final C38494a f90931a = new C38494a();

        static {
            Covode.recordClassIndex(46019);
        }

        C38494a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Long invoke() {
            return Long.valueOf(C48017a.f111238c);
        }
    }

    static {
        Covode.recordClassIndex(46018);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.splash.d$b */
    static final class CallableC38495b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ Context f90932a;

        /* renamed from: b */
        final /* synthetic */ Aweme f90933b;

        /* renamed from: c */
        final /* synthetic */ long f90934c;

        /* renamed from: d */
        final /* synthetic */ long f90935d;

        static {
            Covode.recordClassIndex(46020);
        }

        CallableC38495b(Context context, Aweme aweme, long j, long j2) {
            this.f90932a = context;
            this.f90933b = aweme;
            this.f90934c = j;
            this.f90935d = j2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.util.HashMap */
        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.util.HashMap */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Context context = this.f90932a;
            Aweme aweme = this.f90933b;
            long j = this.f90934c;
            if (C37699a.m76199B(aweme) && C38493d.f90922b != 0) {
                int i = 1;
                if (!C38493d.f90924d) {
                    i = 2;
                }
                C38493d.f90922b = 0;
                HashMap hashMap = new HashMap();
                hashMap.put("splashduration", String.valueOf(j));
                hashMap.put("awemelaunch", String.valueOf(i));
                HashMap hashMap2 = new HashMap();
                hashMap2.put("ad_extra_data", new C27910f().mo46674b(hashMap));
                C38189j.m77510b(context, "splash_show", aweme, C38189j.m77468a(context, aweme, false, (Map<String, String>) hashMap2));
                C18129a.m33746a("draw_ad", "feed_show", aweme.getAwemeRawAd()).mo28897a("splashduration", Long.valueOf(j)).mo28897a("awemelaunch", Integer.valueOf(i)).mo28902c();
            }
            if (C38493d.f90924d) {
                C38189j.m77478a(this.f90932a, this.f90933b, this.f90935d);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.topview.AbstractC18020d
    /* renamed from: a */
    public final void mo28750a(Context context, Aweme aweme) {
        long currentTimeMillis = System.currentTimeMillis();
        f90921a = currentTimeMillis;
        C1731i.m5640b(new CallableC38495b(context, aweme, currentTimeMillis - f90922b, currentTimeMillis - m78021b()), C39162r.m79452a());
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.topview.AbstractC18020d
    /* renamed from: a */
    public final void mo28751a(Context context, Aweme aweme, long j) {
        AwemeRawAd awemeRawAd;
        if (!f90924d) {
            if (!C37699a.m76314s(aweme)) {
                int i = f90927g;
                if (1 <= i && 9 >= i) {
                    f90927g = i + 1;
                    return;
                }
                f90927g = 0;
                f90928h = 0;
            } else if (C37699a.m76199B(aweme)) {
                f90927g = 1;
                f90928h = j;
            } else {
                int i2 = f90927g;
                if (1 <= i2 && 9 >= i2) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("adsgap", String.valueOf(f90927g - 1));
                    hashMap.put("gaptime", String.valueOf(j - f90928h));
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("ad_extra_data", new C27910f().mo46674b(hashMap));
                    C38189j.m77510b(context, "feed_firstshow", aweme, C38189j.m77468a(context, aweme, false, (Map<String, String>) hashMap2));
                    hashMap.get("adsgap");
                    hashMap.get("gaptime");
                    if (aweme != null) {
                        awemeRawAd = aweme.getAwemeRawAd();
                    } else {
                        awemeRawAd = null;
                    }
                    C18129a.m33746a("draw_ad", "feed_firstshow", awemeRawAd).mo28897a("adsgap", String.valueOf(f90927g - 1)).mo28897a("gaptime", String.valueOf(j - f90928h)).mo28902c();
                }
                f90927g = 0;
            }
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.splash.topview.AbstractC18020d
    /* renamed from: b */
    public final void mo28752b(Context context, Aweme aweme, long j) {
        AwemeRawAd awemeRawAd;
        if (C37699a.m76314s(aweme) && !C37699a.m76199B(aweme)) {
            f90929i = 1;
            f90930j = j;
        } else if (C37699a.m76199B(aweme)) {
            int i = f90929i;
            if (1 <= i && 9 >= i) {
                HashMap hashMap = new HashMap();
                hashMap.put("adsgap", String.valueOf(f90929i - 1));
                hashMap.put("gaptime", String.valueOf(j - f90930j));
                HashMap hashMap2 = new HashMap();
                hashMap2.put("ad_extra_data", new C27910f().mo46674b(hashMap));
                C38189j.m77510b(context, "feed_lastshow", aweme, C38189j.m77468a(context, aweme, false, (Map<String, String>) hashMap2));
                hashMap.get("adsgap");
                hashMap.get("gaptime");
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                C18129a.m33746a("draw_ad", "feed_lastshow", awemeRawAd).mo28897a("adsgap", String.valueOf(f90927g - 1)).mo28897a("gaptime", String.valueOf(j - f90930j)).mo28902c();
                f90929i = 0;
            }
        } else {
            int i2 = f90929i;
            if (1 <= i2 && 9 >= i2) {
                f90929i = i2 + 1;
                return;
            }
            f90929i = 0;
            f90930j = 0;
        }
    }
}
