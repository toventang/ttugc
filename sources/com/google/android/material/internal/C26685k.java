package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0405al;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.google.android.material.internal.k */
public final class C26685k {

    /* renamed from: a */
    private static final int[] f63223a = {R.attr.oj};

    /* renamed from: b */
    private static final int[] f63224b = {R.attr.om};

    static {
        Covode.recordClassIndex(32141);
    }

    /* renamed from: a */
    public static void m52977a(Context context) {
        m52979a(context, f63223a, "Theme.AppCompat");
    }

    /* renamed from: b */
    private static void m52982b(Context context) {
        m52979a(context, f63224b, "Theme.MaterialComponents");
    }

    /* renamed from: a */
    private static boolean m52980a(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean hasValue = obtainStyledAttributes.hasValue(0);
        obtainStyledAttributes.recycle();
        return hasValue;
    }

    /* renamed from: a */
    private static void m52979a(Context context, int[] iArr, String str) {
        if (!m52980a(context, iArr)) {
            throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
        }
    }

    /* renamed from: a */
    private static void m52978a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842804, R.attr.t1, R.attr.t2}, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            m52982b(context);
        }
        m52977a(context);
    }

    /* renamed from: a */
    public static TypedArray m52976a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m52978a(context, attributeSet, i, i2);
        m52983c(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* renamed from: b */
    public static C0405al m52981b(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m52978a(context, attributeSet, i, i2);
        m52983c(context, attributeSet, iArr, i, i2, iArr2);
        return C0405al.m1466a(context, attributeSet, iArr, i, i2);
    }

    /* renamed from: d */
    private static boolean m52984d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int i3 : iArr2) {
            if (obtainStyledAttributes.getResourceId(i3, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: c */
    private static void m52983c(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842804, R.attr.t1, R.attr.t2}, i, i2);
        boolean z = false;
        if (!obtainStyledAttributes.getBoolean(2, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 != null && iArr2.length != 0) {
            z = m52984d(context, attributeSet, iArr, i, i2, iArr2);
        } else if (obtainStyledAttributes.getResourceId(0, -1) != -1) {
            z = true;
        }
        obtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }
}
