package com.p2082ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.p1722h.C23154c;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.commercialize.p2571j.AbstractC38029b;
import com.p2082ss.android.ugc.aweme.commercialize.tasks.C38515b;
import com.p2082ss.android.ugc.aweme.commercialize.tasks.C38517d;
import com.p2082ss.android.ugc.aweme.commercialize.utils.p2623b.C38669b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.miniapp.utils.C59286a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.w */
public final class C38767w extends AbstractC38757n {
    static {
        Covode.recordClassIndex(46308);
    }

    /* renamed from: a */
    public static boolean m78665a(int i) {
        return i == 11 || i == 14 || i == 12 || i == 13 || i == 15 || i == 20 || i == 19 || i == 21;
    }

    /* renamed from: a */
    private static boolean m78664a() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static boolean m78668b() {
        if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132253e;
        }
        boolean a = m78664a();
        C58029j.f132253e = a;
        return a;
    }

    /* renamed from: a */
    private static boolean m78667a(Aweme aweme, int i) {
        if (TextUtils.equals(aweme.getAwemeRawAd().getType(), "app") || !m78665a(i)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m78673e(Context context, Aweme aweme) {
        if (aweme != null && aweme.isAd()) {
            return m78670c(context, aweme.getAwemeRawAd().getWebUrl());
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m78669b(Aweme aweme, int i) {
        if (!C37699a.m76207J(aweme)) {
            return false;
        }
        if (i == 3 || i == 11 || i == 14 || i == 20 || i == 12 || i == 2 || i == 1 || i == 35 || i == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m78670c(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return false;
        }
        String path = Uri.parse(str).getPath();
        if (TextUtils.isEmpty(path) || !path.endsWith(".apk")) {
            return false;
        }
        String string = context.getString(R.string.rc);
        Activity a = C23154c.m43640a(context);
        if (a == null) {
            return true;
        }
        new C23144b(a).mo37635a(string).mo37637b();
        return true;
    }

    /* renamed from: d */
    public static boolean m78671d(Context context, Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null) {
            return false;
        }
        if (!C37699a.m76198A(aweme)) {
            return C38669b.m78462a(context, aweme.getAwemeRawAd().getPackageName());
        }
        Activity a = C23154c.m43640a(context);
        if (a == null) {
            return true;
        }
        new C23144b(a).mo37640e(R.string.o6).mo37637b();
        return true;
    }

    /* renamed from: d */
    public static boolean m78672d(Context context, String str) {
        if (!str.contains("aweme/detaillist") || m78668b()) {
            return true;
        }
        Activity a = C23154c.m43640a(context);
        if (a == null) {
            return false;
        }
        new C23144b(a).mo37640e(R.string.dcq).mo37637b();
        return false;
    }

    /* renamed from: h */
    private static void m78675h(Context context, Aweme aweme, int i) {
        IAdSceneService f = AdSceneServiceImpl.m33210f();
        if (f != null) {
            f.mo28466c().mo28511a(aweme, context, i);
        }
        if (i == 2 && C38515b.m78095a()) {
            C38517d.m78106a(context, aweme, aweme.getAwemeRawAd().getOpenUrl(), i);
        } else if ((C37699a.m76242aN(aweme) && AbstractC38757n.m78633a(context, aweme)) || C59286a.m108996a(context, aweme)) {
        } else {
            if (!C37699a.m76276av(aweme) || !m78631a(context, i)) {
                m78671d(context, aweme);
            }
        }
    }

    /* renamed from: g */
    static boolean m78674g(Context context, Aweme aweme, int i) {
        if (!aweme.isAd() || !C37699a.m76314s(aweme)) {
            return false;
        }
        String type = aweme.getAwemeRawAd().getType();
        if (TextUtils.isEmpty(type)) {
            return false;
        }
        if ((i == 1 || i == 2) && C37699a.m76317v(aweme)) {
            Activity a = C23154c.m43640a(context);
            if (a != null) {
                new C23144b(a).mo37640e(R.string.h0g).mo37637b();
            }
            return true;
        } else if (!TextUtils.equals(type, "app") && (i == 1 || i == 18 || i == 4 || i == 35 || i == 5 || i == 36 || i == 7 || i == 37 || i == 38)) {
            return m78649b(context, aweme, i);
        } else {
            if (m78667a(aweme, i) || m78669b(aweme, i)) {
                return m78649b(context, aweme, i);
            }
            type.hashCode();
            switch (type.hashCode()) {
                case -1354573786:
                    if (type.equals("coupon")) {
                        return m78656c(context, aweme, i);
                    }
                    break;
                case 96801:
                    if (type.equals("app")) {
                        m78675h(context, aweme, i);
                        return false;
                    }
                    break;
                case 117588:
                    if (type.equals("web")) {
                        return m78649b(context, aweme, i);
                    }
                    break;
                case 3148996:
                    if (type.equals("form")) {
                        return m78660d(context, aweme, i);
                    }
                    break;
                case 957829685:
                    if (type.equals("counsel")) {
                        return m78634a(context, aweme, i);
                    }
                    break;
                case 1893962841:
                    if (type.equals("redpacket")) {
                        return m78662f(context, aweme, i);
                    }
                    break;
            }
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m78666a(Context context, Aweme aweme, int i, AbstractC38029b bVar) {
        if (context == null || aweme == null) {
            return false;
        }
        if (C38695bp.m78506a(context, aweme, i, new C38768x(context, aweme, i, bVar))) {
            return true;
        }
        if (!C37699a.m76233aE(aweme)) {
            return m78674g(context, aweme, i);
        }
        C38652at.m78415a(context, aweme, i);
        return false;
    }
}
