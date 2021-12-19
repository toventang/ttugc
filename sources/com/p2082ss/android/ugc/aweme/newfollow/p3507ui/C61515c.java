package com.p2082ss.android.ugc.aweme.newfollow.p3507ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.C1764a;
import com.bytedance.analytics.page.AbstractC2599d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.p1106a.AbstractC15497d;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.discover.C41856b;
import com.p2082ss.android.ugc.aweme.discover.activity.AbstractC41570a;
import com.p2082ss.android.ugc.aweme.discover.p2767c.AbstractC41896b;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.c */
public class C61515c extends AbstractC34586a implements AbstractC2599d, AbstractC15497d {

    /* renamed from: a */
    ViewPager f139643a;

    /* renamed from: b */
    private ArrayList<Fragment> f139644b = new ArrayList<>();

    static {
        Covode.recordClassIndex(72178);
    }

    @Override // com.bytedance.hox.p1106a.AbstractC15497d
    /* renamed from: a */
    public final void mo25223a(Bundle bundle) {
    }

    @Override // com.bytedance.analytics.page.AbstractC2599d
    public final String ah_() {
        return "MainTabPage";
    }

    @Override // com.bytedance.hox.p1106a.AbstractC15497d
    /* renamed from: b */
    public final void mo25224b(Bundle bundle) {
    }

    @Override // com.bytedance.analytics.page.AbstractC2597b
    public final String bv_() {
        return "DISCOVER";
    }

    @Override // com.bytedance.analytics.page.AbstractC2597b
    /* renamed from: c */
    public final Map<String, String> mo7085c() {
        return null;
    }

    @Override // com.bytedance.analytics.page.AbstractC2597b
    public final String ag_() {
        return String.valueOf(1055811561);
    }

    /* renamed from: e */
    public final AbstractC41896b mo99171e() {
        if (this.f139644b.size() == 0 || !(this.f139644b.get(0) instanceof AbstractC41896b)) {
            return null;
        }
        return (AbstractC41896b) this.f139644b.get(0);
    }

    /* renamed from: g */
    public final AbstractC41570a mo99172g() {
        if (this.f139644b.size() == 0 || !(this.f139644b.get(0) instanceof AbstractC41570a)) {
            return null;
        }
        return (AbstractC41570a) this.f139644b.get(0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        Iterator<Fragment> it = this.f139644b.iterator();
        while (it.hasNext()) {
            it.next().setUserVisibleHint(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        this.f139643a = (ViewPager) view.findViewById(R.id.fgn);
        super.onViewCreated(view, bundle);
        this.f139644b.clear();
        Bundle bundle2 = new Bundle();
        bundle2.putSerializable("i18n_tab_mode", true);
        Fragment a = getChildFragmentManager().mo3551a(new StringBuilder("android:switcher:2131370289:0").toString());
        if (a == null) {
            a = C41856b.f97654a.mo70759a();
            a.setArguments(bundle2);
        }
        this.f139644b.add(a);
        this.f139643a.setAdapter(new C61516d(getChildFragmentManager(), this.f139644b));
        this.f139643a.setOverScrollMode(2);
        this.f139643a.setCurrentItem(0);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C1764a.m5927a(layoutInflater, R.layout.a0z, viewGroup, false);
    }
}
