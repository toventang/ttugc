package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.p017a.p018a.C0196a;
import androidx.core.content.p032a.C0637f;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.appcompat.widget.al */
public final class C0405al {

    /* renamed from: a */
    public final TypedArray f1585a;

    /* renamed from: b */
    private final Context f1586b;

    /* renamed from: c */
    private TypedValue f1587c;

    static {
        Covode.recordClassIndex(470);
    }

    /* renamed from: c */
    public final CharSequence mo1831c(int i) {
        return this.f1585a.getText(i);
    }

    /* renamed from: d */
    public final String mo1833d(int i) {
        return this.f1585a.getString(i);
    }

    /* renamed from: f */
    public final boolean mo1837f(int i) {
        return this.f1585a.hasValue(i);
    }

    /* renamed from: b */
    public final Drawable mo1829b(int i) {
        int resourceId;
        if (!this.f1585a.hasValue(i) || (resourceId = this.f1585a.getResourceId(i, 0)) == 0) {
            return null;
        }
        return C0428h.m1581a().mo1927a(this.f1586b, resourceId, true);
    }

    /* renamed from: e */
    public final ColorStateList mo1835e(int i) {
        int resourceId;
        ColorStateList a;
        if (!this.f1585a.hasValue(i) || (resourceId = this.f1585a.getResourceId(i, 0)) == 0 || (a = C0196a.m618a(this.f1586b, resourceId)) == null) {
            return this.f1585a.getColorStateList(i);
        }
        return a;
    }

    /* renamed from: a */
    public final Drawable mo1826a(int i) {
        int resourceId;
        if (!this.f1585a.hasValue(i) || (resourceId = this.f1585a.getResourceId(i, 0)) == 0) {
            return this.f1585a.getDrawable(i);
        }
        return C0196a.m619b(this.f1586b, resourceId);
    }

    private C0405al(Context context, TypedArray typedArray) {
        this.f1586b = context;
        this.f1585a = typedArray;
    }

    /* renamed from: a */
    public final float mo1823a(int i, float f) {
        return this.f1585a.getFloat(i, f);
    }

    /* renamed from: b */
    public final int mo1828b(int i, int i2) {
        return this.f1585a.getColor(i, i2);
    }

    /* renamed from: c */
    public final int mo1830c(int i, int i2) {
        return this.f1585a.getInteger(i, i2);
    }

    /* renamed from: d */
    public final int mo1832d(int i, int i2) {
        return this.f1585a.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: e */
    public final int mo1834e(int i, int i2) {
        return this.f1585a.getDimensionPixelSize(i, i2);
    }

    /* renamed from: f */
    public final int mo1836f(int i, int i2) {
        return this.f1585a.getLayoutDimension(i, i2);
    }

    /* renamed from: g */
    public final int mo1838g(int i, int i2) {
        return this.f1585a.getResourceId(i, i2);
    }

    /* renamed from: a */
    public final int mo1824a(int i, int i2) {
        return this.f1585a.getInt(i, i2);
    }

    /* renamed from: a */
    public final boolean mo1827a(int i, boolean z) {
        return this.f1585a.getBoolean(i, z);
    }

    /* renamed from: a */
    public static C0405al m1464a(Context context, int i, int[] iArr) {
        return new C0405al(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: a */
    public static C0405al m1465a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0405al(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: a */
    public final Typeface mo1825a(int i, int i2, C0637f.AbstractC0638a aVar) {
        int resourceId = this.f1585a.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1587c == null) {
            this.f1587c = new TypedValue();
        }
        return C0637f.m2346a(this.f1586b, resourceId, this.f1587c, i2, aVar);
    }

    /* renamed from: a */
    public static C0405al m1466a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0405al(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }
}
