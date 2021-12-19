package com.google.android.material.p1957f;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import androidx.appcompat.p017a.p018a.C0196a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.material.f.a */
public final class C26630a {
    static {
        Covode.recordClassIndex(32078);
    }

    /* renamed from: a */
    public static ColorStateList m52827a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList a;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (a = C0196a.m618a(context, resourceId)) == null) {
            return typedArray.getColorStateList(i);
        }
        return a;
    }

    /* renamed from: b */
    public static Drawable m52828b(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable b;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (b = C0196a.m619b(context, resourceId)) == null) {
            return typedArray.getDrawable(i);
        }
        return b;
    }
}
