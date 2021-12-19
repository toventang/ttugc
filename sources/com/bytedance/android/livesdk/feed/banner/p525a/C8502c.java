package com.bytedance.android.livesdk.feed.banner.p525a;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.android.live.uikit.p412d.AbstractC6230a;
import com.bytedance.android.livesdk.feed.AbstractC8654p;
import com.bytedance.android.livesdk.model.C9594m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.feed.banner.a.c */
public final class C8502c extends AbstractC6230a {

    /* renamed from: a */
    public List<C9594m> f21030a = new ArrayList();

    /* renamed from: e */
    public String f21031e;

    /* renamed from: f */
    private AbstractC8654p f21032f;

    static {
        Covode.recordClassIndex(9356);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getItemPosition(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        List<C9594m> list = this.f21030a;
        if (list == null) {
            return 0;
        }
        if (list.size() > 1) {
            return Integer.MAX_VALUE;
        }
        return this.f21030a.size();
    }

    /* renamed from: a */
    public final void mo14822a(List<C9594m> list) {
        this.f21030a.clear();
        if (list != null) {
            this.f21030a.addAll(list);
        }
        notifyDataSetChanged();
    }

    @Override // androidx.viewpager.widget.PagerAdapter, com.bytedance.android.live.uikit.p412d.AbstractC6230a
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        MethodCollector.m26663i(3236);
        if (obj == null) {
            MethodCollector.m26664o(3236);
            return;
        }
        View view = (View) obj;
        viewGroup.removeView(view);
        if (this.f15585b.size() < this.f21030a.size()) {
            this.f15585b.add(view);
        }
        MethodCollector.m26664o(3236);
    }

    @Override // com.bytedance.android.live.uikit.p412d.AbstractC6230a
    /* renamed from: a */
    public final View mo10387a(int i, View view, ViewGroup viewGroup) {
        C8500a aVar;
        View view2 = view;
        if (view2 == null) {
            view2 = C1764a.m5927a(this.f15586c, R.layout.b9i, viewGroup, false);
            aVar = new C8500a(view2, viewGroup.getContext(), this.f21031e, this.f21032f, i % this.f21030a.size());
            view2.setTag(aVar);
        } else {
            aVar = (C8500a) view2.getTag();
        }
        List<C9594m> list = this.f21030a;
        if (list != null && !list.isEmpty()) {
            List<C9594m> list2 = this.f21030a;
            C9594m mVar = list2.get(i % list2.size());
            aVar.f21025e = mVar;
            if (mVar != null) {
                aVar.f21023c.setVisibility(8);
                String str = mVar.f23279h;
                if (!(mVar.mo16557a() == null || mVar.mo16557a().getUrls() == null || mVar.mo16557a().getUrls().size() <= 0)) {
                    aVar.f21021a.setImageURI(mVar.mo16557a().getUrls().get(0));
                }
                if (TextUtils.isEmpty(str)) {
                    aVar.f21022b.setVisibility(8);
                } else {
                    aVar.f21022b.setVisibility(0);
                    aVar.f21022b.setText(str);
                }
            }
        }
        return view2;
    }

    public C8502c(Context context, LayoutInflater layoutInflater, String str, AbstractC8654p pVar) {
        super(context, layoutInflater);
        this.f21031e = str;
        this.f21032f = pVar;
    }
}
