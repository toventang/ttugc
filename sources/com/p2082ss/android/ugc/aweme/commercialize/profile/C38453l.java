package com.p2082ss.android.ugc.aweme.commercialize.profile;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28021n;
import com.google.gson.C28022o;
import com.google.gson.C28024q;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38189j;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.music.p3476k.C60830h;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.C33263f;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2295d.C33243a;
import com.p2082ss.android.ugc.aweme.p2929fe.method.C47959j;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64118co;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.l */
public final class C38453l extends AbstractC64118co implements AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public boolean f90829a;

    /* renamed from: b */
    private C38447j f90830b;

    /* renamed from: c */
    private String f90831c;

    /* renamed from: d */
    private String f90832d;

    /* renamed from: e */
    private Aweme f90833e;

    /* renamed from: j */
    private SparseArray f90834j;

    static {
        Covode.recordClassIndex(45961);
    }

    /* renamed from: c */
    private View m77896c() {
        if (this.f90834j == null) {
            this.f90834j = new SparseArray();
        }
        View view = (View) this.f90834j.get(R.id.dgw);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(R.id.dgw);
        this.f90834j.put(R.id.dgw, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3569c.AbstractC63505a
    public final boolean ci_() {
        return true;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(75, new RunnableC90250g(C38453l.class, "top", C47959j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.C39211a.AbstractC39212a
    /* renamed from: m */
    public final View mo62680m() {
        return m77896c();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3569c.AbstractC63505a
    public final void bS_() {
        String c = SharePrefCache.inst().getMpTab().mo59941c();
        C89219l.m154716b(c, "");
        String uri = C60830h.m110432a(c).mo98235a().toString();
        C89219l.m154716b(uri, "");
        C38447j jVar = this.f90830b;
        if (jVar != null) {
            C89219l.m154721d(uri, "");
            jVar.f90816b = uri;
        }
        C38447j jVar2 = this.f90830b;
        if (jVar2 != null) {
            jVar2.notifyDataSetChanged();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64118co
    /* renamed from: g */
    public final void mo65254g() {
        Aweme aweme;
        AwemeRawAd awemeRawAd;
        if (getUserVisibleHint() && getActivity() != null && C37699a.m76221X(this.f90833e) && (aweme = this.f90833e) != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            ActivityC0945e activity = getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C38189j.m77493a(activity, "homepage_ad", "businesstab_show", C38189j.m77468a((Context) getActivity(), this.f90833e, false, (Map<String, String>) null), awemeRawAd);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        RecyclerView.AbstractC1362i layoutManager;
        View c;
        super.onDestroyView();
        RecyclerView recyclerView = (RecyclerView) m77896c();
        if (!(recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (c = layoutManager.mo4358c(0)) == null)) {
            Objects.requireNonNull(c, "null cannot be cast to non-null type com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView");
            CrossPlatformWebView crossPlatformWebView = (CrossPlatformWebView) c;
            ActivityC0945e activity = getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            crossPlatformWebView.mo69928d(activity);
        }
        EventBus.m156962a().mo145395b(this);
        SparseArray sparseArray = this.f90834j;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: a */
    public final Bundle mo67015a() {
        Bundle bundle = new Bundle();
        C33263f fVar = C33263f.f79009a;
        C89219l.m154716b(fVar, "");
        C33243a aVar = fVar.f79010b;
        long j = 0;
        if (aVar != null) {
            Long l = aVar.f78980a;
            if (l != null) {
                j = l.longValue();
            }
            bundle.putLong("ad_id", j);
            bundle.putString("bundle_download_app_log_extra", aVar.f78981b);
            return bundle;
        }
        Aweme aweme = this.f90833e;
        if (aweme == null || !aweme.isAd()) {
            return bundle;
        }
        Aweme aweme2 = this.f90833e;
        if (aweme2 == null) {
            C89219l.m154715b();
        }
        AwemeRawAd awemeRawAd = aweme2.getAwemeRawAd();
        if (awemeRawAd == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(awemeRawAd, "");
        Long creativeId = awemeRawAd.getCreativeId();
        if (creativeId == null || creativeId.longValue() != 0) {
            Long creativeId2 = awemeRawAd.getCreativeId();
            C89219l.m154716b(creativeId2, "");
            bundle.putLong("ad_id", creativeId2.longValue());
            bundle.putString("ad_type", awemeRawAd.getType());
            bundle.putInt("ad_system_origin", awemeRawAd.getSystemOrigin());
            bundle.putString("aweme_creative_id", String.valueOf(awemeRawAd.getCreativeId().longValue()));
            bundle.putString("bundle_download_app_log_extra", awemeRawAd.getLogExtra());
        }
        if (!TextUtils.isEmpty(awemeRawAd.getDownloadUrl())) {
            bundle.putString("bundle_download_url", awemeRawAd.getDownloadUrl());
        }
        return bundle;
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void top(C47959j jVar) {
        boolean z;
        String c;
        AbstractC28019l c2;
        CrossPlatformWebView crossPlatformWebView;
        C89219l.m154721d(jVar, "");
        AbstractC28019l a = C28024q.m56139a(jVar.f111077b.toString());
        C89219l.m154716b(a, "");
        C28022o j = a.mo46789j();
        AbstractC28019l c3 = j.mo46803c("data");
        String str = null;
        if (c3 == null || (c3 instanceof C28021n) || (c2 = c3.mo46789j().mo46803c("reactId")) == null || (c2 instanceof C28021n)) {
            z = false;
        } else {
            String c4 = c2.mo46689c();
            C38447j jVar2 = this.f90830b;
            if (!(jVar2 == null || (crossPlatformWebView = jVar2.f90815a) == null)) {
                str = crossPlatformWebView.getReactId();
            }
            z = C89219l.m154714a((Object) c4, (Object) str);
        }
        Boolean valueOf = Boolean.valueOf(z);
        if (valueOf.booleanValue()) {
            valueOf.booleanValue();
            AbstractC28019l c5 = j.mo46803c("eventName");
            if (c5 != null && (c = c5.mo46689c()) != null) {
                if (C89219l.m154714a((Object) c, (Object) "mp_tab_top_arrived") || C89219l.m154714a((Object) c, (Object) "mp_tab_top_left")) {
                    int hashCode = c.hashCode();
                    if (hashCode != -917484739) {
                        if (hashCode == -853202121 && c.equals("mp_tab_top_left")) {
                            ((EnterpriseRecyclerView) m77896c()).getEnterTabManager().f90835a = false;
                        }
                    } else if (c.equals("mp_tab_top_arrived")) {
                        ((EnterpriseRecyclerView) m77896c()).getEnterTabManager().f90835a = true;
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64118co
    /* renamed from: a */
    public final void mo65249a(String str, String str2) {
        super.mo65249a(str, str2);
        this.f90832d = str2;
        this.f90831c = str;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) m77896c();
        C89219l.m154716b(recyclerView, "");
        getActivity();
        recyclerView.setLayoutManager(new EnterpriseTabFragment$onViewCreated$1(this));
        this.f90830b = new C38447j(this, this.f90829a);
        RecyclerView recyclerView2 = (RecyclerView) m77896c();
        C89219l.m154716b(recyclerView2, "");
        recyclerView2.setAdapter(this.f90830b);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.m26663i(9201);
        C89219l.m154721d(layoutInflater, "");
        EventBus.m156966a(EventBus.m156962a(), this);
        ActivityC0945e activity = getActivity();
        if (activity == null) {
            C89219l.m154715b();
        }
        View inflate = LayoutInflater.from(activity).inflate(R.layout.a0w, (ViewGroup) null);
        MethodCollector.m26664o(9201);
        return inflate;
    }
}
