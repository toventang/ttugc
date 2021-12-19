package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0643b;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.tux.p1722h.C23158e;
import com.bytedance.widget.C23669c;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.metrics.C59219an;
import com.p2082ss.android.ugc.aweme.miniapp_api.services.C59320c;
import com.p2082ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63856t;
import com.p2082ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.p2082ss.android.ugc.aweme.utils.C80541ho;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.al */
public abstract class AbstractC63980al extends AbstractC34586a implements AbstractC63856t {

    /* renamed from: a */
    public String f145096a;

    /* renamed from: b */
    public String f145097b;

    /* renamed from: c */
    public View f145098c;

    /* renamed from: d */
    protected List<Integer> f145099d;

    /* renamed from: e */
    public String f145100e;

    /* renamed from: j */
    protected int f145101j;

    /* renamed from: k */
    protected int f145102k;

    /* renamed from: l */
    protected User f145103l;

    /* renamed from: m */
    protected boolean f145104m;

    /* renamed from: n */
    protected EnterpriseTransformLayout f145105n;

    /* renamed from: o */
    ViewGroup f145106o;

    /* renamed from: p */
    protected int f145107p = -1;

    /* renamed from: q */
    protected AnalysisStayTimeFragmentComponent f145108q;

    /* renamed from: r */
    protected ProfileViewModel f145109r;

    /* renamed from: s */
    protected C23669c f145110s;

    /* renamed from: t */
    protected long f145111t = -1;

    static {
        Covode.recordClassIndex(75424);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    /* renamed from: H */
    public boolean mo61043H() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo103546h() {
        return true;
    }

    /* renamed from: i */
    public void mo103547i() {
    }

    /* renamed from: j */
    public void mo103548j() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract int mo103549k();

    /* renamed from: l */
    public abstract boolean mo103550l();

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo103551m() {
        this.f145111t = System.currentTimeMillis();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f145111t = System.currentTimeMillis();
    }

    /* renamed from: g */
    public final C23669c mo103545g() {
        if (this.f145110s == null && getView() != null) {
            this.f145110s = C23669c.C23671a.m44763a(this, getView());
        }
        return this.f145110s;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo103552n() {
        String str;
        if (this.f145111t > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f145111t;
            if (currentTimeMillis > 0) {
                if (mo103550l()) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                C1731i.m5640b(new CallableC63983ao(this, str, currentTimeMillis, this.f145101j), C39162r.m79452a());
            }
            this.f145111t = -1;
        }
    }

    /* renamed from: b */
    public void mo103544b(View view) {
        view.setBackgroundColor(C0643b.m2378c(getContext(), R.color.l));
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.f145109r = ProfileViewModel.C64397a.m116300a(this);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("from");
            this.f145100e = string;
            this.f145109r.mo33689c(new ProfileViewModel.C64404f(string));
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("profile_cur_pos", this.f145101j);
        bundle.putInt("indicator_scroll_maxx", this.f145102k);
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: a */
    public void mo103543a(View view) {
        this.f145098c = view.findViewById(R.id.e7_);
        int i = Build.VERSION.SDK_INT;
        this.f145098c.getLayoutParams().height = C23158e.m43647a(getActivity());
        this.f145106o = (ViewGroup) view.findViewById(R.id.acf);
        AnalysisStayTimeFragmentComponent analysisStayTimeFragmentComponent = new AnalysisStayTimeFragmentComponent(this, mo103546h());
        this.f145108q = analysisStayTimeFragmentComponent;
        analysisStayTimeFragmentComponent.f81540b = new C63981am(this);
        try {
            view.findViewById(R.id.eiz).setOnTouchListener(View$OnTouchListenerC63982an.f145113a);
        } catch (Throwable unused) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        String str;
        int i;
        super.onHiddenChanged(z);
        AnalysisStayTimeFragmentComponent analysisStayTimeFragmentComponent = this.f145108q;
        if (analysisStayTimeFragmentComponent != null) {
            analysisStayTimeFragmentComponent.mo61004a(z);
        }
        if (z) {
            mo103552n();
            return;
        }
        this.f145111t = System.currentTimeMillis();
        EnterpriseTransformLayout enterpriseTransformLayout = this.f145105n;
        if (!(enterpriseTransformLayout == null || C13603b.m24435a((Collection) enterpriseTransformLayout.f144948e) || enterpriseTransformLayout.f144951h == null || TextUtils.isEmpty(enterpriseTransformLayout.f144951h.getUid()))) {
            if (enterpriseTransformLayout.mo103486b()) {
                str = "personal_homepage";
            } else {
                str = "others_homepage";
            }
            for (int i2 = 0; i2 < enterpriseTransformLayout.f144948e.size(); i2++) {
                String str2 = enterpriseTransformLayout.f144948e.get(i2);
                String str3 = enterpriseTransformLayout.f144949f.get(i2);
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                    enterpriseTransformLayout.getContext();
                    C39162r.m79459a("show_link", str, enterpriseTransformLayout.f144951h.getUid(), "0", EnterpriseTransformLayout.m115618a(str2));
                    C39162r.m79460a("show_link", new C33744d().mo59983a("author_id", enterpriseTransformLayout.f144951h.getUid()).mo59983a("enter_from", str).mo59983a("link_type", str2).f79943a);
                    if (TextUtils.equals(str2, "micro_app") || TextUtils.equals(str2, "micro_game")) {
                        String queryParameter = Uri.parse(str3).getQueryParameter("app_id");
                        IMiniAppService a = C59320c.C59324a.f135560a.mo96989a();
                        if (TextUtils.equals(str2, "micro_app")) {
                            i = 1;
                        } else {
                            i = 2;
                        }
                        a.preloadMiniApp(queryParameter, i);
                        C39162r.m79460a("mp_show", new C33744d().mo59983a("mp_id", queryParameter).mo59983a("author_id", enterpriseTransformLayout.f144951h.getUid()).mo59983a("enter_from", str).mo59983a("position", "in_video_tag").mo59983a("_param_for_special", str2).f79943a);
                    }
                }
            }
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (C16048b.m29633a().mo25421a(true, "is_release_window_background", true)) {
            view.setBackgroundColor(-1);
        }
        if (bundle != null) {
            this.f145101j = bundle.getInt("profile_cur_pos", 0);
            this.f145102k = bundle.getInt("indicator_scroll_maxx", 0);
        }
        mo103543a(view);
        mo103544b(view);
        mo103547i();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f145110s = null;
        return C1870c.m6045a((Activity) getActivity(), mo103549k());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ Object mo103542a(String str, long j, int i) {
        String str2;
        C59219an a = new C59219an().mo96761a(str);
        a.f134910a = String.valueOf(j);
        List<Integer> list = this.f145099d;
        if (list == null || list.size() == 0 || i >= this.f145099d.size()) {
            str2 = "";
        } else {
            str2 = C80541ho.m139617a(this.f145099d.get(i).intValue());
        }
        a.mo96801c(str2).mo96792f();
        return null;
    }
}
