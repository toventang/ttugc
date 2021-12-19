package com.bytedance.android.live.design;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import androidx.appcompat.p017a.p018a.C0196a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.design.c */
public final class C4080c {
    static {
        Covode.recordClassIndex(4624);
    }

    /* renamed from: a */
    public static ColorStateList m9890a(Context context, TypedArray typedArray, int i) {
        if (typedArray == null || !typedArray.hasValue(i)) {
            return null;
        }
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0) {
            return typedArray.getColorStateList(i);
        }
        if (context == null) {
            return null;
        }
        return C0196a.m618a(context, resourceId);
    }
}
