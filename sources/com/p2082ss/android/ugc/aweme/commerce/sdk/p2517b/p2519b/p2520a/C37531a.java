package com.p2082ss.android.ugc.aweme.commerce.sdk.p2517b.p2519b.p2520a;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.ecommerce.gallery.transfer.C44503d;
import com.p2082ss.android.ugc.aweme.ecommerce.gallery.transfer.C44507e;
import com.p2082ss.android.ugc.aweme.ecommerce.gallery.transfer.p2845a.AbstractC44498a;
import com.p2082ss.android.ugc.aweme.ecommerce.gallery.view.p2846a.C44529c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commerce.sdk.b.b.a.a */
public final class C37531a extends AbstractC44498a {

    /* renamed from: a */
    public C44507e f88651a;

    /* renamed from: d */
    private int f88652d;

    /* renamed from: e */
    private SparseArray<FrameLayout> f88653e = new SparseArray<>();

    static {
        Covode.recordClassIndex(44919);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(obj, "");
        return view == obj;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        C44503d transConfig = this.f88651a.getTransConfig();
        if (transConfig == null || transConfig.f103764t == null) {
            return this.f103736b;
        }
        return this.f103736b + 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.gallery.transfer.p2845a.AbstractC44498a
    /* renamed from: a */
    public final C44529c mo65352a(int i) {
        FrameLayout frameLayout = this.f88653e.get(i);
        if (frameLayout != null) {
            int childCount = frameLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = frameLayout.getChildAt(i2);
                if (childAt instanceof ImageView) {
                    return (C44529c) childAt;
                }
            }
        }
        return null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        View view;
        MethodCollector.m26663i(7913);
        C89219l.m154721d(viewGroup, "");
        FrameLayout frameLayout = this.f88653e.get(i);
        if (frameLayout == null) {
            C44503d transConfig = this.f88651a.getTransConfig();
            if (transConfig != null) {
                view = transConfig.f103764t;
            } else {
                view = null;
            }
            if (view == null || i != this.f103736b) {
                Context context = viewGroup.getContext();
                C44503d transConfig2 = this.f88651a.getTransConfig();
                C44529c cVar = new C44529c(context);
                C89219l.m154716b(transConfig2, "");
                cVar.setDuration(transConfig2.f103748d);
                cVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
                cVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                cVar.setOnScaleListener(this.f88651a.getOnScaleListener());
                frameLayout = new FrameLayout(context);
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(cVar);
                if (transConfig2.f103749e) {
                    this.f88651a.mo75526c().mo75512a(cVar, i);
                }
                this.f88653e.put(i, frameLayout);
                if (i == this.f88652d && this.f103737c != null) {
                    this.f103737c.mo75509a();
                }
            } else {
                Context context2 = viewGroup.getContext();
                C44503d transConfig3 = this.f88651a.getTransConfig();
                frameLayout = new FrameLayout(context2);
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                C89219l.m154716b(transConfig3, "");
                frameLayout.addView(transConfig3.f103764t);
                this.f88653e.put(i, frameLayout);
            }
        }
        ViewGroup viewGroup2 = (ViewGroup) frameLayout.getParent();
        if (viewGroup2 != null) {
            viewGroup2.removeView(frameLayout);
        }
        try {
            viewGroup.addView(frameLayout);
        } catch (Exception e) {
            e.printStackTrace();
        }
        MethodCollector.m26664o(7913);
        return frameLayout;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        MethodCollector.m26663i(7910);
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(obj, "");
        viewGroup.removeView((View) obj);
        MethodCollector.m26664o(7910);
    }

    public C37531a(C44507e eVar, int i, int i2) {
        C89219l.m154721d(eVar, "");
        this.f88651a = eVar;
        this.f103736b = i;
        int i3 = i2 + 1;
        i3 = i3 == this.f103736b ? i2 - 1 : i3;
        this.f88652d = i3;
        if (i3 < 0) {
            this.f88652d = 0;
        }
    }
}
