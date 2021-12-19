package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.core.content.p032a.C0637f;
import androidx.core.widget.AbstractC0817b;
import androidx.core.widget.C0823h;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.s */
public class C0450s {

    /* renamed from: a */
    final C0452t f1732a;

    /* renamed from: b */
    int f1733b;

    /* renamed from: c */
    Typeface f1734c;

    /* renamed from: d */
    boolean f1735d;

    /* renamed from: e */
    private final TextView f1736e;

    /* renamed from: f */
    private C0403aj f1737f;

    /* renamed from: g */
    private C0403aj f1738g;

    /* renamed from: h */
    private C0403aj f1739h;

    /* renamed from: i */
    private C0403aj f1740i;

    /* renamed from: j */
    private C0403aj f1741j;

    /* renamed from: k */
    private C0403aj f1742k;

    static {
        Covode.recordClassIndex(515);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2003a(boolean z) {
        this.f1736e.setAllCaps(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2004a(int[] iArr, int i) {
        this.f1732a.mo2012a(iArr, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo2005b() {
        if (!AbstractC0817b.f3045d) {
            this.f1732a.mo2007a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1997a() {
        if (!(this.f1737f == null && this.f1738g == null && this.f1739h == null && this.f1740i == null)) {
            Drawable[] compoundDrawables = this.f1736e.getCompoundDrawables();
            m1624a(compoundDrawables[0], this.f1737f);
            m1624a(compoundDrawables[1], this.f1738g);
            m1624a(compoundDrawables[2], this.f1739h);
            m1624a(compoundDrawables[3], this.f1740i);
        }
        int i = Build.VERSION.SDK_INT;
        if (this.f1741j != null || this.f1742k != null) {
            Drawable[] compoundDrawablesRelative = this.f1736e.getCompoundDrawablesRelative();
            m1624a(compoundDrawablesRelative[0], this.f1741j);
            m1624a(compoundDrawablesRelative[2], this.f1742k);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1998a(int i) {
        this.f1732a.mo2008a(i);
    }

    C0450s(TextView textView) {
        this.f1736e = textView;
        this.f1732a = new C0452t(textView);
    }

    /* renamed from: b */
    private void m1625b(int i, float f) {
        this.f1732a.mo2009a(i, f);
    }

    /* renamed from: a */
    private void m1624a(Drawable drawable, C0403aj ajVar) {
        if (drawable != null && ajVar != null) {
            C0428h.m1583a(drawable, ajVar, this.f1736e.getDrawableState());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1999a(int i, float f) {
        if (!AbstractC0817b.f3045d && !this.f1732a.mo2013b()) {
            m1625b(i, f);
        }
    }

    /* renamed from: a */
    private void m1623a(Context context, C0405al alVar) {
        String d;
        this.f1733b = alVar.mo1824a(2, this.f1733b);
        int i = 10;
        boolean z = false;
        if (alVar.mo1837f(10) || alVar.mo1837f(11)) {
            this.f1734c = null;
            if (alVar.mo1837f(11)) {
                i = 11;
            }
            if (!context.isRestricted()) {
                final WeakReference weakReference = new WeakReference(this.f1736e);
                try {
                    Typeface a = alVar.mo1825a(i, this.f1733b, new C0637f.AbstractC0638a() {
                        /* class androidx.appcompat.widget.C0450s.C04511 */

                        static {
                            Covode.recordClassIndex(516);
                        }

                        @Override // androidx.core.content.p032a.C0637f.AbstractC0638a
                        /* renamed from: a */
                        public final void mo2006a(Typeface typeface) {
                            C0450s sVar = C0450s.this;
                            WeakReference weakReference = weakReference;
                            if (sVar.f1735d) {
                                sVar.f1734c = typeface;
                                TextView textView = (TextView) weakReference.get();
                                if (textView != null) {
                                    textView.setTypeface(typeface, sVar.f1733b);
                                }
                            }
                        }
                    });
                    this.f1734c = a;
                    if (a == null) {
                        z = true;
                    }
                    this.f1735d = z;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f1734c == null && (d = alVar.mo1833d(i)) != null) {
                this.f1734c = Typeface.create(d, this.f1733b);
            }
        } else if (alVar.mo1837f(1)) {
            this.f1735d = false;
            int a2 = alVar.mo1824a(1, 1);
            if (a2 == 1) {
                this.f1734c = Typeface.SANS_SERIF;
            } else if (a2 == 2) {
                this.f1734c = Typeface.SERIF;
            } else if (a2 == 3) {
                this.f1734c = Typeface.MONOSPACE;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2001a(Context context, int i) {
        ColorStateList e;
        C0405al a = C0405al.m1464a(context, i, new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, R.attr.ug, R.attr.ahk});
        if (a.mo1837f(12)) {
            mo2003a(a.mo1827a(12, false));
        }
        if (Build.VERSION.SDK_INT < 23 && a.mo1837f(3) && (e = a.mo1835e(3)) != null) {
            this.f1736e.setTextColor(e);
        }
        if (a.mo1837f(0) && a.mo1834e(0, -1) == 0) {
            this.f1736e.setTextSize(0, 0.0f);
        }
        m1623a(context, a);
        a.f1585a.recycle();
        Typeface typeface = this.f1734c;
        if (typeface != null) {
            this.f1736e.setTypeface(typeface, this.f1733b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2002a(AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        boolean z;
        ColorStateList colorStateList3;
        boolean z2;
        Context context = this.f1736e.getContext();
        C0428h a = C0428h.m1581a();
        C0405al a2 = C0405al.m1466a(context, attributeSet, new int[]{16842804, 16843117, 16843118, 16843119, 16843120, 16843666, 16843667}, i, 0);
        int g = a2.mo1838g(0, -1);
        if (a2.mo1837f(3)) {
            this.f1737f = m1622a(context, a, a2.mo1838g(3, 0));
        }
        if (a2.mo1837f(1)) {
            this.f1738g = m1622a(context, a, a2.mo1838g(1, 0));
        }
        if (a2.mo1837f(4)) {
            this.f1739h = m1622a(context, a, a2.mo1838g(4, 0));
        }
        if (a2.mo1837f(2)) {
            this.f1740i = m1622a(context, a, a2.mo1838g(2, 0));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (a2.mo1837f(5)) {
            this.f1741j = m1622a(context, a, a2.mo1838g(5, 0));
        }
        if (a2.mo1837f(6)) {
            this.f1742k = m1622a(context, a, a2.mo1838g(6, 0));
        }
        a2.f1585a.recycle();
        boolean z3 = this.f1736e.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (g != -1) {
            C0405al a3 = C0405al.m1464a(context, g, new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, R.attr.ug, R.attr.ahk});
            if (z3 || !a3.mo1837f(12)) {
                z = false;
                z2 = false;
            } else {
                z = a3.mo1827a(12, false);
                z2 = true;
            }
            m1623a(context, a3);
            if (Build.VERSION.SDK_INT < 23) {
                if (a3.mo1837f(3)) {
                    colorStateList2 = a3.mo1835e(3);
                } else {
                    colorStateList2 = null;
                }
                if (a3.mo1837f(4)) {
                    colorStateList3 = a3.mo1835e(4);
                } else {
                    colorStateList3 = null;
                }
                if (a3.mo1837f(5)) {
                    colorStateList = a3.mo1835e(5);
                } else {
                    colorStateList = null;
                }
            } else {
                colorStateList2 = null;
                colorStateList = null;
                colorStateList3 = null;
            }
            a3.f1585a.recycle();
        } else {
            colorStateList = null;
            colorStateList2 = null;
            z = false;
            colorStateList3 = null;
            z2 = false;
        }
        C0405al a4 = C0405al.m1466a(context, attributeSet, new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, R.attr.ug, R.attr.ahk}, i, 0);
        if (!z3 && a4.mo1837f(12)) {
            z = a4.mo1827a(12, false);
            z2 = true;
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (a4.mo1837f(3)) {
                colorStateList2 = a4.mo1835e(3);
            }
            if (a4.mo1837f(4)) {
                colorStateList3 = a4.mo1835e(4);
            }
            if (a4.mo1837f(5)) {
                colorStateList = a4.mo1835e(5);
            }
        }
        if (Build.VERSION.SDK_INT >= 28 && a4.mo1837f(0) && a4.mo1834e(0, -1) == 0) {
            this.f1736e.setTextSize(0, 0.0f);
        }
        m1623a(context, a4);
        a4.f1585a.recycle();
        if (colorStateList2 != null) {
            this.f1736e.setTextColor(colorStateList2);
        }
        if (colorStateList3 != null) {
            this.f1736e.setHintTextColor(colorStateList3);
        }
        if (colorStateList != null) {
            this.f1736e.setLinkTextColor(colorStateList);
        }
        if (!z3 && z2) {
            mo2003a(z);
        }
        Typeface typeface = this.f1734c;
        if (typeface != null) {
            this.f1736e.setTypeface(typeface, this.f1733b);
        }
        this.f1732a.mo2011a(attributeSet, i);
        if (AbstractC0817b.f3045d && this.f1732a.f1747a != 0) {
            int[] iArr = this.f1732a.f1751e;
            if (iArr.length > 0) {
                if (((float) this.f1736e.getAutoSizeStepGranularity()) != -1.0f) {
                    this.f1736e.setAutoSizeTextTypeUniformWithConfiguration(Math.round(this.f1732a.f1749c), Math.round(this.f1732a.f1750d), Math.round(this.f1732a.f1748b), 0);
                } else {
                    this.f1736e.setAutoSizeTextTypeUniformWithPresetSizes(iArr, 0);
                }
            }
        }
        C0405al a5 = C0405al.m1465a(context, attributeSet, new int[]{16842804, R.attr.iq, R.attr.ir, R.attr.is, R.attr.it, R.attr.iu, R.attr.u0, R.attr.ug, R.attr.z7, R.attr.a2e, R.attr.ahk});
        int e = a5.mo1834e(6, -1);
        int e2 = a5.mo1834e(8, -1);
        int e3 = a5.mo1834e(9, -1);
        a5.f1585a.recycle();
        if (e != -1) {
            C0823h.m2914c(this.f1736e, e);
        }
        if (e2 != -1) {
            C0823h.m2916d(this.f1736e, e2);
        }
        if (e3 != -1) {
            C0823h.m2917e(this.f1736e, e3);
        }
    }

    /* renamed from: a */
    private static C0403aj m1622a(Context context, C0428h hVar, int i) {
        ColorStateList b = hVar.mo1930b(context, i);
        if (b == null) {
            return null;
        }
        C0403aj ajVar = new C0403aj();
        ajVar.f1583d = true;
        ajVar.f1580a = b;
        return ajVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2000a(int i, int i2, int i3, int i4) {
        this.f1732a.mo2010a(i, i2, i3, i4);
    }
}
