package com.p2082ss.android.ugc.aweme.p3924sp;

import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.sp.e */
public final class C74915e {

    /* renamed from: a */
    public static Field f168405a;

    /* renamed from: b */
    public static Field f168406b;

    /* renamed from: c */
    public static Class f168407c;

    /* renamed from: d */
    public static Class f168408d;

    /* renamed from: e */
    static volatile Executor f168409e = null;

    /* renamed from: f */
    private static volatile Executor f168410f = null;

    static {
        Covode.recordClassIndex(87780);
        try {
            Class<?> cls = Class.forName("android.content.ContextWrapper");
            f168407c = cls;
            f168405a = cls.getDeclaredField("mBase");
        } catch (Throwable unused) {
        }
        try {
            Class<?> cls2 = Class.forName("android.content.ContextImpl");
            f168408d = cls2;
            f168406b = cls2.getDeclaredField("mSharedPrefsPaths");
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: a */
    public static Context m131475a(Context context) {
        Field field = f168405a;
        if (field == null) {
            return null;
        }
        try {
            if (context instanceof ContextWrapper) {
                return (Context) field.get(context);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: b */
    public static Map<String, File> m131477b(Context context) {
        Field field = f168406b;
        if (field == null) {
            return null;
        }
        try {
            if (context instanceof ContextWrapper) {
                return (Map) field.get(context);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: a */
    static Executor m131476a(int i) {
        if (f168410f == null) {
            C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
            a.f95504b = "SharedPreferencesImpl-load";
            a.f95505c = i;
            f168410f = C40780g.m82242a(a.mo70028a());
        }
        return f168410f;
    }
}
