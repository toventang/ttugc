package com.bytedance.common.p894a;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: com.bytedance.common.a.a */
public final class C13477a {

    /* renamed from: a */
    public static Context f32819a;

    /* renamed from: b */
    static String f32820b;

    /* renamed from: c */
    static String f32821c;

    /* renamed from: d */
    static String f32822d;

    /* renamed from: e */
    static WeakReference<List<String>> f32823e;

    static {
        Covode.recordClassIndex(15485);
    }

    /* renamed from: a */
    public static Context m24233a() {
        Context context = f32819a;
        if (context != null) {
            return context;
        }
        throw new RuntimeException("Please make sure Deximage.init(...) first");
    }

    /* renamed from: b */
    public static String m24234b() {
        if (f32820b == null) {
            f32820b = m24233a().getPackageName();
        }
        return f32820b;
    }

    /* renamed from: g */
    private static String m24239g() {
        if (f32822d == null) {
            f32822d = m24233a().getPackageCodePath();
        }
        return f32822d;
    }

    /* renamed from: c */
    public static File m24235c() {
        File file;
        if (Build.VERSION.SDK_INT >= 21) {
            file = m24233a().getCodeCacheDir();
        } else {
            Context a = m24233a();
            if (C58016d.f132221b == null || !C58016d.f132224e) {
                C58016d.f132221b = a.getCacheDir();
            }
            file = C58016d.f132221b;
        }
        File file2 = new File(file, "app_profiles");
        if (!file2.exists()) {
            file2.mkdir();
        }
        return file2;
    }

    /* renamed from: d */
    public static String m24236d() {
        return new File(m24239g()).getParentFile().getAbsolutePath() + "/oat/" + m24238f() + "/base.art";
    }

    /* renamed from: e */
    public static List<String> m24237e() {
        WeakReference<List<String>> weakReference = f32823e;
        if (weakReference == null) {
            List<String> a = C13481b.m24245a(m24239g());
            f32823e = new WeakReference<>(a);
            return a;
        }
        List<String> list = weakReference.get();
        if (list != null) {
            return list;
        }
        List<String> a2 = C13481b.m24245a(m24239g());
        f32823e = new WeakReference<>(a2);
        return a2;
    }

    /* renamed from: f */
    private static String m24238f() {
        if (f32821c == null) {
            try {
                Method declaredMethod = Class.forName("dalvik.system.VMRuntime").getDeclaredMethod("getCurrentInstructionSet", new Class[0]);
                declaredMethod.setAccessible(true);
                f32821c = (String) declaredMethod.invoke(null, new Object[0]);
            } catch (Exception e) {
                e.printStackTrace();
                return "";
            }
        }
        return f32821c;
    }
}
