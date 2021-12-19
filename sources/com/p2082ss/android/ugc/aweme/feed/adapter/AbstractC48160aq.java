package com.p2082ss.android.ugc.aweme.feed.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.covode.number.Covode;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.p2082ss.android.ugc.aweme.common.widget.C39192d;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import java.util.LinkedList;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.aq */
public abstract class AbstractC48160aq extends PagerAdapter {

    /* renamed from: r */
    protected final LinkedList<View>[] f111551r;

    /* renamed from: s */
    protected final LayoutInflater f111552s;

    /* renamed from: t */
    protected final Context f111553t;

    /* renamed from: u */
    public final int f111554u = 17;

    static {
        Covode.recordClassIndex(56902);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract View mo80295a(int i, View view, ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo80296b(int i);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo80297b(View view);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo80298c(View view) {
    }

    /* renamed from: e */
    public void mo80299e(View view) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo80294a(int i) {
        int b = mo80296b(i);
        if (b >= 0 && b < this.f111554u) {
            return b;
        }
        C51423a.m95786a(new Exception("getItemViewType must return a number which is form 0 to " + (this.f111554u - 1)));
        return 0;
    }

    public AbstractC48160aq(Context context, LayoutInflater layoutInflater) {
        this.f111552s = layoutInflater;
        this.f111553t = context;
        LinkedList<View>[] linkedListArr = new LinkedList[17];
        int i = 0;
        do {
            linkedListArr[i] = new LinkedList<>();
            i++;
        } while (i < 17);
        this.f111551r = linkedListArr;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        View view;
        int a = mo80294a(i);
        if (!this.f111551r[a].isEmpty()) {
            view = this.f111551r[a].removeFirst();
        } else {
            view = null;
        }
        View a2 = mo80295a(i, view, viewGroup);
        if (a2.getParent() != null) {
            try {
                ((ViewGroup) a2.getParent()).removeView(a2);
            } catch (Exception e) {
                C13468b.m24210a(e);
                C51423a.m95788a("", e);
            }
        }
        if (a2.getParent() != viewGroup) {
            viewGroup.addView(a2);
        }
        mo80298c(a2);
        return a2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (obj != null) {
            View view = (View) obj;
            try {
                viewGroup.removeView(view);
                C39192d.m79544a("destroyItem removeView");
            } catch (Exception e) {
                C51423a.m95788a("", e);
            }
            this.f111551r[mo80297b(view)].add(view);
            mo80299e(view);
        }
    }
}
