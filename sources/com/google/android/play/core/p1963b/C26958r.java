package com.google.android.play.core.p1963b;

import com.bytedance.covode.number.Covode;
import java.io.File;

/* renamed from: com.google.android.play.core.b.r */
public final class C26958r {
    static {
        Covode.recordClassIndex(32433);
    }

    /* renamed from: a */
    public static String m53561a(File file) {
        if (file.getName().endsWith(".apk")) {
            String name = file.getName();
            String str = "";
            String replaceFirst = name.replaceFirst("(_\\d+)?\\.apk", str);
            if (replaceFirst.equals("base-master")) {
                return str;
            }
            String str2 = "base-";
            if (replaceFirst.startsWith(str2)) {
                str = "config.";
            } else {
                replaceFirst = replaceFirst.replace("-", ".config.");
                str2 = ".config.master";
            }
            return replaceFirst.replace(str2, str);
        }
        throw new IllegalArgumentException("Non-apk found in splits directory.");
    }

    /* renamed from: a */
    public static <T> void m53562a(T t, Object obj) {
        if (t == null) {
            throw new NullPointerException((String) obj);
        }
    }

    /* renamed from: a */
    public static void m53563a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
