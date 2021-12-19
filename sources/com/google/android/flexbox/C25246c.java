package com.google.android.flexbox;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.core.p037h.C0778h;
import androidx.core.widget.C0818c;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.flexbox.c */
class C25246c {

    /* renamed from: c */
    static final /* synthetic */ boolean f59841c = true;

    /* renamed from: a */
    int[] f59842a;

    /* renamed from: b */
    long[] f59843b;

    /* renamed from: d */
    private final AbstractC25244a f59844d;

    /* renamed from: e */
    private boolean[] f59845e;

    /* renamed from: f */
    private long[] f59846f;

    /* renamed from: b */
    private static long m48553b(int i, int i2) {
        return (((long) i) & 4294967295L) | (((long) i2) << 32);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.android.flexbox.c$a */
    public static class C25247a {

        /* renamed from: a */
        List<C25245b> f59847a;

        /* renamed from: b */
        int f59848b;

        static {
            Covode.recordClassIndex(30619);
        }

        C25247a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo41285a() {
            this.f59847a = null;
            this.f59848b = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo41277a(C25247a aVar, int i, int i2, int i3, List<C25245b> list) {
        mo41276a(aVar, i, i2, i3, -1, list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo41280b(C25247a aVar, int i, int i2, int i3, List<C25245b> list) {
        mo41276a(aVar, i, i2, 0, i3, list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo41276a(C25247a aVar, int i, int i2, int i3, int i4, List<C25245b> list) {
        int b;
        int i5 = i3;
        List<C25245b> list2 = list;
        boolean i6 = this.f59844d.mo41243i();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (list2 == null) {
            list2 = new ArrayList<>();
        }
        aVar.f59847a = list2;
        boolean z = i4 == -1;
        int a = m48540a(i6);
        int b2 = m48552b(i6);
        int c = m48557c(i6);
        int d = m48559d(i6);
        C25245b bVar = new C25245b();
        bVar.f59837o = i5;
        int i7 = a + b2;
        bVar.f59827e = i7;
        int a2 = this.f59844d.mo41234a();
        int i8 = 0;
        int i9 = 0;
        int i10 = Integer.MIN_VALUE;
        while (i5 < a2) {
            View a3 = this.f59844d.mo4318a(i5);
            if (a3 == null) {
                if (m48547a(i5, a2, bVar)) {
                    m48546a(list2, bVar, i5, i9);
                }
            } else if (a3.getVisibility() == 8) {
                bVar.f59831i++;
                bVar.f59830h++;
                if (m48547a(i5, a2, bVar)) {
                    m48546a(list2, bVar, i5, i9);
                }
            } else {
                if (a3 instanceof CompoundButton) {
                    m48544a((CompoundButton) a3);
                }
                FlexItem flexItem = (FlexItem) a3.getLayoutParams();
                if (flexItem.mo41221e() == 4) {
                    bVar.f59836n.add(Integer.valueOf(i5));
                }
                int a4 = m48539a(flexItem, i6);
                if (flexItem.mo41227k() != -1.0f && mode == 1073741824) {
                    a4 = Math.round(((float) size) * flexItem.mo41227k());
                }
                if (i6) {
                    b = this.f59844d.mo4347a(m48556c(flexItem, true) + i7 + m48558d(flexItem, true), a4);
                    int b3 = this.f59844d.mo41238b(c + d + m48560e(flexItem, true) + m48562f(flexItem, true) + i9, m48551b(flexItem, true));
                    a3.measure(b, b3);
                    m48541a(i5, b, b3, a3);
                } else {
                    int a5 = this.f59844d.mo4347a(c + d + m48560e(flexItem, false) + m48562f(flexItem, false) + i9, m48551b(flexItem, false));
                    b = this.f59844d.mo41238b(m48556c(flexItem, false) + i7 + m48558d(flexItem, false), a4);
                    a3.measure(a5, b);
                    m48541a(i5, a5, b, a3);
                }
                this.f59844d.mo41236a(i5, a3);
                m48542a(a3, i5);
                i8 = View.combineMeasuredStates(i8, a3.getMeasuredState());
                if (m48548a(a3, mode, size, bVar.f59827e, m48537a(a3, i6) + m48556c(flexItem, i6) + m48558d(flexItem, i6), flexItem, list2.size())) {
                    if (bVar.mo41269a() > 0) {
                        m48546a(list2, bVar, i5 > 0 ? i5 - 1 : 0, i9);
                        i9 += bVar.f59829g;
                    }
                    if (i6) {
                        if (flexItem.mo41217b() == -1) {
                            AbstractC25244a aVar2 = this.f59844d;
                            a3.measure(b, aVar2.mo41238b(aVar2.mo41264u() + this.f59844d.mo41266w() + flexItem.mo41229m() + flexItem.mo41231o() + i9, flexItem.mo41217b()));
                            m48542a(a3, i5);
                        }
                    } else if (flexItem.mo41215a() == -1) {
                        AbstractC25244a aVar3 = this.f59844d;
                        a3.measure(aVar3.mo4347a(aVar3.mo41263t() + this.f59844d.mo41265v() + flexItem.mo41228l() + flexItem.mo41230n() + i9, flexItem.mo41215a()), b);
                        m48542a(a3, i5);
                    }
                    bVar = new C25245b();
                    bVar.f59830h = 1;
                    bVar.f59827e = i7;
                    bVar.f59837o = i5;
                    i10 = Integer.MIN_VALUE;
                } else {
                    bVar.f59830h++;
                }
                bVar.f59839q |= flexItem.mo41219c() != 0.0f;
                bVar.f59840r |= flexItem.mo41220d() != 0.0f;
                int[] iArr = this.f59842a;
                if (iArr != null) {
                    iArr[i5] = list2.size();
                }
                bVar.f59827e += m48537a(a3, i6) + m48556c(flexItem, i6) + m48558d(flexItem, i6);
                bVar.f59832j += flexItem.mo41219c();
                bVar.f59833k += flexItem.mo41220d();
                this.f59844d.mo41237a(a3, bVar);
                i10 = Math.max(i10, m48549b(a3, i6) + m48560e(flexItem, i6) + m48562f(flexItem, i6) + this.f59844d.mo41239b(a3));
                bVar.f59829g = Math.max(bVar.f59829g, i10);
                if (i6) {
                    if (this.f59844d.mo41241d() != 2) {
                        bVar.f59834l = Math.max(bVar.f59834l, a3.getBaseline() + flexItem.mo41229m());
                    } else {
                        bVar.f59834l = Math.max(bVar.f59834l, (a3.getMeasuredHeight() - a3.getBaseline()) + flexItem.mo41231o());
                    }
                }
                if (m48547a(i5, a2, bVar)) {
                    m48546a(list2, bVar, i5, i9);
                    i9 += bVar.f59829g;
                }
                if (i4 != -1 && list2.size() > 0 && list2.get(list2.size() - 1).f59838p >= i4 && i5 >= i4 && !z) {
                    i9 = -bVar.f59829g;
                    z = true;
                }
                if (i9 > i2 && z) {
                    break;
                }
                i5++;
            }
            i5++;
        }
        aVar.f59848b = i8;
    }

    /* renamed from: a */
    private boolean m48548a(View view, int i, int i2, int i3, int i4, FlexItem flexItem, int i5) {
        if (this.f59844d.mo41241d() == 0) {
            return false;
        }
        if (flexItem.mo41226j()) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        int k = this.f59844d.mo41245k();
        if (k != -1 && k <= i5 + 1) {
            return false;
        }
        int a = this.f59844d.mo41235a(view);
        if (a > 0) {
            i4 += a;
        }
        if (i2 < i3 + i4) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m48547a(int i, int i2, C25245b bVar) {
        return i == i2 - 1 && bVar.mo41269a() != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo41272a(int i, int i2) {
        mo41273a(i, i2, 0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo41273a(int i, int i2, int i3) {
        int size;
        int t;
        int v;
        m48561e(this.f59844d.mo41234a());
        if (i3 < this.f59844d.mo41234a()) {
            int c = this.f59844d.mo41240c();
            int c2 = this.f59844d.mo41240c();
            if (c2 == 0 || c2 == 1) {
                int mode = View.MeasureSpec.getMode(i);
                size = View.MeasureSpec.getSize(i);
                int j = this.f59844d.mo41244j();
                if (mode != 1073741824 && j <= size) {
                    size = j;
                }
                t = this.f59844d.mo41263t();
                v = this.f59844d.mo41265v();
            } else if (c2 == 2 || c2 == 3) {
                int mode2 = View.MeasureSpec.getMode(i2);
                size = View.MeasureSpec.getSize(i2);
                if (mode2 != 1073741824) {
                    size = this.f59844d.mo41244j();
                }
                t = this.f59844d.mo41264u();
                v = this.f59844d.mo41266w();
            } else {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(c)));
            }
            int i4 = t + v;
            int[] iArr = this.f59842a;
            List<C25245b> l = this.f59844d.mo41246l();
            int size2 = l.size();
            for (int i5 = iArr != null ? iArr[i3] : 0; i5 < size2; i5++) {
                C25245b bVar = l.get(i5);
                if (bVar.f59827e < size && bVar.f59839q) {
                    m48545a(bVar, size, i4, false);
                } else if (bVar.f59827e > size && bVar.f59840r) {
                    m48555b(bVar, size, i4, false);
                }
            }
        }
    }

    /* renamed from: a */
    private void m48545a(C25245b bVar, int i, int i2, boolean z) {
        double d;
        double d2;
        int i3 = 1;
        while (bVar.f59832j > 0.0f && i >= bVar.f59827e) {
            int i4 = bVar.f59827e;
            float f = ((float) (i - bVar.f59827e)) / bVar.f59832j;
            bVar.f59827e = i2 + bVar.f59828f;
            if (!z) {
                bVar.f59829g = Integer.MIN_VALUE;
            }
            int i5 = 0;
            boolean z2 = false;
            int i6 = 0;
            float f2 = 0.0f;
            while (i5 < bVar.f59830h) {
                int i7 = bVar.f59837o + i5;
                View a = this.f59844d.mo4318a(i7);
                if (a != null && a.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) a.getLayoutParams();
                    int c = this.f59844d.mo41240c();
                    if (c == 0 || c == i3) {
                        int measuredWidth = a.getMeasuredWidth();
                        long[] jArr = this.f59846f;
                        if (jArr != null) {
                            measuredWidth = (int) jArr[i7];
                        }
                        int measuredHeight = a.getMeasuredHeight();
                        long[] jArr2 = this.f59846f;
                        if (jArr2 != null) {
                            measuredHeight = (int) (jArr2[i7] >> 32);
                        }
                        if (!this.f59845e[i7] && flexItem.mo41219c() > 0.0f) {
                            float c2 = ((float) measuredWidth) + (flexItem.mo41219c() * f);
                            if (i5 == bVar.f59830h - 1) {
                                c2 += f2;
                                f2 = 0.0f;
                            }
                            int round = Math.round(c2);
                            if (round > flexItem.mo41224h()) {
                                round = flexItem.mo41224h();
                                this.f59845e[i7] = true;
                                bVar.f59832j -= flexItem.mo41219c();
                                z2 = true;
                            } else {
                                f2 += c2 - ((float) round);
                                double d3 = (double) f2;
                                if (d3 > 1.0d) {
                                    round++;
                                    Double.isNaN(d3);
                                    d = d3 - 1.0d;
                                } else if (d3 < -1.0d) {
                                    round--;
                                    Double.isNaN(d3);
                                    d = d3 + 1.0d;
                                }
                                f2 = (float) d;
                            }
                            int b = m48550b(flexItem, bVar.f59835m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                            a.measure(makeMeasureSpec, b);
                            measuredWidth = a.getMeasuredWidth();
                            measuredHeight = a.getMeasuredHeight();
                            m48541a(i7, makeMeasureSpec, b, a);
                            this.f59844d.mo41236a(i7, a);
                        }
                        i6 = Math.max(i6, measuredHeight + flexItem.mo41229m() + flexItem.mo41231o() + this.f59844d.mo41239b(a));
                        bVar.f59827e += measuredWidth + flexItem.mo41228l() + flexItem.mo41230n();
                    } else {
                        int measuredHeight2 = a.getMeasuredHeight();
                        long[] jArr3 = this.f59846f;
                        if (jArr3 != null) {
                            measuredHeight2 = (int) (jArr3[i7] >> 32);
                        }
                        int measuredWidth2 = a.getMeasuredWidth();
                        long[] jArr4 = this.f59846f;
                        if (jArr4 != null) {
                            measuredWidth2 = (int) jArr4[i7];
                        }
                        if (!this.f59845e[i7] && flexItem.mo41219c() > 0.0f) {
                            float c3 = ((float) measuredHeight2) + (flexItem.mo41219c() * f);
                            if (i5 == bVar.f59830h - 1) {
                                c3 += f2;
                                f2 = 0.0f;
                            }
                            int round2 = Math.round(c3);
                            if (round2 > flexItem.mo41225i()) {
                                round2 = flexItem.mo41225i();
                                this.f59845e[i7] = true;
                                bVar.f59832j -= flexItem.mo41219c();
                                z2 = true;
                            } else {
                                f2 += c3 - ((float) round2);
                                double d4 = (double) f2;
                                if (d4 > 1.0d) {
                                    round2++;
                                    Double.isNaN(d4);
                                    d2 = d4 - 1.0d;
                                } else if (d4 < -1.0d) {
                                    round2--;
                                    Double.isNaN(d4);
                                    d2 = d4 + 1.0d;
                                }
                                f2 = (float) d2;
                            }
                            int a2 = m48538a(flexItem, bVar.f59835m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            a.measure(a2, makeMeasureSpec2);
                            measuredWidth2 = a.getMeasuredWidth();
                            measuredHeight2 = a.getMeasuredHeight();
                            m48541a(i7, a2, makeMeasureSpec2, a);
                            this.f59844d.mo41236a(i7, a);
                        }
                        i6 = Math.max(i6, measuredWidth2 + flexItem.mo41228l() + flexItem.mo41230n() + this.f59844d.mo41239b(a));
                        bVar.f59827e += measuredHeight2 + flexItem.mo41229m() + flexItem.mo41231o();
                    }
                    bVar.f59829g = Math.max(bVar.f59829g, i6);
                }
                i5++;
                i3 = 1;
            }
            if (z2 && i4 != bVar.f59827e) {
                i3 = 1;
                z = true;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo41270a() {
        mo41271a(0);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo41271a(int i) {
        View a;
        if (i < this.f59844d.mo41234a()) {
            int c = this.f59844d.mo41240c();
            if (this.f59844d.mo41242h() == 4) {
                int[] iArr = this.f59842a;
                List<C25245b> l = this.f59844d.mo41246l();
                int size = l.size();
                for (int i2 = iArr != null ? iArr[i] : 0; i2 < size; i2++) {
                    C25245b bVar = l.get(i2);
                    int i3 = bVar.f59830h;
                    for (int i4 = 0; i4 < i3; i4++) {
                        int i5 = bVar.f59837o + i4;
                        if (!(i4 >= this.f59844d.mo41234a() || (a = this.f59844d.mo4318a(i5)) == null || a.getVisibility() == 8)) {
                            FlexItem flexItem = (FlexItem) a.getLayoutParams();
                            if (flexItem.mo41221e() == -1 || flexItem.mo41221e() == 4) {
                                if (c == 0 || c == 1) {
                                    m48543a(a, bVar.f59829g, i5);
                                } else if (c == 2 || c == 3) {
                                    m48554b(a, bVar.f59829g, i5);
                                } else {
                                    throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(c)));
                                }
                            }
                        }
                    }
                }
                return;
            }
            for (C25245b bVar2 : this.f59844d.mo41246l()) {
                Iterator<Integer> it = bVar2.f59836n.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Integer next = it.next();
                        View a2 = this.f59844d.mo4318a(next.intValue());
                        if (c == 0 || c == 1) {
                            m48543a(a2, bVar2.f59829g, next.intValue());
                        } else if (c == 2 || c == 3) {
                            m48554b(a2, bVar2.f59829g, next.intValue());
                        } else {
                            throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(c)));
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo41274a(View view, C25245b bVar, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int h = this.f59844d.mo41242h();
        if (flexItem.mo41221e() != -1) {
            h = flexItem.mo41221e();
        }
        int i5 = bVar.f59829g;
        if (h != 0) {
            if (h != 1) {
                if (h == 2) {
                    int measuredHeight = (((i5 - view.getMeasuredHeight()) + flexItem.mo41229m()) - flexItem.mo41231o()) / 2;
                    if (this.f59844d.mo41241d() != 2) {
                        int i6 = i2 + measuredHeight;
                        view.layout(i, i6, i3, view.getMeasuredHeight() + i6);
                        return;
                    }
                    int i7 = i2 - measuredHeight;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                } else if (h != 3) {
                    if (h != 4) {
                        return;
                    }
                } else if (this.f59844d.mo41241d() != 2) {
                    int max = Math.max(bVar.f59834l - view.getBaseline(), flexItem.mo41229m());
                    view.layout(i, i2 + max, i3, i4 + max);
                    return;
                } else {
                    int max2 = Math.max((bVar.f59834l - view.getMeasuredHeight()) + view.getBaseline(), flexItem.mo41231o());
                    view.layout(i, i2 - max2, i3, i4 - max2);
                    return;
                }
            } else if (this.f59844d.mo41241d() != 2) {
                int i8 = i2 + i5;
                view.layout(i, (i8 - view.getMeasuredHeight()) - flexItem.mo41231o(), i3, i8 - flexItem.mo41231o());
                return;
            } else {
                view.layout(i, (i2 - i5) + view.getMeasuredHeight() + flexItem.mo41229m(), i3, (i4 - i5) + view.getMeasuredHeight() + flexItem.mo41229m());
                return;
            }
        }
        if (this.f59844d.mo41241d() != 2) {
            view.layout(i, i2 + flexItem.mo41229m(), i3, i4 + flexItem.mo41229m());
        } else {
            view.layout(i, i2 - flexItem.mo41231o(), i3, i4 - flexItem.mo41231o());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo41275a(View view, C25245b bVar, boolean z, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int h = this.f59844d.mo41242h();
        if (flexItem.mo41221e() != -1) {
            h = flexItem.mo41221e();
        }
        int i5 = bVar.f59829g;
        if (h != 0) {
            if (h != 1) {
                if (h == 2) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int measuredWidth = (((i5 - view.getMeasuredWidth()) + C0778h.m2702a(marginLayoutParams)) - C0778h.m2704b(marginLayoutParams)) / 2;
                    if (!z) {
                        view.layout(i + measuredWidth, i2, i3 + measuredWidth, i4);
                        return;
                    } else {
                        view.layout(i - measuredWidth, i2, i3 - measuredWidth, i4);
                        return;
                    }
                } else if (!(h == 3 || h == 4)) {
                    return;
                }
            } else if (!z) {
                view.layout(((i + i5) - view.getMeasuredWidth()) - flexItem.mo41230n(), i2, ((i3 + i5) - view.getMeasuredWidth()) - flexItem.mo41230n(), i4);
                return;
            } else {
                view.layout((i - i5) + view.getMeasuredWidth() + flexItem.mo41228l(), i2, (i3 - i5) + view.getMeasuredWidth() + flexItem.mo41228l(), i4);
                return;
            }
        }
        if (!z) {
            view.layout(i + flexItem.mo41228l(), i2, i3 + flexItem.mo41228l(), i4);
        } else {
            view.layout(i - flexItem.mo41230n(), i2, i3 - flexItem.mo41230n(), i4);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo41278a(List<C25245b> list, int i) {
        if (!f59841c) {
            if (this.f59842a == null) {
                throw new AssertionError();
            } else if (this.f59843b == null) {
                throw new AssertionError();
            }
        }
        int i2 = this.f59842a[i];
        if (i2 == -1) {
            i2 = 0;
        }
        for (int size = list.size() - 1; size >= i2; size--) {
            list.remove(size);
        }
        int[] iArr = this.f59842a;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.f59843b;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i, length2, 0L);
        }
    }

    static {
        Covode.recordClassIndex(30618);
    }

    C25246c(AbstractC25244a aVar) {
        this.f59844d = aVar;
    }

    /* renamed from: c */
    private int m48557c(boolean z) {
        if (z) {
            return this.f59844d.mo41264u();
        }
        return this.f59844d.mo41267x();
    }

    /* renamed from: d */
    private int m48559d(boolean z) {
        if (z) {
            return this.f59844d.mo41266w();
        }
        return this.f59844d.mo41268y();
    }

    /* renamed from: a */
    private int m48540a(boolean z) {
        if (z) {
            return this.f59844d.mo41267x();
        }
        return this.f59844d.mo41264u();
    }

    /* renamed from: b */
    private int m48552b(boolean z) {
        if (z) {
            return this.f59844d.mo41268y();
        }
        return this.f59844d.mo41266w();
    }

    /* renamed from: e */
    private void m48561e(int i) {
        boolean[] zArr = this.f59845e;
        if (zArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.f59845e = new boolean[i];
        } else if (zArr.length < i) {
            int length = zArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.f59845e = new boolean[i];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo41281c(int i) {
        long[] jArr = this.f59843b;
        if (jArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.f59843b = new long[i];
        } else if (jArr.length < i) {
            int length = jArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.f59843b = Arrays.copyOf(jArr, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo41283d(int i) {
        int[] iArr = this.f59842a;
        if (iArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.f59842a = new int[i];
        } else if (iArr.length < i) {
            int length = iArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.f59842a = Arrays.copyOf(iArr, i);
        }
    }

    /* renamed from: a */
    private static void m48544a(CompoundButton compoundButton) {
        int minimumWidth;
        FlexItem flexItem = (FlexItem) compoundButton.getLayoutParams();
        int f = flexItem.mo41222f();
        int g = flexItem.mo41223g();
        Drawable a = C0818c.m2886a(compoundButton);
        int i = 0;
        if (a == null) {
            minimumWidth = 0;
        } else {
            minimumWidth = a.getMinimumWidth();
            i = a.getMinimumHeight();
        }
        if (f == -1) {
            f = minimumWidth;
        }
        flexItem.mo41216a(f);
        if (g == -1) {
            g = i;
        }
        flexItem.mo41218b(g);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo41279b(int i) {
        long[] jArr = this.f59846f;
        if (jArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.f59846f = new long[i];
        } else if (jArr.length < i) {
            int length = jArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.f59846f = Arrays.copyOf(jArr, i);
        }
    }

    /* renamed from: a */
    private static int m48537a(View view, boolean z) {
        if (z) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    /* renamed from: b */
    private static int m48549b(View view, boolean z) {
        if (z) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    /* renamed from: c */
    private static int m48556c(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo41228l();
        }
        return flexItem.mo41229m();
    }

    /* renamed from: d */
    private static int m48558d(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo41230n();
        }
        return flexItem.mo41231o();
    }

    /* renamed from: e */
    private static int m48560e(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo41229m();
        }
        return flexItem.mo41228l();
    }

    /* renamed from: f */
    private static int m48562f(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo41231o();
        }
        return flexItem.mo41230n();
    }

    /* renamed from: a */
    private static int m48539a(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo41215a();
        }
        return flexItem.mo41217b();
    }

    /* renamed from: b */
    private static int m48551b(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo41217b();
        }
        return flexItem.mo41215a();
    }

    /* renamed from: a */
    private int m48538a(FlexItem flexItem, int i) {
        AbstractC25244a aVar = this.f59844d;
        int a = aVar.mo4347a(aVar.mo41263t() + this.f59844d.mo41265v() + flexItem.mo41228l() + flexItem.mo41230n() + i, flexItem.mo41215a());
        int size = View.MeasureSpec.getSize(a);
        if (size > flexItem.mo41224h()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.mo41224h(), View.MeasureSpec.getMode(a));
        }
        if (size < flexItem.mo41222f()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.mo41222f(), View.MeasureSpec.getMode(a));
        }
        return a;
    }

    /* renamed from: b */
    private int m48550b(FlexItem flexItem, int i) {
        AbstractC25244a aVar = this.f59844d;
        int b = aVar.mo41238b(aVar.mo41264u() + this.f59844d.mo41266w() + flexItem.mo41229m() + flexItem.mo41231o() + i, flexItem.mo41217b());
        int size = View.MeasureSpec.getSize(b);
        if (size > flexItem.mo41225i()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.mo41225i(), View.MeasureSpec.getMode(b));
        }
        if (size < flexItem.mo41223g()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.mo41223g(), View.MeasureSpec.getMode(b));
        }
        return b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m48542a(android.view.View r6, int r7) {
        /*
            r5 = this;
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            com.google.android.flexbox.FlexItem r4 = (com.google.android.flexbox.FlexItem) r4
            int r3 = r6.getMeasuredWidth()
            int r2 = r6.getMeasuredHeight()
            int r1 = r4.mo41222f()
            r0 = 1
            if (r3 >= r1) goto L_0x0048
            int r3 = r4.mo41222f()
        L_0x0019:
            r1 = 1
        L_0x001a:
            int r0 = r4.mo41223g()
            if (r2 >= r0) goto L_0x003a
            int r2 = r4.mo41223g()
        L_0x0024:
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r6.measure(r1, r0)
            r5.m48541a(r7, r1, r0, r6)
            com.google.android.flexbox.a r0 = r5.f59844d
            r0.mo41236a(r7, r6)
        L_0x0039:
            return
        L_0x003a:
            int r0 = r4.mo41225i()
            if (r2 <= r0) goto L_0x0045
            int r2 = r4.mo41225i()
            goto L_0x0024
        L_0x0045:
            if (r1 == 0) goto L_0x0039
            goto L_0x0024
        L_0x0048:
            int r0 = r4.mo41224h()
            if (r3 <= r0) goto L_0x0053
            int r3 = r4.mo41224h()
            goto L_0x0019
        L_0x0053:
            r1 = 0
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.C25246c.m48542a(android.view.View, int):void");
    }

    /* renamed from: b */
    private void m48554b(View view, int i, int i2) {
        int measuredHeight;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i - flexItem.mo41228l()) - flexItem.mo41230n()) - this.f59844d.mo41239b(view), flexItem.mo41222f()), flexItem.mo41224h());
        long[] jArr = this.f59846f;
        if (jArr != null) {
            measuredHeight = (int) (jArr[i2] >> 32);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        m48541a(i2, makeMeasureSpec2, makeMeasureSpec, view);
        this.f59844d.mo41236a(i2, view);
    }

    /* renamed from: a */
    private void m48543a(View view, int i, int i2) {
        int measuredWidth;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i - flexItem.mo41229m()) - flexItem.mo41231o()) - this.f59844d.mo41239b(view), flexItem.mo41223g()), flexItem.mo41225i());
        long[] jArr = this.f59846f;
        if (jArr != null) {
            measuredWidth = (int) jArr[i2];
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        m48541a(i2, makeMeasureSpec, makeMeasureSpec2, view);
        this.f59844d.mo41236a(i2, view);
    }

    /* renamed from: a */
    private static void m48546a(List<C25245b> list, C25245b bVar, int i, int i2) {
        bVar.f59835m = i2;
        bVar.f59838p = i;
        list.add(bVar);
    }

    /* renamed from: a */
    private void m48541a(int i, int i2, int i3, View view) {
        long[] jArr = this.f59843b;
        if (jArr != null) {
            jArr[i] = m48553b(i2, i3);
        }
        long[] jArr2 = this.f59846f;
        if (jArr2 != null) {
            jArr2[i] = m48553b(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    /* renamed from: b */
    private void m48555b(C25245b bVar, int i, int i2, boolean z) {
        int i3 = 1;
        while (true) {
            int i4 = bVar.f59827e;
            if (bVar.f59833k > 0.0f && i <= bVar.f59827e) {
                float f = ((float) (bVar.f59827e - i)) / bVar.f59833k;
                bVar.f59827e = i2 + bVar.f59828f;
                if (!z) {
                    bVar.f59829g = Integer.MIN_VALUE;
                }
                int i5 = 0;
                boolean z2 = false;
                int i6 = 0;
                float f2 = 0.0f;
                while (i5 < bVar.f59830h) {
                    int i7 = bVar.f59837o + i5;
                    View a = this.f59844d.mo4318a(i7);
                    if (a != null && a.getVisibility() != 8) {
                        FlexItem flexItem = (FlexItem) a.getLayoutParams();
                        int c = this.f59844d.mo41240c();
                        if (c == 0 || c == i3) {
                            int measuredWidth = a.getMeasuredWidth();
                            long[] jArr = this.f59846f;
                            if (jArr != null) {
                                measuredWidth = (int) jArr[i7];
                            }
                            int measuredHeight = a.getMeasuredHeight();
                            long[] jArr2 = this.f59846f;
                            if (jArr2 != null) {
                                measuredHeight = (int) (jArr2[i7] >> 32);
                            }
                            if (!this.f59845e[i7] && flexItem.mo41220d() > 0.0f) {
                                float d = ((float) measuredWidth) - (flexItem.mo41220d() * f);
                                if (i5 == bVar.f59830h - 1) {
                                    d += f2;
                                    f2 = 0.0f;
                                }
                                int round = Math.round(d);
                                if (round < flexItem.mo41222f()) {
                                    round = flexItem.mo41222f();
                                    this.f59845e[i7] = true;
                                    bVar.f59833k -= flexItem.mo41220d();
                                    z2 = true;
                                } else {
                                    f2 += d - ((float) round);
                                    double d2 = (double) f2;
                                    if (d2 > 1.0d) {
                                        round++;
                                        f2 -= 1.0f;
                                    } else if (d2 < -1.0d) {
                                        round--;
                                        f2 += 1.0f;
                                    }
                                }
                                int b = m48550b(flexItem, bVar.f59835m);
                                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                                a.measure(makeMeasureSpec, b);
                                measuredWidth = a.getMeasuredWidth();
                                measuredHeight = a.getMeasuredHeight();
                                m48541a(i7, makeMeasureSpec, b, a);
                                this.f59844d.mo41236a(i7, a);
                            }
                            i6 = Math.max(i6, measuredHeight + flexItem.mo41229m() + flexItem.mo41231o() + this.f59844d.mo41239b(a));
                            bVar.f59827e += measuredWidth + flexItem.mo41228l() + flexItem.mo41230n();
                        } else {
                            int measuredHeight2 = a.getMeasuredHeight();
                            long[] jArr3 = this.f59846f;
                            if (jArr3 != null) {
                                measuredHeight2 = (int) (jArr3[i7] >> 32);
                            }
                            int measuredWidth2 = a.getMeasuredWidth();
                            long[] jArr4 = this.f59846f;
                            if (jArr4 != null) {
                                measuredWidth2 = (int) jArr4[i7];
                            }
                            if (!this.f59845e[i7] && flexItem.mo41220d() > 0.0f) {
                                float d3 = ((float) measuredHeight2) - (flexItem.mo41220d() * f);
                                if (i5 == bVar.f59830h - 1) {
                                    d3 += f2;
                                    f2 = 0.0f;
                                }
                                int round2 = Math.round(d3);
                                if (round2 < flexItem.mo41223g()) {
                                    round2 = flexItem.mo41223g();
                                    this.f59845e[i7] = true;
                                    bVar.f59833k -= flexItem.mo41220d();
                                    z2 = true;
                                } else {
                                    f2 += d3 - ((float) round2);
                                    double d4 = (double) f2;
                                    if (d4 > 1.0d) {
                                        round2++;
                                        f2 -= 1.0f;
                                    } else if (d4 < -1.0d) {
                                        round2--;
                                        f2 += 1.0f;
                                    }
                                }
                                int a2 = m48538a(flexItem, bVar.f59835m);
                                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                                a.measure(a2, makeMeasureSpec2);
                                measuredWidth2 = a.getMeasuredWidth();
                                measuredHeight2 = a.getMeasuredHeight();
                                m48541a(i7, a2, makeMeasureSpec2, a);
                                this.f59844d.mo41236a(i7, a);
                            }
                            i6 = Math.max(i6, measuredWidth2 + flexItem.mo41228l() + flexItem.mo41230n() + this.f59844d.mo41239b(a));
                            bVar.f59827e += measuredHeight2 + flexItem.mo41229m() + flexItem.mo41231o();
                        }
                        bVar.f59829g = Math.max(bVar.f59829g, i6);
                    }
                    i5++;
                    i3 = 1;
                }
                if (z2 && i4 != bVar.f59827e) {
                    i3 = 1;
                    z = true;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo41282c(C25247a aVar, int i, int i2, int i3, List<C25245b> list) {
        mo41276a(aVar, i, i2, i3, -1, list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo41284d(C25247a aVar, int i, int i2, int i3, List<C25245b> list) {
        mo41276a(aVar, i, i2, 0, i3, list);
    }
}
