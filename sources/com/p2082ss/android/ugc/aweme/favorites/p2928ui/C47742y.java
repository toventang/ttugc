package com.p2082ss.android.ugc.aweme.favorites.p2928ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.ies.dmt.p1194ui.widget.tablayout.C17299b;
import com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.comment.p2490d.C36401a;
import com.p2082ss.android.ugc.aweme.commercialize.e_commerce.service.ShoppingAdsServiceImpl;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.experiment.C46794ck;
import com.p2082ss.android.ugc.aweme.favorites.p2919a.C47185f;
import com.p2082ss.android.ugc.aweme.favorites.p2926h.C47434a;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64118co;
import com.p2082ss.android.ugc.aweme.question.p3660b.C66503a;
import com.p2082ss.android.ugc.trill.R;
import dagger.AbstractC88075a;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.favorites.ui.y */
public final class C47742y extends AbstractC47712i implements ViewPager.AbstractC1579e {

    /* renamed from: a */
    protected AbstractC88075a<C47185f> f110652a;

    /* renamed from: b */
    protected AbstractC88075a<String> f110653b;

    /* renamed from: c */
    protected TextTitleBar f110654c;

    /* renamed from: d */
    DmtTabLayout f110655d;

    /* renamed from: e */
    protected ViewPager f110656e;

    /* renamed from: j */
    boolean f110657j;

    /* renamed from: k */
    public String[] f110658k;

    /* renamed from: l */
    public boolean f110659l;

    /* renamed from: m */
    public int f110660m;

    /* renamed from: n */
    public int f110661n;

    /* renamed from: o */
    public boolean f110662o = true;

    /* renamed from: p */
    private String f110663p;

    /* renamed from: q */
    private String f110664q;

    static {
        Covode.recordClassIndex(56364);
    }

