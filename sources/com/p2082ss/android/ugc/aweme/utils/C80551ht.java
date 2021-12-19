package com.p2082ss.android.ugc.aweme.utils;

import android.os.Build;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.utils.ht */
public final class C80551ht {

    /* renamed from: a */
    public static final Field f180161a;

    static {
        Covode.recordClassIndex(93824);
        Field field = null;
        if (Build.VERSION.SDK_INT < 23) {
            try {
                field = Class.forName("android.text.TextLine").getDeclaredField("sCached");
                field.setAccessible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        f180161a = field;
    }
}
