package com.bytedance.ies.uikit.p1284f;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.covode.number.Covode;
import java.util.LinkedList;

/* renamed from: com.bytedance.ies.uikit.f.a */
public abstract class AbstractC18272a extends PagerAdapter {

    /* renamed from: a */
    protected final LinkedList<View> f43615a = new LinkedList<>();

    /* renamed from: b */
    protected final LayoutInflater f43616b;

    /* renamed from: c */
    protected final Context f43617c;

    static {
        Covode.recordClassIndex(20932);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract View mo29160a(int i, View view, ViewGroup viewGroup);

    /* renamed from: a */
    public void mo29161a(View view) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public AbstractC18272a(Context context, LayoutInflater layoutInflater) {
        this.f43616b = layoutInflater;
        this.f43617c = context;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View view;
        if (!this.f43615a.isEmpty()) {
            view = this.f43615a.removeFirst();
        } else {
            view = null;
        }
        View a = mo29160a(i, view, viewGroup);
        viewGroup.addView(a);
        return a;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (obj != null) {
            View view = (View) obj;
            viewGroup.removeView(view);
            this.f43615a.add(view);
            mo29161a(view);
        }
    }
}
