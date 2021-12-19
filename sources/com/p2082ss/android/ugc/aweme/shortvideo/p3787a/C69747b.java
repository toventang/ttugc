package com.p2082ss.android.ugc.aweme.shortvideo.p3787a;

import android.view.ViewGroup;
import androidx.p025c.C0498h;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.a.b */
public final class C69747b<T> {

    /* renamed from: c */
    private static final List<Object> f155870c = Collections.emptyList();

    /* renamed from: a */
    protected C0498h<AbstractC69746a<T>> f155871a = new C0498h<>();

    /* renamed from: b */
    public AbstractC69746a<T> f155872b;

    static {
        Covode.recordClassIndex(82153);
    }

    /* renamed from: b */
    public final void mo110113b() {
        if (this.f155871a != null) {
            for (int i = 0; i < this.f155871a.mo2184b(); i++) {
                if (this.f155871a.mo2190d(i) != null) {
                    this.f155871a.mo2190d(i);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo110111a() {
        if (this.f155871a != null) {
            for (int i = 0; i < this.f155871a.mo2184b(); i++) {
                if (this.f155871a.mo2190d(i) != null) {
                    this.f155871a.mo2190d(i);
                }
            }
        }
    }

    /* renamed from: a */
    private AbstractC69746a<T> m123274a(int i) {
        return this.f155871a.mo2183a(i, this.f155872b);
    }

    /* renamed from: a */
    public final C69747b<T> mo110110a(AbstractC69746a<T> aVar) {
        int b = this.f155871a.mo2184b();
        while (this.f155871a.mo2183a(b, null) != null) {
            b++;
            if (b == 2147483646) {
                throw new IllegalArgumentException("Oops, we are very close to Integer.MAX_VALUE. It seems that there are no more free and unused view type integers left to add another AdapterDelegate.");
            }
        }
        if (b == 2147483646) {
            throw new IllegalArgumentException("The view type = 2147483646 is reserved for fallback adapter delegate (see setFallbackDelegate() ). Please use another view type.");
        } else if (this.f155871a.mo2182a(b) == null) {
            this.f155871a.mo2186b(b, aVar);
            return this;
        } else {
            throw new IllegalArgumentException("An AdapterDelegate is already registered for the viewType = " + b + ". Already registered AdapterDelegate is " + this.f155871a.mo2182a(b));
        }
    }

    /* renamed from: a */
    public final RecyclerView.ViewHolder mo110109a(ViewGroup viewGroup, int i) {
        AbstractC69746a<T> a = m123274a(i);
        if (a != null) {
            return a.mo110105a(viewGroup);
        }
        throw new NullPointerException("No AdapterDelegate added for ViewType ".concat(String.valueOf(i)));
    }

    /* renamed from: a */
    public final int mo110108a(T t, int i) {
        Objects.requireNonNull(t, "Items datasource is null!");
        int b = this.f155871a.mo2184b();
        for (int i2 = 0; i2 < b; i2++) {
            if (this.f155871a.mo2190d(i2).mo110107a(t, i)) {
                return this.f155871a.mo2187c(i2);
            }
        }
        if (this.f155872b != null) {
            return 2147483646;
        }
        throw new NullPointerException("No AdapterDelegate added that matches position=" + i + " delegates=" + this.f155871a + " items=" + ((Object) t));
    }

    /* renamed from: a */
    public final void mo110112a(T t, int i, RecyclerView.ViewHolder viewHolder) {
        List<Object> list = f155870c;
        AbstractC69746a<T> a = m123274a(viewHolder.getItemViewType());
        if (a != null) {
            a.mo110106a(t, i, viewHolder, list);
            return;
        }
        throw new NullPointerException("No delegate found for item at position = " + i + " for viewType = " + viewHolder.getItemViewType());
    }
}
