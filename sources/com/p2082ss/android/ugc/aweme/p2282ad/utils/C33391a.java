package com.p2082ss.android.ugc.aweme.p2282ad.utils;

import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.NativeAuthorInfo;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33117e;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.C33113b;
import com.p2082ss.android.ugc.aweme.p2282ad.p2291e.C33197a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ad.utils.a */
public final class C33391a {

    /* renamed from: a */
    public static final C33391a f79344a = new C33391a();

    private C33391a() {
    }

    static {
        Covode.recordClassIndex(40240);
    }

    /* renamed from: a */
    public static final C33197a m68473a() {
        String m;
        C89219l.m154716b(C33113b.C33114a.f78704a, "");
        AbstractC33117e b = C33113b.m67827b();
        if (b == null || (m = b.mo58983m()) == null) {
            return null;
        }
        return (C33197a) new C27910f().mo46670a(m, C33197a.class);
    }

    /* renamed from: a */
    public static final void m68475a(AbstractC89172b<? super C33197a, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        C33197a a = m68473a();
        if (a != null) {
            bVar.invoke(a);
        }
    }

    /* renamed from: a */
    public static int m68472a(AwemeRawAd awemeRawAd) {
        NativeAuthorInfo nativeAuthorInfo;
        if (awemeRawAd == null || awemeRawAd.getNativeAuthorInfo() == null || awemeRawAd == null || (nativeAuthorInfo = awemeRawAd.getNativeAuthorInfo()) == null || Integer.valueOf(nativeAuthorInfo.getAutoPullStyle()) == null) {
            return 0;
        }
        return awemeRawAd.getNativeAuthorInfo().getAutoPullStyle();
    }

    /* renamed from: a */
    public static final String m68474a(String str, long j) {
        if (str == null || C13627m.m24498a(str) || j <= 0 || !C89361p.m154908a((CharSequence) str, (CharSequence) "{{ad_id}}", false)) {
            return null;
        }
        return "javascript:(function () {    var JS_ACTLOG_URL = '" + C89361p.m154869a(str, "{{ad_id}}", String.valueOf(j), false) + "';    var head = document.getElementsByTagName('head')[0];    var script = document.createElement('script');    script.type = 'text/javascript';    script.src = JS_ACTLOG_URL;    head.appendChild(script);})();";
    }
}
