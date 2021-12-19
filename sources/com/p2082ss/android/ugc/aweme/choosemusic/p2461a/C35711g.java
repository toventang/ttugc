package com.p2082ss.android.ugc.aweme.choosemusic.p2461a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.p1284f.AbstractC18272a;
import com.p2082ss.android.ugc.aweme.choosemusic.viewholder.C36014k;
import com.p2082ss.android.ugc.aweme.discover.model.Banner;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.a.g */
public final class C35711g extends AbstractC18272a {

    /* renamed from: d */
    protected List<Banner> f84241d;

    /* renamed from: e */
    private int f84242e;

    /* renamed from: f */
    private int f84243f;

    static {
        Covode.recordClassIndex(42943);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        List<Banner> list = this.f84241d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: a */
    public final void mo62758a(List<Banner> list) {
        if (this.f84241d != list) {
            this.f84241d = list;
            notifyDataSetChanged();
        }
    }

    @Override // com.bytedance.ies.uikit.p1284f.AbstractC18272a
    /* renamed from: a */
    public final View mo29160a(int i, View view, ViewGroup viewGroup) {
        C36014k kVar;
        if (view == null) {
            view = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.a_u, viewGroup, false);
            kVar = new C36014k(view, this.f84242e, this.f84243f);
            view.setTag(kVar);
        } else {
            kVar = (C36014k) view.getTag();
        }
        if (getCount() > 0) {
            kVar.mo63174a(this.f84241d.get(i), i);
        }
        return view;
    }

    public C35711g(Context context, LayoutInflater layoutInflater, int i, int i2) {
        super(context, layoutInflater);
        this.f84242e = i;
        this.f84243f = i2;
    }
}
