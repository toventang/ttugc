package com.p2082ss.android.ugc.aweme.specact.popup.p3946e;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.common.util.C29844g;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.specact.popup.e.a */
public final class C75202a {

    /* renamed from: a */
    public static final C75202a f169105a = new C75202a();

    private C75202a() {
    }

    static {
        Covode.recordClassIndex(88080);
    }

    /* renamed from: a */
    private static boolean m131947a(String str) {
        if (TextUtils.isEmpty(str) || (!C89361p.m154874b(str, "http", false) && !C89361p.m154874b(str, "https", false))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m131946a(Context context, String str) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        if (m131947a(str)) {
            SmartRouter.buildRoute(context, "aweme://webview/").withParam("url", str).open();
        } else {
            SmartRouter.buildRoute(context, str).open();
        }
    }

    /* renamed from: a */
    public static String m131945a(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        if (C89361p.m154888a((CharSequence) str, str2 + '=', 0, false, 6) != -1) {
            return m131948b(str, str2, str3);
        }
        C29844g gVar = new C29844g(str);
        gVar.mo52130a(str2, str3);
        String a = gVar.mo52126a();
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: b */
    private static String m131948b(String str, String str2, String str3) {
        boolean z;
        String str4;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return str;
        }
        try {
            int a = C89361p.m154888a((CharSequence) str, str2 + '=', 0, false, 6);
            if (a != -1) {
                StringBuilder sb = new StringBuilder();
                if (str != null) {
                    String substring = str.substring(0, a);
                    C89219l.m154716b(substring, "");
                    sb.append(substring).append(str2 + '=').append(str3);
                    int a2 = C89361p.m154888a((CharSequence) str, "&", a, false, 4);
                    if (a2 != -1) {
                        String substring2 = str.substring(a2);
                        C89219l.m154716b(substring2, "");
                        sb.append(substring2);
                    }
                    str4 = sb.toString();
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                str4 = str;
            }
            C89219l.m154716b(str4, "");
            return str4;
        } catch (StringIndexOutOfBoundsException unused) {
            return str;
        }
    }
}
