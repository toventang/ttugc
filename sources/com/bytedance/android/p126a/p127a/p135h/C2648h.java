package com.bytedance.android.p126a.p127a.p135h;

import android.text.TextUtils;
import com.bytedance.android.p126a.p127a.C2628e;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.android.a.a.h.h */
public final class C2648h {

    /* renamed from: a */
    public static volatile String f7937a;

    /* renamed from: b */
    public static final AtomicBoolean f7938b = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(3036);
    }

    /* renamed from: a */
    public static void m7664a(String str) {
        if (!TextUtils.isEmpty(str)) {
            C2640a.m7643a("ua updated: ".concat(String.valueOf(str)));
            f7937a = str;
            C2628e.m7607d().f7909f.mo7119a("WEB_UA_KEY", f7937a);
        }
    }
}
