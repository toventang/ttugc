package com.p2082ss.ttm.p4406a;

import android.os.Build;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.ttm.a.e */
public final class C86222e {

    /* renamed from: a */
    public static final int f192440a;

    /* renamed from: b */
    public static final String f192441b;

    /* renamed from: c */
    public static final String f192442c;

    /* renamed from: d */
    public static final String f192443d;

    /* renamed from: e */
    public static final String f192444e = Build.HARDWARE;

    /* renamed from: f */
    public static final String f192445f = Build.BRAND;

    /* renamed from: g */
    public static final String f192446g;

    static {
        Covode.recordClassIndex(101367);
        int i = Build.VERSION.SDK_INT;
        f192440a = i;
        String str = Build.DEVICE;
        f192441b = str;
        String str2 = Build.MANUFACTURER;
        f192442c = str2;
        String str3 = Build.MODEL;
        f192443d = str3;
        f192446g = str + ", " + str3 + ", " + str2 + ", " + i;
    }
}
