package com.bytedance.android.livesdk.p437ag;

import android.content.Context;
import android.os.Build;
import androidx.core.content.C0645c;
import androidx.p025c.C0497g;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.ag.c */
public final class C6657c {

    /* renamed from: a */
    private static final C0497g<String, Integer> f16556a;

    static {
        Covode.recordClassIndex(7395);
        C0497g<String, Integer> gVar = new C0497g<>(8);
        f16556a = gVar;
        gVar.put("android.permission.READ_EXTERNAL_STORAGE", 16);
    }

    /* renamed from: a */
    private static boolean m14155a(Context context, String str) {
        try {
            if (C0645c.m2379a(context, str) == 0) {
                return true;
            }
            return false;
        } catch (RuntimeException unused) {
        }
    }

    /* renamed from: a */
    public static boolean m14156a(Context context, String... strArr) {
        for (String str : strArr) {
            Integer num = f16556a.get(str);
            if ((num == null || Build.VERSION.SDK_INT >= num.intValue()) && !m14155a(context, str)) {
                return false;
            }
        }
        return true;
    }
}
