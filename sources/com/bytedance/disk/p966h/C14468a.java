package com.bytedance.disk.p966h;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.disk.p961e.AbstractC14448c;

/* renamed from: com.bytedance.disk.h.a */
public final class C14468a {

    /* renamed from: a */
    public static AbstractC14448c f34997a;

    /* renamed from: b */
    private static boolean f34998b = true;

    /* renamed from: c */
    private static boolean f34999c = true;

    /* renamed from: d */
    private static boolean f35000d = true;

    static {
        Covode.recordClassIndex(16547);
    }

    /* renamed from: b */
    public static void m26439b(String str, String str2, Object... objArr) {
        if (f34999c) {
            String concat = "DM-".concat(String.valueOf(str));
            AbstractC14448c cVar = f34997a;
            if (cVar != null) {
                cVar.mo23275a(5, concat, C1764a.m5928a(str2, objArr), null);
            } else {
                C1764a.m5928a(str2, objArr);
            }
        }
    }

    /* renamed from: a */
    public static void m26438a(String str, String str2, Object... objArr) {
        if (f34998b) {
            String concat = "DM-".concat(String.valueOf(str));
            AbstractC14448c cVar = f34997a;
            if (cVar != null) {
                cVar.mo23275a(3, concat, C1764a.m5928a(str2, objArr), null);
            } else {
                C1764a.m5928a(str2, objArr);
            }
        }
    }

    /* renamed from: a */
    public static void m26437a(String str, String str2, Throwable th, Object... objArr) {
        if (f35000d) {
            String concat = "DM-".concat(String.valueOf(str));
            AbstractC14448c cVar = f34997a;
            if (cVar != null) {
                cVar.mo23275a(6, concat, C1764a.m5928a(str2, objArr), th);
            } else {
                C1764a.m5928a(str2, objArr);
            }
        }
    }
}
