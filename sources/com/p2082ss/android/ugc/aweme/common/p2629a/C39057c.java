package com.p2082ss.android.ugc.aweme.common.p2629a;

import android.view.ViewGroup;
import androidx.p025c.C0498h;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: com.ss.android.ugc.aweme.common.a.c */
public final class C39057c<T> {

    /* renamed from: c */
    private static final List<Object> f92228c = Collections.emptyList();

    /* renamed from: a */
    protected C0498h<AbstractC39056b<T>> f92229a = new C0498h<>();

    /* renamed from: b */
    public AbstractC39056b<T> f92230b;

    static {
        Covode.recordClassIndex(46673);
    }

    /* renamed from: b */
    public final void mo67799b() {
        if (this.f92229a != null) {
            for (int i = 0; i < this.f92229a.mo2184b(); i++) {
                if (this.f92229a.mo2190d(i) != null) {
                    this.f92229a.mo2190d(i);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo67795a() {
        if (this.f92229a != null) {
            for (int i = 0; i < this.f92229a.mo2184b(); i++) {
                if (this.f92229a.mo2190d(i) != null) {
                    this.f92229a.mo2190d(i);
                }
            }
        }
    }

    /* renamed from: a */
    private AbstractC39056b<T> m79262a(int i) {
        return this.f92229a.mo2183a(i, this.f92230b);
    }

    /* renamed from: b */
    public final boolean mo67800b(RecyclerView.ViewHolder viewHolder) {
        if (m79262a(viewHolder.getItemViewType()) != null) {
            return false;
        }
        throw new NullPointerException("No delegate found for " + viewHolder + " for item at position = " + viewHolder.getAdapterPosition() + " for viewType = " + viewHolder.getItemViewType());
    }

    /* renamed from: c */
    public final void mo67801c(RecyclerView.ViewHolder viewHolder) {
        if (m79262a(viewHolder.getItemViewType()) == null) {
            throw new NullPointerException("No delegate found for " + viewHolder + " for item at position = " + viewHolder.getAdapterPosition() + " for viewType = " + viewHolder.getItemViewType());
        }
    }

    /* renamed from: d */
    public final void mo67802d(RecyclerView.ViewHolder viewHolder) {
        if (m79262a(viewHolder.getItemViewType()) == null) {
            throw new NullPointerException("No delegate found for " + viewHolder + " for item at position = " + viewHolder.getAdapterPosition() + " for viewType = " + viewHolder.getItemViewType());
        }
    }

    /* renamed from: a */
    public final C39057c<T> mo67794a(AbstractC39056b<T> bVar) {
        int b = this.f92229a.mo2184b();
        while (this.f92229a.mo2183a(b, null) != null) {
            b++;
            if (b == 2147483646) {
                throw new IllegalArgumentException("Oops, we are very close to Integer.MAX_VALUE. It seems that there are no more free and unused view type integers left to add another AdapterDelegate.");
            }
        }
        Objects.requireNonNull(bVar, "AdapterDelegate is null!");
        if (b == 2147483646) {
            throw new IllegalArgumentException("The view type = 2147483646 is reserved for fallback adapter delegate (see setFallbackDelegate() ). Please use another view type.");
        } else if (this.f92229a.mo2182a(b) == null) {
            this.f92229a.mo2186b(b, bVar);
            return this;
        } else {
            throw new IllegalArgumentException("An AdapterDelegate is already registered for the viewType = " + b + ". Already registered AdapterDelegate is " + this.f92229a.mo2182a(b));
        }
    }

    /* renamed from: a */
    public final void mo67796a(RecyclerView.ViewHolder viewHolder) {
        if (m79262a(viewHolder.getItemViewType()) == null) {
            throw new NullPointerException("No delegate found for " + viewHolder + " for item at position = " + viewHolder.getAdapterPosition() + " for viewType = " + viewHolder.getItemViewType());
        }
    }

    /* renamed from: a */
    public final RecyclerView.ViewHolder mo67793a(ViewGroup viewGroup, int i) {
        AbstractC39056b<T> a = m79262a(i);
        if (a != null) {
            return a.mo63163a(viewGroup);
        }
        throw new NullPointerException("No AdapterDelegate added for ViewType ".concat(String.valueOf(i)));
    }

    /* renamed from: a */
    public final int mo67792a(T t, int i) {
        Objects.requireNonNull(t, "Items datasource is null!");
        int b = this.f92229a.mo2184b();
        for (int i2 = 0; i2 < b; i2++) {
            if (this.f92229a.mo2190d(i2).mo63165a(t, i)) {
                return this.f92229a.mo2187c(i2);
            }
        }
        if (this.f92230b != null) {
            return 2147483646;
        }
        throw new NullPointerException("No AdapterDelegate added that matches position=" + i + " delegates=" + this.f92229a + " items=" + ((Object) t));
    }

    /* renamed from: a */
    public final void mo67797a(T t, int i, RecyclerView.ViewHolder viewHolder) {
        mo67798a(t, i, viewHolder, f92228c);
    }

    /* renamed from: a */
    public final void mo67798a(T t, int i, RecyclerView.ViewHolder viewHolder, List list) {
        AbstractC39056b<T> a = m79262a(viewHolder.getItemViewType());
        if (a != null) {
            if (list == null) {
                list = f92228c;
            }
            a.mo63164a(t, i, viewHolder, list);
            return;
        }
        throw new NullPointerException("No delegate found for item at position = " + i + " for viewType = " + viewHolder.getItemViewType());
    }
}
