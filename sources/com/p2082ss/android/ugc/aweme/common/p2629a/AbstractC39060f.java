package com.p2082ss.android.ugc.aweme.common.p2629a;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.common.a.f */
public abstract class AbstractC39060f<T> extends AbstractC39063h {

    /* renamed from: n */
    static final String f92235n = AbstractC39060f.class.getSimpleName();

    /* renamed from: l */
    public List<T> f92236l;

    /* renamed from: m */
    protected int f92237m;

    /* renamed from: e */
    public List<T> mo63369e() {
        return this.f92236l;
    }

    public AbstractC39060f() {
        this((byte) 0);
    }

    static {
        Covode.recordClassIndex(46676);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public int mo60933c() {
        List<T> list = this.f92236l;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: f */
    public void mo67810f() {
        List<T> list = this.f92236l;
        if (list != null) {
            list.clear();
            notifyDataSetChanged();
        }
    }

    /* renamed from: b_ */
    public void mo62377b_(List<T> list) {
        this.f92236l = list;
        notifyDataSetChanged();
    }

    public AbstractC39060f(byte b) {
        registerAdapterDataObserver(new RecyclerView.AbstractC1353c() {
            /* class com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f.C390611 */

            static {
                Covode.recordClassIndex(46677);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
            /* renamed from: a */
            public final void mo4655a() {
                AbstractC39060f fVar = AbstractC39060f.this;
                fVar.f92237m = fVar.getItemCount();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
            /* renamed from: b */
            public final void mo4660b(int i, int i2) {
                AbstractC39060f fVar = AbstractC39060f.this;
                fVar.f92237m = fVar.getItemCount();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
            /* renamed from: c */
            public final void mo4661c(int i, int i2) {
                AbstractC39060f fVar = AbstractC39060f.this;
                fVar.f92237m = fVar.getItemCount();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
            /* renamed from: a */
            public final void mo4656a(int i, int i2) {
                AbstractC39060f fVar = AbstractC39060f.this;
                fVar.f92237m = fVar.getItemCount();
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1353c
            /* renamed from: a */
            public final void mo4657a(int i, int i2, int i3) {
                AbstractC39060f fVar = AbstractC39060f.this;
                fVar.f92237m = fVar.getItemCount();
            }
        });
    }

    /* renamed from: d */
    public final void mo67809d(List<T> list) {
        this.f92236l = list;
        notifyItemRangeInserted(0, getItemCount() - this.f92237m);
    }

    /* renamed from: a */
    public void mo63358a(T t) {
        if (this.f92236l == null) {
            this.f92236l = new ArrayList();
        }
        this.f92236l.add(0, t);
        notifyItemInserted(0);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: b */
    public final void mo67808b(boolean z) {
        if (z) {
            notifyItemInserted(getItemCount() - 1);
        } else {
            notifyItemRemoved(getItemCount());
        }
        this.f92237m = getItemCount();
    }

    /* renamed from: c */
    public void mo63366c(List<T> list) {
        if (!C13603b.m24435a((Collection) list)) {
            if (this.f92236l == null) {
                this.f92236l = new ArrayList();
            }
            this.f92236l.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    public void mo62376b(List<T> list) {
        this.f92236l = list;
        if (this.f92274v) {
            notifyItemRangeInserted(this.f92237m - 1, getItemCount() - this.f92237m);
            notifyItemChanged(getItemCount() - 1);
            return;
        }
        notifyItemRangeInserted(this.f92237m, getItemCount() - this.f92237m);
    }
}
