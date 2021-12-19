package com.p2082ss.android.ugc.aweme.comment.gift;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.AbstractC1491x;
import androidx.recyclerview.widget.C1481r;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;

/* renamed from: com.ss.android.ugc.aweme.comment.gift.i */
public class C36468i extends AbstractC36470j {

    /* renamed from: a */
    int f86214a = 1;

    /* renamed from: b */
    int f86215b = 1;

    /* renamed from: d */
    private AbstractC1491x f86216d;

    /* renamed from: e */
    private AbstractC1491x f86217e;

    static {
        Covode.recordClassIndex(43766);
    }

    /* renamed from: b */
    private int m74225b() {
        return this.f86214a * this.f86215b;
    }

    /* renamed from: c */
    private AbstractC1491x m74227c(RecyclerView.AbstractC1362i iVar) {
        AbstractC1491x xVar = this.f86216d;
        if (xVar == null || xVar.f4932a != iVar) {
            this.f86216d = AbstractC1491x.m5056b(iVar);
        }
        return this.f86216d;
    }

    /* renamed from: d */
    private AbstractC1491x m74228d(RecyclerView.AbstractC1362i iVar) {
        AbstractC1491x xVar = this.f86217e;
        if (xVar == null || xVar.f4932a != iVar) {
            this.f86217e = AbstractC1491x.m5054a(iVar);
        }
        return this.f86217e;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.gift.AbstractC36470j
    /* renamed from: a */
    public View mo63776a(RecyclerView.AbstractC1362i iVar) {
        if (iVar.mo4368g()) {
            return m74224a(iVar, m74227c(iVar));
        }
        if (iVar.mo4366f()) {
            return m74224a(iVar, m74228d(iVar));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.comment.gift.AbstractC36470j
    /* renamed from: b */
    public final C1481r mo63795b(RecyclerView.AbstractC1362i iVar) {
        if (!(iVar instanceof RecyclerView.AbstractC1375r.AbstractC1377b)) {
            return null;
        }
        return new C1481r(this.f86221c.getContext()) {
            /* class com.p2082ss.android.ugc.aweme.comment.gift.C36468i.C364691 */

            static {
                Covode.recordClassIndex(43767);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1375r
            /* renamed from: c */
            public final PointF mo4778c(int i) {
                return null;
            }

            @Override // androidx.recyclerview.widget.C1481r
            /* renamed from: a */
            public final float mo4862a(DisplayMetrics displayMetrics) {
                return 100.0f / ((float) displayMetrics.densityDpi);
            }

            @Override // androidx.recyclerview.widget.C1481r
            /* renamed from: b */
            public final int mo5014b(int i) {
                return Math.min(100, super.mo5014b(i));
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1375r, androidx.recyclerview.widget.C1481r
            /* renamed from: a */
            public final void mo4777a(View view, RecyclerView.C1378s sVar, RecyclerView.AbstractC1375r.C1376a aVar) {
                C36468i iVar = C36468i.this;
                int[] a = iVar.mo63794a(iVar.f86221c.getLayoutManager(), view);
                int i = a[0];
                int i2 = a[1];
                int a2 = mo5010a(Math.max(Math.abs(i), Math.abs(i2)));
                if (a2 > 0) {
                    aVar.mo4780a(i, i2, a2, this.f4912b);
                }
            }
        };
    }

    /* renamed from: b */
    private static View m74226b(RecyclerView.AbstractC1362i iVar, AbstractC1491x xVar) {
        int s = iVar.mo4730s();
        View view = null;
        if (s == 0) {
            return null;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < s; i2++) {
            View g = iVar.mo4717g(i2);
            int a = xVar.mo5021a(g);
            if (a < i) {
                view = g;
                i = a;
            }
        }
        return view;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.gift.AbstractC36470j
    /* renamed from: a */
    public final int[] mo63794a(RecyclerView.AbstractC1362i iVar, View view) {
        int[] iArr = new int[2];
        if (iVar.mo4366f()) {
            iArr[0] = m74223a(iVar, view, m74228d(iVar));
        } else {
            iArr[0] = 0;
        }
        if (iVar.mo4368g()) {
            iArr[1] = m74223a(iVar, view, m74227c(iVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: a */
    private static View m74224a(RecyclerView.AbstractC1362i iVar, AbstractC1491x xVar) {
        int d;
        int s = iVar.mo4730s();
        View view = null;
        if (s == 0) {
            return null;
        }
        if (iVar.mo4727p()) {
            d = xVar.mo5023b() + (xVar.mo5029e() / 2);
        } else {
            d = xVar.mo5027d() / 2;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < s; i2++) {
            View g = iVar.mo4717g(i2);
            int abs = Math.abs((xVar.mo5021a(g) + (xVar.mo5030e(g) / 2)) - d);
            if (abs < i) {
                view = g;
                i = abs;
            }
        }
        return view;
    }

    /* renamed from: a */
    private int m74223a(RecyclerView.AbstractC1362i iVar, View view, AbstractC1491x xVar) {
        int i;
        int a;
        int i2;
        int a2;
        boolean a3 = C80471gb.m139483a(this.f86221c.getContext());
        if (iVar.mo4366f()) {
            int width = this.f86221c.getWidth() / this.f86215b;
            int e = RecyclerView.AbstractC1362i.m4426e(view);
            int b = (e / m74225b()) * m74225b();
            if (a3) {
                i2 = ((m74225b() - (e - b)) / this.f86214a) * width;
                a2 = xVar.mo5024b(view);
            } else {
                i2 = ((e - b) / this.f86214a) * width;
                a2 = xVar.mo5021a(view);
            }
            int i3 = a2 - i2;
            if (i3 > 5 || i3 < -5) {
                return i3;
            }
            return 0;
        }
        int height = this.f86221c.getHeight() / this.f86214a;
        int e2 = RecyclerView.AbstractC1362i.m4426e(view);
        int b2 = (e2 / m74225b()) * m74225b();
        if (a3) {
            i = ((m74225b() - (e2 - b2)) / this.f86215b) * height;
            a = xVar.mo5024b(view);
        } else {
            i = ((e2 - b2) / this.f86215b) * height;
            a = xVar.mo5021a(view);
        }
        int i4 = a - i;
        if (i4 > 5 || i4 < -5) {
            return i4;
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.gift.AbstractC36470j
    /* renamed from: a */
    public final int mo63793a(RecyclerView.AbstractC1362i iVar, int i, int i2) {
        View b;
        int e;
        boolean z;
        PointF d;
        int A = iVar.mo4685A();
        if (A == 0) {
            return -1;
        }
        if (iVar.mo4368g()) {
            b = m74226b(iVar, m74227c(iVar));
        } else {
            if (iVar.mo4366f()) {
                b = m74226b(iVar, m74228d(iVar));
            }
            return -1;
        }
        if (b == null || (e = RecyclerView.AbstractC1362i.m4426e(b)) == -1) {
            return -1;
        }
        boolean z2 = false;
        if (!iVar.mo4366f() ? i2 <= 0 : i <= 0) {
            z = false;
        } else {
            z = true;
        }
        if ((iVar instanceof RecyclerView.AbstractC1375r.AbstractC1377b) && (d = ((RecyclerView.AbstractC1375r.AbstractC1377b) iVar).mo4360d(A - 1)) != null && (d.x < 0.0f || d.y < 0.0f)) {
            z2 = true;
        }
        int b2 = (e / m74225b()) * m74225b();
        if (z2) {
            if (z) {
                return b2 - m74225b();
            }
            return b2;
        } else if (z) {
            return b2 + m74225b();
        } else {
            return (b2 + m74225b()) - 1;
        }
    }
}
