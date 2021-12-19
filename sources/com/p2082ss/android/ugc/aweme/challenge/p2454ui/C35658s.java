package com.p2082ss.android.ugc.aweme.challenge.p2454ui;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.app.C0576b;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.watcher.C18285c;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33623d;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.base.p2372d.C34569a;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.challenge.AbstractC35500d;
import com.p2082ss.android.ugc.aweme.challenge.p2445a.AbstractC35485a;
import com.p2082ss.android.ugc.aweme.challenge.p2445a.C35486b;
import com.p2082ss.android.ugc.aweme.challenge.p2445a.C35487c;
import com.p2082ss.android.ugc.aweme.challenge.p2448d.C35502b;
import com.p2082ss.android.ugc.aweme.common.C39161q;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39054a;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39058d;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39059e;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39062g;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.common.p2632d.C39092a;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39103d;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39108i;
import com.p2082ss.android.ugc.aweme.detail.AbstractC41135h;
import com.p2082ss.android.ugc.aweme.detail.AbstractC41245k;
import com.p2082ss.android.ugc.aweme.detail.AbstractC41246l;
import com.p2082ss.android.ugc.aweme.detail.C41121e;
import com.p2082ss.android.ugc.aweme.detail.DetailViewModel;
import com.p2082ss.android.ugc.aweme.discover.model.Challenge;
import com.p2082ss.android.ugc.aweme.experiment.C47039q;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2943d.C49419b;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50529ae;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.framework.p3009d.C51428b;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.metrics.C59217al;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.performance.C62845i;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.p2082ss.android.ugc.aweme.profile.p3568b.C63494a;
import com.p2082ss.android.ugc.aweme.setting.C68193o;
import com.p2082ss.android.ugc.aweme.utils.C80330da;
import com.p2082ss.android.ugc.aweme.utils.C80472gc;
import com.p2082ss.android.ugc.aweme.views.AbstractC81445m;
import com.p2082ss.android.ugc.aweme.views.FpsRecyclerView;
import com.p2082ss.android.ugc.aweme.views.SpannedGridLayoutManager;
import com.p2082ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.s */
public class C35658s extends AbstractC35557a implements AbstractC35500d, AbstractC39063h.AbstractC39067a, AbstractC39103d, AbstractC41135h, AbstractC49762o, AbstractC49762o, AbstractC90252i, AbstractC90253j {

    /* renamed from: A */
    public boolean f84105A;

    /* renamed from: B */
    public SparseArray<C35486b> f84106B = new SparseArray<>();

    /* renamed from: C */
    public SparseBooleanArray f84107C = new SparseBooleanArray();

    /* renamed from: D */
    public SparseBooleanArray f84108D = new SparseBooleanArray();

    /* renamed from: E */
    public SparseArray<DmtStatusView> f84109E = new SparseArray<>();

    /* renamed from: F */
    public AbstractC35669w f84110F;

    /* renamed from: G */
    public AbstractC35663b f84111G;

    /* renamed from: H */
    public SpannedGridLayoutManager.AbstractC81418b f84112H;

    /* renamed from: I */
    private String f84113I;

    /* renamed from: J */
    private String f84114J;

    /* renamed from: K */
    private String f84115K;

    /* renamed from: L */
    private C35657r f84116L;

    /* renamed from: M */
    private DetailViewModel f84117M;

    /* renamed from: N */
    private C39092a f84118N;

    /* renamed from: O */
    private String f84119O;

    /* renamed from: P */
    private SparseArray<C39101b> f84120P = new SparseArray<>();

    /* renamed from: a */
    public int f84121a;

    /* renamed from: b */
    public String f84122b;

    /* renamed from: c */
    public String f84123c;

    /* renamed from: d */
    public C39101b f84124d;

    /* renamed from: e */
    protected String f84125e;

    /* renamed from: j */
    protected String f84126j;

    /* renamed from: k */
    public boolean f84127k;

    /* renamed from: l */
    public String f84128l;

    /* renamed from: m */
    public float f84129m;

    /* renamed from: n */
    public RecyclerView f84130n;

    /* renamed from: o */
    protected DmtStatusView f84131o;

    /* renamed from: p */
    FrameLayout f84132p;

    /* renamed from: q */
    public DmtStatusView f84133q;

    /* renamed from: r */
    protected C35486b f84134r;

    /* renamed from: s */
    public AbstractC35662a f84135s;

    /* renamed from: t */
    public int f84136t;

    /* renamed from: u */
    public AbstractC41245k f84137u;

    /* renamed from: v */
    public AbstractC41246l f84138v;

    /* renamed from: w */
    public boolean f84139w;

    /* renamed from: y */
    Challenge f84140y;

    /* renamed from: z */
    public boolean f84141z;

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.s$a */
    public interface AbstractC35662a {
        static {
            Covode.recordClassIndex(42886);
        }

