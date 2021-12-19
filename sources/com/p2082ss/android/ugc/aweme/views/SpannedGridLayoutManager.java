package com.p2082ss.android.ugc.aweme.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1481r;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.views.SpannedGridLayoutManager */
public class SpannedGridLayoutManager extends RecyclerView.AbstractC1362i {

    /* renamed from: a */
    public AbstractC81418b f181932a;

    /* renamed from: b */
    public int f181933b;

    /* renamed from: c */
    public int f181934c;

    /* renamed from: d */
    public int f181935d;

    /* renamed from: e */
    public int f181936e;

    /* renamed from: f */
    public int f181937f;

    /* renamed from: g */
    private float f181938g;

    /* renamed from: h */
    private int[] f181939h;

    /* renamed from: i */
    private int f181940i;

    /* renamed from: j */
    private boolean f181941j;

    /* renamed from: k */
    private SparseArray<C81417a> f181942k;

    /* renamed from: l */
    private List<Integer> f181943l;

    /* renamed from: m */
    private int f181944m;

    /* renamed from: n */
    private final Rect f181945n;

    /* renamed from: com.ss.android.ugc.aweme.views.SpannedGridLayoutManager$b */
    public interface AbstractC81418b {
        static {
            Covode.recordClassIndex(94778);
        }

        /* renamed from: a */
        C81420d mo62653a(int i);

        /* renamed from: a */
        boolean mo62654a();
    }

