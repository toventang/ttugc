package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.appcompat.p017a.p018a.C0196a;
import androidx.appcompat.p019b.p020a.C0257a;
import androidx.core.graphics.C0699a;
import androidx.core.graphics.drawable.C0705a;
import androidx.p025c.C0484a;
import androidx.p025c.C0489d;
import androidx.p025c.C0490e;
import androidx.p025c.C0498h;
import androidx.p063m.p064a.p065a.C1251c;
import androidx.p063m.p064a.p065a.C1261i;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.appcompat.widget.h */
public final class C0428h {

    /* renamed from: a */
    private static final PorterDuff.Mode f1673a = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    private static C0428h f1674b;

    /* renamed from: c */
    private static final C0431c f1675c = new C0431c();

    /* renamed from: d */
    private static final int[] f1676d = {R.drawable.c2, R.drawable.c0, R.drawable.v};

    /* renamed from: e */
    private static final int[] f1677e = {R.drawable.ag, R.drawable.bk, R.drawable.an, R.drawable.ai, R.drawable.aj, R.drawable.am, R.drawable.al};

    /* renamed from: f */
    private static final int[] f1678f = {R.drawable.bz, R.drawable.c1, 2131230756, R.drawable.bs, R.drawable.bt, R.drawable.bv, R.drawable.bx, R.drawable.bu, R.drawable.bw, R.drawable.by};

    /* renamed from: g */
    private static final int[] f1679g = {R.drawable.ba, R.drawable.a8, R.drawable.b_};

    /* renamed from: h */
    private static final int[] f1680h = {R.drawable.bq, R.drawable.c3};

    /* renamed from: i */
    private static final int[] f1681i = {R.drawable.y, R.drawable.a3};

    /* renamed from: j */
    private WeakHashMap<Context, C0498h<ColorStateList>> f1682j;

    /* renamed from: k */
    private C0484a<String, AbstractC0432d> f1683k;

    /* renamed from: l */
    private C0498h<String> f1684l;

    /* renamed from: m */
    private final WeakHashMap<Context, C0489d<WeakReference<Drawable.ConstantState>>> f1685m = new WeakHashMap<>(0);

    /* renamed from: n */
    private TypedValue f1686n;

    /* renamed from: o */
    private boolean f1687o;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.h$d */
    public interface AbstractC0432d {
        static {
            Covode.recordClassIndex(497);
        }

        /* renamed from: a */
        Drawable mo1931a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* renamed from: androidx.appcompat.widget.h$a */
    static class C0429a implements AbstractC0432d {
        static {
            Covode.recordClassIndex(494);
        }

        C0429a() {
        }

        @Override // androidx.appcompat.widget.C0428h.AbstractC0432d
        /* renamed from: a */
        public final Drawable mo1931a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C0257a.m887a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.h$b */
    static class C0430b implements AbstractC0432d {
        static {
            Covode.recordClassIndex(495);
        }

        C0430b() {
        }

        @Override // androidx.appcompat.widget.C0428h.AbstractC0432d
        /* renamed from: a */
        public final Drawable mo1931a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C1251c.m3998a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.h$e */
    static class C0433e implements AbstractC0432d {
        static {
            Covode.recordClassIndex(498);
        }

        C0433e() {
        }

