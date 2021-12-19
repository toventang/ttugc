package com.p2082ss.android.ugc.aweme.newfollow.p3507ui;

import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0974l;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.d */
public final class C61516d extends AbstractC0974l {

    /* renamed from: a */
    private ArrayList<Fragment> f139645a = new ArrayList<>();

    static {
        Covode.recordClassIndex(72179);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f139645a.size();
    }

    @Override // androidx.fragment.app.AbstractC0974l
    /* renamed from: a */
    public final Fragment mo3639a(int i) {
        return this.f139645a.get(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence getPageTitle(int i) {
        if (i != 0 && i == 1) {
            return C17867d.m33078a().getString(R.string.c13);
        }
        return "";
    }

    public C61516d(AbstractC0952i iVar, ArrayList<Fragment> arrayList) {
        super(iVar);
        this.f139645a = arrayList;
    }
}