    @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f110652a.get().mo79581a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo79839a() {
        DmtTabLayout dmtTabLayout = this.f110655d;
        if (dmtTabLayout != null) {
            C17299b.m32026a(dmtTabLayout);
        }
        ViewPager viewPager = this.f110656e;
        if (viewPager != null) {
            viewPager.setCurrentItem(this.f110661n);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onResume() {
        AbstractC64118co coVar;
        super.onResume();
        if (!this.f110657j && this.f110652a.get() != null) {
            C47185f fVar = this.f110652a.get();
            int i = this.f110661n;
            fVar.mo79582c(i);
            if (fVar.f109823a != null && i >= 0 && i < fVar.f109823a.size() && (fVar.f109823a.get(i) instanceof AbstractC64118co) && (coVar = (AbstractC64118co) fVar.f109823a.get(i)) != null) {
                coVar.aC_();
            }
        }
        this.f110657j = false;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
    public final void onPageSelected(int i) {
        if (this.f110652a.get() != null && i >= 0 && i < this.f110652a.get().getCount()) {
            this.f110661n = i;
            C47185f fVar = this.f110652a.get();
            fVar.mo79582c(i);
            if (fVar.f109823a != null && i < fVar.f109823a.size()) {
                if (fVar.f109823a.get(i) instanceof AbstractC64118co) {
                    AbstractC64118co coVar = (AbstractC64118co) fVar.f109823a.get(i);
                    if (coVar != null && coVar.ci_()) {
                        coVar.bS_();
                    }
                } else if (fVar.f109823a.get(i) instanceof AbstractC47713j) {
                    ((AbstractC47713j) fVar.f109823a.get(i)).bm_();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ArrayList arrayList = new ArrayList();
        if (!C46794ck.m90140b()) {
            arrayList.add("video");
            arrayList.add("music");
            arrayList.add("sticker");
            if (C36401a.m74098a()) {
                arrayList.add(UGCMonitor.EVENT_COMMENT);
            }
            if (C66503a.f149498a) {
                arrayList.add("question");
            }
            arrayList.add("challenge");
            if (ShoppingAdsServiceImpl.m76354d() != null && ShoppingAdsServiceImpl.m76354d().mo65746a()) {
                arrayList.add("product");
            }
        } else {
            arrayList.add("video");
            arrayList.add("challenge");
            arrayList.add("music");
            arrayList.add("sticker");
            if (C36401a.m74098a()) {
                arrayList.add(UGCMonitor.EVENT_COMMENT);
            }
            if (C66503a.f149498a) {
                arrayList.add("question");
            }
            if (ShoppingAdsServiceImpl.m76354d() != null && ShoppingAdsServiceImpl.m76354d().mo65746a()) {
                arrayList.add("product");
            }
        }
        String[] strArr = new String[arrayList.size()];
        this.f110658k = strArr;
        this.f110658k = (String[]) arrayList.toArray(strArr);
    }

    /* renamed from: a */
    private static String m90792a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        super.onViewCreated(view, bundle);
        this.f110654c = (TextTitleBar) view.findViewById(R.id.eiz);
        this.f110655d = (DmtTabLayout) view.findViewById(R.id.ee7);
        this.f110656e = (ViewPager) view.findViewById(R.id.fgn);
        Intent intent = getActivity().getIntent();
        this.f110656e.setAdapter(this.f110652a.get());
        if (intent != null) {
            if (intent.hasExtra("tab_name")) {
                this.f110664q = m90792a(intent, "tab_name");
                int i2 = 0;
                while (true) {
                    String[] strArr = this.f110658k;
                    if (i2 >= strArr.length) {
                        break;
                    } else if (TextUtils.equals(this.f110664q, strArr[i2])) {
                        this.f110660m = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                int i3 = this.f110660m;
                if (i3 > 0 && i3 < this.f110652a.get().getCount()) {
                    this.f110661n = this.f110660m;
                    this.f110659l = true;
                }
            } else if (intent.hasExtra("index")) {
                int intValue = Integer.valueOf(m90792a(intent, "index")).intValue();
                this.f110660m = intValue;
                if (intValue > 0 && intValue < this.f110652a.get().getCount()) {
                    this.f110661n = this.f110660m;
                    this.f110659l = true;
                }
            }
            if (intent.hasExtra("enter_method")) {
                this.f110663p = m90792a(intent, "enter_method");
            } else {
                this.f110663p = "click_h5";
            }
            if (intent.hasExtra("tab_name")) {
                this.f110664q = m90792a(intent, "tab_name");
            }
            C33744d dVar = new C33744d();
            if (!TextUtils.isEmpty(this.f110653b.get())) {
                dVar.mo59983a("enter_from", this.f110653b.get());
            }
            if (!TextUtils.isEmpty(this.f110663p)) {
                dVar.mo59983a("enter_method", this.f110663p);
            }
            if (intent.hasExtra("scene_id")) {
                dVar.mo59980a("scene_id", intent.getIntExtra("scene_id", 0));
            }
            if (!TextUtils.isEmpty(this.f110663p)) {
                dVar.mo59983a("enter_method", this.f110663p);
            }
            if (!TextUtils.isEmpty(this.f110664q)) {
                dVar.mo59983a("tab_name", this.f110664q);
            }
            C39162r.m79460a("enter_personal_favourite", dVar.f79943a);
        }
        this.f110655d.setCustomTabViewResId(R.layout.a01);
        this.f110655d.setupWithViewPager(this.f110656e);
        this.f110655d.setOnTabClickListener(new C47602aa(this));
        this.f110655d.mo27521a(new DmtTabLayout.AbstractC17289c() {
            /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47742y.C477442 */

            static {
                Covode.recordClassIndex(56366);
            }

            @Override // com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout.AbstractC17289c
            /* renamed from: b */
            public final void mo27575b(DmtTabLayout.C17294f fVar) {
            }

            @Override // com.bytedance.ies.dmt.p1194ui.widget.tablayout.DmtTabLayout.AbstractC17289c
            /* renamed from: a */
            public final void mo27574a(DmtTabLayout.C17294f fVar) {
                String str;
                int i = fVar.f41524e;
                if (C47742y.this.f110662o) {
                    str = "click";
                } else {
                    str = "slide";
                }
                if (C47742y.this.f110659l) {
                    if (i == C47742y.this.f110660m) {
                        C47434a.m90447a(str, C47742y.this.f110658k[i]);
                    }
                    C47742y.this.f110659l = false;
                } else {
                    C47434a.m90447a(str, C47742y.this.f110658k[i]);
                }
                C47742y.this.f110662o = false;
                fVar.f41528i.findViewById(R.id.c9q).setVisibility(8);
                if (!C46794ck.m90140b()) {
                    if (TextUtils.equals(C47742y.this.f110658k[C47742y.this.f110661n], "music")) {
                        C47742y.this.f110652a.get().mo79581a();
                    }
                } else if (TextUtils.equals(C47742y.this.f110658k[C47742y.this.f110661n], "challenge")) {
                    C47742y.this.f110652a.get().mo79581a();
                }
            }
        });
        this.f110655d.setTabMode(0);
        this.f110655d.setAutoFillWhenScrollable(true);
        this.f110655d.mo27519a(C34728n.m70946a(16.0d), C34728n.m70946a(16.0d));
        this.f110656e.addOnPageChangeListener(this);
        if (C66503a.f149498a) {
            i = 6;
        } else {
            i = 5;
        }
        this.f110656e.setOffscreenPageLimit(i);
        this.f110654c.setOnTitleBarClickListener(new AbstractC17251a() {
            /* class com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47742y.C477431 */

            static {
                Covode.recordClassIndex(56365);
            }

            @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
            /* renamed from: b */
            public final void mo27340b(View view) {
            }

            @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
            /* renamed from: a */
            public final void mo27339a(View view) {
                C47742y yVar = C47742y.this;
                if (yVar.getActivity() != null && (yVar.getActivity() instanceof UserFavoritesActivity)) {
                    yVar.getActivity().finish();
                }
            }
        });
        C47434a.f110164a = this.f110653b.get();
        this.f110655d.post(new RunnableC47745z(this));
        ViewPager viewPager = this.f110656e;
        if (viewPager != null) {
            viewPager.setBackground(null);
        }
        DmtTabLayout dmtTabLayout = this.f110655d;
        if (dmtTabLayout != null) {
            dmtTabLayout.setBackground(null);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getArguments();
        return C1764a.m5927a(layoutInflater, R.layout.zq, viewGroup, false);
    }
}
