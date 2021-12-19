package com.p2082ss.android.ugc.aweme.p4173ug.praise.p4185b;

import android.content.Context;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.AppStoreMessage;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.FeedbackConf;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.i18n.language.i18n.C53457c;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p4173ug.praise.AbstractC79681a;
import com.p2082ss.android.ugc.aweme.p4173ug.praise.C79684b;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.Locale;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ug.praise.b.b */
public final class C79697b extends AbstractC79681a {
    static {
        Covode.recordClassIndex(92914);
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.praise.AbstractC79681a
    /* renamed from: b */
    public final AbstractC79681a.C79682a mo123223b() {
        String string = this.f178793c.getString(R.string.c47);
        C89219l.m154716b(string, "");
        String string2 = this.f178793c.getString(R.string.c4n);
        C89219l.m154716b(string2, "");
        try {
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            AppStoreMessage appStoreScore = iESSettingsProxy.getAppStoreScore();
            C89219l.m154716b(appStoreScore, "");
            String title = appStoreScore.getTitle();
            C89219l.m154716b(title, "");
            if (title.length() > 0) {
                String title2 = appStoreScore.getTitle();
                C89219l.m154716b(title2, "");
                string = title2;
            }
            String text = appStoreScore.getText();
            C89219l.m154716b(text, "");
            if (text.length() > 0) {
                String text2 = appStoreScore.getText();
                C89219l.m154716b(text2, "");
                string2 = text2;
            }
        } catch (C16041a unused) {
        }
        String string3 = this.f178793c.getString(R.string.d9e);
        C89219l.m154716b(string3, "");
        String string4 = this.f178793c.getString(R.string.bxo);
        C89219l.m154716b(string4, "");
        String packageName = this.f178793c.getPackageName();
        C89219l.m154716b(packageName, "");
        return new AbstractC79681a.C79682a(string, string2, string3, string4, packageName);
    }

    @Override // com.p2082ss.android.ugc.aweme.p4173ug.praise.AbstractC79681a
    /* renamed from: c */
    public final void mo123224c() {
        C29844g gVar;
        Map<String, String> map = new C33744d().mo59983a("enter_from", "praise_dialog").f79943a;
        C39162r.m79460a("FAQ", map);
        C39162r.m79460a("click_feedback_entrance", map);
        SmartRoute buildRoute = SmartRouter.buildRoute(this.f178793c, "aweme://webview");
        C89219l.m154716b(buildRoute, "");
        if (C80580in.m139689d()) {
            gVar = new C29844g("https://www.tiktok.com/aweme/inapp/v2/c_feedback");
        } else {
            try {
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                if (g.isLogin()) {
                    C36125t a = C36125t.m73591a();
                    IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
                    C89219l.m154716b(iESSettingsProxy, "");
                    FeedbackConf feedbackConf = iESSettingsProxy.getFeedbackConf();
                    C89219l.m154716b(feedbackConf, "");
                    C36125t.m73598a(a, feedbackConf.getNormalEntry());
                    return;
                }
                C36125t a2 = C36125t.m73591a();
                IESSettingsProxy iESSettingsProxy2 = C52912c.f121688a.f121689b;
                C89219l.m154716b(iESSettingsProxy2, "");
                FeedbackConf feedbackConf2 = iESSettingsProxy2.getFeedbackConf();
                C89219l.m154716b(feedbackConf2, "");
                C36125t.m73598a(a2, feedbackConf2.getNotLoggedIn());
                return;
            } catch (C16041a unused) {
                gVar = new C29844g("https://www.tiktok.com/falcon/tiktok_rn_web/feedback/");
                Locale a3 = C53457c.m98651a(this.f178793c);
                C89219l.m154716b(a3, "");
                gVar.mo52130a("locale", a3.getLanguage());
            }
        }
        gVar.mo52130a("enter_from", "praise_dialog");
        buildRoute.withParam(Uri.parse(gVar.toString())).withParam("hide_nav_bar", true).open();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79697b(Context context, C79684b.EnumC79686b bVar) {
        super(context, bVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(bVar, "");
    }
}
