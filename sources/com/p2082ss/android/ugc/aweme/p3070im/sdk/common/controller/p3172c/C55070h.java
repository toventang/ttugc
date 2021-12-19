package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3172c;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.c.h */
public final class C55070h {

    /* renamed from: a */
    public static final String[] f126028a = new String[0];

    /* renamed from: b */
    public static final C55070h f126029b = new C55070h();

    private C55070h() {
    }

    static {
        Covode.recordClassIndex(64798);
    }

    /* renamed from: a */
    public static String[] m100711a() {
        SettingsManager a = SettingsManager.m29616a();
        String[] strArr = f126028a;
        String[] strArr2 = (String[]) a.mo25397a("tt_dm_illegal_schema", String[].class, strArr);
        return strArr2 == null ? strArr : strArr2;
    }

    /* renamed from: b */
    public static boolean m100712b(String str, String[] strArr) {
        Uri parse;
        C89219l.m154721d(strArr, "");
        if (strArr.length == 0 || str == null || str.length() == 0 || (parse = Uri.parse(str)) == null) {
            return false;
        }
        String scheme = parse.getScheme();
        if (scheme == null || scheme.length() == 0) {
            return true;
        }
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            String str2 = strArr[i];
            if (!C89361p.m154872a(scheme, str2, true)) {
                i++;
            } else if (str2 != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static String m100709a(String str, String[] strArr) {
        boolean z;
        boolean z2;
        C89219l.m154721d(strArr, "");
        boolean z3 = true;
        if (strArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return str;
        }
        if (str == null || str.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return str;
        }
        try {
            Uri parse = Uri.parse(str);
            C89219l.m154716b(parse, "");
            String scheme = parse.getScheme();
            if (scheme != null) {
                if (scheme.length() != 0) {
                    z3 = false;
                }
            }
            if (z3) {
                return str;
            }
            return parse.buildUpon().scheme("tiktok").build().toString();
        } catch (Exception e) {
            C56244a.m102186a("MessagingIllegalSchemeSetting", "replaceIllegalScheme failed ".concat(String.valueOf(str)), e);
            return str;
        }
    }
}
