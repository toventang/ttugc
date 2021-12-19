package com.bytedance.android.live.core.p218f;

import android.os.Debug;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.core.f.w */
public final class C3964w {

    /* renamed from: a */
    public static long f10861a = -1;

    /* renamed from: b */
    public static String f10862b = "";

    /* renamed from: c */
    private static final int[] f10863c = {0, 192, 290, 512, 1024, 1536, 2048};

    /* renamed from: d */
    private static final int[] f10864d = {0, 528, 620, 1020, 1220, 1520, 2020};

    /* renamed from: e */
    private static long f10865e = -1;

    /* renamed from: f */
    private static String f10866f = "";

    /* renamed from: a */
    public static long m9651a() {
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        return (long) memoryInfo.getTotalPss();
    }

    static {
        Covode.recordClassIndex(4493);
    }
}
