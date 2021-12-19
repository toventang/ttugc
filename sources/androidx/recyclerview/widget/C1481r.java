package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.recyclerview.widget.r */
public class C1481r extends RecyclerView.AbstractC1375r {

    /* renamed from: a */
    protected final LinearInterpolator f4911a = new LinearInterpolator();

    /* renamed from: b */
    protected final DecelerateInterpolator f4912b = new DecelerateInterpolator();

    /* renamed from: c */
    protected PointF f4913c;

    /* renamed from: d */
    protected int f4914d = 0;

    /* renamed from: e */
    protected int f4915e = 0;

    /* renamed from: f */
    private final DisplayMetrics f4916f;

    /* renamed from: n */
    private boolean f4917n = false;

    /* renamed from: o */
    private float f4918o;

    static {
        Covode.recordClassIndex(1619);
    }

    /* renamed from: b */
    private static int m5011b(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1375r
    /* renamed from: a */
    public final void mo4773a() {
        this.f4915e = 0;
        this.f4914d = 0;
        this.f4913c = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo5013b() {
        PointF pointF = this.f4913c;
        if (pointF == null || pointF.x == 0.0f) {
            return 0;
        }
        if (this.f4913c.x > 0.0f) {
            return 1;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo5016c() {
        PointF pointF = this.f4913c;
        if (pointF == null || pointF.y == 0.0f) {
            return 0;
        }
        if (this.f4913c.y > 0.0f) {
            return 1;
        }
        return -1;
    }

    /* renamed from: a */
    public float mo4862a(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo5010a(int i) {
        double b = (double) mo5014b(i);
        Double.isNaN(b);
        return (int) Math.ceil(b / 0.3356d);
    }

    public C1481r(Context context) {
        this.f4916f = context.getResources().getDisplayMetrics();
    }

    /* renamed from: b */
    public int mo5014b(int i) {
        float abs = (float) Math.abs(i);
        if (!this.f4917n) {
            this.f4918o = mo4862a(this.f4916f);
            this.f4917n = true;
        }
        return (int) Math.ceil((double) (abs * this.f4918o));
    }

    /* renamed from: a */
    public int mo5012a(View view, int i) {
        RecyclerView.AbstractC1362i iVar = this.f4517i;
        if (iVar == null || !iVar.mo4368g()) {
            return 0;
        }
        RecyclerView.C1367j jVar = (RecyclerView.C1367j) view.getLayoutParams();
        return mo5011a(RecyclerView.AbstractC1362i.m4432p(view) - jVar.topMargin, RecyclerView.AbstractC1362i.m4434r(view) + jVar.bottomMargin, iVar.mo4732u(), iVar.f4486K - iVar.mo4734w(), i);
    }

    /* renamed from: b */
    public int mo5015b(View view, int i) {
        RecyclerView.AbstractC1362i iVar = this.f4517i;
        if (iVar == null || !iVar.mo4366f()) {
            return 0;
        }
        RecyclerView.C1367j jVar = (RecyclerView.C1367j) view.getLayoutParams();
        return mo5011a(RecyclerView.AbstractC1362i.m4431o(view) - jVar.leftMargin, RecyclerView.AbstractC1362i.m4433q(view) + jVar.rightMargin, iVar.mo4731t(), iVar.f4485J - iVar.mo4733v(), i);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1375r
    /* renamed from: a */
    public final void mo4775a(int i, int i2, RecyclerView.AbstractC1375r.C1376a aVar) {
        if (this.f4516h.f4445o.mo4730s() == 0) {
            mo4779d();
            return;
        }
        this.f4914d = m5011b(this.f4914d, i);
        int b = m5011b(this.f4915e, i2);
        this.f4915e = b;
        if (this.f4914d == 0 && b == 0) {
            PointF c = mo4778c(this.f4515g);
            if (c == null || (c.x == 0.0f && c.y == 0.0f)) {
                aVar.f4525d = this.f4515g;
                mo4779d();
                return;
            }
            float sqrt = (float) Math.sqrt((double) ((c.x * c.x) + (c.y * c.y)));
            c.x /= sqrt;
            c.y /= sqrt;
            this.f4913c = c;
            this.f4914d = (int) (c.x * 10000.0f);
            this.f4915e = (int) (c.y * 10000.0f);
            aVar.mo4780a((int) (((float) this.f4914d) * 1.2f), (int) (((float) this.f4915e) * 1.2f), (int) (((float) mo5014b(10000)) * 1.2f), this.f4911a);
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1375r
    /* renamed from: a */
    public void mo4777a(View view, RecyclerView.C1378s sVar, RecyclerView.AbstractC1375r.C1376a aVar) {
        int b = mo5015b(view, mo5013b());
        int a = mo5012a(view, mo5016c());
        int a2 = mo5010a((int) Math.sqrt((double) ((b * b) + (a * a))));
        if (a2 > 0) {
            aVar.mo4780a(-b, -a, a2, this.f4912b);
        }
    }

    /* renamed from: a */
    public int mo5011a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 == 0) {
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        } else if (i5 == 1) {
            return i4 - i2;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }
}
