package com.bytedance.liko.leakdetector.p1487a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.bytedance.liko.leakdetector.a.c */
public final class C20854c {

    /* renamed from: a */
    public static final C20854c f49311a = new C20854c();

    private C20854c() {
    }

    static {
        Covode.recordClassIndex(24433);
    }

    /* renamed from: a */
    public static void m39206a(Context context, String str) {
        SharedPreferences a;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putString;
        if (context != null && (a = C34822d.m71158a(context, "LeakDetectorSp", 0)) != null && (edit = a.edit()) != null && (putString = edit.putString("ld_memory_peak_dump_file", str)) != null) {
            putString.commit();
        }
    }

    /* renamed from: b */
    public static void m39207b(Context context, String str) {
        SharedPreferences a;
        SharedPreferences.Editor edit;
        SharedPreferences.Editor putString;
        if (context != null && (a = C34822d.m71158a(context, "LeakDetectorSp", 0)) != null && (edit = a.edit()) != null && (putString = edit.putString("ld_oom_dump_file", str)) != null) {
            putString.commit();
        }
    }
}
