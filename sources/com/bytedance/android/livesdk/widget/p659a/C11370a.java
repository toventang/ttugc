package com.bytedance.android.livesdk.widget.p659a;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.C1481r;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.uikit.p411c.C6229a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.widget.a.a */
public class C11370a extends AbstractC11375c {

    /* renamed from: a */
    private AbstractC11372b f27325a;

    /* renamed from: b */
    public int f27326b = 1;

    /* renamed from: c */
    public int f27327c = 1;

    /* renamed from: e */
    private AbstractC11372b f27328e;

    static {
        Covode.recordClassIndex(13026);
    }

    /* renamed from: b */
    private int m20189b() {
        return this.f27326b * this.f27327c;
    }

    /* renamed from: c */
    private AbstractC11372b m20191c(RecyclerView.AbstractC1362i iVar) {
        AbstractC11372b bVar = this.f27325a;
        if (bVar == null || bVar.f27330a != iVar) {
            this.f27325a = AbstractC11372b.m20202b(iVar);
        }
        return this.f27325a;
    }

    /* renamed from: d */
    private AbstractC11372b m20192d(RecyclerView.AbstractC1362i iVar) {
        AbstractC11372b bVar = this.f27328e;
        if (bVar == null || bVar.f27330a != iVar) {
            this.f27328e = AbstractC11372b.m20201a(iVar);
        }
        return this.f27328e;
    }

    @Override // com.bytedance.android.livesdk.widget.p659a.AbstractC11375c
    /* renamed from: a */
    public View mo16877a(RecyclerView.AbstractC1362i iVar) {
        if (iVar.mo4368g()) {
            return m20188a(iVar, m20191c(iVar));
        }
        if (iVar.mo4366f()) {
            return m20188a(iVar, m20192d(iVar));
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.android.livesdk.widget.p659a.AbstractC11375c
    /* renamed from: b */
    public final C1481r mo18246b(RecyclerView.AbstractC1362i iVar) {
        if (!(iVar instanceof RecyclerView.AbstractC1375r.AbstractC1377b)) {
            return null;
        }
        return new C1481r(this.f27335d.getContext()) {
            /* class com.bytedance.android.livesdk.widget.p659a.C11370a.C113711 */

            static {
                Covode.recordClassIndex(13027);
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
                C11370a aVar2 = C11370a.this;
                int[] a = aVar2.mo18245a(aVar2.f27335d.getLayoutManager(), view);
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
    private static View m20190b(RecyclerView.AbstractC1362i iVar, AbstractC11372b bVar) {
        int s = iVar.mo4730s();
        View view = null;
        if (s == 0) {
            return null;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < s; i2++) {
            View g = iVar.mo4717g(i2);
            int a = bVar.mo18248a(g);
            if (a < i) {
                view = g;
                i = a;
            }
        }
        return view;
    }

    @Override // com.bytedance.android.livesdk.widget.p659a.AbstractC11375c
    /* renamed from: a */
    public final int[] mo18245a(RecyclerView.AbstractC1362i iVar, View view) {
        int[] iArr = new int[2];
        if (iVar.mo4366f()) {
            iArr[0] = m20187a(iVar, view, m20192d(iVar));
        } else {
            iArr[0] = 0;
        }
        if (iVar.mo4368g()) {
            iArr[1] = m20187a(iVar, view, m20191c(iVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: a */
    private static View m20188a(RecyclerView.AbstractC1362i iVar, AbstractC11372b bVar) {
        int b;
        int s = iVar.mo4730s();
        View view = null;
        if (s == 0) {
            return null;
        }
        if (iVar.mo4727p()) {
            b = bVar.mo18247a() + (bVar.mo18251c() / 2);
        } else {
            b = bVar.mo18249b() / 2;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < s; i2++) {
            View g = iVar.mo4717g(i2);
            int abs = Math.abs((bVar.mo18248a(g) + (bVar.mo18252c(g) / 2)) - b);
            if (abs < i) {
                view = g;
                i = abs;
            }
        }
        return view;
    }

    /* renamed from: a */
    private int m20187a(RecyclerView.AbstractC1362i iVar, View view, AbstractC11372b bVar) {
        int i;
        int a;
        int i2;
        int a2;
        boolean a3 = C6229a.m13521a(this.f27335d.getContext());
        if (iVar.mo4366f()) {
            int width = this.f27335d.getWidth() / this.f27327c;
            int e = RecyclerView.AbstractC1362i.m4426e(view);
            int b = (e / m20189b()) * m20189b();
            if (a3) {
                i2 = ((m20189b() - (e - b)) / this.f27326b) * width;
                a2 = bVar.mo18250b(view);
            } else {
                i2 = ((e - b) / this.f27326b) * width;
                a2 = bVar.mo18248a(view);
            }
            int i3 = a2 - i2;
            if (i3 > 5 || i3 < -5) {
                return i3;
            }
            return 0;
        }
        int height = this.f27335d.getHeight() / this.f27326b;
        int e2 = RecyclerView.AbstractC1362i.m4426e(view);
        int b2 = (e2 / m20189b()) * m20189b();
        if (a3) {
            i = ((m20189b() - (e2 - b2)) / this.f27327c) * height;
            a = bVar.mo18250b(view);
        } else {
            i = ((e2 - b2) / this.f27327c) * height;
            a = bVar.mo18248a(view);
        }
        int i4 = a - i;
        if (i4 > 5 || i4 < -5) {
            return i4;
        }
        return 0;
    }

    @Override // com.bytedance.android.livesdk.widget.p659a.AbstractC11375c
    /* renamed from: a */
    public int mo16876a(RecyclerView.AbstractC1362i iVar, int i, int i2) {
        View b;
        int e;
        boolean z;
        PointF d;
        int A = iVar.mo4685A();
        if (A == 0) {
            return -1;
        }
        if (iVar.mo4368g()) {
            b = m20190b(iVar, m20191c(iVar));
        } else {
            if (iVar.mo4366f()) {
                b = m20190b(iVar, m20192d(iVar));
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
        int b2 = (e / m20189b()) * m20189b();
        if (z2) {
            if (z) {
                return b2 - m20189b();
            }
            return b2;
        } else if (z) {
            return b2 + m20189b();
        } else {
            return (b2 + m20189b()) - 1;
        }
    }
}