        @Override // androidx.appcompat.widget.C0428h.AbstractC0432d
        /* renamed from: a */
        public final Drawable mo1931a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return C1261i.m4016a(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: a */
    public final synchronized Drawable mo1926a(Context context, int i) {
        return mo1927a(context, i, false);
    }

    /* renamed from: a */
    public final synchronized void mo1929a(Context context) {
        C0489d<WeakReference<Drawable.ConstantState>> dVar = this.f1685m.get(context);
        if (dVar != null) {
            dVar.mo2086c();
        }
    }

    /* renamed from: a */
    private synchronized boolean m1586a(Context context, long j, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        C0489d<WeakReference<Drawable.ConstantState>> dVar = this.f1685m.get(context);
        if (dVar == null) {
            dVar = new C0489d<>();
            this.f1685m.put(context, dVar);
        }
        dVar.mo2083b(j, new WeakReference<>(constantState));
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized Drawable mo1928a(Context context, C0414aq aqVar, int i) {
        Drawable c = m1588c(context, i);
        if (c == null) {
            c = aqVar.mo1878a(i);
        }
        if (c == null) {
            return null;
        }
        return m1579a(context, i, false, c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m1585a(android.content.Context r6, int r7, android.graphics.drawable.Drawable r8) {
        /*
            android.graphics.PorterDuff$Mode r4 = androidx.appcompat.widget.C0428h.f1673a
            int[] r0 = androidx.appcompat.widget.C0428h.f1676d
            boolean r0 = m1587a(r0, r7)
            r5 = 16842801(0x1010031, float:2.3693695E-38)
            r3 = -1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x002f
            r5 = 2130969138(0x7f040232, float:1.754695E38)
        L_0x0013:
            r1 = -1
        L_0x0014:
            boolean r0 = androidx.appcompat.widget.C0455w.m1697c(r8)
            if (r0 == 0) goto L_0x001e
            android.graphics.drawable.Drawable r8 = r8.mutate()
        L_0x001e:
            int r0 = androidx.appcompat.widget.C0401ah.m1457a(r6, r5)
            android.graphics.PorterDuffColorFilter r0 = m1577a(r0, r4)
            r8.setColorFilter(r0)
            if (r1 == r3) goto L_0x002e
            r8.setAlpha(r1)
        L_0x002e:
            return r2
        L_0x002f:
            int[] r0 = androidx.appcompat.widget.C0428h.f1678f
            boolean r0 = m1587a(r0, r7)
            if (r0 == 0) goto L_0x003b
            r5 = 2130969136(0x7f040230, float:1.7546945E38)
            goto L_0x0013
        L_0x003b:
            int[] r0 = androidx.appcompat.widget.C0428h.f1679g
            boolean r0 = m1587a(r0, r7)
            if (r0 == 0) goto L_0x0046
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x0013
        L_0x0046:
            r0 = 2131230782(0x7f08003e, float:1.8077626E38)
            if (r7 != r0) goto L_0x0056
            r5 = 16842800(0x1010030, float:2.3693693E-38)
            r0 = 1109603123(0x42233333, float:40.8)
            int r1 = java.lang.Math.round(r0)
            goto L_0x0014
        L_0x0056:
            r0 = 2131230758(0x7f080026, float:1.8077578E38)
            if (r7 != r0) goto L_0x005c
            goto L_0x0013
        L_0x005c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0428h.m1585a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    /* renamed from: a */
    private void m1584a(String str, AbstractC0432d dVar) {
        if (this.f1683k == null) {
            this.f1683k = new C0484a<>();
        }
        this.f1683k.put(str, dVar);
    }

    /* renamed from: a */
    private static boolean m1587a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static void m1583a(Drawable drawable, C0403aj ajVar, int[] iArr) {
        if (!C0455w.m1697c(drawable) || drawable.mutate() == drawable) {
            if (ajVar.f1583d || ajVar.f1582c) {
                drawable.setColorFilter(m1578a(ajVar.f1583d ? ajVar.f1580a : null, ajVar.f1582c ? ajVar.f1581b : f1673a, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable mo1927a(android.content.Context r9, int r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 154
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0428h.mo1927a(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.h$c */
    public static class C0431c extends C0490e<Integer, PorterDuffColorFilter> {
        static {
            Covode.recordClassIndex(496);
        }

        public C0431c() {
            super(6);
        }

        /* renamed from: a */
        static int m1597a(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }
    }

    static {
        Covode.recordClassIndex(493);
    }

    /* renamed from: a */
    public static synchronized C0428h m1581a() {
        C0428h hVar;
        synchronized (C0428h.class) {
            if (f1674b == null) {
                C0428h hVar2 = new C0428h();
                f1674b = hVar2;
                if (Build.VERSION.SDK_INT < 24) {
                    hVar2.m1584a("vector", new C0433e());
                    hVar2.m1584a("animated-vector", new C0430b());
                    hVar2.m1584a("animated-selector", new C0429a());
                }
            }
            hVar = f1674b;
        }
        return hVar;
    }

    /* renamed from: a */
    private static long m1575a(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* renamed from: a */
    private static PorterDuff.Mode m1576a(int i) {
        if (i == R.drawable.bo) {
            return PorterDuff.Mode.MULTIPLY;
        }
        return null;
    }

    /* renamed from: a */
    public static synchronized PorterDuffColorFilter m1577a(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (C0428h.class) {
            C0431c cVar = f1675c;
            porterDuffColorFilter = (PorterDuffColorFilter) cVar.mo2091a(Integer.valueOf(C0431c.m1597a(i, mode)));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                cVar.mo2092a(Integer.valueOf(C0431c.m1597a(i, mode)), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    /* renamed from: d */
    private static ColorStateList m1589d(Context context, int i) {
        int a = C0401ah.m1457a(context, R.attr.og);
        int c = C0401ah.m1461c(context, R.attr.oe);
        return new ColorStateList(new int[][]{C0401ah.f1566a, C0401ah.f1569d, C0401ah.f1567b, C0401ah.f1573h}, new int[]{c, C0699a.m2460a(a, i), C0699a.m2460a(a, i), i});
    }

    /* renamed from: c */
    private Drawable m1588c(Context context, int i) {
        int next;
        C0484a<String, AbstractC0432d> aVar = this.f1683k;
        if (aVar == null || aVar.isEmpty()) {
            return null;
        }
        C0498h<String> hVar = this.f1684l;
        if (hVar != null) {
            String a = hVar.mo2183a(i, null);
            if ("appcompat_skip_skip".equals(a) || (a != null && this.f1683k.get(a) == null)) {
                return null;
            }
        } else {
            this.f1684l = new C0498h<>();
        }
        if (this.f1686n == null) {
            this.f1686n = new TypedValue();
        }
        TypedValue typedValue = this.f1686n;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long a2 = m1575a(typedValue);
        Drawable a3 = m1580a(context, a2);
        if (a3 != null) {
            return a3;
        }
        if (typedValue.string != null && typedValue.string.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next == 2) {
                    String name = xml.getName();
                    this.f1684l.mo2188c(i, name);
                    AbstractC0432d dVar = this.f1683k.get(name);
                    if (dVar != null) {
                        a3 = dVar.mo1931a(context, xml, asAttributeSet, context.getTheme());
                    }
                    if (a3 != null) {
                        a3.setChangingConfigurations(typedValue.changingConfigurations);
                        m1586a(context, a2, a3);
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (Exception unused) {
            }
        }
        if (a3 == null) {
            this.f1684l.mo2188c(i, "appcompat_skip_skip");
        }
        return a3;
    }

    /* renamed from: a */
    private synchronized Drawable m1580a(Context context, long j) {
        C0489d<WeakReference<Drawable.ConstantState>> dVar = this.f1685m.get(context);
        if (dVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> a = dVar.mo2078a(j, null);
        if (a != null) {
            Drawable.ConstantState constantState = a.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            dVar.mo2082b(j);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized ColorStateList mo1930b(Context context, int i) {
        ColorStateList colorStateList;
        C0498h<ColorStateList> hVar;
        WeakHashMap<Context, C0498h<ColorStateList>> weakHashMap = this.f1682j;
        colorStateList = null;
        if (!(weakHashMap == null || (hVar = weakHashMap.get(context)) == null)) {
            colorStateList = hVar.mo2183a(i, null);
        }
        if (colorStateList == null) {
            if (i == R.drawable.ac) {
                colorStateList = C0196a.m618a(context, R.color.ct);
            } else if (i == R.drawable.bp) {
                colorStateList = C0196a.m618a(context, R.color.cw);
            } else if (i == R.drawable.bo) {
                int[][] iArr = new int[3][];
                int[] iArr2 = new int[3];
                ColorStateList b = C0401ah.m1460b(context, R.attr.on);
                if (b == null || !b.isStateful()) {
                    iArr[0] = C0401ah.f1566a;
                    iArr2[0] = C0401ah.m1461c(context, R.attr.on);
                    iArr[1] = C0401ah.f1570e;
                    iArr2[1] = C0401ah.m1457a(context, R.attr.of);
                    iArr[2] = C0401ah.f1573h;
                    iArr2[2] = C0401ah.m1457a(context, R.attr.on);
                } else {
                    iArr[0] = C0401ah.f1566a;
                    iArr2[0] = b.getColorForState(iArr[0], 0);
                    iArr[1] = C0401ah.f1570e;
                    iArr2[1] = C0401ah.m1457a(context, R.attr.of);
                    iArr[2] = C0401ah.f1573h;
                    iArr2[2] = b.getDefaultColor();
                }
                colorStateList = new ColorStateList(iArr, iArr2);
            } else if (i == R.drawable.a2) {
                colorStateList = m1589d(context, C0401ah.m1457a(context, R.attr.oe));
            } else if (i == R.drawable.x) {
                colorStateList = m1589d(context, 0);
            } else if (i == R.drawable.a1) {
                colorStateList = m1589d(context, C0401ah.m1457a(context, R.attr.oc));
            } else {
                if (i != R.drawable.bm) {
                    if (i != R.drawable.bn) {
                        if (m1587a(f1677e, i)) {
                            colorStateList = C0401ah.m1460b(context, R.attr.oh);
                        } else if (m1587a(f1680h, i)) {
                            colorStateList = C0196a.m618a(context, R.color.cs);
                        } else if (m1587a(f1681i, i)) {
                            colorStateList = C0196a.m618a(context, R.color.cr);
                        } else if (i == R.drawable.bj) {
                            colorStateList = C0196a.m618a(context, R.color.cu);
                        }
                    }
                }
                colorStateList = C0196a.m618a(context, R.color.cv);
            }
            if (colorStateList != null) {
                if (this.f1682j == null) {
                    this.f1682j = new WeakHashMap<>();
                }
                C0498h<ColorStateList> hVar2 = this.f1682j.get(context);
                if (hVar2 == null) {
                    hVar2 = new C0498h<>();
                    this.f1682j.put(context, hVar2);
                }
                hVar2.mo2188c(i, colorStateList);
            }
        }
        return colorStateList;
    }

    /* renamed from: a */
    private static PorterDuffColorFilter m1578a(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m1577a(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: a */
    private static void m1582a(Drawable drawable, int i, PorterDuff.Mode mode) {
        if (C0455w.m1697c(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = f1673a;
        }
        drawable.setColorFilter(m1577a(i, mode));
    }

    /* renamed from: a */
    private Drawable m1579a(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList b = mo1930b(context, i);
        if (b != null) {
            if (C0455w.m1697c(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable e = C0705a.m2506e(drawable);
            C0705a.m2496a(e, b);
            PorterDuff.Mode a = m1576a(i);
            if (a == null) {
                return e;
            }
            C0705a.m2499a(e, a);
            return e;
        } else if (i == R.drawable.bl) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908288);
            int a2 = C0401ah.m1457a(context, R.attr.oh);
            PorterDuff.Mode mode = f1673a;
            m1582a(findDrawableByLayerId, a2, mode);
            m1582a(layerDrawable.findDrawableByLayerId(16908303), C0401ah.m1457a(context, R.attr.oh), mode);
            m1582a(layerDrawable.findDrawableByLayerId(16908301), C0401ah.m1457a(context, R.attr.of), mode);
            return drawable;
        } else if (i == R.drawable.bc || i == R.drawable.bb || i == R.drawable.bd) {
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(16908288);
            int c = C0401ah.m1461c(context, R.attr.oh);
            PorterDuff.Mode mode2 = f1673a;
            m1582a(findDrawableByLayerId2, c, mode2);
            m1582a(layerDrawable2.findDrawableByLayerId(16908303), C0401ah.m1457a(context, R.attr.of), mode2);
            m1582a(layerDrawable2.findDrawableByLayerId(16908301), C0401ah.m1457a(context, R.attr.of), mode2);
            return drawable;
        } else if (m1585a(context, i, drawable) || !z) {
            return drawable;
        } else {
            return null;
        }
    }
}
