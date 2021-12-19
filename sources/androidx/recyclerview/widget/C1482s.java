package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.recyclerview.widget.s */
public class C1482s extends AbstractC1392ac {

    /* renamed from: b */
    private AbstractC1491x f4919b;

    /* renamed from: c */
    private AbstractC1491x f4920c;

    static {
        Covode.recordClassIndex(1620);
    }

    /* renamed from: d */
    private AbstractC1491x m5027d(RecyclerView.AbstractC1362i iVar) {
        AbstractC1491x xVar = this.f4919b;
        if (xVar == null || xVar.f4932a != iVar) {
            this.f4919b = AbstractC1491x.m5056b(iVar);
        }
        return this.f4919b;
    }

    /* renamed from: e */
    private AbstractC1491x m5028e(RecyclerView.AbstractC1362i iVar) {
        AbstractC1491x xVar = this.f4920c;
        if (xVar == null || xVar.f4932a != iVar) {
            this.f4920c = AbstractC1491x.m5054a(iVar);
        }
        return this.f4920c;
    }

    @Override // androidx.recyclerview.widget.AbstractC1392ac
    /* renamed from: a */
    public View mo4855a(RecyclerView.AbstractC1362i iVar) {
        if (iVar.mo4368g()) {
            return m5025a(iVar, m5027d(iVar));
        }
        if (iVar.mo4366f()) {
            return m5025a(iVar, m5028e(iVar));
        }
        return null;
    }

    /* renamed from: a */
    private static int m5023a(View view, AbstractC1491x xVar) {
        return (xVar.mo5021a(view) + (xVar.mo5030e(view) / 2)) - (xVar.mo5023b() + (xVar.mo5029e() / 2));
    }

    /* renamed from: a */
    private static View m5025a(RecyclerView.AbstractC1362i iVar, AbstractC1491x xVar) {
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

    /* renamed from: b */
    private static float m5026b(RecyclerView.AbstractC1362i iVar, AbstractC1491x xVar) {
        int max;
        int s = iVar.mo4730s();
        if (s == 0) {
            return 1.0f;
        }
        View view = null;
        View view2 = null;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < s; i3++) {
            View g = iVar.mo4717g(i3);
            int e = RecyclerView.AbstractC1362i.m4426e(g);
            if (e != -1) {
                if (e < i) {
                    view = g;
                    i = e;
                }
                if (e > i2) {
                    view2 = g;
                    i2 = e;
                }
            }
        }
        if (view == null || view2 == null || (max = Math.max(xVar.mo5024b(view), xVar.mo5024b(view2)) - Math.min(xVar.mo5021a(view), xVar.mo5021a(view2))) == 0) {
            return 1.0f;
        }
        return (((float) max) * 1.0f) / ((float) ((i2 - i) + 1));
    }

    @Override // androidx.recyclerview.widget.AbstractC1392ac
    /* renamed from: a */
    public final int[] mo4858a(RecyclerView.AbstractC1362i iVar, View view) {
        int[] iArr = new int[2];
        if (iVar.mo4366f()) {
            iArr[0] = m5023a(view, m5028e(iVar));
        } else {
            iArr[0] = 0;
        }
        if (iVar.mo4368g()) {
            iArr[1] = m5023a(view, m5027d(iVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.AbstractC1392ac
    /* renamed from: a */
    public final int mo4854a(RecyclerView.AbstractC1362i iVar, int i, int i2) {
        int A;
        View a;
        int e;
        int i3;
        PointF d;
        int i4;
        int i5;
        if (!(iVar instanceof RecyclerView.AbstractC1375r.AbstractC1377b) || (A = iVar.mo4685A()) == 0 || (a = mo4855a(iVar)) == null || (e = RecyclerView.AbstractC1362i.m4426e(a)) == -1 || (d = ((RecyclerView.AbstractC1375r.AbstractC1377b) iVar).mo4360d(A - 1)) == null) {
            return -1;
        }
        int i6 = 0;
        if (iVar.mo4366f()) {
            i4 = m5024a(iVar, m5028e(iVar), i, 0);
            if (d.x < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (iVar.mo4368g()) {
            i5 = m5024a(iVar, m5027d(iVar), 0, i2);
            if (d.y < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (iVar.mo4368g()) {
            i4 = i5;
        }
        if (i4 == 0) {
            return -1;
        }
        int i7 = e + i4;
        if (i7 >= 0) {
            i6 = i7;
        }
        return i6 >= A ? i3 : i6;
    }

    /* renamed from: a */
    private int m5024a(RecyclerView.AbstractC1362i iVar, AbstractC1491x xVar, int i, int i2) {
        int i3;
        int[] b = mo4860b(i, i2);
        float b2 = m5026b(iVar, xVar);
        if (b2 <= 0.0f) {
            return 0;
        }
        if (Math.abs(b[0]) > Math.abs(b[1])) {
            i3 = b[0];
        } else {
            i3 = b[1];
        }
        return Math.round(((float) i3) / b2);
    }
}
