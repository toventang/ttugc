package com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.lazy;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.lazy.b */
public abstract class AbstractC72360b<T> extends PagerAdapter {

    /* renamed from: b */
    protected SparseArray<T> f162228b = new SparseArray<>();

    /* renamed from: c */
    protected T f162229c;

    static {
        Covode.recordClassIndex(85030);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo114382a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo114641a(ViewGroup viewGroup, int i);

    /* renamed from: b */
    public final boolean mo114642b(int i) {
        if (this.f162228b.get(i) != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        this.f162229c = mo114641a(viewGroup, i);
    }
}
