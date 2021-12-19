package com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.GenericWidget;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.a */
public abstract class AbstractC49544a implements AbstractC49558o<C33942b, C33942b> {

    /* renamed from: I */
    public boolean f113950I;

    /* renamed from: J */
    public GenericWidget f113951J;

    /* renamed from: K */
    protected boolean f113952K;

    /* renamed from: L */
    public Aweme f113953L;

    /* renamed from: M */
    public String f113954M;

    /* renamed from: N */
    protected JSONObject f113955N;

    /* renamed from: O */
    protected boolean f113956O;

    /* renamed from: P */
    public int f113957P;

    /* renamed from: Q */
    public DataCenter f113958Q;

    /* renamed from: R */
    public final Context f113959R;

    /* renamed from: S */
    public final View f113960S;

    /* renamed from: T */
    public View f113961T;

    /* renamed from: U */
    protected String f113962U = "click";

    /* renamed from: V */
    protected Fragment f113963V;

    /* renamed from: W */
    protected int f113964W;

    /* renamed from: a */
    private boolean f113965a;

    static {
        Covode.recordClassIndex(58385);
    }

    /* renamed from: a */
    public abstract void mo80928a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo81275b(View view);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo80931a(DataCenter dataCenter);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo81274a(Map<String, Object> map) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo80933a(C33942b bVar) {
        return true;
    }

    /* renamed from: b */
    public void mo80935b(C33942b bVar) {
    }

    /* renamed from: c */
    public void mo80938c(C33942b bVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo81279d(C33942b bVar) {
        return false;
    }

    /* renamed from: f */
    public int mo81281f(C33942b bVar) {
        return 0;
    }

    /* renamed from: f */
    public void mo81282f() {
    }

    /* renamed from: g */
    public void mo81283g() {
    }

    /* renamed from: i */
    public void mo81287i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo81290l() {
        return true;
    }

    /* renamed from: h */
    public void mo81285h() {
        this.f113951J.mo60182b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ void mo81291m() {
        mo81275b(this.f113960S);
    }

    /* renamed from: j */
    public final boolean mo81288j() {
        if (!mo81289k()) {
            return false;
        }
        new C79459a(this.f113959R).mo123050a(R.string.o6).mo123053a();
        return true;
    }

    /* renamed from: k */
    public boolean mo81289k() {
        boolean E = C37699a.m76202E(this.f113953L);
        Aweme aweme = this.f113953L;
        if ((aweme == null || !aweme.isAd()) && E) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final /* synthetic */ void mo81292n() {
        Object a = this.f113958Q.mo60192a("video_params");
        mo81282f();
        if (a != null && mo81290l()) {
            onChanged(new C33942b("video_params", a));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo81276b(DataCenter dataCenter) {
        if (dataCenter != null) {
            this.f113958Q = dataCenter;
            mo80931a(dataCenter);
        }
    }

    public AbstractC49544a(View view) {
        this.f113959R = view.getContext();
        this.f113960S = view;
        this.f113950I = true;
        m92840a(view, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo81278b(Map map) {
        this.f113962U = (String) map.get("enterMethod");
        this.f113955N = (JSONObject) map.get("reqId");
    }

    /* renamed from: c */
    private void mo85281c(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        if (this.f113950I) {
            C49559p.f113984a.mo81305a(new RunnableC49561r(true, new RunnableC49554k(this, map)));
            return;
        }
        this.f113962U = (String) map.get("enterMethod");
        this.f113955N = (JSONObject) map.get("reqId");
    }

    /* renamed from: i */
    private boolean m92842i(C33942b bVar) {
        if (!this.f113965a || bVar == null || C49560q.m92875b(this)) {
            return false;
        }
        if ("video_params".equals(bVar.f80277a)) {
            if (mo80933a(bVar)) {
                C49560q.m92874a(this);
                return false;
            }
            C49560q.m92877d(this);
            return true;
        } else if (C49560q.m92876c(this)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public void mo81273a(VideoItemParams videoItemParams) {
        mo81277b(videoItemParams);
    }

    /* renamed from: b */
    public void mo81277b(VideoItemParams videoItemParams) {
        if (videoItemParams != null) {
            this.f113953L = videoItemParams.mWidgetAweme;
            this.f113957P = videoItemParams.mPageType;
            this.f113954M = videoItemParams.mEventType;
            this.f113955N = videoItemParams.mRequestId;
            this.f113956O = videoItemParams.isMyProfile;
            this.f113962U = videoItemParams.mEnterMethodValue;
            this.f113963V = videoItemParams.fragment;
            this.f113964W = videoItemParams.mAwemeFromPage;
        }
    }

    /* renamed from: e */
    public C33942b mo81280e(C33942b bVar) {
        if (bVar != null) {
            String str = bVar.f80277a;
            str.hashCode();
            switch (str.hashCode()) {
                case -1180796502:
                    if (str.equals("on_viewpager_page_selected")) {
                        mo81287i();
                        break;
                    }
                    break;
                case -98766390:
                    if (str.equals("video_params")) {
                        mo81273a((VideoItemParams) bVar.mo60212a());
                        break;
                    }
                    break;
                case 986395595:
                    if (str.equals("async_widget_unsafe_data")) {
                        mo85281c((Map) bVar.mo60212a());
                        break;
                    }
                    break;
            }
        }
        return bVar;
    }

    /* renamed from: g */
    public final void onChanged(C33942b bVar) {
        if (this.f113950I) {
            if (!mo81279d(bVar)) {
                C49559p.f113984a.mo81305a(new RunnableC49561r(this.f113950I, new RunnableC49555l(this, bVar)));
            }
        } else if (!mo81279d(bVar) && !m92842i(bVar)) {
            if (bVar == null || bVar.f80277a.equals("video_params")) {
                mo80935b(mo81280e(bVar));
                return;
            }
            String str = bVar.f80277a;
            str.hashCode();
            if (str.equals("on_viewpager_page_selected")) {
                mo81287i();
            } else if (str.equals("async_widget_unsafe_data")) {
                mo85281c((Map) bVar.mo60212a());
            }
            mo80938c(bVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo81286h(C33942b bVar) {
        if (!m92842i(bVar)) {
            if (bVar == null || bVar.f80277a.equals("video_params")) {
                C33942b e = mo81280e(bVar);
                C49559p.f113984a.mo81305a(new RunnableC49561r(false, new RunnableC49548e(this, mo81281f(e), e)));
                return;
            }
            String str = bVar.f80277a;
            str.hashCode();
            if (str.equals("on_viewpager_page_selected")) {
                mo81287i();
            } else if (str.equals("async_widget_unsafe_data")) {
                mo85281c((Map) bVar.mo60212a());
            }
            mo80938c(bVar);
        }
    }

    /* renamed from: a */
    private void m92840a(View view, boolean z) {
        C49559p.f113984a.mo81305a(new RunnableC49561r(true, new RunnableC49547d(this)));
    }

    public AbstractC49544a(View view, boolean z) {
        this.f113959R = view.getContext();
        this.f113960S = view;
        this.f113950I = true;
        this.f113965a = z;
        if (z) {
            RunnableC49556m mVar = new RunnableC49556m(this, view);
            C89219l.m154721d(this, "");
            C89219l.m154721d(mVar, "");
            C49560q.f113987a.put(this, mVar);
            return;
        }
        m92840a(view, true);
    }
}
