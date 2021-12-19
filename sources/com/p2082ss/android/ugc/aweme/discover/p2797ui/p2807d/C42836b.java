package com.p2082ss.android.ugc.aweme.discover.p2797ui.p2807d;

import android.app.Activity;
import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.core.content.C0643b;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.C17273d;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42690av;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.locale.LocalServiceImpl;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.search.C67458j;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.d.b */
public final class C42836b {

    /* renamed from: c */
    public static final C42837a f99904c = new C42837a((byte) 0);

    /* renamed from: a */
    public Context f99905a;

    /* renamed from: b */
    public AbstractC42690av<?> f99906b;

    static {
        Covode.recordClassIndex(50940);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.d.b$a */
    public static final class C42837a {
        static {
            Covode.recordClassIndex(50941);
        }

        private C42837a() {
        }

        public /* synthetic */ C42837a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final C17273d mo73081a() {
        C17273d dVar = new C17273d.C17274a(this.f99905a).mo27457a(2131232652).mo27462b(R.string.gzz).mo27464c(R.string.h00).mo27465d(EnumC42835a.EMPTY.getType()).f41365a;
        C89219l.m154716b(dVar, "");
        return dVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.d.b$b */
    public static final class View$OnClickListenerC42838b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Fragment f99907a;

        /* renamed from: b */
        final /* synthetic */ String f99908b;

        static {
            Covode.recordClassIndex(50942);
        }

        View$OnClickListenerC42838b(Fragment fragment, String str) {
            this.f99907a = fragment;
            this.f99908b = str;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C58957c.m108325a(this.f99907a, this.f99908b, "search_freq_control", C428391.f99909a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.d.b$c */
    public static final class C42840c extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ C42836b f99910a;

        /* renamed from: b */
        final /* synthetic */ SearchApiResult f99911b;

        /* renamed from: c */
        final /* synthetic */ Activity f99912c;

        static {
            Covode.recordClassIndex(50944);
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            textPaint.setColor(C0643b.m2378c(this.f99910a.f99905a, R.color.jr));
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            C33744d a = new C33744d().mo59983a("use_scenario", this.f99911b.globalDoodleConfig.getUseScenario());
            LogPbBean logPbBean = this.f99911b.logPb;
            C89219l.m154716b(logPbBean, "");
            C39162r.m79460a("tns_click_community_link", a.mo59983a("search_id", logPbBean.getImprId()).mo59983a("search_type", C67458j.m119528a(this.f99910a.f99906b.f99497B)).f79943a);
            C29844g gVar = new C29844g("https://www.tiktok.com/community-guidelines");
            gVar.mo52130a("lang", LocalServiceImpl.m108272a().mo96421a(this.f99912c));
            SmartRouter.buildRoute(this.f99912c, "//webview").withParam("url", gVar.mo52126a()).withParam("title", this.f99912c.getString(R.string.arm)).open();
        }

        C42840c(C42836b bVar, SearchApiResult searchApiResult, Activity activity) {
            this.f99910a = bVar;
            this.f99911b = searchApiResult;
            this.f99912c = activity;
        }
    }

    public C42836b(Context context, AbstractC42690av<?> avVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(avVar, "");
        this.f99905a = context;
        this.f99906b = avVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0146, code lost:
        if (r7 < 0) goto L_0x0148;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01a8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.bytedance.ies.dmt.p1194ui.widget.C17273d m85547a(com.p2082ss.android.ugc.aweme.discover.model.SearchApiResult r12, java.lang.Exception r13) {
        /*
        // Method dump skipped, instructions count: 497
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.p2797ui.p2807d.C42836b.m85547a(com.ss.android.ugc.aweme.discover.model.SearchApiResult, java.lang.Exception):com.bytedance.ies.dmt.ui.widget.d");
    }

    /* renamed from: a */
    public static /* synthetic */ C17273d m85548a(C42836b bVar, SearchApiResult searchApiResult, Exception exc, int i) {
        if ((i & 1) != 0) {
            searchApiResult = null;
        }
        if ((i & 2) != 0) {
            exc = null;
        }
        return bVar.m85547a(searchApiResult, exc);
    }
}
