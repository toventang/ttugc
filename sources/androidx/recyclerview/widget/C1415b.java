package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.recyclerview.widget.b */
public final class C1415b implements AbstractC1485u {

    /* renamed from: a */
    private final RecyclerView.AbstractC1350a f4657a;

    static {
        Covode.recordClassIndex(1553);
    }

    public C1415b(RecyclerView.AbstractC1350a aVar) {
        this.f4657a = aVar;
    }

    @Override // androidx.recyclerview.widget.AbstractC1485u
    /* renamed from: a */
    public final void mo3773a(int i, int i2) {
        this.f4657a.notifyItemRangeInserted(i, i2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1485u
    /* renamed from: b */
    public final void mo3775b(int i, int i2) {
        this.f4657a.notifyItemRangeRemoved(i, i2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1485u
    /* renamed from: c */
    public final void mo3776c(int i, int i2) {
        this.f4657a.notifyItemMoved(i, i2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1485u
    /* renamed from: a */
    public final void mo3774a(int i, int i2, Object obj) {
        this.f4657a.notifyItemRangeChanged(i, i2, obj);
    }
}
