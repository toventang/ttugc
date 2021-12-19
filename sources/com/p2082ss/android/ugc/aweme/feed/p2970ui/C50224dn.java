package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.services.apm.api.C22708a;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.ugc.aweme.anchor.multi.p2314ui.FeedMultiTagLayout;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.experiment.C46759bu;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.C49559p;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.RunnableC49561r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50534c;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50539g;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.dn */
public final class C50224dn extends AbstractC49544a {

    /* renamed from: a */
    FeedMultiTagLayout f115981a;

    static {
        Covode.recordClassIndex(59350);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80928a() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: i */
    public final void mo81287i() {
        super.mo81287i();
        if (this.f113953L != null && !TextUtils.isEmpty(this.f113953L.getAnchorWikiOfflineText())) {
            new C79459a(this.f113959R).mo123052a(this.f113953L.getAnchorWikiOfflineText()).mo123053a();
            this.f113953L.setAnchorWikiOfflineText("");
        }
        C50534c.m94737a(this.f113953L, this.f113959R, Integer.valueOf(this.f113957P));
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final boolean mo80933a(C33942b bVar) {
        return C50539g.m94742a(bVar, C50225do.f115982a);
    }

    public C50224dn(View view) {
        super(view, ((Boolean) C46759bu.f108961g.getValue()).booleanValue());
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80931a(DataCenter dataCenter) {
        if (dataCenter != null) {
            dataCenter.mo60189a("on_page_selected", (AbstractC1214u<C33942b>) this.f113951J);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80929a(View view) {
        View a = C1870c.m6045a((Activity) this.f113959R, (int) R.layout.aiu);
        this.f115981a = (FeedMultiTagLayout) a.findViewById(R.id.b0t);
        this.f113961T = a;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: c */
    public final void mo80938c(C33942b bVar) {
        if (bVar != null) {
            C49559p.f113984a.mo81305a(new RunnableC49561r(false, new RunnableC50227dq(this, bVar.f80277a)));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: b */
    public final void mo80935b(C33942b bVar) {
        MethodCollector.m26663i(5586);
        if (!this.f113952K) {
            this.f113952K = true;
            if (this.f113960S instanceof FrameLayout) {
                ((FrameLayout) this.f113960S).addView(this.f113961T);
            }
        }
        if (bVar == null) {
            MethodCollector.m26664o(5586);
        } else if (((Integer) ((HashMap) bVar.mo60212a()).get("aweme_type_state")).intValue() == 0) {
            this.f115981a.mo59613c();
            MethodCollector.m26664o(5586);
        } else {
            this.f115981a.mo59611a();
            MethodCollector.m26664o(5586);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: e */
    public final C33942b mo81280e(C33942b bVar) {
        String str;
        C33942b bVar2 = null;
        if (bVar == null) {
            return null;
        }
        super.mo81280e(bVar);
        if (TextUtils.equals(bVar.f80277a, "video_params")) {
            HashMap hashMap = new HashMap();
            bVar2 = new C33942b("ui_state", hashMap);
            if (this.f113954M == null) {
                C22708a.m42800a("widget event type null ");
                C51423a.m95791b(6, "VideoFeedTagView", "mEventType null");
            }
            this.f115981a.setOnInternalEventListener(new C50226dp(this));
            if (TextUtils.isEmpty(this.f113954M)) {
                str = "nullEventType";
            } else {
                str = this.f113954M;
            }
            int a = this.f115981a.mo59610a(this.f113953L, (Activity) this.f113959R, str, this.f113955N);
            hashMap.put("aweme_type_state", Integer.valueOf(a));
            if (a == 0) {
                return bVar2;
            }
            Aweme aweme = this.f113953L;
            JSONObject jSONObject = this.f113955N;
            hashMap.put("aweme_state", aweme);
            hashMap.put("event_type_state", str);
            hashMap.put("req_id_state", jSONObject);
        }
        return bVar2;
    }
}
