package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.appcompat.widget.t */
public class C0452t {

    /* renamed from: f */
    private static final RectF f1745f = new RectF();

    /* renamed from: g */
    private static ConcurrentHashMap<String, Method> f1746g = new ConcurrentHashMap<>();

    /* renamed from: a */
    public int f1747a;

    /* renamed from: b */
    float f1748b = -1.0f;

    /* renamed from: c */
    float f1749c = -1.0f;

    /* renamed from: d */
    float f1750d = -1.0f;

    /* renamed from: e */
    public int[] f1751e = new int[0];

    /* renamed from: h */
    private boolean f1752h;

    /* renamed from: i */
    private boolean f1753i;

    /* renamed from: j */
    private TextPaint f1754j;

    /* renamed from: k */
    private final TextView f1755k;

    /* renamed from: l */
    private final Context f1756l;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2011a(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.f1756l.obtainStyledAttributes(attributeSet, new int[]{16842804, R.attr.iq, R.attr.ir, R.attr.is, R.attr.it, R.attr.iu, R.attr.u0, R.attr.ug, R.attr.z7, R.attr.a2e, R.attr.ahk}, i, 0);
        if (obtainStyledAttributes.hasValue(5)) {
            this.f1747a = obtainStyledAttributes.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(4) ? obtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(2) ? obtainStyledAttributes.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(1) ? obtainStyledAttributes.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            m1643a(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!m1649f()) {
            this.f1747a = 0;
        } else if (this.f1747a == 1) {
            if (!this.f1753i) {
                DisplayMetrics displayMetrics = this.f1756l.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                m1642a(dimension2, dimension3, dimension);
            }
            m1647d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2008a(int i) {
        if (!m1649f()) {
            return;
        }
        if (i == 0) {
            m1648e();
        } else if (i == 1) {
            DisplayMetrics displayMetrics = this.f1756l.getResources().getDisplayMetrics();
            m1642a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (m1647d()) {
                mo2007a();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: ".concat(String.valueOf(i)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2010a(int i, int i2, int i3, int i4) {
        if (m1649f()) {
            DisplayMetrics displayMetrics = this.f1756l.getResources().getDisplayMetrics();
            m1642a(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (m1647d()) {
                mo2007a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2012a(int[] iArr, int i) {
        if (m1649f()) {
            int length = iArr.length;
            int i2 = 0;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1756l.getResources().getDisplayMetrics();
                    do {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                        i2++;
                    } while (i2 < length);
                }
                this.f1751e = m1645a(iArr2);
                if (!m1646c()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1753i = false;
            }
            if (m1647d()) {
                mo2007a();
            }
        }
    }

    /* renamed from: a */
    private static int[] m1645a(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            int i2 = iArr[i];
            if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                arrayList.add(Integer.valueOf(i2));
            }
            i++;
        } while (i < length);
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2007a() {
        int measuredWidth;
        if (mo2013b()) {
            if (this.f1752h) {
                if (this.f1755k.getMeasuredHeight() > 0 && this.f1755k.getMeasuredWidth() > 0) {
                    if (((Boolean) m1639a((Object) this.f1755k, "getHorizontallyScrolling", (Object) false)).booleanValue()) {
                        measuredWidth = 1048576;
                    } else {
                        measuredWidth = (this.f1755k.getMeasuredWidth() - this.f1755k.getTotalPaddingLeft()) - this.f1755k.getTotalPaddingRight();
                    }
                    int height = (this.f1755k.getHeight() - this.f1755k.getCompoundPaddingBottom()) - this.f1755k.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = f1745f;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) measuredWidth;
                            rectF.bottom = (float) height;
                            float a = (float) m1636a(rectF);
                            if (a != this.f1755k.getTextSize()) {
                                mo2009a(0, a);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f1752h = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2009a(int i, float f) {
        Resources resources;
        Context context = this.f1756l;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        m1641a(TypedValue.applyDimension(i, f, resources.getDisplayMetrics()));
    }

    /* renamed from: a */
    private boolean m1644a(int i, RectF rectF) {
        StaticLayout a;
        CharSequence transformation;
        CharSequence text = this.f1755k.getText();
        TransformationMethod transformationMethod = this.f1755k.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f1755k)) == null)) {
            text = transformation;
        }
        int i2 = Build.VERSION.SDK_INT;
        int maxLines = this.f1755k.getMaxLines();
        TextPaint textPaint = this.f1754j;
        if (textPaint == null) {
            this.f1754j = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1754j.set(this.f1755k.getPaint());
        this.f1754j.setTextSize((float) i);
        Layout.Alignment alignment = (Layout.Alignment) m1639a(this.f1755k, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
        if (Build.VERSION.SDK_INT >= 23) {
            a = m1638a(text, alignment, Math.round(rectF.right), maxLines);
        } else {
            a = m1637a(text, alignment, Math.round(rectF.right));
        }
        return (maxLines == -1 || (a.getLineCount() <= maxLines && a.getLineEnd(a.getLineCount() - 1) == text.length())) && ((float) a.getHeight()) <= rectF.bottom;
    }

    /* renamed from: f */
    private boolean m1649f() {
        if (!(this.f1755k instanceof AppCompatEditText)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo2013b() {
        if (!m1649f() || this.f1747a == 0) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(517);
    }

    /* renamed from: c */
    private boolean m1646c() {
        boolean z;
        int[] iArr = this.f1751e;
        int length = iArr.length;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f1753i = z;
        if (z) {
            this.f1747a = 1;
            this.f1749c = (float) iArr[0];
            this.f1750d = (float) iArr[length - 1];
            this.f1748b = -1.0f;
        }
        return z;
    }

    /* renamed from: e */
    private void m1648e() {
        this.f1747a = 0;
        this.f1749c = -1.0f;
        this.f1750d = -1.0f;
        this.f1748b = -1.0f;
        this.f1751e = new int[0];
        this.f1752h = false;
    }

    /* renamed from: d */
    private boolean m1647d() {
        if (!m1649f() || this.f1747a != 1) {
            this.f1752h = false;
        } else {
            if (!this.f1753i || this.f1751e.length == 0) {
                float round = (float) Math.round(this.f1749c);
                int i = 1;
                while (Math.round(this.f1748b + round) <= Math.round(this.f1750d)) {
                    i++;
                    round += this.f1748b;
                }
                int[] iArr = new int[i];
                float f = this.f1749c;
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = Math.round(f);
                    f += this.f1748b;
                }
                this.f1751e = m1645a(iArr);
            }
            this.f1752h = true;
        }
        return this.f1752h;
    }

    C0452t(TextView textView) {
        this.f1755k = textView;
        this.f1756l = textView.getContext();
    }

    /* renamed from: a */
    private void m1643a(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            int i = 0;
            do {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
                i++;
            } while (i < length);
            this.f1751e = m1645a(iArr);
            m1646c();
        }
    }

    /* renamed from: a */
    private int m1636a(RectF rectF) {
        int length = this.f1751e.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                if (m1644a(this.f1751e[i4], rectF)) {
                    int i5 = i4 + 1;
                    i3 = i2;
                    i2 = i5;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.f1751e[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: a */
    private static Method m1640a(String str) {
        try {
            Method method = f1746g.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1746g.put(str, method);
            }
            return method;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private void m1641a(float f) {
        if (f != this.f1755k.getPaint().getTextSize()) {
            this.f1755k.getPaint().setTextSize(f);
            int i = Build.VERSION.SDK_INT;
            boolean isInLayout = this.f1755k.isInLayout();
            if (this.f1755k.getLayout() != null) {
                this.f1752h = false;
                try {
                    Method a = m1640a("nullLayouts");
                    if (a != null) {
                        a.invoke(this.f1755k, new Object[0]);
                    }
                } catch (Exception unused) {
                }
                if (!isInLayout) {
                    this.f1755k.requestLayout();
                } else {
                    this.f1755k.forceLayout();
                }
                this.f1755k.invalidate();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        return r4;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T> T m1639a(java.lang.Object r2, java.lang.String r3, T r4) {
        /*
            java.lang.reflect.Method r1 = m1640a(r3)     // Catch:{ Exception -> 0x000b, all -> 0x000c }
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x000b, all -> 0x000c }
            java.lang.Object r4 = r1.invoke(r2, r0)     // Catch:{ Exception -> 0x000b, all -> 0x000c }
        L_0x000b:
            return r4
        L_0x000c:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0452t.m1639a(java.lang.Object, java.lang.String, java.lang.Object):java.lang.Object");
    }

    /* renamed from: a */
    private StaticLayout m1637a(CharSequence charSequence, Layout.Alignment alignment, int i) {
        int i2 = Build.VERSION.SDK_INT;
        return new StaticLayout(charSequence, this.f1754j, i, alignment, this.f1755k.getLineSpacingMultiplier(), this.f1755k.getLineSpacingExtra(), this.f1755k.getIncludeFontPadding());
    }

    /* renamed from: a */
    private void m1642a(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        } else if (f3 > 0.0f) {
            this.f1747a = 1;
            this.f1749c = f;
            this.f1750d = f2;
            this.f1748b = f3;
            this.f1753i = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
    }

    /* renamed from: a */
    private StaticLayout m1638a(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        TextDirectionHeuristic textDirectionHeuristic = (TextDirectionHeuristic) m1639a(this.f1755k, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f1754j, i).setAlignment(alignment).setLineSpacing(this.f1755k.getLineSpacingExtra(), this.f1755k.getLineSpacingMultiplier()).setIncludePad(this.f1755k.getIncludeFontPadding()).setBreakStrategy(this.f1755k.getBreakStrategy()).setHyphenationFrequency(this.f1755k.getHyphenationFrequency());
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        return hyphenationFrequency.setMaxLines(i2).setTextDirection(textDirectionHeuristic).build();
    }
}
