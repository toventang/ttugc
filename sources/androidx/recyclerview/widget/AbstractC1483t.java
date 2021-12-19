package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C1416c;
import androidx.recyclerview.widget.C1418d;
import androidx.recyclerview.widget.C1445j;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.t */
public abstract class AbstractC1483t<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.AbstractC1350a<VH> {

    /* renamed from: a */
    public final C1418d<T> f4921a;

    /* renamed from: b */
    private final C1418d.AbstractC1422a<T> f4922b;

    static {
        Covode.recordClassIndex(1621);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public int getItemCount() {
        return this.f4921a.f4672f.size();
    }

    /* renamed from: a */
    public final void mo5018a(List<T> list) {
        this.f4921a.mo4889a(list, null);
    }

    /* renamed from: a */
    public final T mo5017a(int i) {
        return this.f4921a.f4672f.get(i);
    }

    public AbstractC1483t(C1445j.AbstractC1451e<T> eVar) {
        C14841 r3 = new C1418d.AbstractC1422a<T>() {
            /* class androidx.recyclerview.widget.AbstractC1483t.C14841 */

            static {
                Covode.recordClassIndex(1622);
            }
        };
        this.f4922b = r3;
        C1418d<T> dVar = new C1418d<>(new C1415b(this), new C1416c.C1417a(eVar).mo4887a());
        this.f4921a = dVar;
        dVar.f4670d.add(r3);
    }

    /* renamed from: a */
    public final void mo5019a(List<T> list, Runnable runnable) {
        this.f4921a.mo4889a(list, runnable);
    }
}
