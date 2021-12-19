package com.p2082ss.android.ugc.aweme.kids.choosemusic.p3319a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.p1284f.AbstractC18272a;
import com.p2082ss.android.ugc.aweme.discover.model.Banner;
import com.p2082ss.android.ugc.aweme.kids.choosemusic.p3327i.C57307g;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.kids.choosemusic.a.g */
public final class C57182g extends AbstractC18272a {

    /* renamed from: d */
    protected List<Banner> f130204d;

    /* renamed from: e */
    private int f130205e;

    static {
        Covode.recordClassIndex(67083);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        List<Banner> list = this.f130204d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: a */
    public final void mo94383a(List<Banner> list) {
        if (this.f130204d != list) {
            this.f130204d = list;
            notifyDataSetChanged();
        }
    }

    public C57182g(Context context, LayoutInflater layoutInflater, int i) {
        super(context, layoutInflater);
        this.f130205e = i;
    }

    @Override // com.bytedance.ies.uikit.p1284f.AbstractC18272a
    /* renamed from: a */
    public final View mo29160a(int i, View view, ViewGroup viewGroup) {
        C57307g gVar;
        if (view == null) {
            view = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_u, viewGroup, false);
            gVar = new C57307g(view, this.f130205e);
            view.setTag(gVar);
        } else {
            gVar = (C57307g) view.getTag();
        }
        if (getCount() > 0) {
            gVar.mo94516a(this.f130204d.get(i), i);
        }
        return view;
    }
}
