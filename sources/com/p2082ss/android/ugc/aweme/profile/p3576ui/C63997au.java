package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1719f.p1720a.C23126b;
import com.bytedance.tux.p1719f.p1720a.C23129d;
import com.bytedance.tux.p1722h.C23155d;
import com.google.android.material.appbar.AppBarLayout;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.C33842s;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.common.p2632d.C39092a;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.experiment.C46937fn;
import com.p2082ss.android.ugc.aweme.performance.C62845i;
import com.p2082ss.android.ugc.aweme.profile.experiment.C63748i;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3578b.C64008a;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64150c;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.widget.C64350d;
import com.p2082ss.android.ugc.aweme.profile.service.C63873h;
import com.p2082ss.android.ugc.aweme.recommend.users.RecommendUserServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.AbstractC80321cz;
import com.p2082ss.android.ugc.aweme.utils.C80330da;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.au */
public final class C63997au extends C64066c {

    /* renamed from: K */
    protected RecyclerView f145127K;

    /* renamed from: L */
    protected AppBarLayout f145128L;

    /* renamed from: M */
    protected boolean f145129M = true;

    /* renamed from: Q */
    private boolean f145130Q;

    /* renamed from: R */
    private boolean f145131R;

    /* renamed from: S */
    private C64008a f145132S;

    /* renamed from: T */
    private TextView f145133T;

    /* renamed from: U */
    private boolean f145134U;

    /* renamed from: V */
    private AbstractC64150c f145135V;

