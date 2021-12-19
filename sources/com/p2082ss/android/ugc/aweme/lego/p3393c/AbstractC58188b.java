package com.p2082ss.android.ugc.aweme.lego.p3393c;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.lego.c.b */
public abstract class AbstractC58188b<T> extends PagerAdapter {

    /* renamed from: d */
    protected SparseArray<T> f132497d = new SparseArray<>();

    /* renamed from: e */
    protected T f132498e;

    static {
        Covode.recordClassIndex(68254);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo62762a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract T mo70816b(ViewGroup viewGroup, int i);

    /* renamed from: b */
    public boolean mo70817b(int i) {
        if (this.f132497d.get(i) != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        this.f132498e = mo70816b(viewGroup, i);
    }
}
