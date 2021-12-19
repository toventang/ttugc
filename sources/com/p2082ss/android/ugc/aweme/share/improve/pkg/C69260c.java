package com.p2082ss.android.ugc.aweme.share.improve.pkg;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdkapi.C11755f;
import com.bytedance.android.livesdkapi.depend.p683e.C11666c;
import com.bytedance.android.livesdkapi.service.AbstractC11846d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.FeedbackConf;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.c */
public final class C69260c implements AbstractC69693h {

    /* renamed from: a */
    private final Activity f154808a;

    /* renamed from: b */
    private final C11666c f154809b;

    static {
        Covode.recordClassIndex(81590);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: c */
    public final String mo61919c() {
        return "live_feed_back";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: d */
    public final boolean mo61921d() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: e */
    public final boolean mo61922e() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: f */
    public final boolean mo61923f() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: g */
    public final int mo61924g() {
        return co_();
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: b */
    public final int mo61918b() {
        AbstractC11846d a = C11755f.m20713a();
        if (a != null) {
            return a.mo13032m();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    public final int co_() {
        AbstractC11846d a = C11755f.m20713a();
        if (a != null) {
            return a.mo13031l();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61914a(Context context) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(context, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61916a(ImageView imageView) {
        C89219l.m154721d(imageView, "");
        C89219l.m154721d(imageView, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61917a(TextView textView) {
        C89219l.m154721d(textView, "");
        AbstractC69693h.C69694a.m123110a(this, textView);
    }

    public C69260c(Activity activity, C11666c cVar) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(cVar, "");
        this.f154808a = activity;
        this.f154809b = cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h
    /* renamed from: a */
    public final void mo61915a(Context context, SharePackage sharePackage) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(sharePackage, "");
        try {
            if (C16048b.m29633a().mo25412a(true, "feedback_post_page_style", 0) == 1) {
                IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
                C89219l.m154716b(iESSettingsProxy, "");
                FeedbackConf feedbackConf = iESSettingsProxy.getFeedbackConf();
                C89219l.m154716b(feedbackConf, "");
                String queryParameter = Uri.parse(feedbackConf.getFeHelp()).getQueryParameter("url");
                if (!TextUtils.isEmpty(queryParameter)) {
                    C29844g gVar = new C29844g(queryParameter);
                    gVar.mo52129a("room_id", this.f154809b.f27813c);
                    gVar.mo52130a("feedback_id", "6955");
                    gVar.mo52130a("enter_from", "live_share_feedback");
                    SmartRouter.buildRoute(this.f154808a, "aweme://webview/").withParam("url", gVar.toString()).open();
                    C33744d a = new C33744d().mo59983a("action_type", this.f154809b.f27831u);
                    Map<String, String> map = this.f154809b.f27797D;
                    if (map == null) {
                        map = C89041ag.m154415a();
                    }
                    C33744d a2 = a.mo59985a(new HashMap<>(map));
                    IAccountUserService g = C31575b.m65865g();
                    C89219l.m154716b(g, "");
                    C39162r.m79460a("livesdk_share_feedback_click", a2.mo59983a("uid", g.getCurUserId()).f79943a);
                    return;
                }
                throw new C16041a();
            }
            throw new C16041a();
        } catch (C16041a unused) {
            C29844g gVar2 = new C29844g("aweme://i18n_feedback_input");
            gVar2.mo52129a("room_id", this.f154809b.f27813c);
            gVar2.mo52130a("feedback_id", "6955");
            gVar2.mo52130a("enter_from", "live_share_feedback");
            SmartRouter.buildRoute(this.f154808a, gVar2.mo52126a()).open();
        }
    }
}
