package com.p2082ss.android.ugc.aweme.commerce.p2505a.p2512b;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.commerce.p2505a.C37475k;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commerce.a.b.a */
public final class C37466a {

    /* renamed from: a */
    public static Aweme f88448a;

    /* renamed from: b */
    public static final C37466a f88449b = new C37466a();

    /* renamed from: c */
    private static long f88450c;

    /* renamed from: d */
    private static boolean f88451d;

    private C37466a() {
    }

    static {
        Covode.recordClassIndex(44851);
    }

    /* renamed from: a */
    private static boolean m75554a(long j) {
        double d = (double) (j - f88450c);
        Double.isNaN(d);
        if (d / 1000.0d >= 2.0d) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static void m75555b(long j) {
        AwemeRawAd awemeRawAd;
        if (!f88451d && m75554a(j)) {
            f88451d = true;
            Aweme aweme = f88448a;
            if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
                C89219l.m154716b(awemeRawAd, "");
                if (C37475k.m75566b(f88448a)) {
                    C18129a.m33746a("draw_ad", "viewable_2s", awemeRawAd).mo28897a("is_piv", 0).mo28901b();
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m75553a(String str) {
        Aweme aweme = f88448a;
        if (aweme != null && aweme.isAd()) {
            long currentTimeMillis = System.currentTimeMillis();
            switch (str.hashCode()) {
                case -1036064766:
                    if (!str.equals("bufferStart")) {
                        return;
                    }
                    m75555b(currentTimeMillis);
                    f88450c = Long.MAX_VALUE;
                    return;
                case -934426579:
                    if (!str.equals("resume")) {
                        return;
                    }
                    f88450c = currentTimeMillis;
                    return;
                case -697335956:
                    if (!str.equals("sessionStart")) {
                        return;
                    }
                    f88450c = currentTimeMillis;
                    f88451d = false;
                    return;
                case -599445191:
                    if (!str.equals("complete")) {
                        return;
                    }
                    m75555b(currentTimeMillis);
                    f88450c = Long.MAX_VALUE;
                    return;
                case -524537143:
                    if (!str.equals("sessionFinish")) {
                        return;
                    }
                    m75555b(currentTimeMillis);
                    f88450c = Long.MAX_VALUE;
                    return;
                case 106440182:
                    if (!str.equals("pause")) {
                        return;
                    }
                    m75555b(currentTimeMillis);
                    f88450c = Long.MAX_VALUE;
                    return;
                case 1859771635:
                    if (!str.equals("bufferFinish")) {
                        return;
                    }
                    f88450c = currentTimeMillis;
                    return;
                case 1928770270:
                    if (!str.equals("mediaStart")) {
                        return;
                    }
                    f88450c = currentTimeMillis;
                    f88451d = false;
                    return;
                case 2147444528:
                    if (!str.equals("skipped")) {
                        return;
                    }
                    m75555b(currentTimeMillis);
                    f88450c = Long.MAX_VALUE;
                    return;
                default:
                    return;
            }
        }
    }
}