        /* renamed from: b */
        boolean mo62691b(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.s$b */
    public interface AbstractC35663b extends Serializable {
        static {
            Covode.recordClassIndex(42887);
        }

        C35664c getJumpToVideoParam(C35664c cVar, Aweme aweme);

        C39101b getPresenter(int i, ActivityC0945e eVar);

        C35487c onCreateDetailAwemeViewHolder(View view, String str, AbstractC35500d dVar);

        void onJumpToDetail(String str);

        boolean sendCustomRequest(C39101b bVar, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.s$c */
    public static class C35664c {

        /* renamed from: a */
        public String f84147a = "";

        /* renamed from: b */
        public String f84148b = "";

        /* renamed from: c */
        public String f84149c = "";

        /* renamed from: d */
        public String f84150d = "";

        /* renamed from: e */
        public String f84151e = "";

        /* renamed from: f */
        public int f84152f;

        static {
            Covode.recordClassIndex(42888);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.s$d */
    public static abstract class AbstractC35665d implements AbstractC35663b {
        static {
            Covode.recordClassIndex(42889);
        }

        public int getDetailAwemeViewType(int i, Aweme aweme) {
            return 0;
        }

        public abstract AbstractC35485a onCreateDetailAwemeViewHolder(ViewGroup viewGroup, int i, String str, AbstractC35500d dVar);

        @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s.AbstractC35663b
        public C35487c onCreateDetailAwemeViewHolder(View view, String str, AbstractC35500d dVar) {
            return null;
        }

        @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s.AbstractC35663b
        public void onJumpToDetail(String str) {
        }
    }

    static {
        Covode.recordClassIndex(42882);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    /* renamed from: H */
    public final boolean mo61043H() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39103d
    /* renamed from: a */
    public final void mo62668a(List list, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39103d
    /* renamed from: a */
    public final boolean mo62670a(C39108i iVar) {
        return false;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(33, new RunnableC90250g(C35658s.class, "onDynamicEvent", C35502b.class, ThreadMode.POSTING, 0, false));
        hashMap.put(2, new RunnableC90250g(C35658s.class, "onVideoEvent", C49672ag.class, ThreadMode.POSTING, 0, false));
        hashMap.put(34, new RunnableC90250g(C35658s.class, "onAntiCrawlerEvent", C34569a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(35, new RunnableC90250g(C35658s.class, "onBlockUserEvent", C63494a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(36, new RunnableC90250g(C35658s.class, "onFollowStatusUpdate", FollowStatusEvent.class, ThreadMode.POSTING, 0, false));
        hashMap.put(37, new RunnableC90250g(C35658s.class, "onReceiveVideoEvent", C49672ag.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o
    public final void ba_() {
        mo62679l();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41135h, com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.C39211a.AbstractC39212a
    /* renamed from: m */
    public final View mo62680m() {
        return this.f84130n;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41135h
    /* renamed from: a */
    public final void mo62669a(boolean z, boolean z2) {
        if (af_()) {
            AbstractC41246l lVar = this.f84138v;
            boolean z3 = true;
            if (lVar != null) {
                lVar.mo70562a(true);
            }
            if (this.f84131o.getVisibility() != 0 && !mo62674d()) {
                z3 = false;
            }
            m72769a(z, z3, z2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o
    /* renamed from: a */
    public final void mo59513a(boolean z) {
        C35486b bVar = this.f84134r;
        if (!z) {
            bVar.mo67813a((AbstractC39063h.AbstractC39067a) null);
            bVar.mo67829d(false);
        }
    }

    /* renamed from: a */
    public void mo62665a(AbstractC39059e eVar) {
        C35486b bVar;
        int indexOf;
        String o = mo62682o();
        AbstractC39054a aVar = (AbstractC39054a) eVar;
        if (aVar != null && aVar.f92231m != null && TextUtils.equals("challenge", o) && aVar.f92231m != null && (bVar = this.f84134r) != null && ((AbstractC39058d) bVar).f92236l != null && (indexOf = ((AbstractC39058d) this.f84134r).f92236l.indexOf(aVar.f92231m)) >= 0) {
            if (!C47039q.m90298a()) {
                C59217al alVar = new C59217al();
                if (o == null) {
                    o = "";
                }
                C59217al a = alVar.mo96756a(o);
                a.f134886d = String.valueOf(indexOf);
                a.f134885c = this.f84125e;
                a.f134887e = this.f84123c;
                a.f134888p = this.f84116L.f84104b;
                a.mo96757c((Aweme) aVar.f92231m, this.f84121a).mo96792f();
            }
            HashMap hashMap = new HashMap();
            hashMap.put("enter_from", "challenge");
            hashMap.put("tag_id", this.f84123c);
            hashMap.put("process_id", this.f84125e);
            hashMap.put("order", String.valueOf(indexOf));
            hashMap.put("group_id", ((Aweme) aVar.f92231m).getAid());
            hashMap.put("parent_tag_id", this.f84116L.f84104b);
            C39161q.m79451a("tag_show_video", hashMap);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.AbstractC35500d
    /* renamed from: a */
    public final void mo62403a(View view, Aweme aweme, String str) {
        int indexOf;
        C35486b bVar;
        if (!(C58001a.m104815a(view, 1200) || aweme == null || getActivity() == null)) {
            C35664c cVar = new C35664c();
            if ("share_from_resso".equals(this.f84113I)) {
                cVar.f84149c = "share_from_resso";
            } else {
                cVar.f84149c = str;
            }
            if (!(!TextUtils.equals("challenge", mo62682o()) || (bVar = this.f84134r) == null || ((AbstractC39058d) bVar).f92236l == null)) {
                int indexOf2 = ((AbstractC39058d) this.f84134r).f92236l.indexOf(aweme);
                if (indexOf2 >= 0) {
                    cVar.f84152f = indexOf2;
                }
                cVar.f84151e = this.f84125e;
                cVar.f84150d = this.f84123c;
            }
            if (TextUtils.equals("single_song", mo62682o())) {
                cVar.f84151e = this.f84125e;
                C35486b bVar2 = this.f84134r;
                if (!(bVar2 == null || ((AbstractC39058d) bVar2).f92236l == null || (indexOf = ((AbstractC39058d) this.f84134r).f92236l.indexOf(aweme)) < 0)) {
                    cVar.f84152f = indexOf + 1;
                }
            }
            C35664c jumpToVideoParam = this.f84111G.getJumpToVideoParam(cVar, aweme);
            if (this.f84124d.f92286h != null) {
                List<Aweme> items = ((AbstractC39100a) this.f84124d.f92286h).getItems();
                if (items != null) {
                    for (Aweme aweme2 : items) {
                        if (aweme2 != null) {
                            aweme2.setFromRawChallenge(this.f84140y);
                        }
                    }
                    ((AbstractC39100a) this.f84124d.f92286h).setItems(items);
                }
                C50529ae.f116790a = (AbstractC39100a) this.f84124d.f92286h;
            }
            SmartRoute a = mo62661a(aweme, jumpToVideoParam);
            boolean a2 = C16048b.m29633a().mo25421a(true, "enable_reuse_external_image", false);
            if (view != null && a2) {
                a.withBundleAnimation(C0576b.m2193b(view, view.getWidth(), view.getHeight()).mo2564a());
                a.withParam("activity_has_activity_options", true);
            }
            this.f84111G.onJumpToDetail(aweme.getAid());
            if (MSAdaptionService.m97895c().mo89377c(getContext())) {
                a.open();
            } else {
                a.open(10086);
            }
            C49419b.m92487a(aweme);
        }
    }

    /* renamed from: t */
    private void m72773t() {
        C39092a aVar = this.f84118N;
        if (aVar != null) {
            aVar.mo67849a();
        }
    }

    /* renamed from: u */
    private void m72774u() {
        this.f84136t = this.f84121a;
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41135h
    /* renamed from: j */
    public void mo62677j() {
        mo62669a(false, false);
    }

    /* renamed from: r */
    private static boolean m72771r() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2957n.AbstractC49762o
    public final boolean bn_() {
        return this.f84108D.get(this.f84121a, true);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41135h
    /* renamed from: d */
    public final boolean mo62674d() {
        return this.f84107C.get(this.f84121a, true);
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (getUserVisibleHint()) {
            mo62673b(false, true);
        }
    }

    /* renamed from: p */
    public final List<Aweme> mo62689p() {
        C35486b bVar = this.f84134r;
        if (bVar != null) {
            return ((AbstractC39058d) bVar).f92236l;
        }
        return null;
    }

    /* renamed from: s */
    private static boolean m72772s() {
        if (C58029j.f132256h && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132256h;
        }
        boolean r = m72771r();
        C58029j.f132256h = r;
        return r;
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.AbstractC35557a
    /* renamed from: b */
    public final String mo62536b() {
        try {
            T t = this.f84124d.f92286h;
            if (t instanceof AbstractC33623d) {
                return ((AbstractC33623d) t).getRequestId();
            }
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* renamed from: e */
    public final void mo62675e() {
        DmtStatusView dmtStatusView = this.f84133q;
        if (dmtStatusView != null && dmtStatusView.mo27389j()) {
            this.f84133q.mo27382d();
        }
        AbstractC35669w wVar = this.f84110F;
        if (wVar != null) {
            wVar.ca_();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41135h
    /* renamed from: n */
    public final void mo62681n() {
        if (af_() && this.f84130n.getChildCount() > 0) {
            this.f84130n.mo4435d(0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.AbstractC35557a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C39101b bVar = this.f84124d;
        if (bVar != null) {
            bVar.ck_();
        }
        if (this.f84133q != null) {
            this.f84133q = null;
        }
        m72773t();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (getUserVisibleHint()) {
            m72773t();
        }
        try {
            m72770q();
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onStop() {
        try {
            m72770q();
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
        }
        super.onStop();
        if (getUserVisibleHint()) {
            m72773t();
        }
    }

    /* renamed from: q */
    private void m72770q() {
        RecyclerView.ViewHolder a;
        if (this.f84130n != null && af_()) {
            int childCount = this.f84130n.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f84130n.getChildAt(i);
                if (!(childAt == null || (a = this.f84130n.mo4393a(childAt)) == null || a.getItemViewType() != 0)) {
                    ((AbstractC39062g) a).at_();
                }
            }
        }
    }

    /* renamed from: g */
    public void mo62676g() {
        TuxTextView a = mo62662a(R.string.cxj);
        a.setOnClickListener(new View$OnClickListenerC35667u(this));
        this.f84131o.setBuilder(DmtStatusView.C17269a.m31905a(getContext()).mo27406b(mo62662a(R.string.bn6)).mo27408c(a));
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41135h
    /* renamed from: k */
    public final void mo62678k() {
        if (af_()) {
            if (getUserVisibleHint()) {
                getContext();
                if (C68193o.m120445a()) {
                    getActivity();
                    if (m72772s()) {
                        mo62673b(false, false);
                        return;
                    }
                }
            }
            m72773t();
        }
    }

    /* renamed from: o */
    public final String mo62682o() {
        int i = this.f84121a;
        if (i == 0 || i == 1) {
            return "single_song";
        }
        if (i == 2 || i == 3) {
            return "challenge";
        }
        if (i == 15) {
            return "prop_page";
        }
        if (i == 20) {
            return "mv_page";
        }
        switch (i) {
            case 28:
            case 29:
            case 30:
            case 31:
                return "question";
            default:
                return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.AbstractC35557a
    /* renamed from: a */
    public final JSONObject mo62535a() {
        JSONObject jSONObject = new JSONObject();
        String str = "";
        try {
            T t = this.f84124d.f92286h;
            if (t instanceof AbstractC33623d) {
                str = ((AbstractC33623d) t).getRequestId();
            }
            jSONObject.put("request_id", str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
    /* renamed from: l */
    public final void mo62679l() {
        m72774u();
        if (this.f84124d != null && !TextUtils.isEmpty(this.f84123c)) {
            AbstractC35663b bVar = this.f84111G;
            if (bVar != null && bVar.sendCustomRequest(this.f84124d, 4)) {
                return;
            }
            if (!this.f84127k || TextUtils.isEmpty(this.f84119O)) {
                this.f84124d.mo57616a(4, this.f84123c, Integer.valueOf(this.f84136t), false);
            } else {
                this.f84124d.mo57616a(4, this.f84119O, Integer.valueOf(this.f84136t), true);
            }
        }
        AbstractC41246l lVar = this.f84138v;
        if (lVar != null) {
            lVar.mo70562a(false);
        }
    }

    @AbstractC90264r
    public void onBlockUserEvent(C63494a aVar) {
        mo62677j();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41135h
    /* renamed from: b */
    public final void mo62672b(boolean z) {
        this.f84107C.put(this.f84121a, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.AbstractC41135h
    /* renamed from: a */
    public final void mo62667a(String str) {
        this.f84123c = str;
        this.f84127k = false;
    }

    @AbstractC90264r
    public void onDynamicEvent(C35502b bVar) {
        if (bVar.f83727a == 0) {
            mo62673b(true, false);
        } else {
            m72773t();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            bundle.putSerializable("provider", this.f84111G);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final TuxTextView mo62662a(int i) {
        TuxTextView tuxTextView = new TuxTextView(getContext());
        tuxTextView.setTuxFont(51);
        tuxTextView.setGravity(17);
        tuxTextView.setTextColorRes(R.attr.bj);
        tuxTextView.setText(i);
        return tuxTextView;
    }

    @AbstractC90264r
    public void onAntiCrawlerEvent(C34569a aVar) {
        String str = aVar.f81610a;
        if (str == null) {
            return;
        }
        if (str.contains("/aweme/v1/challenge/aweme/?") || str.contains("/aweme/v1/music/fresh/aweme/?")) {
            EventBus.m156962a().mo145397d(aVar);
            mo62677j();
        }
    }

    @AbstractC90264r
    public void onFollowStatusUpdate(FollowStatusEvent followStatusEvent) {
        C35486b bVar;
        FollowStatus followStatus = followStatusEvent.status;
        if (af_() && (bVar = this.f84134r) != null) {
            bVar.mo67804a(followStatus);
        }
    }

    @AbstractC90264r
    public void onVideoEvent(C49672ag agVar) {
        if (agVar.f114315a == 2) {
            this.f84124d.mo67866a(AwemeService.m70060b().mo60684b((String) agVar.f114316b));
        }
    }

    /* renamed from: a */
    public static List<Aweme> m72768a(List<Aweme> list) {
        ArrayList arrayList = new ArrayList();
        if (C13603b.m24435a((Collection) list)) {
            return arrayList;
        }
        for (Aweme aweme : list) {
            if (aweme != null && !aweme.isAd()) {
                arrayList.add(aweme);
            }
        }
        return arrayList;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39103d
    /* renamed from: b */
    public final void mo62671b(int i) {
        if (af_()) {
            this.f84134r.notifyItemRemoved(i);
            if (this.f84134r.mo60933c() == 0) {
                this.f84131o.setVisibility(0);
                this.f84131o.mo27385g();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            C35486b bVar = this.f84134r;
            if (!(!af_() || this.f84130n == null || this.f84134r == null || bVar.f83679d)) {
                bVar.f83679d = true;
                int childCount = this.f84130n.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    RecyclerView.ViewHolder f = this.f84130n.mo4451f(i);
                    if (f instanceof AbstractC35485a) {
                        AbstractC35485a aVar = (AbstractC35485a) f;
                        aVar.mo62374a();
                        mo62665a((AbstractC39059e) aVar);
                    }
                }
            }
        }
    }

    @AbstractC90264r
    public void onReceiveVideoEvent(C49672ag agVar) {
        int indexOf;
        if (C41121e.m82820a() && agVar.f114315a == 21) {
            Object obj = agVar.f114316b;
            if ((obj instanceof Aweme) && (indexOf = ((AbstractC39058d) this.f84134r).f92236l.indexOf(obj)) >= 0) {
                View c = this.f84130n.getLayoutManager().mo4358c(indexOf);
                if (c != null) {
                    int[] iArr = new int[2];
                    c.getLocationOnScreen(iArr);
                    int b = C13628n.m24521b(C17867d.m33078a()) - iArr[1];
                    if (c.getHeight() > 0 && (((float) b) * 1.0f) / ((float) c.getHeight()) > 0.4f) {
                        return;
                    }
                }
                this.f84117M.f96066b.setValue(true);
                ((AbstractC81445m) this.f84130n.getLayoutManager()).mo125099a(indexOf, 0);
            }
        }
    }

    /* renamed from: a */
    public void mo62663a(Bundle bundle) {
        if (bundle != null) {
            this.f84121a = bundle.getInt("detail_aweme_list_type", 0);
            this.f84122b = bundle.getString("event_label", "");
            this.f84123c = bundle.getString("detail_id", "");
            C35657r rVar = (C35657r) bundle.getSerializable("detail_config");
            this.f84116L = rVar;
            if (rVar == null) {
                this.f84116L = new C35657r(null);
            }
            this.f84113I = bundle.getString("detail_aweme_from", "");
            this.f84114J = bundle.getString("detail_aweme_from_aid", "");
            this.f84115K = bundle.getString("detail_aweme_previous_page_position", "");
            this.f84125e = bundle.getString("process_id", "");
            this.f84126j = bundle.getString("group_id", "");
            this.f84127k = bundle.getBoolean("extra_challenge_is_hashtag", false);
            this.f84119O = bundle.getString("extra_challenge_hashtag_name", "");
            this.f84128l = bundle.getString("top_aweme_ids", "");
        }
    }

    /* renamed from: b */
    public final void mo62673b(boolean z, boolean z2) {
        C39092a aVar = this.f84118N;
        if (aVar != null) {
            aVar.mo67850a(z, z2);
        }
    }

    /* renamed from: a */
    public SmartRoute mo62661a(Aweme aweme, C35664c cVar) {
        String str;
        if (MSAdaptionService.m97895c().mo89377c(getContext())) {
            str = "//duo";
        } else {
            str = "aweme://aweme/detail/";
        }
        String str2 = "";
        SmartRoute withParam = SmartRouter.buildRoute(getActivity(), str).withParam("id", aweme.getAid()).withParam("refer", cVar.f84149c).withParam("previous_page", this.f84113I).withParam("extra_previous_page_position", this.f84115K).withParam("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", str2).withParam("video_from", cVar.f84147a);
        int i = this.f84121a;
        if (i == 3 || i == 2) {
            str2 = this.f84113I;
        }
        return withParam.withParam("video_challenge_profile_from", str2).withParam("video_type", this.f84121a).withParam("profile_enterprise_type", aweme.getEnterpriseType()).withParam("process_id", this.f84125e).withParam("duo_type", "duo_detail").withParam("extra_parent_tag_id", this.f84116L.f84104b).withParam(cVar.f84148b, this.f84123c).withParam("from_group_id", this.f84114J);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        RecyclerView.AbstractC1362i spannedGridLayoutManager;
        boolean z;
        MethodCollector.m26663i(7580);
        this.f84130n = (RecyclerView) view.findViewById(R.id.b0k);
        this.f84131o = (DmtStatusView) view.findViewById(R.id.e7i);
        this.f84132p = (FrameLayout) view.findViewById(R.id.e7l);
        super.onViewCreated(view, bundle);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f84131o.getLayoutParams();
        layoutParams.topMargin = C51428b.m95803a(getContext(), 80.0f);
        this.f84131o.setLayoutParams(layoutParams);
        if (this.f84111G == null && bundle != null) {
            Serializable serializable = bundle.getSerializable("provider");
            if (serializable instanceof AbstractC35663b) {
                this.f84111G = (AbstractC35663b) serializable;
            }
        }
        C35672z zVar = null;
        if (C41121e.m82820a()) {
            this.f84130n.setItemAnimator(null);
        }
        mo62676g();
        if (this.f84112H == null) {
            getActivity();
            spannedGridLayoutManager = new WrapGridLayoutManager(3, 1);
        } else {
            spannedGridLayoutManager = new SpannedGridLayoutManager(this.f84112H);
        }
        this.f84130n.setLayoutManager(spannedGridLayoutManager);
        this.f84130n.setOverScrollMode(2);
        this.f84130n.mo4402a(new C35668v((int) C13628n.m24520b(getContext(), 1.0f), (byte) 0));
        this.f84130n.mo4404a(new RecyclerView.AbstractC1370m() {
            /* class com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s.C356591 */

            static {
                Covode.recordClassIndex(42883);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1370m
            /* renamed from: a */
            public final void mo4750a(boolean z) {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1370m
            /* renamed from: b */
            public final void mo4752b(RecyclerView recyclerView, MotionEvent motionEvent) {
            }

            @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1370m
            /* renamed from: a */
            public final boolean mo4751a(RecyclerView recyclerView, MotionEvent motionEvent) {
                String str;
                String str2;
                int action = motionEvent.getAction();
                if (action == 0) {
                    C35658s.this.f84129m = motionEvent.getY();
                    return false;
                } else if (action != 1) {
                    return false;
                } else {
                    C35658s.this.f84129m = motionEvent.getY() - C35658s.this.f84129m;
                    if (!TextUtils.equals("challenge", C35658s.this.mo62682o()) && !TextUtils.equals("single_song", C35658s.this.mo62682o())) {
                        return false;
                    }
                    String str3 = "";
                    if (TextUtils.equals("single_song", C35658s.this.mo62682o())) {
                        str3 = "music_id";
                        str = "music_detail_slide_up";
                        str2 = "music_detail_slide_down";
                    } else {
                        str = str3;
                        str2 = str;
                    }
                    if (TextUtils.equals("challenge", C35658s.this.mo62682o())) {
                        str3 = "tag_id";
                        str = "tag_detail_slide_up";
                        str2 = "tag_detail_slide_down";
                    }
                    if (TextUtils.isEmpty(str3)) {
                        return false;
                    }
                    if (C35658s.this.f84129m > 10.0f) {
                        C39162r.m79460a(str2, new C33744d().mo59983a("process_id", C35658s.this.f84125e).mo59983a(str3, C35658s.this.f84123c).f79943a);
                        return false;
                    } else if (C35658s.this.f84129m >= -10.0f) {
                        return false;
                    } else {
                        C39162r.m79460a(str, new C33744d().mo59983a("process_id", C35658s.this.f84125e).mo59983a(str3, C35658s.this.f84123c).f79943a);
                        return false;
                    }
                }
            }
        });
        if (!C62845i.m113257a()) {
            zVar = new C35672z();
            this.f84130n.mo4405a(zVar);
        }
        this.f84118N = new C39092a(this.f84130n, zVar);
        this.f84130n = C80472gc.m139484a(this.f84130n, this, 2);
        if (this.f84116L.f84103a) {
            int a = C34728n.m70946a(16.0d);
            RecyclerView recyclerView = this.f84130n;
            recyclerView.setPadding(a, recyclerView.getPaddingTop(), a, this.f84130n.getPaddingBottom());
        }
        RecyclerView recyclerView2 = this.f84130n;
        if (recyclerView2 instanceof FpsRecyclerView) {
            ((FpsRecyclerView) recyclerView2).setLabel("detail_list");
        }
        C80330da.C80331a.m139266a(this.f84122b).mo123698a(this.f84130n);
        C39101b bVar = this.f84120P.get(this.f84121a);
        this.f84124d = bVar;
        if (bVar == null) {
            C39101b presenter = this.f84111G.getPresenter(this.f84121a, getActivity());
            this.f84124d = presenter;
            if (presenter != null) {
                presenter.mo67839a_(new AbstractC39102c<Aweme>() {
                    /* class com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s.C356613 */

                    /* renamed from: a */
                    final int f84145a;

                    static {
                        Covode.recordClassIndex(42885);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
                    /* renamed from: a */
                    public final void mo59511a(Exception exc) {
                    }

                    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
                    public final void bl_() {
                    }

                    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
                    /* renamed from: c */
                    public final void mo59523c(List<Aweme> list, boolean z) {
                    }

                    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
                    public final void aW_() {
                        C35486b bVar = C35658s.this.f84106B.get(this.f84145a);
                        if (bVar != null) {
                            bVar.ao_();
                        }
                    }

                    /* renamed from: a */
                    private DmtStatusView m72806a() {
                        if (!C35658s.this.af_()) {
                            return null;
                        }
                        if (C35658s.this.f84132p == null) {
                            return C35658s.this.f84131o;
                        }
                        return C35658s.this.f84109E.get(this.f84145a);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
                    /* renamed from: b */
                    public final void mo59515b() {
                        DmtStatusView a = m72806a();
                        if (a != null && a.getVisibility() == 0 && !TextUtils.equals("challenge", C35658s.this.mo62682o()) && !TextUtils.equals("single_song", C35658s.this.mo62682o()) && !TextUtils.equals("question", C35658s.this.mo62682o())) {
                            a.mo27384f();
                        }
                    }

                    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
                    /* renamed from: f */
                    public final void mo59525f() {
                        if (C35658s.this.af_()) {
                            C35658s.this.mo62675e();
                            DmtStatusView a = m72806a();
                            if (C35658s.this.f84135s != null) {
                                C35658s.this.f84135s.mo62691b(C35658s.this.f84121a);
                            } else if (a != null) {
                                a.mo27385g();
                            }
                            if (C35658s.this.f84137u != null && C35658s.this.f84121a == this.f84145a) {
                                C35658s.this.f84137u.mo62652a(C35658s.this.mo62674d());
                            }
                            if (C35658s.this.f84138v != null) {
                                C35658s.this.f84138v.mo70563b();
                            }
                            C35658s.this.f84107C.put(this.f84145a, false);
                        }
                    }

                    {
                        this.f84145a = C35658s.this.f84121a;
                    }

                    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
                    /* renamed from: c */
                    public final void mo59522c(Exception exc) {
                        C35486b bVar = C35658s.this.f84106B.get(this.f84145a);
                        if (bVar != null) {
                            bVar.mo67823i();
                        }
                        if (C35658s.this.f84138v != null && exc != null) {
                            C35658s.this.f84138v.mo70561a(exc);
                        }
                    }

                    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
                    /* renamed from: b */
                    public final void mo59516b(Exception exc) {
                        if (C35658s.this.af_()) {
                            C35658s.this.mo62675e();
                            DmtStatusView a = m72806a();
                            if (a != null) {
                                T t = C35658s.this.f84124d.f92286h;
                                if (!(t instanceof AbstractC39100a) || C13603b.m24435a((Collection) ((AbstractC39100a) t).getItems())) {
                                    a.mo27387h();
                                }
                            }
                            if (C35658s.this.f84137u != null && C35658s.this.f84121a == this.f84145a) {
                                C35658s.this.f84137u.mo62652a(C35658s.this.mo62674d());
                            }
                            if (!(C35658s.this.f84138v == null || exc == null)) {
                                C35658s.this.f84138v.mo70561a(exc);
                            }
                            C35658s.this.f84107C.put(this.f84145a, false);
                        }
                    }

                    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
                    /* renamed from: b */
                    public final void mo59517b(List<Aweme> list, boolean z) {
                        if (C35658s.this.af_()) {
                            if (C35658s.this.f84138v != null) {
                                C35658s.this.f84138v.mo70560a();
                            }
                            if (list == null) {
                                list = new ArrayList<>();
                            }
                            C35486b bVar = C35658s.this.f84106B.get(this.f84145a);
                            DmtStatusView a = m72806a();
                            if (bVar != null && a != null) {
                                bVar.aq_();
                                if (!C13603b.m24435a((Collection) list) || !z) {
                                    List list2 = ((AbstractC39058d) bVar).f92236l;
                                    if (list2 == null || list2.size() != list.size() || !list2.containsAll(list)) {
                                        bVar.mo62376b(C35658s.m72768a(list));
                                    }
                                    a.setVisibility(4);
                                    C35658s.this.f84108D.put(this.f84145a, z);
                                    C35658s.this.mo59513a(z);
                                } else if (C35658s.this.f84121a == this.f84145a) {
                                    C35658s.this.mo62679l();
                                }
                            }
                        }
                    }

                    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
                    /* renamed from: a */
                    public final void mo59512a(List<Aweme> list, boolean z) {
                        if (C35658s.this.af_()) {
                            C35658s.this.mo62675e();
                            C35486b bVar = C35658s.this.f84106B.get(this.f84145a);
                            DmtStatusView a = m72806a();
                            if (!(bVar == null || a == null)) {
                                if (C35658s.this.f84112H != null && !list.isEmpty()) {
                                    list.get(0).setHighlighted(true);
                                }
                                bVar.aq_();
                                bVar.mo62377b_(C35658s.m72768a(list));
                                a.setVisibility(8);
                                if (!z) {
                                    bVar.mo67829d(false);
                                    bVar.mo67813a((AbstractC39063h.AbstractC39067a) null);
                                }
                                if ("single_song".equals(C35658s.this.f84122b)) {
                                    C18285c.m34007c("md_start_activity_to_show_list_duration");
                                    if (!C35658s.this.f84139w && list != null) {
                                        C35658s.this.f84139w = true;
                                        C18285c.m34005a("music_detail_list", C35658s.this.f84123c, list);
                                    }
                                } else if ("challenge".equals(C35658s.this.f84122b)) {
                                    C18285c.m34007c("cd_start_activity_to_show_list_duration");
                                    if (!C35658s.this.f84139w && list != null) {
                                        C35658s.this.f84139w = true;
                                        C18285c.m34005a("challenge_detail_list", C35658s.this.f84123c, list);
                                    }
                                } else if ("sticker_prop_detail".equals(C35658s.this.f84122b)) {
                                    C18285c.m34007c("sd_start_activity_to_show_list_duration");
                                }
                            }
                            C35658s.this.f84108D.put(this.f84145a, z);
                            if (C35658s.this.f84137u != null && C35658s.this.f84121a == this.f84145a) {
                                C35658s.this.f84137u.mo62652a(C35658s.this.mo62674d());
                            }
                            if (C35658s.this.f84138v != null) {
                                C35658s.this.f84138v.mo70560a();
                            }
                            C35658s.this.f84107C.put(this.f84145a, false);
                            if (C35658s.this.getUserVisibleHint() && C35658s.this.f84121a == this.f84145a) {
                                C35658s.this.mo62673b(false, false);
                            }
                        }
                    }
                });
                this.f84124d.mo67865a((AbstractC39103d) this);
                this.f84120P.put(this.f84121a, this.f84124d);
            }
            z = true;
        } else {
            z = false;
        }
        C35486b bVar2 = this.f84106B.get(this.f84121a);
        this.f84134r = bVar2;
        if (bVar2 == null) {
            C35486b bVar3 = new C35486b(this.f84122b, this, this, this.f84111G);
            this.f84134r = bVar3;
            bVar3.mo67813a((AbstractC39063h.AbstractC39067a) this);
            this.f84134r.f92244p = "detail_list";
            this.f84134r.f83679d = this.f84141z;
            this.f84106B.put(this.f84121a, this.f84134r);
            z = true;
        }
        this.f84130n.setAdapter(this.f84134r);
        this.f84134r.f83679d = this.f84141z;
        getActivity();
        if (!m72772s()) {
            new C23144b(getActivity()).mo37640e(R.string.dcq).mo37637b();
        } else if (!this.f84105A && z) {
            mo62669a(true, false);
        } else if (getUserVisibleHint() && mo62674d()) {
            mo62669a(true, false);
        } else if (getUserVisibleHint()) {
            mo62673b(false, false);
        }
        if (this.f84132p != null) {
            if (this.f84109E.size() == 0) {
                this.f84109E.put(this.f84121a, this.f84131o);
                MethodCollector.m26664o(7580);
                return;
            }
            DmtStatusView dmtStatusView = this.f84131o;
            if (dmtStatusView != null) {
                dmtStatusView.setAlpha(0.0f);
            }
            DmtStatusView dmtStatusView2 = this.f84109E.get(this.f84121a);
            this.f84131o = dmtStatusView2;
            if (dmtStatusView2 == null) {
                this.f84131o = new DmtStatusView(this.f84132p.getContext());
                mo62676g();
                this.f84132p.addView(this.f84131o, new FrameLayout.LayoutParams(-1, -1));
                this.f84109E.put(this.f84121a, this.f84131o);
                MethodCollector.m26664o(7580);
                return;
            }
            dmtStatusView2.setAlpha(1.0f);
        }
        MethodCollector.m26664o(7580);
    }

    /* renamed from: a */
    public final void mo62664a(View view, View view2) {
        view2.setOnClickListener(new View$OnClickListenerC35666t(this));
        this.f84131o.setBuilder(DmtStatusView.C17269a.m31905a(getContext()).mo27406b(view).mo27408c(view2));
        this.f84131o.mo27385g();
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = C1764a.m5927a(layoutInflater, R.layout.w2, viewGroup, false);
        mo62663a(getArguments());
        this.f84117M = (DetailViewModel) C1181ae.m3881a(getActivity(), (C1175ad.AbstractC1177b) null).mo3983a(DetailViewModel.class);
        return a;
    }

    /* renamed from: a */
    private void m72769a(boolean z, boolean z2, boolean z3) {
        if (af_()) {
            if (!z) {
                mo62672b(false);
            }
            m72774u();
            if (this.f84124d != null && !TextUtils.isEmpty(this.f84123c)) {
                AbstractC35663b bVar = this.f84111G;
                if (bVar == null || !bVar.sendCustomRequest(this.f84124d, 1)) {
                    this.f84124d.mo57616a(1, this.f84123c, Integer.valueOf(this.f84136t), Boolean.valueOf(this.f84127k), this.f84128l, Boolean.valueOf(z3));
                }
                if (z2 && !TextUtils.equals("challenge", mo62682o()) && !TextUtils.equals("single_song", mo62682o()) && !TextUtils.equals("question", mo62682o())) {
                    this.f84131o.mo27384f();
                }
            }
        }
    }
}
