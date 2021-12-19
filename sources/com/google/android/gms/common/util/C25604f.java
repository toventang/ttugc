package com.google.android.gms.common.util;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.internal.C25565r;

/* renamed from: com.google.android.gms.common.util.f */
public final class C25604f {

    /* renamed from: a */
    private static final String[] f60714a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    /* renamed from: b */
    private static int f60715b = -1;

    static {
        Covode.recordClassIndex(31014);
    }

    /* renamed from: a */
    public static boolean m49410a(Context context, Throwable th) {
        try {
            C25565r.m49314a(context);
            C25565r.m49314a(th);
        } catch (Exception unused) {
        }
        return false;
    }
}
