package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.recyclerview.widget.y */
public class C1494y extends AbstractC1392ac {

    /* renamed from: b */
    private AbstractC1491x f4935b;

    /* renamed from: c */
    private AbstractC1491x f4936c;

    static {
        Covode.recordClassIndex(1632);
    }

    /* renamed from: d */
    private AbstractC1491x mo60480d(RecyclerView.AbstractC1362i iVar) {
        AbstractC1491x xVar = this.f4935b;
        if (xVar == null || xVar.f4932a != iVar) {
            this.f4935b = AbstractC1491x.m5056b(iVar);
        }
        return this.f4935b;
    }

    /* renamed from: e */
    private AbstractC1491x mo60481e(RecyclerView.AbstractC1362i iVar) {
        AbstractC1491x xVar = this.f4936c;
        if (xVar == null || xVar.f4932a != iVar) {
            this.f4936c = AbstractC1491x.m5054a(iVar);
        }
        return this.f4936c;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.AbstractC1392ac
    /* renamed from: b */
    public final RecyclerView.AbstractC1375r mo4859b(RecyclerView.AbstractC1362i iVar) {
        if (!(iVar instanceof RecyclerView.AbstractC1375r.AbstractC1377b)) {
            return null;
        }
        return new C1481r(this.f4622a.getContext()) {
            /* class androidx.recyclerview.widget.C1494y.C14951 */

            static {
                Covode.recordClassIndex(1633);
            }

            /* access modifiers changed from: protected */
            @Override // androidx.recyclerview.widget.C1481r
            /* renamed from: a */
            public final float mo4862a(DisplayMetrics displayMetrics) {
                return 100.0f / ((float) displayMetrics.densityDpi);
            }

            /* access modifiers changed from: protected */
            @Override // androidx.recyclerview.widget.C1481r
            /* renamed from: b */
            public final int mo5014b(int i) {
                return Math.min(100, super.mo5014b(i));
            }

            /* access modifiers changed from: protected */
            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1375r, androidx.recyclerview.widget.C1481r
            /* renamed from: a */
            public final void mo4777a(View view, RecyclerView.C1378s sVar, RecyclerView.AbstractC1375r.C1376a aVar) {
                C1494y yVar = C1494y.this;
                int[] a = yVar.mo4858a(yVar.f4622a.getLayoutManager(), view);
                int i = a[0];
                int i2 = a[1];
                int a2 = mo5010a(Math.max(Math.abs(i), Math.abs(i2)));
                if (a2 > 0) {
                    aVar.mo4780a(i, i2, a2, this.f4912b);
                }
            }
        };
    }

    @Override // androidx.recyclerview.widget.AbstractC1392ac
    /* renamed from: a */
    public View mo4855a(RecyclerView.AbstractC1362i iVar) {
        if (iVar.mo4368g()) {
            return mo60479a(iVar, mo60480d(iVar));
        }
        if (iVar.mo4366f()) {
            return mo60479a(iVar, mo60481e(iVar));
        }
        return null;
    }

    /* renamed from: a */
    private static int mo60478a(View view, AbstractC1491x xVar) {
        return (xVar.mo5021a(view) + (xVar.mo5030e(view) / 2)) - (xVar.mo5023b() + (xVar.mo5029e() / 2));
    }

    /* renamed from: a */
    private static View mo60479a(RecyclerView.AbstractC1362i iVar, AbstractC1491x xVar) {
        int s = iVar.mo4730s();
        View view = null;
        if (s == 0) {
            return null;
        }
        int b = xVar.mo5023b() + (xVar.mo5029e() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < s; i2++) {
            View g = iVar.mo4717g(i2);
            int abs = Math.abs((xVar.mo5021a(g) + (xVar.mo5030e(g) / 2)) - b);
            if (abs < i) {
                view = g;
                i = abs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.AbstractC1392ac
    /* renamed from: a */
    public int[] mo4858a(RecyclerView.AbstractC1362i iVar, View view) {
        int[] iArr = new int[2];
        if (iVar.mo4366f()) {
            iArr[0] = mo60478a(view, mo60481e(iVar));
        } else {
            iArr[0] = 0;
        }
        if (iVar.mo4368g()) {
            iArr[1] = mo60478a(view, mo60480d(iVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.AbstractC1392ac
    /* renamed from: a */
    public int mo4854a(RecyclerView.AbstractC1362i iVar, int i, int i2) {
        AbstractC1491x e;
        boolean z;
        PointF d;
        int A = iVar.mo4685A();
        if (A == 0) {
            return -1;
        }
        View view = null;
        if (iVar.mo4368g()) {
            e = mo60480d(iVar);
        } else {
            if (iVar.mo4366f()) {
                e = mo60481e(iVar);
            }
            return -1;
        }
        if (e != null) {
            int s = iVar.mo4730s();
            boolean z2 = false;
            View view2 = null;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            for (int i5 = 0; i5 < s; i5++) {
                View g = iVar.mo4717g(i5);
                if (g != null) {
                    int a = mo60478a(g, e);
                    if (a <= 0) {
                        if (a > i3) {
                            view2 = g;
                            i3 = a;
                        }
                        if (a < 0) {
                        }
                    }
                    if (a < i4) {
                        view = g;
                        i4 = a;
                    }
                }
            }
            int i6 = 1;
            if (!iVar.mo4366f() ? i2 <= 0 : i <= 0) {
                z = false;
                if (view2 != null) {
                    return RecyclerView.AbstractC1362i.m4426e(view2);
                }
            } else {
                z = true;
                if (view != null) {
                    return RecyclerView.AbstractC1362i.m4426e(view);
                }
                view = view2;
            }
            if (view == null) {
                return -1;
            }
            int e2 = RecyclerView.AbstractC1362i.m4426e(view);
            int A2 = iVar.mo4685A();
            if ((iVar instanceof RecyclerView.AbstractC1375r.AbstractC1377b) && (d = ((RecyclerView.AbstractC1375r.AbstractC1377b) iVar).mo4360d(A2 - 1)) != null && (d.x < 0.0f || d.y < 0.0f)) {
                z2 = true;
            }
            if (z2 == z) {
                i6 = -1;
            }
            int i7 = e2 + i6;
            if (i7 < 0 || i7 >= A) {
                return -1;
            }
            return i7;
        }
        return -1;
    }
}
