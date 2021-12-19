package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.graphics.C0699a;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.ah */
public final class C0401ah {

    /* renamed from: a */
    static final int[] f1566a = {-16842910};

    /* renamed from: b */
    static final int[] f1567b = {16842908};

    /* renamed from: c */
    static final int[] f1568c = {16843518};

    /* renamed from: d */
    static final int[] f1569d = {16842919};

    /* renamed from: e */
    static final int[] f1570e = {16842912};

    /* renamed from: f */
    static final int[] f1571f = {16842913};

    /* renamed from: g */
    static final int[] f1572g = {-16842919, -16842908};

    /* renamed from: h */
    static final int[] f1573h = new int[0];

    /* renamed from: i */
    private static final ThreadLocal<TypedValue> f1574i = new ThreadLocal<>();

    /* renamed from: j */
    private static final int[] f1575j = new int[1];

    static {
        Covode.recordClassIndex(466);
    }

    /* renamed from: a */
    private static TypedValue m1459a() {
        ThreadLocal<TypedValue> threadLocal = f1574i;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: a */
    public static int m1457a(Context context, int i) {
        int[] iArr = f1575j;
        iArr[0] = i;
        C0405al a = C0405al.m1465a(context, (AttributeSet) null, iArr);
        try {
            return a.mo1828b(0, 0);
        } finally {
            a.f1585a.recycle();
        }
    }

    /* renamed from: b */
    public static ColorStateList m1460b(Context context, int i) {
        int[] iArr = f1575j;
        iArr[0] = i;
        C0405al a = C0405al.m1465a(context, (AttributeSet) null, iArr);
        try {
            return a.mo1835e(0);
        } finally {
            a.f1585a.recycle();
        }
    }

    /* renamed from: c */
    public static int m1461c(Context context, int i) {
        ColorStateList b = m1460b(context, i);
        if (b != null && b.isStateful()) {
            return b.getColorForState(f1566a, b.getDefaultColor());
        }
        TypedValue a = m1459a();
        context.getTheme().resolveAttribute(16842803, a, true);
        return m1458a(context, i, a.getFloat());
    }

    /* renamed from: a */
    private static int m1458a(Context context, int i, float f) {
        int a = m1457a(context, i);
        return C0699a.m2464b(a, Math.round(((float) Color.alpha(a)) * f));
    }
}
