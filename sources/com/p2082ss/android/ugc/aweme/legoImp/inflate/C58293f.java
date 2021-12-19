package com.p2082ss.android.ugc.aweme.legoImp.inflate;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.ss.android.ugc.aweme.legoImp.inflate.f */
public final class C58293f {

    /* renamed from: a */
    public static SharedPreferences f132751a;

    /* renamed from: b */
    public static int f132752b;

    /* renamed from: a */
    public static int m105315a() {
        return f132752b;
    }

    static {
        Covode.recordClassIndex(68372);
        SharedPreferences a = C34822d.m71158a(C17867d.m33078a(), "aweme-app", 0);
        f132751a = a;
        f132752b = a.getInt("x2c_switch", 2);
    }
}
