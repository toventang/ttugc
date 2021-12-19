package com.bytedance.android.live.design;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.design.b */
public final class C4079b {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f11287a = new ThreadLocal<>();

    static {
        Covode.recordClassIndex(4623);
    }

    /* renamed from: a */
    public static int m9889a(View view, int i) {
        return m9888a(view.getContext(), i);
    }

    /* renamed from: a */
    public static int m9888a(Context context, int i) {
        ThreadLocal<TypedValue> threadLocal = f11287a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.data;
    }
}
