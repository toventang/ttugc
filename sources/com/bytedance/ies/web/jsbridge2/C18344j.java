package com.bytedance.ies.web.jsbridge2;

import android.util.Log;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ies.web.jsbridge2.j */
public final class C18344j {

    /* renamed from: a */
    static boolean f43884a;

    static {
        Covode.recordClassIndex(21016);
    }

    /* renamed from: a */
    static void m34123a(RuntimeException runtimeException) {
        if (f43884a) {
            throw runtimeException;
        }
    }

    /* renamed from: b */
    static void m34125b(Throwable th) {
        if (f43884a) {
            Log.getStackTraceString(th);
        }
    }

    /* renamed from: a */
    static void m34124a(Throwable th) {
        if (f43884a) {
            Log.getStackTraceString(th);
        }
    }
}