    static {
        Covode.recordClassIndex(75441);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.C64066c
    /* renamed from: a */
    public final int mo103571a() {
        return R.layout.an1;
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.profile.p3576ui.C64066c, com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a
    public final void onResume() {
        super.onResume();
        C64008a aVar = this.f145132S;
        if (aVar != null) {
            aVar.mo103585a();
        }
    }

    /* renamed from: O */
    private boolean m115736O() {
        User user = this.f145342b;
        if (user == null || user.getFollowerCount() >= 1000 || user.getAccountType() == 2 || user.getAccountType() == 3) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64005b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.profile.p3576ui.C64066c
    public final void onDestroyView() {
        AbstractC80321cz b = C80330da.C80331a.m139267b(this.f145132S.mo103586b());
        if (b != null) {
            b.mo123701c();
        }
        super.onDestroyView();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.C64066c, com.p2082ss.android.ugc.aweme.profile.p3569c.AbstractC63505a
    public final void bS_() {
        if (af_()) {
            if (this.f145130Q || this.f145131R) {
                mo59525f();
            } else if (this.f145355s == null || !this.f145303C) {
                mo103701v();
            } else {
                mo103574n();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.C64066c, com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.C39211a.AbstractC39212a
    /* renamed from: m */
    public final View mo62680m() {
        if (!af_()) {
            return null;
        }
        if (!this.f145134U) {
            return this.f145350n;
        }
        if (this.f145127K == null) {
            this.f145127K = this.f145135V.mo103746a();
        }
        if (!this.f145129M) {
            return null;
        }
        RecyclerView recyclerView = this.f145127K;
        if (recyclerView != null) {
            return recyclerView;
        }
        return this.f145350n;
    }

    /* renamed from: M */
    private void m115734M() {
        this.f145355s.setVisibility(0);
        if (this.f145302B != null) {
            mo103675c().setVisibility(4);
        }
        if (!this.f145346j && !C80580in.m139687c() && this.f145345e == 0 && C63748i.m115282c() && !m115736O()) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f145355s.getLayoutParams();
            layoutParams.topMargin = C34728n.m70946a(38.0d);
            this.f145355s.setLayoutParams(layoutParams);
            m115735N();
        }
        this.f145355s.mo27385g();
        if (this.f145356t != null) {
            this.f145356t.mo103568a(this.f145346j, this.f145345e);
        }
    }

    /* renamed from: N */
    private void m115735N() {
        if (!getActivity().isDestroyed() && !getActivity().isFinishing() && !this.f145134U) {
            this.f145134U = true;
            Fragment a = RecommendUserServiceImpl.m118456b().mo105665a();
            getChildFragmentManager().mo3552a().mo3469b(R.id.dfo, a).mo3473c();
            AbstractC64150c cVar = (AbstractC64150c) a;
            this.f145135V = cVar;
            cVar.mo103747a(this.f145342b);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c, com.p2082ss.android.ugc.aweme.profile.p3576ui.C64066c
    /* renamed from: f */
    public final void mo59525f() {
        if (af_()) {
            if (((AbstractC39100a) this.f145354r.f92286h).isHasMore()) {
                mo62679l();
            }
            if (!this.f145346j || this.f145345e != 0) {
                m115734M();
                return;
            }
            if (this.f145352p.getItemCount() != 0 || this.f145352p.f143796d) {
                if (this.f145356t != null) {
                    this.f145356t.mo103567a(this.f145345e);
                }
            } else if (this.f145356t != null) {
                this.f145356t.mo103568a(this.f145346j, this.f145345e);
            }
            this.f145355s.setVisibility(4);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.C64066c
    /* renamed from: n */
    public final void mo103574n() {
        super.mo103574n();
        if (this.f145356t != null && this.f145345e == 0 && !this.f145346j && !C80580in.m139687c() && !m115736O()) {
            if (C63748i.m115281b()) {
                this.f145356t.mo103568a(this.f145346j, this.f145345e);
            }
            if (C63748i.m115282c()) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) mo103675c().getLayoutParams();
                layoutParams.topMargin = C34728n.m70946a(-29.0d);
                mo103675c().setLayoutParams(layoutParams);
                this.f145355s.setVisibility(8);
                m115735N();
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.C64066c
    /* renamed from: p */
    public final void mo103575p() {
        C64350d dVar;
        this.f145350n.setOverScrollMode(2);
        mo103697q();
        this.f145350n.setLayoutManager(this.f145353q);
        this.f145350n.mo4402a(mo103698r());
        if (!C62845i.m113257a()) {
            dVar = new C64350d(new C64000aw(this));
            this.f145350n.mo4405a(dVar);
        } else {
            dVar = null;
        }
        this.f145309I = new C39092a(this.f145350n, dVar);
        if (C46937fn.f109393c) {
            this.f145350n.mo4405a(new RecyclerView.AbstractC1371n() {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.C63997au.C639981 */

                static {
                    Covode.recordClassIndex(75442);
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
                /* renamed from: a */
                public final void mo4753a(RecyclerView recyclerView, int i) {
                    int i2;
                    super.mo4753a(recyclerView, i);
                    if (i == 0) {
                        RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
                        if (layoutManager instanceof GridLayoutManager) {
                            i2 = ((LinearLayoutManager) layoutManager).mo4373m();
                        } else {
                            i2 = -1;
                        }
                        recyclerView.getLayoutManager().mo4685A();
                        if (i2 > recyclerView.getLayoutManager().mo4685A() - 15) {
                            C63997au.this.mo62679l();
                        }
                    }
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
                /* renamed from: a */
                public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
                    super.mo4754a(recyclerView, i, i2);
                }
            });
        }
        this.f145350n = C63873h.f144797a.buildBaseRecyclerView(this.f145350n, this);
        this.f145132S = new C64008a(this.f145346j, this.f145459O, this.f145350n);
        mo103699t();
        this.f145350n.setAdapter(this.f145352p);
        mo103656D();
        mo103700u();
        if (this.f145346j || this.f145359w) {
            mo103701v();
        }
        if (this.f145349m > 0) {
            this.f145350n.setPadding(0, 0, 0, this.f145349m);
        }
        Integer a = C23155d.m43641a(this.f145350n.getContext(), R.attr.m);
        if (a != null) {
            getView().setBackgroundColor(a.intValue());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.C64066c
    /* renamed from: j */
    public final void mo103573j() {
        View c;
        boolean z = this.f145346j;
        int i = R.string.dc2;
        if (!z) {
            i = this.f145345e == 0 ? R.string.h58 : R.string.h51;
        } else if (this.f145345e == 0) {
            i = R.string.bn6;
        } else if (this.f145345e == 1) {
            if (!C80580in.m139687c()) {
                i = !C33842s.C33843a.f80132a.mo60060d().mo59941c().booleanValue() ? R.string.c9n : C33842s.C33843a.f80132a.mo60059c().mo59941c().intValue() == 0 ? R.string.cuq : R.string.cur;
            }
        } else if (this.f145345e == 2) {
            i = R.string.g6u;
        }
        this.f145358v = DmtStatusView.C17269a.m31905a(getContext());
        TuxTextView c2 = m115740c(R.string.cxj);
        m115740c(i);
        if (this.f145346j && this.f145345e == 1) {
            if (!C80580in.m139687c()) {
                if (C33842s.C33843a.f80132a.mo60059c().mo59941c().intValue() == 0) {
                    c = mo103662a(getContext(), false);
                } else {
                    c = mo103662a(getContext(), true);
                }
            }
            c = m115740c(i);
        } else if (this.f145346j && this.f145345e == 14) {
            c = m115738b(getString(R.string.et4), getString(R.string.evf));
        } else if (this.f145346j || this.f145345e != 1) {
            if (!this.f145346j && this.f145345e == 0 && !C80580in.m139687c() && C63748i.m115281b()) {
                c = m115738b(getString(R.string.ev9), getContext().getString(R.string.ev8));
            }
            c = m115740c(i);
        } else {
            if (!C80580in.m139687c()) {
                c = mo103671b(getContext(), false);
            }
            c = m115740c(i);
        }
        c2.setOnClickListener(new View$OnClickListenerC64001ax(this));
        this.f145358v.mo27406b(c).mo27408c(c2);
        this.f145355s.setBuilder(this.f145358v);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.C64066c, com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64118co
    /* renamed from: b */
    public final void mo102299b(boolean z) {
        this.f145130Q = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.C64066c, com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64118co
    /* renamed from: c */
    public final void mo102301c(boolean z) {
        this.f145131R = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo103572a(int i) {
        boolean z;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f145129M = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63985aq, com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64118co
    /* renamed from: c */
    public final void mo103561c(String str) {
        super.mo103561c(str);
        C64008a aVar = this.f145132S;
        if (aVar != null) {
            aVar.f145166b = str;
        }
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.profile.p3576ui.C64066c
    public final void setUserVisibleHint(boolean z) {
        C64008a aVar;
        super.setUserVisibleHint(z);
        if (z && (aVar = this.f145132S) != null) {
            aVar.mo103585a();
        }
    }

    /* renamed from: c */
    private TuxTextView m115740c(int i) {
        TuxTextView tuxTextView = new TuxTextView(getContext());
        tuxTextView.setGravity(17);
        tuxTextView.setTuxFont(51);
        tuxTextView.setTextColor(C0643b.m2378c(getContext(), R.color.c4));
        tuxTextView.setText(i);
        return tuxTextView;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63985aq, com.p2082ss.android.ugc.aweme.profile.p3576ui.C64066c
    /* renamed from: a */
    public final void mo103557a(User user) {
        super.mo103557a(user);
        if (!this.f145346j && !C80580in.m139687c() && this.f145345e == 0 && C63748i.m115281b() && this.f145133T != null) {
            if (!m115736O()) {
                this.f145133T.setText(m115739c(getString(R.string.ev9), C1764a.m5928a(getContext().getString(R.string.ev8), new Object[]{C80580in.m139684b(this.f145342b)})));
                return;
            }
            this.f145133T.setText(R.string.h58);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.profile.p3576ui.C64066c
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AppBarLayout appBarLayout = (AppBarLayout) view.findViewById(R.id.avb);
        this.f145128L = appBarLayout;
        appBarLayout.mo43717a(new C63999av(this));
    }

    /* renamed from: b */
    private TuxTextView m115738b(String str, String str2) {
        TuxTextView tuxTextView = new TuxTextView(getContext());
        tuxTextView.setGravity(17);
        tuxTextView.setTuxFont(51);
        tuxTextView.setTextColor(C0643b.m2378c(getContext(), R.color.c5));
        tuxTextView.setText(m115739c(str, str2));
        this.f145133T = tuxTextView;
        return tuxTextView;
    }

    /* renamed from: c */
    private SpannableStringBuilder m115739c(String str, String str2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str).append((CharSequence) "\n").append((CharSequence) str2);
        spannableStringBuilder.setSpan(new C23126b(33, false), 0, str.length(), 18);
        spannableStringBuilder.setSpan(new C23129d(C34728n.m70946a(20.0d)), 0, str.length(), 18);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C0643b.m2378c(getContext(), R.color.bx)), 0, str.length(), 18);
        return spannableStringBuilder;
    }

    /* renamed from: a */
    public static C63997au m115737a(int i, int i2, String str, String str2, boolean z, boolean z2, Bundle bundle) {
        C63997au auVar = new C63997au();
        bundle.putInt(StringSet.type, i2);
        bundle.putString("uid", str);
        bundle.putString("sec_user_id", str2);
        bundle.putBoolean("is_my_profile", z);
        bundle.putBoolean("is_scene_transition_enable", z2);
        bundle.putInt("bottom_bar_height", i);
        auVar.setArguments(bundle);
        return auVar;
    }
}
