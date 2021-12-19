package com.p2082ss.android.ugc.aweme.commerce.challenge;

import android.graphics.Rect;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.p1184ui.common.AbstractC17045g;
import com.bytedance.ies.bullet.p1184ui.common.BulletActivityWrapper;
import com.bytedance.ies.bullet.p1184ui.common.BulletContainerView;
import com.google.gson.AbstractC28019l;
import com.google.gson.C28021n;
import com.google.gson.C28022o;
import com.google.gson.C28024q;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.bullet.module.base.CommonBizWebView;
import com.p2082ss.android.ugc.aweme.commercialize.profile.C38450k;
import com.p2082ss.android.ugc.aweme.commercialize.profile.EnterpriseRecyclerView;
import com.p2082ss.android.ugc.aweme.detail.AbstractC41135h;
import com.p2082ss.android.ugc.aweme.music.p3476k.C60830h;
import com.p2082ss.android.ugc.aweme.p2929fe.method.C47959j;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63989ar;
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
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commerce.challenge.a */
public final class C37488a extends AbstractC34586a implements AbstractC41135h, AbstractC63989ar, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public String f88488a;

    /* renamed from: b */
    public String f88489b;

    /* renamed from: c */
    public String f88490c;

    /* renamed from: d */
    private final Rect f88491d = new Rect();

    /* renamed from: e */
    private boolean f88492e = true;

    /* renamed from: j */
    private C38450k f88493j;

    /* renamed from: k */
    private final AbstractC89244h f88494k = C89250i.m154774a(EnumC89331m.NONE, new C37490b(this));

    /* renamed from: l */
    private SparseArray f88495l;

    static {
        Covode.recordClassIndex(44875);
    }

    /* renamed from: e */
    private final AbstractC17045g m75581e() {
        return (AbstractC17045g) this.f88494k.getValue();
    }

    /* renamed from: g */
    private View m75582g() {
        if (this.f88495l == null) {
            this.f88495l = new SparseArray();
        }
        View view = (View) this.f88495l.get(R.id.dgw);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(R.id.dgw);
        this.f88495l.put(R.id.dgw, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41135h
    /* renamed from: a */
    public final void mo62669a(boolean z, boolean z2) {
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41135h
    /* renamed from: b */
    public final void mo62672b(boolean z) {
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(339, new RunnableC90250g(C37488a.class, "onJsBroadcast", C47959j.class, ThreadMode.MAIN, 0, false));
        hashMap.put(75, new RunnableC90250g(C37488a.class, "top", C47959j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41135h
    /* renamed from: k */
    public final void mo62678k() {
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41135h
    /* renamed from: d */
    public final boolean mo62674d() {
        return this.f88492e;
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.challenge.a$a */
    public static final class RunnableC37489a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C37488a f88496a;

        static {
            Covode.recordClassIndex(44876);
        }

        public RunnableC37489a(C37488a aVar) {
            this.f88496a = aVar;
        }

        public final void run() {
            this.f88496a.mo65196b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63989ar
    /* renamed from: c */
    public final String mo65197c() {
        String str = this.f88489b;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: a */
    public final CommonBizWebView mo65195a() {
        C38450k kVar = this.f88493j;
        if (kVar != null) {
            return kVar.f90822a;
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41135h, com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.C39211a.AbstractC39212a
    /* renamed from: m */
    public final View mo62680m() {
        EnterpriseRecyclerView enterpriseRecyclerView = (EnterpriseRecyclerView) m75582g();
        C89219l.m154716b(enterpriseRecyclerView, "");
        return enterpriseRecyclerView;
    }

    /* renamed from: com.ss.android.ugc.aweme.commerce.challenge.a$b */
    static final class C37490b extends AbstractC89220m implements AbstractC89171a<BulletActivityWrapper> {

        /* renamed from: a */
        final /* synthetic */ C37488a f88497a;

        static {
            Covode.recordClassIndex(44877);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37490b(C37488a aVar) {
            super(0);
            this.f88497a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ BulletActivityWrapper invoke() {
            ActivityC0945e activity = this.f88497a.getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            return new BulletActivityWrapper(activity);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41135h
    /* renamed from: n */
    public final void mo62681n() {
        RecyclerView.AbstractC1362i layoutManager;
        RecyclerView recyclerView = (RecyclerView) m75582g();
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            layoutManager.mo4363e(0);
        }
    }

    /* renamed from: b */
    public final void mo65196b() {
        CommonBizWebView a;
        CommonBizWebView a2 = mo65195a();
        if (a2 != null && a2.getGlobalVisibleRect(this.f88491d) && (a = mo65195a()) != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("height", C34728n.m70948b((double) this.f88491d.height()));
            a.mo62061a("brand_room_show", jSONObject);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41135h
    /* renamed from: j */
    public final void mo62677j() {
        this.f88492e = false;
        String str = this.f88490c;
        if (str != null) {
            C60830h.C60831a a = C60830h.m110432a(str);
            String str2 = this.f88488a;
            if (str2 == null) {
                str2 = "";
            }
            String uri = a.mo98236a("challenge_id", str2).mo98235a().toString();
            C89219l.m154716b(uri, "");
            C38450k kVar = this.f88493j;
            if (kVar != null) {
                C89219l.m154721d(uri, "");
                kVar.f90823b = uri;
            }
            C38450k kVar2 = this.f88493j;
            if (kVar2 != null) {
                kVar2.notifyDataSetChanged();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onPause() {
        RecyclerView.AbstractC1362i layoutManager;
        super.onPause();
        RecyclerView recyclerView = (RecyclerView) m75582g();
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && layoutManager.mo4358c(0) != null) {
            AbstractC17045g e = m75581e();
            ActivityC0945e activity = getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            e.mo26223c(activity);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onResume() {
        RecyclerView.AbstractC1362i layoutManager;
        super.onResume();
        RecyclerView recyclerView = (RecyclerView) m75582g();
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && layoutManager.mo4358c(0) != null) {
            AbstractC17045g e = m75581e();
            ActivityC0945e activity = getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            e.mo26222b(activity);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        RecyclerView.AbstractC1362i layoutManager;
        View c;
        super.onDestroyView();
        RecyclerView recyclerView = (RecyclerView) m75582g();
        if (!(recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (c = layoutManager.mo4358c(0)) == null)) {
            AbstractC17045g e = m75581e();
            ActivityC0945e activity = getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            e.mo26224d(activity);
            Objects.requireNonNull(c, "null cannot be cast to non-null type com.bytedance.ies.bullet.ui.common.BulletContainerView");
            ((BulletContainerView) c).mo25721a();
        }
        EventBus.m156962a().mo145395b(this);
        SparseArray sparseArray = this.f88495l;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41135h
    /* renamed from: a */
    public final void mo62667a(String str) {
        this.f88488a = str;
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onJsBroadcast(C47959j jVar) {
        CommonBizWebView a;
        CommonBizWebView a2;
        C89219l.m154721d(jVar, "");
        String string = jVar.f111077b.getString("eventName");
        if (string != null) {
            String str = null;
            if (C89219l.m154714a((Object) string, (Object) "brand_room_loaded")) {
                CommonBizWebView a3 = mo65195a();
                if (a3 != null) {
                    str = a3.getReactId();
                }
                if (C89219l.m154714a((Object) str, (Object) jVar.f111077b.getString("reactId")) && (a = mo65195a()) != null && a.getGlobalVisibleRect(this.f88491d) && (a2 = mo65195a()) != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("height", C34728n.m70948b((double) this.f88491d.height()));
                    a2.mo62061a("brand_room_show", jSONObject);
                }
            }
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void top(C47959j jVar) {
        boolean z;
        String c;
        AbstractC28019l c2;
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
            CommonBizWebView a2 = mo65195a();
            if (a2 != null) {
                str = a2.getReactId();
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
                            ((EnterpriseRecyclerView) m75582g()).getEnterTabManager().f90835a = false;
                        }
                    } else if (c.equals("mp_tab_top_arrived")) {
                        ((EnterpriseRecyclerView) m75582g()).getEnterTabManager().f90835a = true;
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) m75582g();
        C89219l.m154716b(recyclerView, "");
        getActivity();
        recyclerView.setLayoutManager(new CommerceChallengeFragment$onViewCreated$1(this));
        this.f88493j = new C38450k(this, m75581e());
        RecyclerView recyclerView2 = (RecyclerView) m75582g();
        C89219l.m154716b(recyclerView2, "");
        recyclerView2.setAdapter(this.f88493j);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MethodCollector.m26663i(8443);
        C89219l.m154721d(layoutInflater, "");
        EventBus.m156966a(EventBus.m156962a(), this);
        ActivityC0945e activity = getActivity();
        if (activity == null) {
            C89219l.m154715b();
        }
        View inflate = LayoutInflater.from(activity).inflate(R.layout.a0w, (ViewGroup) null);
        MethodCollector.m26664o(8443);
        return inflate;
    }
}
