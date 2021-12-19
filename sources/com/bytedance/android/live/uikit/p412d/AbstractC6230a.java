package com.bytedance.android.live.uikit.p412d;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.covode.number.Covode;
import java.util.LinkedList;

/* renamed from: com.bytedance.android.live.uikit.d.a */
public abstract class AbstractC6230a extends PagerAdapter {

    /* renamed from: b */
    protected final LinkedList<View> f15585b = new LinkedList<>();

    /* renamed from: c */
    protected final LayoutInflater f15586c;

    /* renamed from: d */
    protected final Context f15587d;

    static {
        Covode.recordClassIndex(6936);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract View mo10387a(int i, View view, ViewGroup viewGroup);

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public AbstractC6230a(Context context, LayoutInflater layoutInflater) {
        this.f15586c = layoutInflater;
        this.f15587d = context;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View view;
        if (!this.f15585b.isEmpty()) {
            view = this.f15585b.removeFirst();
        } else {
            view = null;
        }
        View a = mo10387a(i, view, viewGroup);
        viewGroup.addView(a);
        return a;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (obj != null) {
            View view = (View) obj;
            viewGroup.removeView(view);
            this.f15585b.add(view);
        }
    }
}
