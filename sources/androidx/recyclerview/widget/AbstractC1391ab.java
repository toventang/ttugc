package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.recyclerview.widget.ab */
public abstract class AbstractC1391ab extends RecyclerView.AbstractC1356f {

    /* renamed from: m */
    public boolean f4621m = true;

    static {
        Covode.recordClassIndex(1529);
    }

    /* renamed from: a */
    public abstract boolean mo4850a(RecyclerView.ViewHolder viewHolder);

    /* renamed from: a */
    public abstract boolean mo4851a(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4);

    /* renamed from: a */
    public abstract boolean mo4852a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4);

    /* renamed from: b */
    public abstract boolean mo4853b(RecyclerView.ViewHolder viewHolder);

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1356f
    /* renamed from: g */
    public final boolean mo4675g(RecyclerView.ViewHolder viewHolder) {
        if (!this.f4621m || viewHolder.isInvalid()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1356f
    /* renamed from: c */
    public final boolean mo4671c(RecyclerView.ViewHolder viewHolder, RecyclerView.AbstractC1356f.C1359c cVar, RecyclerView.AbstractC1356f.C1359c cVar2) {
        if (cVar.f4471a != cVar2.f4471a || cVar.f4472b != cVar2.f4472b) {
            return mo4851a(viewHolder, cVar.f4471a, cVar.f4472b, cVar2.f4471a, cVar2.f4472b);
        }
        mo4674f(viewHolder);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1356f
    /* renamed from: a */
    public final boolean mo4665a(RecyclerView.ViewHolder viewHolder, RecyclerView.AbstractC1356f.C1359c cVar, RecyclerView.AbstractC1356f.C1359c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f4471a;
        int i4 = cVar.f4472b;
        View view = viewHolder.itemView;
        if (cVar2 == null) {
            i = view.getLeft();
        } else {
            i = cVar2.f4471a;
        }
        if (cVar2 == null) {
            i2 = view.getTop();
        } else {
            i2 = cVar2.f4472b;
        }
        if (viewHolder.isRemoved() || (i3 == i && i4 == i2)) {
            return mo4850a(viewHolder);
        }
        view.layout(i, i2, view.getWidth() + i, view.getHeight() + i2);
        return mo4851a(viewHolder, i3, i4, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1356f
    /* renamed from: b */
    public final boolean mo4669b(RecyclerView.ViewHolder viewHolder, RecyclerView.AbstractC1356f.C1359c cVar, RecyclerView.AbstractC1356f.C1359c cVar2) {
        if (cVar == null || (cVar.f4471a == cVar2.f4471a && cVar.f4472b == cVar2.f4472b)) {
            return mo4853b(viewHolder);
        }
        return mo4851a(viewHolder, cVar.f4471a, cVar.f4472b, cVar2.f4471a, cVar2.f4472b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1356f
    /* renamed from: a */
    public final boolean mo4664a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, RecyclerView.AbstractC1356f.C1359c cVar, RecyclerView.AbstractC1356f.C1359c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f4471a;
        int i4 = cVar.f4472b;
        if (viewHolder2.shouldIgnore()) {
            i = cVar.f4471a;
            i2 = cVar.f4472b;
        } else {
            i = cVar2.f4471a;
            i2 = cVar2.f4472b;
        }
        return mo4852a(viewHolder, viewHolder2, i3, i4, i, i2);
    }
}
