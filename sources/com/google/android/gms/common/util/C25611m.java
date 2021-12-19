package com.google.android.gms.common.util;

import com.bytedance.covode.number.Covode;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.common.util.m */
public final class C25611m {

    /* renamed from: a */
    private static final Pattern f60724a = Pattern.compile("\\$\\{(.*?)\\}");

    static {
        Covode.recordClassIndex(31021);
    }

    /* renamed from: a */
    public static boolean m49428a(String str) {
        if (str == null || str.trim().isEmpty()) {
            return true;
        }
        return false;
    }
}
