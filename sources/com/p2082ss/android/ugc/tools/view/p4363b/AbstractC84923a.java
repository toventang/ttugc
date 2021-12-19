package com.p2082ss.android.ugc.tools.view.p4363b;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.utils.C80558hx;
import java.util.List;

/* renamed from: com.ss.android.ugc.tools.view.b.a */
public abstract class AbstractC84923a<T> extends AbstractC84926c {

    /* renamed from: h */
    static final String f189753h = AbstractC84923a.class.getSimpleName();

    /* renamed from: f */
    public List<T> f189754f;

    /* renamed from: g */
    protected int f189755g;

    static {
        Covode.recordClassIndex(98917);
    }

    public AbstractC84923a() {
        registerAdapterDataObserver(new RecyclerView.AbstractC1353c() {
            /* class com.p2082ss.android.ugc.tools.view.p4363b.AbstractC84923a.C849241 */

            static {
                Covode.recordClassIndex(98918);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
            /* renamed from: a */
            public final void mo4655a() {
                AbstractC84923a aVar = AbstractC84923a.this;
                aVar.f189755g = aVar.getItemCount();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
            /* renamed from: b */
            public final void mo4660b(int i, int i2) {
                AbstractC84923a aVar = AbstractC84923a.this;
                aVar.f189755g = aVar.getItemCount();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
            /* renamed from: c */
            public final void mo4661c(int i, int i2) {
                AbstractC84923a aVar = AbstractC84923a.this;
                aVar.f189755g = aVar.getItemCount();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
            /* renamed from: a */
            public final void mo4656a(int i, int i2) {
                AbstractC84923a aVar = AbstractC84923a.this;
                aVar.f189755g = aVar.getItemCount();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
            /* renamed from: a */
            public final void mo4657a(int i, int i2, int i3) {
                AbstractC84923a aVar = AbstractC84923a.this;
                aVar.f189755g = aVar.getItemCount();
            }
        });
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4363b.AbstractC84932f
    /* renamed from: a */
    public final int mo112426a() {
        List<T> list = this.f189754f;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: c */
    public final void mo129692c() {
        List<T> list = this.f189754f;
        if (list != null) {
            list.clear();
            notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    public void mo122352b(List<T> list) {
        C80558hx.m139642a(0, new C84925b(this, list));
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.tools.view.p4363b.AbstractC84932f
    /* renamed from: c */
    public final void mo129694c(boolean z) {
        if (z) {
            notifyItemInserted(getItemCount() - 1);
        } else {
            notifyItemRemoved(getItemCount());
        }
        this.f189755g = getItemCount();
    }

    /* renamed from: c */
    public final void mo129693c(List<T> list) {
        this.f189754f = list;
        if (this.f189783q) {
            notifyItemRangeInserted(this.f189755g - 1, getItemCount() - this.f189755g);
            notifyItemChanged(getItemCount() - 1);
            return;
        }
        notifyItemRangeInserted(this.f189755g, getItemCount() - this.f189755g);
    }
}
