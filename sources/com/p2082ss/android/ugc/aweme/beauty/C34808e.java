package com.p2082ss.android.ugc.aweme.beauty;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.tools.beauty.p4091e.C77886a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.beauty.e */
public final class C34808e {

    /* renamed from: a */
    public static final C34808e f82233a = new C34808e();

    /* renamed from: b */
    private static final SharedPreferences f82234b;

    private C34808e() {
    }

    static {
        SharedPreferences sharedPreferences;
        Covode.recordClassIndex(41812);
        Context context = C77886a.f174745b;
        if (context != null) {
            sharedPreferences = C34822d.m71158a(context, "beauty_params", 0);
        } else {
            sharedPreferences = null;
        }
        f82234b = sharedPreferences;
    }

    /* renamed from: b */
    private static String m71119b(int i, String str) {
        return "beauty_params_max" + i + str;
    }

    /* renamed from: a */
    public static final float m71118a(int i, String str) {
        C89219l.m154721d(str, "");
        SharedPreferences sharedPreferences = f82234b;
        float f = -1.0f;
        if (sharedPreferences != null) {
            float f2 = sharedPreferences.getFloat(m71119b(i, str), -1.0f);
            if (f2 != -1.0f) {
                return f2;
            }
        }
        if (!C89219l.m154714a((Object) str, (Object) "0")) {
            if (sharedPreferences != null) {
                f = sharedPreferences.getFloat(m71119b(i, "0"), -1.0f);
            }
        } else if (sharedPreferences != null) {
            f = sharedPreferences.getFloat(m71119b(i, "2"), -1.0f);
        }
        return f;
    }
}
