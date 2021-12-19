package com.bytedance.tux.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.bytedance.tux.badge.a */
public final class C22993a {
    static {
        Covode.recordClassIndex(26912);
    }

    /* renamed from: a */
    public static final String m43371a(int i, int i2, int i3) {
        if (i == 0) {
            return "";
        }
        if (i2 == 0 || i2 > 9) {
            return String.valueOf(i3);
        }
        int i4 = 1;
        if (i2 > 0) {
            int i5 = 1;
            while (true) {
                i4 *= 10;
                if (i5 == i2) {
                    break;
                }
                i5++;
            }
        }
        int i6 = i4 - 1;
        if (i3 > i6) {
            return new StringBuilder().append(i6).append('+').toString();
        }
        return String.valueOf(i3);
    }

    /* renamed from: a */
    public static final C22995c m43370a(TypedArray typedArray, int i, int i2, int i3) {
        C89219l.m154719c(typedArray, "");
        return new C22995c(typedArray.getInt(1, 0), typedArray.getColor(2, i), typedArray.getColor(0, i2), typedArray.getDimensionPixelSize(4, i3));
    }

    /* renamed from: a */
    public static /* synthetic */ C22995c m43369a(Context context, AttributeSet attributeSet, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            attributeSet = null;
        }
        if ((i4 & 8) != 0) {
            i = -1;
        }
        if ((i4 & 16) != 0) {
            i2 = -16777216;
        }
        if ((i4 & 32) != 0) {
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            i3 = C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics()));
        }
        C89219l.m154719c(context, "");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.cr, R.attr.cs, R.attr.ct, R.attr.aoc, R.attr.aod, R.attr.aoe, R.attr.aoi}, R.attr.bn, 0);
        C89219l.m154709a((Object) obtainStyledAttributes, "");
        C22995c a = m43370a(obtainStyledAttributes, i, i2, i3);
        obtainStyledAttributes.recycle();
        return a;
    }
}
