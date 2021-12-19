package com.p2082ss.android.ugc.aweme.wiki;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.p2123b.C29736b;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.wiki.CheckAnchorModerationService */
public interface CheckAnchorModerationService {

    /* renamed from: a */
    public static final C81658a f182587a = C81658a.f182588a;

    static {
        Covode.recordClassIndex(95060);
    }

    @AbstractC89722f(mo144276a = "aweme/v1/anchor/add/check/")
    AbstractFutureC27655q<C81659a> postCheckAnchorReviewResult(@AbstractC89736t(mo144292a = "type") int i, @AbstractC89736t(mo144292a = "url") String str, @AbstractC89736t(mo144292a = "keyword") String str2, @AbstractC89736t(mo144292a = "language") String str3, @AbstractC89736t(mo144292a = "subtype") String str4);

    /* renamed from: com.ss.android.ugc.aweme.wiki.CheckAnchorModerationService$a */
    public static final class C81658a {

        /* renamed from: a */
        static final /* synthetic */ C81658a f182588a = new C81658a();

        /* renamed from: b */
        private static final CheckAnchorModerationService f182589b = ((CheckAnchorModerationService) RetrofitFactory.m33635a().mo28817b(C29736b.f70924e).mo28831c().mo28832d().mo28858a(CheckAnchorModerationService.class));

        private C81658a() {
        }

        static {
            Covode.recordClassIndex(95061);
        }

        /* renamed from: a */
        public static AbstractFutureC27655q<C81659a> m141528a(int i, String str, String str2, String str3, String str4) {
            return f182589b.postCheckAnchorReviewResult(i, str, str2, str3, str4);
        }
    }
}
