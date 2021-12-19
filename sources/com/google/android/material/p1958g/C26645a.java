package com.google.android.material.p1958g;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.StateSet;
import androidx.core.graphics.C0699a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.material.g.a */
public final class C26645a {

    /* renamed from: a */
    public static final boolean f63025a;

    /* renamed from: b */
    private static final int[] f63026b = {16842919};

    /* renamed from: c */
    private static final int[] f63027c = {16843623, 16842908};

    /* renamed from: d */
    private static final int[] f63028d = {16842908};

    /* renamed from: e */
    private static final int[] f63029e = {16843623};

    /* renamed from: f */
    private static final int[] f63030f = {16842913, 16842919};

    /* renamed from: g */
    private static final int[] f63031g = {16842913, 16843623, 16842908};

    /* renamed from: h */
    private static final int[] f63032h = {16842913, 16842908};

    /* renamed from: i */
    private static final int[] f63033i = {16842913, 16843623};

    /* renamed from: j */
    private static final int[] f63034j = {16842913};

    static {
        boolean z;
        Covode.recordClassIndex(32096);
        if (Build.VERSION.SDK_INT >= 21) {
            z = true;
        } else {
            z = false;
        }
        f63025a = z;
    }

    /* renamed from: a */
    private static int m52888a(int i) {
        return C0699a.m2464b(i, Math.min(Color.alpha(i) * 2, 255));
    }

    /* renamed from: a */
    public static ColorStateList m52890a(ColorStateList colorStateList) {
        if (f63025a) {
            return new ColorStateList(new int[][]{f63034j, StateSet.NOTHING}, new int[]{m52889a(colorStateList, f63030f), m52889a(colorStateList, f63026b)});
        }
        int[] iArr = f63030f;
        int[] iArr2 = f63031g;
        int[] iArr3 = f63032h;
        int[] iArr4 = f63033i;
        int[] iArr5 = f63026b;
        int[] iArr6 = f63027c;
        int[] iArr7 = f63028d;
        int[] iArr8 = f63029e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f63034j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{m52889a(colorStateList, iArr), m52889a(colorStateList, iArr2), m52889a(colorStateList, iArr3), m52889a(colorStateList, iArr4), 0, m52889a(colorStateList, iArr5), m52889a(colorStateList, iArr6), m52889a(colorStateList, iArr7), m52889a(colorStateList, iArr8), 0});
    }

    /* renamed from: a */
    private static int m52889a(ColorStateList colorStateList, int[] iArr) {
        int i;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        } else {
            i = 0;
        }
        if (f63025a) {
            return m52888a(i);
        }
        return i;
    }
}
