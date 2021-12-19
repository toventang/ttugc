package com.p2082ss.android.ugc.aweme.setting;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.C16041a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.MtcertSettings;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.ay */
final /* synthetic */ class View$OnClickListenerC68010ay implements View.OnClickListener {

    /* renamed from: a */
    private final I18nSettingManageMyAccountActivity f152360a;

    static {
        Covode.recordClassIndex(80206);
    }

    View$OnClickListenerC68010ay(I18nSettingManageMyAccountActivity i18nSettingManageMyAccountActivity) {
        this.f152360a = i18nSettingManageMyAccountActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C89219l.m154721d(this.f152360a, "");
        C39162r.m79460a("enter_request_verification", new HashMap());
        try {
            C36125t a = C36125t.m73591a();
            IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
            C89219l.m154716b(iESSettingsProxy, "");
            MtcertSettings mtcertSettings = iESSettingsProxy.getMtcertSettings();
            C89219l.m154716b(mtcertSettings, "");
            C36125t.m73598a(a, mtcertSettings.getCertUrlSchema());
        } catch (C16041a unused) {
            SmartRouter.buildRoute(C17867d.m33078a(), "aweme://webview/?url=https%3a%2f%2fwww.tiktok.com%2ffalcon%2fmain%2fverification%2f%3fhide_nav_bar%3d1&hide_nav_bar=1").open();
        }
    }
}
