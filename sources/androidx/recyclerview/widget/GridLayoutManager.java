package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p037h.C0792v;
import androidx.core.p037h.p038a.C0733d;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;

public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    boolean f4315a;

    /* renamed from: b */
    public int f4316b = -1;

    /* renamed from: c */
    int[] f4317c;

    /* renamed from: d */
    View[] f4318d;

    /* renamed from: e */
    final SparseIntArray f4319e = new SparseIntArray();

    /* renamed from: f */
    final SparseIntArray f4320f = new SparseIntArray();

    /* renamed from: g */
    public AbstractC1337c f4321g = new C1335a();

    /* renamed from: h */
    final Rect f4322h = new Rect();

    /* renamed from: i */
    public boolean f4323i;

    static {
        Covode.recordClassIndex(1461);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: a */
    public final void mo4329a(boolean z) {
        if (!z) {
            super.mo4329a(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4321a(RecyclerView.C1372o oVar, RecyclerView.C1378s sVar, View view, C0733d dVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1336b)) {
            super.mo4690a(view, dVar);
            return;
        }
        C1336b bVar = (C1336b) layoutParams;
        int a = m4116a(oVar, sVar, bVar.f4500c.getLayoutPosition());
        if (this.f4334j == 0) {
            dVar.mo2835a(C0733d.C0736c.m2623a(bVar.f4324a, bVar.f4325b, a, 1));
        } else {
            dVar.mo2835a(C0733d.C0736c.m2623a(a, 1, bVar.f4324a, bVar.f4325b));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public void mo4324a(RecyclerView.C1378s sVar) {
        super.mo4324a(sVar);
        this.f4315a = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4326a(RecyclerView recyclerView, int i, int i2) {
        this.f4321g.f4326a.clear();
        this.f4321g.f4327b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4328a(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f4321g.f4326a.clear();
        this.f4321g.f4327b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4327a(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f4321g.f4326a.clear();
        this.f4321g.f4327b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final RecyclerView.C1367j mo4317a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C1336b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C1336b(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final boolean mo4330a(RecyclerView.C1367j jVar) {
        return jVar instanceof C1336b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final void mo4319a(Rect rect, int i, int i2) {
        int a;
        int a2;
        if (this.f4317c == null) {
            super.mo4319a(rect, i, i2);
        }
        int t = mo4731t() + mo4733v();
        int u = mo4732u() + mo4734w();
        if (this.f4334j == 1) {
            a2 = m4413a(i2, rect.height() + u, C0792v.m2775i(this.f4490w));
            int[] iArr = this.f4317c;
            a = m4413a(i, iArr[iArr.length - 1] + t, C0792v.m2774h(this.f4490w));
        } else {
            a = m4413a(i, rect.width() + t, C0792v.m2774h(this.f4490w));
            int[] iArr2 = this.f4317c;
            a2 = m4413a(i2, iArr2[iArr2.length - 1] + u, C0792v.m2775i(this.f4490w));
        }
        mo4714d(a, a2);
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: a */
    public final void mo4322a(RecyclerView.C1372o oVar, RecyclerView.C1378s sVar, LinearLayoutManager.C1339a aVar, int i) {
        boolean z;
        super.mo4322a(oVar, sVar, aVar, i);
        m4114C();
        if (sVar.mo4782a() > 0 && !sVar.f4535g) {
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            int b = m4121b(oVar, sVar, aVar.f4350b);
            if (z) {
                while (b > 0 && aVar.f4350b > 0) {
                    aVar.f4350b--;
                    b = m4121b(oVar, sVar, aVar.f4350b);
                }
            } else {
                int a = sVar.mo4782a() - 1;
                int i2 = aVar.f4350b;
                while (i2 < a) {
                    int i3 = i2 + 1;
                    int b2 = m4121b(oVar, sVar, i3);
                    if (b2 <= b) {
                        break;
                    }
                    i2 = i3;
                    b = b2;
                }
                aVar.f4350b = i2;
            }
        }
        m4115D();
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: a */
    public final View mo4315a(RecyclerView.C1372o oVar, RecyclerView.C1378s sVar, boolean z, boolean z2) {
        int i;
        int s = mo4730s();
        int i2 = -1;
        int i3 = 1;
        if (z2) {
            i = mo4730s() - 1;
            i3 = -1;
        } else {
            i2 = s;
            i = 0;
        }
        int a = sVar.mo4782a();
        mo4370i();
        int b = this.f4335k.mo5023b();
        int c = this.f4335k.mo5025c();
        View view = null;
        View view2 = null;
        while (i != i2) {
            View g = mo4717g(i);
            int e = m4426e(g);
            if (e >= 0 && e < a && m4121b(oVar, sVar, e) == 0) {
                if (((RecyclerView.C1367j) g.getLayoutParams()).f4500c.isRemoved()) {
                    if (view2 == null) {
                        view2 = g;
                    }
                } else if (this.f4335k.mo5021a(g) < c && this.f4335k.mo5024b(g) >= b) {
                    return g;
                } else {
                    if (view == null) {
                        view = g;
                    }
                }
            }
            i += i3;
        }
        return view != null ? view : view2;
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: a */
    public final void mo4325a(RecyclerView.C1378s sVar, LinearLayoutManager.C1341c cVar, RecyclerView.AbstractC1362i.AbstractC1365a aVar) {
        int i = this.f4316b;
        for (int i2 = 0; i2 < this.f4316b && cVar.mo4390a(sVar) && i > 0; i2++) {
            int i3 = cVar.f4361d;
            aVar.mo4743a(i3, Math.max(0, cVar.f4364g));
            i -= this.f4321g.mo4342a(i3);
            cVar.f4361d += cVar.f4362e;
        }
    }

    /* access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: a */
    public final void mo4323a(RecyclerView.C1372o oVar, RecyclerView.C1378s sVar, LinearLayoutManager.C1341c cVar, LinearLayoutManager.C1340b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int makeMeasureSpec;
        int a;
        View a2;
        int h = this.f4335k.mo5034h();
        boolean z = false;
        boolean z2 = h != 1073741824;
        int i5 = mo4730s() > 0 ? this.f4317c[this.f4316b] : 0;
        if (z2) {
            m4114C();
        }
        boolean z3 = cVar.f4362e == 1;
        int i6 = this.f4316b;
        if (!z3) {
            i6 = m4121b(oVar, sVar, cVar.f4361d) + m4122c(oVar, sVar, cVar.f4361d);
        }
        int i7 = 0;
        while (i7 < this.f4316b && cVar.mo4390a(sVar) && i6 > 0) {
            int i8 = cVar.f4361d;
            int c = m4122c(oVar, sVar, i8);
            if (c <= this.f4316b) {
                i6 -= c;
                if (i6 < 0 || (a2 = cVar.mo4388a(oVar)) == null) {
                    break;
                }
                this.f4318d[i7] = a2;
                i7++;
            } else {
                throw new IllegalArgumentException("Item at position " + i8 + " requires " + c + " spans but GridLayoutManager has only " + this.f4316b + " spans.");
            }
        }
        if (i7 == 0) {
            bVar.f4355b = true;
            return;
        }
        float f = 0.0f;
        m4119a(oVar, sVar, i7, z3);
        int i9 = 0;
        int i10 = 0;
        while (i9 < i7) {
            View view = this.f4318d[i9];
            if (cVar.f4369l == null) {
                if (z3) {
                    mo4710c(view);
                } else {
                    int i11 = z ? 1 : 0;
                    int i12 = z ? 1 : 0;
                    int i13 = z ? 1 : 0;
                    mo4688a(view, i11);
                }
            } else if (z3) {
                mo4701a_(view);
            } else {
                mo4708b_(view);
            }
            mo4703b(view, this.f4322h);
            m4118a(view, h, z);
            int e = this.f4335k.mo5030e(view);
            if (e > i10) {
                i10 = e;
            }
            float f2 = (((float) this.f4335k.mo5032f(view)) * 1.0f) / ((float) ((C1336b) view.getLayoutParams()).f4325b);
            if (f2 > f) {
                f = f2;
            }
            i9++;
            z = false;
        }
        if (z2) {
            m4126k(Math.max(Math.round(f * ((float) this.f4316b)), i5));
            i10 = 0;
            for (int i14 = 0; i14 < i7; i14++) {
                View view2 = this.f4318d[i14];
                m4118a(view2, 1073741824, true);
                int e2 = this.f4335k.mo5030e(view2);
                if (e2 > i10) {
                    i10 = e2;
                }
            }
        }
        for (int i15 = 0; i15 < i7; i15++) {
            View view3 = this.f4318d[i15];
            if (this.f4335k.mo5030e(view3) != i10) {
                C1336b bVar2 = (C1336b) view3.getLayoutParams();
                Rect rect = bVar2.f4501d;
                int i16 = rect.top + rect.bottom + bVar2.topMargin + bVar2.bottomMargin;
                int i17 = rect.left + rect.right + bVar2.leftMargin + bVar2.rightMargin;
                int e3 = m4123e(bVar2.f4324a, bVar2.f4325b);
                if (this.f4334j == 1) {
                    makeMeasureSpec = m4414a(e3, 1073741824, i17, bVar2.width, false);
                    a = View.MeasureSpec.makeMeasureSpec(i10 - i16, 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10 - i17, 1073741824);
                    a = m4414a(e3, 1073741824, i16, bVar2.height, false);
                }
                m4117a(view3, makeMeasureSpec, a, true);
            }
        }
        bVar.f4354a = i10;
        if (this.f4334j != 1) {
            if (cVar.f4363f == -1) {
                i2 = cVar.f4359b;
                i4 = i2 - i10;
            } else {
                i4 = cVar.f4359b;
                i2 = i10 + i4;
            }
            i = 0;
            i3 = 0;
        } else if (cVar.f4363f == -1) {
            i = cVar.f4359b;
            i3 = i - i10;
            i4 = 0;
            i2 = 0;
        } else {
            i3 = cVar.f4359b;
            i = i10 + i3;
            i2 = 0;
            i4 = 0;
        }
        for (int i18 = 0; i18 < i7; i18++) {
            View view4 = this.f4318d[i18];
            C1336b bVar3 = (C1336b) view4.getLayoutParams();
            if (this.f4334j != 1) {
                i3 = mo4732u() + this.f4317c[bVar3.f4324a];
                i = this.f4335k.mo5032f(view4) + i3;
            } else if (mo4369h()) {
                i2 = mo4731t() + this.f4317c[this.f4316b - bVar3.f4324a];
                i4 = i2 - this.f4335k.mo5032f(view4);
            } else {
                i4 = mo4731t() + this.f4317c[bVar3.f4324a];
                i2 = this.f4335k.mo5032f(view4) + i4;
            }
            mo4702b(view4, i4, i3, i2, i);
            if (bVar3.f4500c.isRemoved() || bVar3.f4500c.isUpdated()) {
                bVar.f4356c = true;
            }
            bVar.f4357d |= view4.hasFocusable();
        }
        Arrays.fill(this.f4318d, (Object) null);
    }

    /* renamed from: a */
    public final void mo4318a(int i) {
        if (i != this.f4316b) {
            this.f4315a = true;
            if (i > 0) {
                this.f4316b = i;
                this.f4321g.f4326a.clear();
                mo4726o();
                return;
            }
            throw new IllegalArgumentException("Span count should be at least 1. Provided ".concat(String.valueOf(i)));
        }
    }

    /* renamed from: D */
    private void m4115D() {
        View[] viewArr = this.f4318d;
        if (viewArr == null || viewArr.length != this.f4316b) {
            this.f4318d = new View[this.f4316b];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: x_ */
    public boolean mo4340x_() {
        if (this.f4343s != null || this.f4315a) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: y_ */
    public final void mo4341y_() {
        this.f4321g.f4326a.clear();
        this.f4321g.f4327b.clear();
    }

    /* renamed from: C */
    private void m4114C() {
        int w;
        int u;
        if (this.f4334j == 1) {
            w = this.f4485J - mo4733v();
            u = mo4731t();
        } else {
            w = this.f4486K - mo4734w();
            u = mo4732u();
        }
        m4126k(w - u);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: b */
    public final RecyclerView.C1367j mo4334b() {
        if (this.f4334j == 0) {
            return new C1336b(-2, -1);
        }
        return new C1336b(-1, -2);
    }

    /* renamed from: a */
    public void mo4320a(AbstractC1337c cVar) {
        this.f4321g = cVar;
    }

    /* renamed from: k */
    private void m4126k(int i) {
        this.f4317c = m4120a(this.f4317c, this.f4316b, i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: c */
    public final int mo4336c(RecyclerView.C1378s sVar) {
        if (this.f4323i) {
            return m4124h(sVar);
        }
        return super.mo4336c(sVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: d */
    public final int mo4338d(RecyclerView.C1378s sVar) {
        if (this.f4323i) {
            return m4125i(sVar);
        }
        return super.mo4338d(sVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: e */
    public final int mo4339e(RecyclerView.C1378s sVar) {
        if (this.f4323i) {
            return m4125i(sVar);
        }
        return super.mo4339e(sVar);
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static class C1336b extends RecyclerView.C1367j {

        /* renamed from: a */
        public int f4324a = -1;

        /* renamed from: b */
        public int f4325b;

        static {
            Covode.recordClassIndex(1463);
        }

        public C1336b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C1336b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C1336b(int i, int i2) {
            super(i, i2);
        }

        public C1336b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public GridLayoutManager(int i) {
        mo4318a(i);
    }

    /* renamed from: h */
    private int m4124h(RecyclerView.C1378s sVar) {
        if (!(mo4730s() == 0 || sVar.mo4782a() == 0)) {
            mo4370i();
            View c = mo4359c(!this.f4339o);
            View d = mo4361d(!this.f4339o);
            if (!(c == null || d == null)) {
                if (!this.f4339o) {
                    return this.f4321g.mo4345c(sVar.mo4782a() - 1, this.f4316b) + 1;
                }
                int b = this.f4335k.mo5024b(d) - this.f4335k.mo5021a(c);
                int c2 = this.f4321g.mo4345c(m4426e(c), this.f4316b);
                return (int) ((((float) b) / ((float) ((this.f4321g.mo4345c(m4426e(d), this.f4316b) - c2) + 1))) * ((float) (this.f4321g.mo4345c(sVar.mo4782a() - 1, this.f4316b) + 1)));
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: b */
    public final int mo4333b(RecyclerView.C1378s sVar) {
        if (this.f4323i) {
            return m4124h(sVar);
        }
        return super.mo4333b(sVar);
    }

    /* renamed from: i */
    private int m4125i(RecyclerView.C1378s sVar) {
        int max;
        if (!(mo4730s() == 0 || sVar.mo4782a() == 0)) {
            mo4370i();
            boolean z = this.f4339o;
            View c = mo4359c(!z);
            View d = mo4361d(!z);
            if (!(c == null || d == null)) {
                int c2 = this.f4321g.mo4345c(m4426e(c), this.f4316b);
                int c3 = this.f4321g.mo4345c(m4426e(d), this.f4316b);
                int min = Math.min(c2, c3);
                int max2 = Math.max(c2, c3);
                int c4 = this.f4321g.mo4345c(sVar.mo4782a() - 1, this.f4316b) + 1;
                if (this.f4337m) {
                    max = Math.max(0, (c4 - max2) - 1);
                } else {
                    max = Math.max(0, min);
                }
                if (!z) {
                    return max;
                }
                return Math.round((((float) max) * (((float) Math.abs(this.f4335k.mo5024b(d) - this.f4335k.mo5021a(c))) / ((float) ((this.f4321g.mo4345c(m4426e(d), this.f4316b) - this.f4321g.mo4345c(m4426e(c), this.f4316b)) + 1)))) + ((float) (this.f4335k.mo5023b() - this.f4335k.mo5021a(c))));
            }
        }
        return 0;
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static final class C1335a extends AbstractC1337c {
        static {
            Covode.recordClassIndex(1462);
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1337c
        /* renamed from: a */
        public final int mo4342a(int i) {
            return 1;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1337c
        /* renamed from: a */
        public final int mo4343a(int i, int i2) {
            return i % i2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final RecyclerView.C1367j mo4316a(Context context, AttributeSet attributeSet) {
        return new C1336b(context, attributeSet);
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$c */
    public static abstract class AbstractC1337c {

        /* renamed from: a */
        final SparseIntArray f4326a = new SparseIntArray();

        /* renamed from: b */
        final SparseIntArray f4327b = new SparseIntArray();

        /* renamed from: c */
        public boolean f4328c = false;

        /* renamed from: d */
        public boolean f4329d = false;

        static {
            Covode.recordClassIndex(1464);
        }

        /* renamed from: a */
        public abstract int mo4342a(int i);

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final int mo4344b(int i, int i2) {
            if (!this.f4328c) {
                return mo4343a(i, i2);
            }
            int i3 = this.f4326a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int a = mo4343a(i, i2);
            this.f4326a.put(i, a);
            return a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final int mo4345c(int i, int i2) {
            if (!this.f4329d) {
                return mo4346d(i, i2);
            }
            int i3 = this.f4327b.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int d = mo4346d(i, i2);
            this.f4327b.put(i, d);
            return d;
        }

        /* renamed from: a */
        private static int m4159a(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0036 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0037 A[RETURN] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo4343a(int r6, int r7) {
            /*
                r5 = this;
                int r4 = r5.mo4342a(r6)
                r3 = 0
                if (r4 != r7) goto L_0x0008
                return r3
            L_0x0008:
                boolean r0 = r5.f4328c
                if (r0 == 0) goto L_0x0030
                android.util.SparseIntArray r0 = r5.f4326a
                int r2 = m4159a(r0, r6)
                if (r2 < 0) goto L_0x0030
                android.util.SparseIntArray r0 = r5.f4326a
                int r1 = r0.get(r2)
                int r0 = r5.mo4342a(r2)
                int r1 = r1 + r0
            L_0x001f:
                int r2 = r2 + 1
            L_0x0021:
                if (r2 >= r6) goto L_0x0033
                int r0 = r5.mo4342a(r2)
                int r1 = r1 + r0
                if (r1 != r7) goto L_0x002c
                r1 = 0
                goto L_0x001f
            L_0x002c:
                if (r1 <= r7) goto L_0x001f
                r1 = r0
                goto L_0x001f
            L_0x0030:
                r2 = 0
                r1 = 0
                goto L_0x0021
            L_0x0033:
                int r4 = r4 + r1
                if (r4 > r7) goto L_0x0037
                return r1
            L_0x0037:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.AbstractC1337c.mo4343a(int, int):int");
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo4346d(int r6, int r7) {
            /*
                r5 = this;
                boolean r1 = r5.f4329d
                r0 = 0
                if (r1 == 0) goto L_0x003d
                android.util.SparseIntArray r0 = r5.f4327b
                int r1 = m4159a(r0, r6)
                r0 = -1
                if (r1 == r0) goto L_0x003d
                android.util.SparseIntArray r0 = r5.f4327b
                int r4 = r0.get(r1)
                int r3 = r1 + 1
                int r2 = r5.mo4344b(r1, r7)
                int r0 = r5.mo4342a(r1)
                int r2 = r2 + r0
                if (r2 != r7) goto L_0x0024
                int r4 = r4 + 1
            L_0x0023:
                r2 = 0
            L_0x0024:
                int r1 = r5.mo4342a(r6)
            L_0x0028:
                if (r3 >= r6) goto L_0x0040
                int r0 = r5.mo4342a(r3)
                int r2 = r2 + r0
                if (r2 != r7) goto L_0x0037
                int r4 = r4 + 1
                r2 = 0
            L_0x0034:
                int r3 = r3 + 1
                goto L_0x0028
            L_0x0037:
                if (r2 <= r7) goto L_0x0034
                int r4 = r4 + 1
                r2 = r0
                goto L_0x0034
            L_0x003d:
                r4 = 0
                r3 = 0
                goto L_0x0023
            L_0x0040:
                int r2 = r2 + r1
                if (r2 <= r7) goto L_0x0045
                int r4 = r4 + 1
            L_0x0045:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.AbstractC1337c.mo4346d(int, int):int");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: b */
    public final int mo4332b(RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        if (this.f4334j == 1) {
            return this.f4316b;
        }
        if (sVar.mo4782a() <= 0) {
            return 0;
        }
        return m4116a(oVar, sVar, sVar.mo4782a() - 1) + 1;
    }

    /* renamed from: e */
    private int m4123e(int i, int i2) {
        if (this.f4334j != 1 || !mo4369h()) {
            int[] iArr = this.f4317c;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f4317c;
        int i3 = this.f4316b;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: c */
    public void mo4337c(RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        if (sVar.f4535g) {
            int s = mo4730s();
            for (int i = 0; i < s; i++) {
                C1336b bVar = (C1336b) mo4717g(i).getLayoutParams();
                int layoutPosition = bVar.f4500c.getLayoutPosition();
                this.f4319e.put(layoutPosition, bVar.f4325b);
                this.f4320f.put(layoutPosition, bVar.f4324a);
            }
        }
        super.mo4337c(oVar, sVar);
        this.f4319e.clear();
        this.f4320f.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public final int mo4313a(RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        if (this.f4334j == 0) {
            return this.f4316b;
        }
        if (sVar.mo4782a() <= 0) {
            return 0;
        }
        return m4116a(oVar, sVar, sVar.mo4782a() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    public int mo4312a(int i, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        m4114C();
        m4115D();
        return super.mo4312a(i, oVar, sVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: b */
    public int mo4331b(int i, RecyclerView.C1372o oVar, RecyclerView.C1378s sVar) {
        m4114C();
        m4115D();
        return super.mo4331b(i, oVar, sVar);
    }

    /* renamed from: a */
    private int m4116a(RecyclerView.C1372o oVar, RecyclerView.C1378s sVar, int i) {
        if (!sVar.f4535g) {
            return this.f4321g.mo4345c(i, this.f4316b);
        }
        int a = oVar.mo4755a(i);
        if (a == -1) {
            return 0;
        }
        return this.f4321g.mo4345c(a, this.f4316b);
    }

    /* renamed from: b */
    private int m4121b(RecyclerView.C1372o oVar, RecyclerView.C1378s sVar, int i) {
        if (!sVar.f4535g) {
            return this.f4321g.mo4344b(i, this.f4316b);
        }
        int i2 = this.f4320f.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a = oVar.mo4755a(i);
        if (a == -1) {
            return 0;
        }
        return this.f4321g.mo4344b(a, this.f4316b);
    }

    /* renamed from: c */
    private int m4122c(RecyclerView.C1372o oVar, RecyclerView.C1378s sVar, int i) {
        if (!sVar.f4535g) {
            return this.f4321g.mo4342a(i);
        }
        int i2 = this.f4319e.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a = oVar.mo4755a(i);
        if (a == -1) {
            return 1;
        }
        return this.f4321g.mo4342a(a);
    }

    public GridLayoutManager(int i, int i2, boolean z) {
        super(i2, false);
        mo4318a(i);
    }

    /* renamed from: a */
    private void m4118a(View view, int i, boolean z) {
        int a;
        int a2;
        C1336b bVar = (C1336b) view.getLayoutParams();
        Rect rect = bVar.f4501d;
        int i2 = rect.top + rect.bottom + bVar.topMargin + bVar.bottomMargin;
        int i3 = rect.left + rect.right + bVar.leftMargin + bVar.rightMargin;
        int e = m4123e(bVar.f4324a, bVar.f4325b);
        if (this.f4334j == 1) {
            a2 = m4414a(e, i, i3, bVar.width, false);
            a = m4414a(this.f4335k.mo5029e(), this.f4484I, i2, bVar.height, true);
        } else {
            a = m4414a(e, i, i2, bVar.height, false);
            a2 = m4414a(this.f4335k.mo5029e(), this.f4483H, i3, bVar.width, true);
        }
        m4117a(view, a2, a, z);
    }

    /* renamed from: a */
    private static int[] m4120a(int[] iArr, int i, int i2) {
        int i3;
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: b */
    public final void mo4335b(RecyclerView recyclerView, int i, int i2) {
        this.f4321g.f4326a.clear();
        this.f4321g.f4327b.clear();
    }

    /* renamed from: a */
    private void m4117a(View view, int i, int i2, boolean z) {
        boolean b;
        RecyclerView.C1367j jVar = (RecyclerView.C1367j) view.getLayoutParams();
        if (z) {
            b = mo4697a(view, i, i2, jVar);
        } else {
            b = mo4707b(view, i, i2, jVar);
        }
        if (b) {
            view.measure(i, i2);
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo4318a(m4415a(context, attributeSet, i, i2).f4497b);
    }

    /* renamed from: a */
    private void m4119a(RecyclerView.C1372o oVar, RecyclerView.C1378s sVar, int i, boolean z) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = -1;
        if (z) {
            i5 = i;
            i2 = 0;
            i3 = 1;
        } else {
            i2 = i - 1;
            i3 = -1;
        }
        while (i2 != i5) {
            View view = this.f4318d[i2];
            C1336b bVar = (C1336b) view.getLayoutParams();
            bVar.f4325b = m4122c(oVar, sVar, m4426e(view));
            bVar.f4324a = i4;
            i4 += bVar.f4325b;
            i2 += i3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00cb, code lost:
        if (r6 == r0) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0113, code lost:
        if (r21 == null) goto L_0x0126;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0126, code lost:
        return r18;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00fc  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1362i
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View mo4314a(android.view.View r26, int r27, androidx.recyclerview.widget.RecyclerView.C1372o r28, androidx.recyclerview.widget.RecyclerView.C1378s r29) {
        /*
        // Method dump skipped, instructions count: 295
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo4314a(android.view.View, int, androidx.recyclerview.widget.RecyclerView$o, androidx.recyclerview.widget.RecyclerView$s):android.view.View");
    }
}