    static {
        Covode.recordClassIndex(94775);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: g */
    public final boolean mo4368g() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: x_ */
    public final boolean mo4340x_() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4354a(RecyclerView recyclerView, RecyclerView.C1378s sVar, int i) {
        if (i >= mo4685A()) {
            i = mo4685A() - 1;
        }
        C814161 r1 = new C1481r(recyclerView.getContext()) {
            /* class com.p2082ss.android.ugc.aweme.views.SpannedGridLayoutManager.C814161 */

            static {
                Covode.recordClassIndex(94776);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1375r
            /* renamed from: c */
            public final PointF mo4778c(int i) {
                return new PointF(0.0f, (float) ((SpannedGridLayoutManager.this.mo4318a(i) - SpannedGridLayoutManager.this.f181937f) * SpannedGridLayoutManager.this.f181934c));
            }
        };
        r1.f4515g = i;
        mo4695a(r1);
    }

    /* renamed from: com.ss.android.ugc.aweme.views.SpannedGridLayoutManager$c */
    public static class C81419c extends RecyclerView.C1367j {

        /* renamed from: a */
        int f181951a;

        /* renamed from: b */
        int f181952b;

        static {
            Covode.recordClassIndex(94779);
        }

        public C81419c() {
            super(-2, -2);
        }

        public C81419c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C81419c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C81419c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* renamed from: h */
    private int m141152h() {
        return this.f181943l.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: b */
    public final RecyclerView.C1367j mo4334b() {
        return new C81419c();
    }

    /* renamed from: com.ss.android.ugc.aweme.views.SpannedGridLayoutManager$d */
    public static class C81420d {

        /* renamed from: c */
        public static final C81420d f181953c = new C81420d(1, 1);

        /* renamed from: a */
        public int f181954a;

        /* renamed from: b */
        public int f181955b;

        static {
            Covode.recordClassIndex(94780);
        }

        public C81420d(int i, int i2) {
            this.f181954a = i;
            this.f181955b = i2;
        }
    }

    /* renamed from: i */
    private void m141153i() {
        int k = m141154k();
        if (this.f181937f > k) {
            this.f181937f = k;
        }
        int f = m141151f(this.f181937f);
        this.f181935d = f;
        this.f181940i = this.f181937f;
        this.f181936e = f;
    }

    /* renamed from: k */
    private int m141154k() {
        int ceil = ((int) Math.ceil((double) (((float) this.f4486K) / ((float) this.f181934c)))) + 1;
        int i = this.f181944m;
        if (i < ceil) {
            return 0;
        }
        return mo4318a(m141151f(i - ceil));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final boolean mo4330a(RecyclerView.C1367j jVar) {
        return jVar instanceof C81419c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: g */
    public final int mo4367g(RecyclerView.C1378s sVar) {
        return this.f4486K;
    }

    /* renamed from: f */
    private int m141151f(int i) {
        return this.f181943l.get(i).intValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: c */
    public final View mo4358c(int i) {
        int i2 = this.f181935d;
        if (i < i2 || i > this.f181936e) {
            return null;
        }
        return mo4717g(i - i2);
    }

    public SpannedGridLayoutManager(AbstractC81418b bVar) {
        this.f181933b = 1;
        this.f181938g = 1.0f;
        this.f181945n = new Rect();
        this.f181933b = 3;
        this.f181938g = 0.75f;
        this.f181932a = bVar;
        this.f4478C = true;
    }

    /* renamed from: d */
    private int m141150d(int i) {
        int f = m141151f(i);
        do {
            i++;
            if (i >= m141152h()) {
                break;
            }
        } while (m141151f(i) == f);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: c */
    public final int mo4336c(RecyclerView.C1378s sVar) {
        return (m141152h() * this.f181934c) + mo4732u() + mo4734w();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: e */
    public final int mo4339e(RecyclerView.C1378s sVar) {
        if (mo4730s() == 0) {
            return 0;
        }
        return (mo4732u() + (this.f181937f * this.f181934c)) - m4432p(mo4717g(0));
    }

    /* renamed from: b */
    private C81420d m141148b(int i) {
        for (int i2 = 0; i2 < mo4730s(); i2++) {
            View g = mo4717g(i2);
            if (i == m4426e(g)) {
                C81419c cVar = (C81419c) g.getLayoutParams();
                return new C81420d(cVar.f181951a, cVar.f181952b);
            }
        }
        return C81420d.f181953c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: e */
    public final void mo4363e(int i) {
        if (i >= mo4685A()) {
            i = mo4685A() - 1;
        }
        this.f181937f = mo4318a(i);
        m141153i();
        this.f181941j = true;
        mo4729r();
        mo4726o();
    }

    /* renamed from: a */
    public final int mo4318a(int i) {
        if (i < this.f181942k.size()) {
            return this.f181942k.get(i).f181947a;
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final RecyclerView.C1367j mo4317a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C81419c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C81419c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final RecyclerView.C1367j mo4316a(Context context, AttributeSet attributeSet) {
        return new C81419c(context, attributeSet);
    }

    /* renamed from: a */
    private int m141144a(int i, RecyclerView.C1378s sVar) {
        int a;
        int d = m141150d(i);
        if (d != m141152h()) {
            a = m141151f(d);
        } else {
            a = sVar.mo4782a();
        }
        return a - 1;
    }

    /* renamed from: a */
    private void m141145a(int i, int i2) {
        if (m141152h() < i + 1) {
            this.f181943l.add(Integer.valueOf(i2));
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
        */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00b4 A[EDGE_INSN: B:71:0x00b4->B:28:0x00b4 ?: BREAK  , SYNTHETIC] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: c */
    public final void mo4337c(androidx.recyclerview.widget.RecyclerView.C1372o r17, androidx.recyclerview.widget.RecyclerView.C1378s r18) {
        /*
        // Method dump skipped, instructions count: 374
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.views.SpannedGridLayoutManager.mo4337c(androidx.recyclerview.widget.RecyclerView$o, androidx.recyclerview.widget.RecyclerView$s):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4692a(RecyclerView.AbstractC1350a aVar, RecyclerView.AbstractC1350a aVar2) {
        mo4729r();
        this.f181942k = null;
        this.f181943l = null;
        this.f181935d = 0;
        this.f181937f = 0;
        this.f181936e = 0;
        this.f181940i = 0;
        this.f181934c = 0;
        this.f181941j = false;
    }

    /* renamed from: b */
    private static int m141147b(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i) - i2) - i3, mode);
        }
        return i;
    }

    /* renamed from: c */
    private void m141149c(int i, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        int f = m141151f(i);
        int a = m141144a(i, sVar);
        for (int i2 = a; i2 >= f; i2--) {
            mo4687a(i2 - this.f181935d, oVar);
        }
        if (i == this.f181937f) {
            int i3 = a + 1;
            this.f181935d = i3;
            this.f181937f = mo4318a(i3);
        }
        if (i == this.f181940i) {
            int i4 = f - 1;
            this.f181936e = i4;
            this.f181940i = mo4318a(i4);
        }
    }

    /* renamed from: a */
    private void m141146a(View view, int i, int i2) {
        mo4703b(view, this.f181945n);
        RecyclerView.C1367j jVar = (RecyclerView.C1367j) view.getLayoutParams();
        view.measure(m141147b(i, jVar.leftMargin + this.f181945n.left, jVar.rightMargin + this.f181945n.right), m141147b(i2, jVar.topMargin + this.f181945n.top, jVar.bottomMargin + this.f181945n.bottom));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: b */
    public final int mo4331b(int i, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        int i2;
        int i3;
        int i4;
        if (mo4730s() == 0 || i == 0) {
            return 0;
        }
        int p = m4432p(mo4717g(0));
        if (i < 0) {
            if (this.f181937f == 0) {
                i = Math.max(i, -(mo4732u() - p));
            }
            if (p - i >= 0 && (i3 = this.f181937f) - 1 >= 0) {
                m141143a(i4, p - (i3 * this.f181934c), oVar, sVar);
            }
            if (m4432p(mo4717g(m141151f(this.f181940i) - this.f181935d)) - i > this.f4486K) {
                m141149c(this.f181940i, oVar, sVar);
            }
        } else {
            int r = m4434r(mo4717g(mo4730s() - 1));
            if (this.f181936e == mo4685A() - 1) {
                i = Math.min(i, Math.max((r - this.f4486K) + mo4734w(), 0));
            }
            if (r - i < this.f4486K && (i2 = this.f181940i + 1) < m141152h()) {
                m141143a(i2, p - (this.f181937f * this.f181934c), oVar, sVar);
            }
            if (m4434r(mo4717g(m141144a(this.f181937f, sVar) - this.f181935d)) - i < 0) {
                m141149c(this.f181937f, oVar, sVar);
            }
        }
        mo4721i(-i);
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.views.SpannedGridLayoutManager$a */
    public static class C81417a {

        /* renamed from: a */
        final int f181947a;

        /* renamed from: b */
        final int f181948b;

        /* renamed from: c */
        final int f181949c;

        /* renamed from: d */
        final int f181950d;

        static {
            Covode.recordClassIndex(94777);
        }

        C81417a(int i, int i2, int i3, int i4) {
            this.f181947a = i;
            this.f181948b = i2;
            this.f181949c = i3;
            this.f181950d = i4;
        }
    }

    public SpannedGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        int indexOf;
        this.f181933b = 1;
        this.f181938g = 1.0f;
        this.f181945n = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.in, R.attr.acx}, i, i2);
        this.f181933b = obtainStyledAttributes.getInt(1, 1);
        String string = obtainStyledAttributes.getString(0);
        if (string != null && (indexOf = string.indexOf(58)) >= 0 && indexOf < string.length() - 1) {
            String substring = string.substring(0, indexOf);
            String substring2 = string.substring(indexOf + 1);
            if (substring.length() > 0 && substring2.length() > 0) {
                try {
                    float parseFloat = Float.parseFloat(substring);
                    float parseFloat2 = Float.parseFloat(substring2);
                    if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                        this.f181938g = Math.abs(parseFloat / parseFloat2);
                        obtainStyledAttributes.recycle();
                        this.f4478C = true;
                        return;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        throw new IllegalArgumentException("Could not parse aspect ratio: '" + string + "'");
    }

    /* renamed from: a */
    private int m141143a(int i, int i2, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        int s;
        int a;
        int i3;
        int i4;
        int f = m141151f(i);
        int a2 = m141144a(i, sVar);
        if (i < this.f181937f) {
            s = 0;
        } else {
            s = mo4730s();
        }
        int i5 = f;
        boolean z = false;
        while (i5 <= a2) {
            View c = oVar.mo4766c(i5);
            C81419c cVar = (C81419c) c.getLayoutParams();
            z |= cVar.f4500c.isRemoved();
            C81417a aVar = this.f181942k.get(i5);
            mo4688a(c, s);
            if (!this.f181932a.mo62654a()) {
                a = m4414a(this.f181939h[aVar.f181949c + aVar.f181950d] - this.f181939h[aVar.f181949c], 1073741824, 0, cVar.width, false);
            } else {
                a = m4414a(this.f181939h[aVar.f181949c] - this.f181939h[aVar.f181949c - aVar.f181950d], 1073741824, 0, cVar.width, false);
            }
            m141146a(c, a, m4414a(aVar.f181948b * this.f181934c, 1073741824, 0, cVar.height, true));
            if (!this.f181932a.mo62654a()) {
                i3 = this.f181939h[aVar.f181949c];
                i4 = cVar.leftMargin;
            } else {
                i3 = this.f181939h[aVar.f181949c - aVar.f181950d];
                i4 = cVar.leftMargin;
            }
            int i6 = i3 + i4;
            int i7 = i2 + (aVar.f181947a * this.f181934c) + cVar.topMargin;
            m4418a(c, i6, i7, m4429m(c) + i6, m4430n(c) + i7);
            cVar.f181951a = aVar.f181950d;
            cVar.f181952b = aVar.f181948b;
            i5++;
            s++;
        }
        if (f < this.f181935d) {
            this.f181935d = f;
            this.f181937f = mo4318a(f);
        }
        if (a2 > this.f181936e) {
            this.f181936e = a2;
            this.f181940i = mo4318a(a2);
        }
        if (z) {
            return 0;
        }
        C81417a aVar2 = this.f181942k.get(a2);
        return ((aVar2.f181947a + aVar2.f181948b) - this.f181942k.get(f).f181947a) * this.f181934c;
    }
}
