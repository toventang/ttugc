package com.lynx.tasm.utils;

import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.AbstractC28520j;

/* renamed from: com.lynx.tasm.utils.a */
public final class C28914a {
    static {
        Covode.recordClassIndex(35042);
    }

    /* renamed from: a */
    public static AbstractC28520j m57914a(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof AbstractC28520j) {
                return (AbstractC28520j) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }
}
