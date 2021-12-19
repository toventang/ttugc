package com.bytedance.p1734ug.sdk.region.data.p1740e;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1734ug.sdk.region.data.p1736a.C23460a;
import com.bytedance.p1734ug.sdk.region.data.p1743h.C23483b;

/* renamed from: com.bytedance.ug.sdk.region.data.e.b */
public final class C23473b {

    /* renamed from: a */
    public static final C23460a f55655a = C23460a.m44150a("");

    /* renamed from: b */
    public static C23460a f55656b = null;

    static {
        Covode.recordClassIndex(27474);
    }

    /* renamed from: a */
    public static C23460a m44165a(Context context) {
        String b = m44166b(context);
        if (TextUtils.isEmpty(b)) {
            return null;
        }
        return C23460a.m44150a(b);
    }

    /* renamed from: b */
    private static String m44166b(Context context) {
        String b = C23483b.m44176b(context);
        if (!TextUtils.isEmpty(b)) {
            return b;
        }
        String a = C23483b.m44175a(context);
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        return C23483b.m44174a();
    }
}
